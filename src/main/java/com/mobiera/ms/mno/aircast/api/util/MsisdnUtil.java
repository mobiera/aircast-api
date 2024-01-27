package com.mobiera.ms.mno.aircast.api.util;

import org.jboss.logging.Logger;

import com.mobiera.aircast.commons.enums.AppletImpl;

public class MsisdnUtil {

	private static final Logger logger = Logger.getLogger(MsisdnUtil.class);
	
	public static String ensureMsisdnHasPrefix(String msisdn, int minMsisdnSize, int maxMsisdnSize, String countryPrefix) {
		
		if (msisdn == null) {
			return null;
		}
		if (msisdn.length()>=minMsisdnSize) {
			return msisdn;
		}
		return countryPrefix + msisdn;
		
		
	}
	
	public static String ensureMsisdnHasNoPrefix(String msisdn, int minMsisdnSize, int maxMsisdnSize, String countryPrefix) {
		
		if (msisdn == null) {
			return null;
		}
		if (msisdn.length()>=minMsisdnSize) {
			return msisdn.replaceFirst(countryPrefix, "");
		}
		return msisdn;
		
		
	}
	
	
	
}
