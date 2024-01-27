package com.mobiera.ms.mno.aircast.test;

public class TestMsisdn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msisdn = "255628020334";
		
		System.out.println(ensureMsisdnHasNoPrefix(msisdn, 10, 11, "255"));
		
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
