package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

public enum SetUpCallMode implements Serializable
{ 
	/** set up call, but only if not currently busy on another call **/
	SETUP_IF_NOT_BUSY,
	/** set up call, but only if not currently busy on another call, with redial **/
	SETUP_IF_NOT_BUSY_REDIAL,
	/** set up call, putting all other calls (if any) on hold **/
	SETUP_AND_PUT_OTHERS_ON_HOLD,
	/** set up call, putting all other calls (if any) on hold, with redial **/
	SETUP_AND_PUT_OTHERS_ON_HOLD_REDIAL,
	/** set up call, disconnecting all other calls (if any) **/
	SETUP_AND_DISCONNECT_OTHERS,
	/** set up call, disconnecting all other calls (if any), with redial **/
	SETUP_AND_DISCONNECT_OTHERS_REDIAL
};
