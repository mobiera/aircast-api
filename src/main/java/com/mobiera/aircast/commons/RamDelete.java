package com.mobiera.aircast.commons;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Applet deletion over the air (RamCommand.DELETE): the GlobalPlatform DELETE commands of a
 * delete row, one per command packet so that the status word of each is known.
 *
 * The commands carry no Le: DELETE needs no answer, and some cards report an error for a
 * command with Le although they executed it.
 */
public final class RamDelete {

	/** GlobalPlatform: an AID is 5 to 16 bytes long **/
	public static final int AID_MIN_LENGTH = 5;
	public static final int AID_MAX_LENGTH = 16;

	private RamDelete() {
	}

	/** AID in upper case hex without separators, null when empty **/
	public static String aid(String hex) {
		if (hex == null) return null;
		String h = hex.replaceAll("[\\s:.-]", "").toUpperCase(Locale.ROOT);
		return h.isEmpty() ? null : h;
	}

	public static boolean isValidAid(String hex) {
		String h = aid(hex);
		return (h != null) && h.matches("[0-9A-F]+") && ((h.length() % 2) == 0)
				&& (h.length() >= 2 * AID_MIN_LENGTH) && (h.length() <= 2 * AID_MAX_LENGTH);
	}

	/**
	 * Commands of a delete row, hex, in the order they are sent:
	 * <ul>
	 * <li>instance and package, related objects deleted: the package alone, the card deletes
	 * its instances with it;</li>
	 * <li>instance and package otherwise: the instance, then the package, which a card
	 * refuses to delete while an instance of it exists;</li>
	 * <li>one of them: that one.</li>
	 * </ul>
	 * Empty when the row names nothing to delete.
	 */
	public static List<String> commands(String instanceAid, String packageAid, Boolean deleteRelatedObjects) {
		boolean related = (deleteRelatedObjects != null) && deleteRelatedObjects;
		String instance = aid(instanceAid);
		String pkg = aid(packageAid);
		List<String> commands = new ArrayList<String>(2);
		if ((instance != null) && !((pkg != null) && related)) {
			commands.add(command(instance, related));
		}
		if (pkg != null) {
			commands.add(command(pkg, related));
		}
		return commands;
	}

	/** DELETE [AID], hex: 80 E4 00 P2 Lc 4F len AID, P2 80 to delete the related objects too **/
	public static String command(String aidHex, boolean deleteRelatedObjects) {
		String h = aid(aidHex);
		if (!isValidAid(h)) {
			throw new IllegalArgumentException("invalid AID " + aidHex);
		}
		int len = h.length() / 2;
		return String.format("80E400%s%02X4F%02X%s", deleteRelatedObjects ? "80" : "00", len + 2, len, h);
	}

	/** Status word of a DELETE whose object is not on the card: there is nothing left to do **/
	public static boolean isNotFound(int statusWord) {
		return statusWord == 0x6A88;
	}
}
