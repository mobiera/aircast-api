package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;

import com.mobiera.aircast.api.v1.sleepy.response.GetInfoResponse;

/**
 * These tags are used to identify {@link GetInfoCommand} responses in {@link GetInfoResponse} object.  
 * @author mj
 * 
 */
public enum GetInfoTag implements Serializable {

	LOCATION_INFORMATION,
	IMEI,
	NMR,
	DATE_TIME_TIMEZONE,
	LANGUAGE_SETTING,
	TIMING_ADVANCE,
	ICCID,
	IMSI,
	KDF_RANDOM;

}