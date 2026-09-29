package com.mobiera.aircast.commons;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Data codings of incoming messages that an SMPP account declares as 8-bit binary
 * (SmppAccount.moBinaryDataCodings): a list of data_coding values, decimal, separated by
 * commas, like "2" or "2,245".
 *
 * A message sent by a card with a GSM data coding scheme like 0xF6 should reach the platform
 * with that value. Some SMSC deliver it with the SMPP code for binary instead, which has no
 * 8-bit flag: the account lists the values to be read as binary. An empty list changes nothing.
 */
public final class DataCodings {

	/** GSM 03.38: 8-bit data, no message class **/
	public static final int BINARY = 0x04;

	public static final int MIN = 0;
	public static final int MAX = 255;

	private DataCodings() {
	}

	/** Values of the list in the order given, empty when the list is null or blank **/
	public static Set<Integer> parse(String list) {
		if ((list == null) || list.trim().isEmpty()) return Collections.emptySet();
		Set<Integer> values = new LinkedHashSet<Integer>();
		for (String item: list.split(",")) {
			String s = item.trim();
			if (!s.matches("[0-9]{1,3}")) {
				throw new IllegalArgumentException("not a data coding: '" + s + "'");
			}
			int value = Integer.parseInt(s);
			if (value > MAX) {
				throw new IllegalArgumentException("data coding out of range: " + value);
			}
			values.add(value);
		}
		return Collections.unmodifiableSet(values);
	}

	public static boolean isValid(String list) {
		try {
			parse(list);
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}
	}

	/** The list as stored: values separated by commas without spaces, null when empty **/
	public static String normalize(String list) {
		Set<Integer> values = parse(list);
		if (values.isEmpty()) return null;
		StringBuilder sb = new StringBuilder();
		for (Integer value: values) {
			if (sb.length() > 0) sb.append(',');
			sb.append(value);
		}
		return sb.toString();
	}

	/** GSM 03.38 8-bit flag of a data coding scheme **/
	public static boolean hasBinaryFlag(int dataCoding) {
		return (dataCoding & 0x04) == 0x04;
	}

	/** True when the data coding has the 8-bit flag or is declared as binary **/
	public static boolean isBinary(int dataCoding, Set<Integer> declared) {
		if (hasBinaryFlag(dataCoding)) return true;
		return (declared != null) && declared.contains(dataCoding & 0xFF);
	}

	/**
	 * Data coding to work with: a value declared as binary that has no 8-bit flag becomes
	 * BINARY, any other value is returned unchanged.
	 */
	public static int effective(int dataCoding, Set<Integer> declared) {
		if (hasBinaryFlag(dataCoding)) return dataCoding;
		if ((declared != null) && declared.contains(dataCoding & 0xFF)) return BINARY;
		return dataCoding;
	}
}
