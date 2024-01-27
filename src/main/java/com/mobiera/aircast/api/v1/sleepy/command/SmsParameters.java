package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Represents configuration parameters of a STK sendSms command for Sleepy Response.
 * Used by Aircast internally, not through REST API.
 * <p>
 * <b>smscAddress</b>: smsc address tpda.
 * <p>
 * <b>tpda</b>: tpda (shortcode to send response to). use null to set answer tpda to sender shortcode.
 * <p>
 * <b>protocolId</b>: force protocolId of submit_sm.
 * <p>
 * <b>messageReference</b>: force messageReference.
 * <p>
 * <b>dataCodingScheme</b>: force dcs of sms.
 * <p>
 * <b>commandQualifier</b>: force commandQualifier.
 * <p>
 * <i>Important Note:</i>Tpda format is using and abbreviated notation.
 * <p>
 * Use + for international (ton/npi 0x91), N for national (ton/npi 0xA1), or nothing for default SMSC (ton/npi 0x81), or any String for alphanumeric shortcodes.
 * <p>
 * Examples :
 * <p>
 * N12345 : will generate TP-OA field 0x05A12143F5
 * <p>
 * 12345 : will generate TP-OA field 0x05812143F5
 * <p>
 * +12345678 or 0012345678 : will generate TP-OA field 0x069121436587
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class SmsParameters implements Serializable {

	private static final long serialVersionUID = 2583034519859477683L;
	private String smscAddress;
	private String tpda;
	private Byte protocolId;
	private Byte messageReference;
	private Byte dataCodingScheme;
	private Byte commandQualifier;
	public String getSmscAddress() {
		return smscAddress;
	}
	public void setSmscAddress(String smscAddress) {
		this.smscAddress = smscAddress;
	}
	public String getTpda() {
		return tpda;
	}
	public void setTpda(String tpda) {
		this.tpda = tpda;
	}
	public Byte getProtocolId() {
		return protocolId;
	}
	public void setProtocolId(Byte protocolId) {
		this.protocolId = protocolId;
	}
	public Byte getMessageReference() {
		return messageReference;
	}
	public void setMessageReference(Byte messageReference) {
		this.messageReference = messageReference;
	}
	public Byte getDataCodingScheme() {
		return dataCodingScheme;
	}
	public void setDataCodingScheme(Byte dataCodingScheme) {
		this.dataCodingScheme = dataCodingScheme;
	}
	public Byte getCommandQualifier() {
		return commandQualifier;
	}
	public void setCommandQualifier(Byte commandQualifier) {
		this.commandQualifier = commandQualifier;
	}
	public Boolean getSend0348udh() {
		return send0348udh;
	}
	public void setSend0348udh(Boolean send0348udh) {
		this.send0348udh = send0348udh;
	}
	private Boolean send0348udh;

	
	
}
