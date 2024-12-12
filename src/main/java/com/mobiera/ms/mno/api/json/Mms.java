package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.AppletImpl;
import com.mobiera.ms.mno.api.enums.MessageType;

@JsonInclude(Include.NON_NULL)
public class Mms implements Serializable {

	private static final long serialVersionUID = 7960755744857629469L;
	
	
	private String subject;
	private String testMsg;
	private Boolean dlrRequested;
	private Long validityPeriod;
	
	private List<MmsMedia> medias;
	
	private String serviceTpda;
	private String to;
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getServiceTpda() {
		return serviceTpda;
	}
	public void setServiceTpda(String serviceTpda) {
		this.serviceTpda = serviceTpda;
	}
	public String getTestMsg() {
		return testMsg;
	}
	public void setTestMsg(String testMsg) {
		this.testMsg = testMsg;
	}
	public List<MmsMedia> getMedias() {
		return medias;
	}
	public void setMedias(List<MmsMedia> medias) {
		this.medias = medias;
	}
	public Boolean getDlrRequested() {
		return dlrRequested;
	}
	public void setDlrRequested(Boolean dlrRequested) {
		this.dlrRequested = dlrRequested;
	}
	public Long getValidityPeriod() {
		return validityPeriod;
	}
	public void setValidityPeriod(Long validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	
	
	
}
