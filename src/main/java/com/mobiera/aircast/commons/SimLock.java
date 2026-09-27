package com.mobiera.aircast.commons;

import com.mobiera.aircast.commons.enums.CampaignType;

/**
 * Lock of a sim (sim.locked_until_ts / sim.locked_by_campaign_fk): a permanent campaign, a
 * scheduled STK campaign or a discovery is running on the sim, nothing else of that kind
 * is started until the holder releases the lock or the lock expires. API campaigns and
 * plain SMS campaigns neither take nor check it.
 *
 * The holder is a campaign id. Two pseudo holders exist for the moments where no campaign
 * is known yet.
 */
public final class SimLock {

	/** Taken by a batch selector before cm has chosen the campaign of the sim **/
	public static final long HOLDER_SELECTION = -1L;

	/** Taken for a discovery probe **/
	public static final long HOLDER_DISCOVERY = -2L;

	private SimLock() {
	}

	/**
	 * Campaigns that push to an applet and wait for its answer take the sim lock. Plain SMS and
	 * MMS campaigns wait for nothing on the sim, and API campaigns run on their own SMPP
	 * connection: both ignore it.
	 */
	public static boolean isLockingCampaign(CampaignType type) {
		if (type == null) return false;
		switch (type) {
			case ADVERTISING:
			case USTK:
			case SLEEPY:
			case SLEEPY_FLOW:
			case RAW:
			case CUSTOM:
			case RAM:
			case DISCOVERY:
				return true;
			default:
				return false;
		}
	}
}
