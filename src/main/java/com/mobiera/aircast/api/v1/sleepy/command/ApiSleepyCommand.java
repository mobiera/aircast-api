package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.mobiera.aircast.commons.enums.CipheringAlgorithm;

/**
 * Abstract class representing a Sleepy Command.
 * <p>
 * <b>responseRequired</b>: If true, Applet will send a response when receiving command, if false, response will not be sent to server.
 * <p>
 * <b>commandEncryption</b>: if true, bytecode sent by Aircast to SIM will be encrypted. If false, Aircast default configuration will apply.
 * <p>
 * <b>responseEncryption</b>: if true, bytecode sent by SIM to Aircast will be encrypted. If false, Aircast default configuration will apply.
 * <p>
 * <b>responseParams</b>: {@link ResponseParameters}. Ignored by API.
 * <p>
 * <b>sessionId</b>: Ignored by API.
 * <p>
 * <b>random</b>: Ignored by API.
 * <p>
 * <b>encryptionKey</b>: Ignored by API.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
@Type(value = GetInfoCommand.class),
@Type(value = SendOptinOfferCommand.class),
@Type(value = UpdateConfigParametersCommand.class),
})
public abstract class ApiSleepyCommand implements Serializable {

	private static final long serialVersionUID = 8700674691192843144L;
	private Boolean responseRequired = true;
	private Boolean commandEncryption = false;
	private Boolean responseEncryption = false;
	
	/*
	 * Disabled in REST because we do not want endUser to specify that
	 */
	@JsonIgnore
	private ResponseParameters responseParams;
	@JsonIgnore
	private byte sessionId;
	@JsonIgnore
	private byte [] random;
	@JsonIgnore
	private byte [] encryptionKey;

	
	
	public byte[] getRandom() {
		return random;
	}
	public void setRandom(byte[] random) {
		this.random = random;
	}
	public byte[] getEncryptionKey() {
		return encryptionKey;
	}
	public void setEncryptionKey(byte[] encryptionKey) {
		this.encryptionKey = encryptionKey;
	}
	
	public Boolean getResponseRequired() {
		return responseRequired;
	}
	public void setResponseRequired(Boolean responseRequired) {
		this.responseRequired = responseRequired;
	}
	public Boolean getCommandEncryption() {
		return commandEncryption;
	}
	public void setCommandEncryption(Boolean commandEncryption) {
		this.commandEncryption = commandEncryption;
	}
	public Boolean getResponseEncryption() {
		return responseEncryption;
	}
	public void setResponseEncryption(Boolean responseEncryption) {
		this.responseEncryption = responseEncryption;
	}
	public ResponseParameters getResponseParams() {
		return responseParams;
	}
	public void setResponseParams(ResponseParameters responseParams) {
		this.responseParams = responseParams;
	}
	public byte getSessionId() {
		return sessionId;
	}
	public void setSessionId(byte sessionId) {
		this.sessionId = sessionId;
	}
	//@JsonIgnore
		private Integer protocolVersion;
		//@JsonIgnore
		private Integer clientVersion;
		//@JsonIgnore
		CipheringAlgorithm cipheringAlgorithm;
		//@JsonIgnore
		private Integer maximumCommandLength;
		
}
