package com.mobiera.aircast.commons;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.mobiera.aircast.api.vo.RamSecurityProbeParametersVO;

/**
 * Security probe (RamCommand.SECURITY_PROBE): the candidate OTA configurations of a campaign
 * are tried on a card one by one, one command packet each, until one is accepted. Every
 * service must see the candidates in the same order: this is the one place that orders them.
 */
public final class RamSecurityProbe {

	/** Most candidates per campaign: bounds the SMS cost per sim **/
	public static final int MAX_CANDIDATES = 16;

	/** The command every candidate packet carries: GET DATA card resources, harmless and short **/
	public static final String COMMAND = CardProbe.command(CardProbe.TAG_CARD_RESOURCES);

	private RamSecurityProbe() {
	}

	/**
	 * Applet ids of the candidates in the order they are tried: by position, rows without a
	 * position last in the order given, each applet once.
	 */
	public static List<Long> candidates(List<RamSecurityProbeParametersVO> rows) {
		List<Long> ids = new ArrayList<Long>();
		if (rows == null) return ids;
		List<RamSecurityProbeParametersVO> sorted = new ArrayList<RamSecurityProbeParametersVO>();
		for (RamSecurityProbeParametersVO row : rows) {
			if ((row != null) && (row.getRamAppletFk() != null)) sorted.add(row);
		}
		sorted.sort(Comparator.comparing((RamSecurityProbeParametersVO r) -> r.getPosition() == null ? Integer.MAX_VALUE : r.getPosition()));
		for (RamSecurityProbeParametersVO row : sorted) {
			if (!ids.contains(row.getRamAppletFk())) ids.add(row.getRamAppletFk());
		}
		return ids;
	}
}
