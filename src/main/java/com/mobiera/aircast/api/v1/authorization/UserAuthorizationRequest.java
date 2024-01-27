package com.mobiera.aircast.api.v1.authorization;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserAuthorizationRequest implements Serializable
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	private String msisdn;
	private String iccid;
	private String imsi;
	private Long requestId;
	private Long campaignId;
	
	private String title1; //DT, nullable
	private String title2; //SI, not nullable
	private String yesText;
	private String noText;
	
	private String fallbackSms;
	private List<String> fallbackSmsKeywordList;
	
	private String tpda; // optional tpda to send MO to when user authorizes
	private String mo;
	
	private Boolean requestDeliveryReport;
	
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
	
	public String getYesText() {
		return yesText;
	}
	public void setYesText(String yesText) {
		this.yesText = yesText;
	}
	public String getNoText() {
		return noText;
	}
	public void setNoText(String noText) {
		this.noText = noText;
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public String getFallbackSms() {
		return fallbackSms;
	}
	public void setFallbackSms(String fallbackSms) {
		this.fallbackSms = fallbackSms;
	}
	public List<String> getFallbackSmsKeywordList() {
		return fallbackSmsKeywordList;
	}
	public void setFallbackSmsKeywordList(List<String> fallbackSmsKeywordList) {
		this.fallbackSmsKeywordList = fallbackSmsKeywordList;
	}
	public Long getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	public Boolean getRequestDeliveryReport() {
		return requestDeliveryReport;
	}
	public void setRequestDeliveryReport(Boolean requestDeliveryReport) {
		this.requestDeliveryReport = requestDeliveryReport;
	}
	
	public String getFallbackSmsKeywords() {
		String keywords = null;
		if ((fallbackSmsKeywordList != null) && (fallbackSmsKeywordList.size()>0)) {
			keywords="";
			for (int i=0; i<fallbackSmsKeywordList.size();i++) {
				String k = fallbackSmsKeywordList.get(i);
				keywords +=k;
				if (i<fallbackSmsKeywordList.size()-1) keywords +=",";
			}
		}
		return keywords;
	}
	public String getTpda() {
		return tpda;
	}
	public void setTpda(String tpda) {
		this.tpda = tpda;
	}
	public String getMo() {
		return mo;
	}
	public void setMo(String mo) {
		this.mo = mo;
	}
	
	
	
	
}
