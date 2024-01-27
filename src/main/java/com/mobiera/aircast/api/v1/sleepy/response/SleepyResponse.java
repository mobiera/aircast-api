package com.mobiera.aircast.api.v1.sleepy.response;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * Abstract class representing a Sleepy response.
 * <p>
 * <b>commandEncryption</b>: if true, bytecode sent by Aircast to SIM was encrypted. If false, it was not encrypted.
 * <p>
 * <b>responseEncryption</b>: if true, bytecode sent by SIM to Aircast was encrypted. If false, it was not encrypted.
 * <p>
 * <b>appletVersion</b>: Applet version.
 * <p>
 * <b>sessionId</b>: Internal sessionId.
 * <p>
 * <b>resultCode</b>: resultCode of SleepyCommand. 0 if OK, greater than 0 if error
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
@Type(value = GetInfoResponse.class),
@Type(value = SendOptinOfferResponse.class),
@Type(value = UpdateConfigParametersResponse.class),
})
public abstract class SleepyResponse implements Serializable {
	
	private static final long serialVersionUID = -6940547175203039970L;
	protected boolean commandEncryption;
	protected boolean responseEncryption;
	protected int appletVersion;
	protected byte sessionId;
	protected byte resultCode;
	
	public boolean isCommandEncryption() {
		return commandEncryption;
	}
	public void setCommandEncryption(boolean commandEncryption) {
		this.commandEncryption = commandEncryption;
	}
	public boolean isResponseEncryption() {
		return responseEncryption;
	}
	public void setResponseEncryption(boolean responseEncryption) {
		this.responseEncryption = responseEncryption;
	}
	
	public int getAppletVersion() {
		return appletVersion;
	}
	public void setAppletVersion(int appletVersion) {
		this.appletVersion = appletVersion;
	}
	public byte getResultCode() {
		return resultCode;
	}
	public void setResultCode(byte resultCode) {
		this.resultCode = resultCode;
	}
	public byte getSessionId() {
		return sessionId;
	}
	public void setSessionId(byte sessionId) {
		this.sessionId = sessionId;
	}
	
		
	
}
