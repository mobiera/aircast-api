package com.mobiera.aircast.commons;

import java.util.Locale;

/**
 * Card probe (RamCommand.CARD_PROBE): what is read from the card manager, one GET DATA per
 * command packet because a card answers the data of the last command of a packet only, and
 * how the answers are decoded.
 *
 * Every read is optional on the card side: a card that does not hold an object answers 6A88,
 * the value is then unknown and the probe goes on.
 */
public final class CardProbe {

	/** ETSI TS 102 226 extended card resources: installed applications, free memory **/
	public static final String TAG_CARD_RESOURCES = "FF21";
	/** GlobalPlatform key diversification data **/
	public static final String TAG_KEY_DIVERSIFICATION_DATA = "00CF";
	/** GlobalPlatform key information template **/
	public static final String TAG_KEY_INFORMATION = "00E0";

	/** Order of the reads, which is the order of the command packets **/
	private static final String[] TAGS = { TAG_CARD_RESOURCES, TAG_KEY_DIVERSIFICATION_DATA, TAG_KEY_INFORMATION };

	private CardProbe() {
	}

	public static int packetCount() {
		return TAGS.length;
	}

	/** Tag read by the command packet of this index, null when out of range **/
	public static String tag(int packetIndex) {
		return ((packetIndex < 0) || (packetIndex >= TAGS.length)) ? null : TAGS[packetIndex];
	}

	/** GET DATA command, hex **/
	public static String command(String tag) {
		return "80CA" + tag + "00";
	}

	/**
	 * Card resources decoded from the answer to GET DATA FF21 ("FF21" length, then the objects
	 * 81 installed applications, 82 free non volatile memory, 83 free volatile memory). An
	 * object that is missing leaves its value null; null when the answer is not FF21 data.
	 */
	public static CardResources cardResources(String hex) {
		byte[] d = bytes(hex);
		if ((d == null) || (d.length < 3) || ((d[0] & 0xFF) != 0xFF) || ((d[1] & 0xFF) != 0x21)) {
			return null;
		}
		int end = Math.min(d.length, 3 + (d[2] & 0xFF));
		CardResources r = new CardResources();
		int i = 3;
		while (i + 1 < end) {
			int tag = d[i] & 0xFF;
			int len = d[i + 1] & 0xFF;
			if ((len > 4) || (i + 2 + len > end)) break;
			long v = 0;
			for (int k = 0; k < len; k++) v = (v << 8) | (d[i + 2 + k] & 0xFF);
			switch (tag) {
			case 0x81: r.installedApplications = (int) v; break;
			case 0x82: r.freeNonVolatileMemory = (int) v; break;
			case 0x83: r.freeVolatileMemory = (int) v; break;
			default: break;
			}
			i += 2 + len;
		}
		return r;
	}

	/**
	 * Value of a simple object answered to GET DATA (tag on one byte, as the card answers CF
	 * and E0), upper case hex, null when the answer does not start with this tag.
	 */
	public static String value(String hex, int tag) {
		byte[] d = bytes(hex);
		if ((d == null) || (d.length < 2) || ((d[0] & 0xFF) != tag)) return null;
		int len = d[1] & 0xFF;
		int from = 2;
		if (len == 0x81) {
			if (d.length < 3) return null;
			len = d[2] & 0xFF;
			from = 3;
		}
		if (from + len > d.length) len = d.length - from;
		StringBuilder sb = new StringBuilder(len * 2);
		for (int k = 0; k < len; k++) sb.append(String.format("%02X", d[from + k] & 0xFF));
		return sb.toString();
	}

	private static byte[] bytes(String hex) {
		if (hex == null) return null;
		String h = hex.replaceAll("[^0-9A-Fa-f]", "").toUpperCase(Locale.ROOT);
		if ((h.length() == 0) || ((h.length() % 2) != 0)) return null;
		byte[] b = new byte[h.length() / 2];
		for (int i = 0; i < b.length; i++) b[i] = (byte) Integer.parseInt(h.substring(2 * i, 2 * i + 2), 16);
		return b;
	}

	public static final class CardResources {
		private Integer installedApplications;
		private Integer freeNonVolatileMemory;
		private Integer freeVolatileMemory;

		public Integer getInstalledApplications() {
			return installedApplications;
		}
		public Integer getFreeNonVolatileMemory() {
			return freeNonVolatileMemory;
		}
		public Integer getFreeVolatileMemory() {
			return freeVolatileMemory;
		}
	}
}
