package com.mobiera.ms.mno.api.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.AppletImpl;

@JsonInclude(Include.NON_NULL)

public class DiscoveryResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7960755744857629469L;
	

	// sim = simResource.discoveryResponse(mo.getUserTpda(), iccid, imsi, kdr, impl, appletVersion);

	
	private String userTpda;
	private String iccid; 
	private String imsi; 
	private byte[] kdr;
	private AppletImpl impl;
	private Integer appletVersion;
	private Long requestId;
	private Boolean error;
	
	public String getUserTpda() {
		return userTpda;
	}
	public void setUserTpda(String userTpda) {
		this.userTpda = userTpda;
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
	public byte[] getKdr() {
		return kdr;
	}
	public void setKdr(byte[] kdr) {
		this.kdr = kdr;
	}
	public AppletImpl getImpl() {
		return impl;
	}
	public void setImpl(AppletImpl impl) {
		this.impl = impl;
	}
	public Integer getAppletVersion() {
		return appletVersion;
	}
	public void setAppletVersion(Integer appletVersion) {
		this.appletVersion = appletVersion;
	}
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	
	
	
}
