package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Validator;

/**
 * Perform a SendSms Action.
 * <p>
 * <b>smscAddress</b>: tpda of SMSC.
 * <p>
 * <b>dcs</b>: {@link Dcs} to use. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * <b>tpda</b>: tpda to send SMS to.
 * <p>
 * <b>mr</b>: message reference.
 * <p>
 * <b>pid</b>: protocolId.
 * <p>
 * <b>send0348udh</b>: if true, put a udh header. If false, do not put udh.
 * <p>
 * <b>packingRequired</b>: if true and dcs set to DCS_8_BIT_DATA, will encode GSM8 into GSM7.
 * <p>
 * <b>userData</b>: list of {@link InputData} to send. Will concatenate all element of the list.
 * <p>
 * <i>Important Note:</i>Tpda format is using and abbreviated notation.
 * <p>
 * Use + for international (ton/npi 0x91), N for national (ton/npi 0xA1), or nothing for default SMSC (ton/npi 0x81).
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
public class SmsAction extends Action implements Serializable{

	private static final long serialVersionUID = 3216469091760895274L;
	//private Byte commandQualifier;
	private String smscAddress;
	@Required
	private String tpda;
	private Dcs dcs;
	private Byte mr;
	private Byte pid;
	private Boolean send0348udh;
	private Boolean packingRequired;
	@Required
	@Validator(minSize=1)
	private List<InputData> userData;
	
	
	
	/*public Byte getCommandQualifier() {
		return commandQualifier;
	}
	public void setCommandQualifier(Byte commandQualifier) {
		this.commandQualifier = commandQualifier;
	}*/
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
	
	public Byte getMr() {
		return mr;
	}
	public void setMr(Byte mr) {
		this.mr = mr;
	}
	public Byte getPid() {
		return pid;
	}
	public void setPid(Byte pid) {
		this.pid = pid;
	}
	public Boolean getSend0348udh() {
		return send0348udh;
	}
	public void setSend0348udh(Boolean send0348udh) {
		this.send0348udh = send0348udh;
	}
	public List<InputData> getUserData() {
		return userData;
	}
	public void setUserData(List<InputData> userData) {
		this.userData = userData;
	}
	public Dcs getDcs() {
		return dcs;
	}
	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}
	public Boolean getPackingRequired() {
		return packingRequired;
	}
	public void setPackingRequired(Boolean packingRequired) {
		this.packingRequired = packingRequired;
	}

	
}
