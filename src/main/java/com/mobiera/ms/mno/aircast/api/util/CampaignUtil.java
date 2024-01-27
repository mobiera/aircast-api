package com.mobiera.ms.mno.aircast.api.util;

import java.util.List;

import org.jboss.logging.Logger;

import com.mobiera.aircast.api.vo.CampaignVO;
import com.mobiera.aircast.api.vo.ad.AdVO;
import com.mobiera.aircast.commons.exception.ExcludedSimException;
import com.mobiera.commons.enums.Condition;
import com.mobiera.ms.mno.aircast.api.ms.SimMS;

public class CampaignUtil {

	private static final Logger logger = Logger.getLogger("CampaignUtil");

	
	
	public static void excludeSim(CampaignVO campaign, SimMS sim, boolean debug) throws ExcludedSimException {

		if (campaign == null) return;
		if (sim == null) return;
		
		if (debug) {
			logger.info("checkCampaignExclusions: checking campaign exclusions " + campaign.getName() + " sim: " + sim.getMsisdn());
		}
		if (campaign.getSubscriberPlanExclude() != null && campaign.getSubscriberPlanExclude().size() > 0) {
			if (sim.getSubscriberPlan() != null) {
				if (campaign.getSubscriberPlanExclude().contains(sim.getSubscriberPlan())) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.subscriberPlan:" + sim.getSubscriberPlan() + " campaign.subscriberPlanExclude: " + campaign.getSubscriberPlanExclude());

				}
			}
		}
		if (campaign.getSubscriberTypeExclude() != null && campaign.getSubscriberTypeExclude().size() > 0) {
			if (sim.getSubscriberType() != null) {
				if (campaign.getSubscriberTypeExclude().contains(sim.getSubscriberType())) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.subscriberType:" + sim.getSubscriberType() + " campaign.subscriberTypeExclude: " + campaign.getSubscriberTypeExclude());

				}
			}
		}
		
		if (campaign.getMnoAdExclude() != null && campaign.getMnoAdExclude().size() > 0) {
			logger.warn("" + campaign.getMnoAdExclude());
			if (sim.getMnoAdAllowed() == null) {
				if (campaign.getMnoAdExclude().contains(Condition.NULL)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.mnoAdAllowed:" + sim.getMnoAdAllowed() + " campaign.mnoAdExclude: " + campaign.getMnoAdExclude());

				}
			} else if (sim.getMnoAdAllowed()) {
				if (campaign.getMnoAdExclude().contains(Condition.TRUE)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.mnoAdAllowed:" + sim.getMnoAdAllowed() + " campaign.mnoAdExclude: " + campaign.getMnoAdExclude());

				}
			} else {
				if (campaign.getMnoAdExclude().contains(Condition.FALSE)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.mnoAdAllowed:" + sim.getMnoAdAllowed() + " campaign.mnoAdExclude: " + campaign.getMnoAdExclude());

				}
			}
			
		}



		if (campaign.getTpAdExclude() != null && campaign.getTpAdExclude().size() > 0) {
			if (debug) {
				logger.info("checkCampaignExclusions: campaign.getTpAdExclude() " + campaign.getTpAdExclude() + " " + campaign.getName() + " sim: " + sim.getMsisdn());
			}
			if (sim.getTpAdAllowed() == null) {
				if (campaign.getTpAdExclude().contains(Condition.NULL)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.tpAdAllowed:" + sim.getTpAdAllowed() + " campaign.tpAdExclude: " + campaign.getTpAdExclude());
		
				}
			} else if (sim.getTpAdAllowed()) {
				if (campaign.getTpAdExclude().contains(Condition.TRUE)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.tpAdAllowed:" + sim.getTpAdAllowed() + " campaign.tpAdExclude: " + campaign.getTpAdExclude());
		
				}
			} else {
				if (campaign.getTpAdExclude().contains(Condition.FALSE)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.tpAdAllowed:" + sim.getTpAdAllowed() + " campaign.tpAdExclude: " + campaign.getTpAdExclude());
		
				}
			}
			
		}

		if (campaign.getState1Exclude() != null && campaign.getState1Exclude().size() > 0) {
			
			if (sim.getState1() == null) {
				if (campaign.getState1Exclude().contains(Condition.NULL)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state1:" + sim.getState1() + " campaign.state1Exclude: " + campaign.getState1Exclude());
		
				}
			} else if (sim.getState1()) {
				if (campaign.getState1Exclude().contains(Condition.TRUE)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state1:" + sim.getState1() + " campaign.state1Exclude: " + campaign.getState1Exclude());
		
				}
			} else {
				if (campaign.getState1Exclude().contains(Condition.FALSE)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state1:" + sim.getState1() + " campaign.state1Exclude: " + campaign.getState1Exclude());
		
				}
			}
			
		}


		if (campaign.getState2Exclude() != null && campaign.getState2Exclude().size() > 0) {
			
			if (sim.getState2() == null) {
				if (campaign.getState2Exclude().contains(Condition.NULL)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state2:" + sim.getState2() + " campaign.state2Exclude: " + campaign.getState2Exclude());
		
				}
			} else if (sim.getState2()) {
				if (campaign.getState2Exclude().contains(Condition.TRUE)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state2:" + sim.getState2() + " campaign.state2Exclude: " + campaign.getState2Exclude());
		
				}
			} else {
				if (campaign.getState2Exclude().contains(Condition.FALSE)) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state2:" + sim.getState2() + " campaign.state2Exclude: " + campaign.getState2Exclude());
		
				}
			}
			
		}

		
		if (campaign.getMnoAdAllowedCondition() != null) {
			switch (campaign.getMnoAdAllowedCondition()) {
			case NULL: {
				if (sim.getMnoAdAllowed() != null) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.mnoAdAllowed:" + sim.getMnoAdAllowed() + " campaign.mnoAdAllowedCondition: " + campaign.getMnoAdAllowedCondition());
				}
				break;
			}
			case FALSE: {
				if ( (sim.getMnoAdAllowed() == null) || (sim.getMnoAdAllowed()) ) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.mnoAdAllowed:" + sim.getMnoAdAllowed() + " campaign.mnoAdAllowedCondition: " + campaign.getMnoAdAllowedCondition());
				}
				break;
			}
			case TRUE: {
				if ( (sim.getMnoAdAllowed() == null) || (!sim.getMnoAdAllowed()) ) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.mnoAdAllowed:" + sim.getMnoAdAllowed() + " campaign.mnoAdAllowedCondition: " + campaign.getMnoAdAllowedCondition());
				}
				break;
			}
			}
			
		}
		
		if (campaign.getTpAdAllowedCondition() != null) {
			switch (campaign.getTpAdAllowedCondition()) {
			case NULL: {
				if (sim.getTpAdAllowed() != null) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.tpAdAllowed:" + sim.getTpAdAllowed() + " campaign.tpAdAllowedCondition: " + campaign.getTpAdAllowedCondition());
				}
				break;
			}
			case FALSE: {
				if ( (sim.getTpAdAllowed() == null) || (sim.getTpAdAllowed()) ) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.tpAdAllowed:" + sim.getTpAdAllowed() + " campaign.tpAdAllowedCondition: " + campaign.getTpAdAllowedCondition());
				}
				break;
			}
			case TRUE: {
				if ( (sim.getTpAdAllowed() == null) || (!sim.getTpAdAllowed()) ) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.tpAdAllowed:" + sim.getTpAdAllowed() + " campaign.tpAdAllowedCondition: " + campaign.getTpAdAllowedCondition());
				}
				break;
			}
			}
			
		}
		
		
		
		if (campaign.getState1Condition() != null) {
			switch (campaign.getState1Condition()) {
			case NULL: {
				if (sim.getState1() != null) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state1:" + sim.getState1() + " campaign.state1Condition: " + campaign.getState1Condition());
				}
				break;
			}
			case FALSE: {
				if ( (sim.getState1() == null) || (sim.getState1()) ) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state1:" + sim.getState1() + " campaign.state1Condition: " + campaign.getState1Condition());
				}
				break;
			}
			case TRUE: {
				if ( (sim.getState1() == null) || (!sim.getState1()) ) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state1:" + sim.getState1() + " campaign.state1Condition: " + campaign.getState1Condition());
				}
				break;
			}
			}
			
		}
		
		if (campaign.getState2Condition() != null) {
			switch (campaign.getState2Condition()) {
			case NULL: {
				if (sim.getState2() != null) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state2:" + sim.getState2() + " campaign.state2Condition: " + campaign.getState2Condition());
				}
				break;
			}
			case FALSE: {
				if ( (sim.getState2() == null) || (sim.getState2()) ) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state2:" + sim.getState2() + " campaign.state2Condition: " + campaign.getState2Condition());
				}
				break;
			}
			case TRUE: {
				if ( (sim.getState2() == null) || (!sim.getState2()) ) {
					throw new ExcludedSimException("checkCampaignExclusions: SIM is excluded by Campaign Configuration sim.state2:" + sim.getState2() + " campaign.state2Condition: " + campaign.getState2Condition());
				}
				break;
			}
			}
			
		}
		
	}
	
	
	public static AdVO advertisingCampaignCalculateStats(List<AdVO> adVOs) {
		
		AdVO gs = new AdVO();
		for (AdVO a: adVOs) {
			gs.setAllBack1(((gs.getAllBack1()==null)?0:gs.getAllBack1()) + ((a.getAllBack1()==null)?0:a.getAllBack1()));
			gs.setAllBack2(((gs.getAllBack2()==null)?0:gs.getAllBack2()) + ((a.getAllBack2()==null)?0:a.getAllBack2()));
			gs.setAllCancel1(((gs.getAllCancel1()==null)?0:gs.getAllCancel1()) + ((a.getAllCancel1()==null)?0:a.getAllCancel1()));
			gs.setAllCancel2(((gs.getAllCancel2()==null)?0:gs.getAllCancel2()) + ((a.getAllCancel2()==null)?0:a.getAllCancel2()));
			gs.setAllDlred(((gs.getAllDlred()==null)?0:gs.getAllDlred()) + ((a.getAllDlred()==null)?0:a.getAllDlred()));
			gs.setAllError1(((gs.getAllError1()==null)?0:gs.getAllError1()) + ((a.getAllError1()==null)?0:a.getAllError1()));
			gs.setAllError2(((gs.getAllError2()==null)?0:gs.getAllError2()) + ((a.getAllError2()==null)?0:a.getAllError2()));
			gs.setAllOk1(((gs.getAllOk1()==null)?0:gs.getAllOk1()) + ((a.getAllOk1()==null)?0:a.getAllOk1()));
			gs.setAllOk2(((gs.getAllOk2()==null)?0:gs.getAllOk2()) + ((a.getAllOk2()==null)?0:a.getAllOk2()));
			gs.setAllSent(((gs.getAllSent()==null)?0:gs.getAllSent()) + ((a.getAllSent()==null)?0:a.getAllSent()));
			gs.setAllTimeout1(((gs.getAllTimeout1()==null)?0:gs.getAllTimeout1()) + ((a.getAllTimeout1()==null)?0:a.getAllTimeout1()));
			gs.setAllTimeout2(((gs.getAllTimeout2()==null)?0:gs.getAllTimeout2()) + ((a.getAllTimeout2()==null)?0:a.getAllTimeout2()));
			gs.setAllViewed1(((gs.getAllViewed1()==null)?0:gs.getAllViewed1()) + ((a.getAllViewed1()==null)?0:a.getAllViewed1()));
			gs.setAllViewed2(((gs.getAllViewed2()==null)?0:gs.getAllViewed2()) + ((a.getAllViewed2()==null)?0:a.getAllViewed2()));
			
			
			gs.setTodayBack1(((gs.getTodayBack1()==null)?0:gs.getTodayBack1()) + ((a.getTodayBack1()==null)?0:a.getTodayBack1()));
			gs.setTodayBack2(((gs.getTodayBack2()==null)?0:gs.getTodayBack2()) + ((a.getTodayBack2()==null)?0:a.getTodayBack2()));
			gs.setTodayCancel1(((gs.getTodayCancel1()==null)?0:gs.getTodayCancel1()) + ((a.getTodayCancel1()==null)?0:a.getTodayCancel1()));
			gs.setTodayCancel2(((gs.getTodayCancel2()==null)?0:gs.getTodayCancel2()) + ((a.getTodayCancel2()==null)?0:a.getTodayCancel2()));
			gs.setTodayDlred(((gs.getTodayDlred()==null)?0:gs.getTodayDlred()) + ((a.getTodayDlred()==null)?0:a.getTodayDlred()));
			gs.setTodayError1(((gs.getTodayError1()==null)?0:gs.getTodayError1()) + ((a.getTodayError1()==null)?0:a.getTodayError1()));
			gs.setTodayError2(((gs.getTodayError2()==null)?0:gs.getTodayError2()) + ((a.getTodayError2()==null)?0:a.getTodayError2()));
			gs.setTodayOk1(((gs.getTodayOk1()==null)?0:gs.getTodayOk1()) + ((a.getTodayOk1()==null)?0:a.getTodayOk1()));
			gs.setTodayOk2(((gs.getTodayOk2()==null)?0:gs.getTodayOk2()) + ((a.getTodayOk2()==null)?0:a.getTodayOk2()));
			gs.setTodaySent(((gs.getTodaySent()==null)?0:gs.getTodaySent()) + ((a.getTodaySent()==null)?0:a.getTodaySent()));
			gs.setTodayTimeout1(((gs.getTodayTimeout1()==null)?0:gs.getTodayTimeout1()) + ((a.getTodayTimeout1()==null)?0:a.getTodayTimeout1()));
			gs.setTodayTimeout2(((gs.getTodayTimeout2()==null)?0:gs.getTodayTimeout2()) + ((a.getTodayTimeout2()==null)?0:a.getTodayTimeout2()));
			gs.setTodayViewed1(((gs.getTodayViewed1()==null)?0:gs.getTodayViewed1()) + ((a.getTodayViewed1()==null)?0:a.getTodayViewed1()));
			gs.setTodayViewed2(((gs.getTodayViewed2()==null)?0:gs.getTodayViewed2()) + ((a.getTodayViewed2()==null)?0:a.getTodayViewed2()));
			
		}
		
		return gs;
		
	}

}
