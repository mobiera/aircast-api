package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;

import com.mobiera.aircast.api.v1.sleepy.response.UpdateConfigParametersResponse;

/**
 * These tags are used to identify {@link UpdateConfigParametersCommand} responses in {@link UpdateConfigParametersResponse} object.  
 * @author mj
 * 
 */public enum UpdateConfigParametersTag implements Serializable {

	SMS_PARAMETERS,
	ENCRYPTION_KEY,
	WHITE_LIST,
	MENU_ENTRIES,
	APPLET_FLAGS,
	IMEI_TRACKING;

}