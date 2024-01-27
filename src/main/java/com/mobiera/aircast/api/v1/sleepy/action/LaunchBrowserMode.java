package com.mobiera.aircast.api.v1.sleepy.action;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public enum LaunchBrowserMode implements Serializable
{ 
	LAUNCH_IF_NOT_ALREADY_LAUNCHED, // 0x00
	USE_EXISTING_BROWSER, 			// 0x02
	CLOSE_AND_LAUNCH_NEW_BROWSER 	// 0x03
};