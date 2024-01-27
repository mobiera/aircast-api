package com.mobiera.aircast.api.v1.sleepy.command;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Represent applet flag configuration.
 * <p>
 * <b>cmdEncryptionRequired</b>: If true, communication between Aircast and Applet is required. If false, communication between Aircast and Applet is not required.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class AppletFlags implements Serializable {

	
	private static final long serialVersionUID = -7850495016819614244L;
	private boolean cmdEncryptionRequired = false;
	public boolean isCmdEncryptionRequired() {
		return cmdEncryptionRequired;
	}
	public void setCmdEncryptionRequired(boolean cmdEncryptionRequired) {
		this.cmdEncryptionRequired = cmdEncryptionRequired;
	}

	
	
}
