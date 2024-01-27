package com.mobiera.aircast.api.v1.sim;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class GetSimRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private Long id;
	private String msisdn;
	private String iccid;
	private String imsi;
	@JsonIgnore
	private UserContextVO userContext;
	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getIccid() {
		return iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer(256);
		buffer.append("GetSimRequest: iccid: ").append(iccid).append(" imsi: ")
		.append(imsi).append(" msisdn: ").append(msisdn);
		return buffer.toString();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}

	
	
}
