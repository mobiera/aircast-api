package com.mobiera.ms.mno.aircast.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.CampaignManagement;

@JsonInclude(Include.NON_NULL)
public class CmSessionVO implements Serializable {

	private static final long serialVersionUID = -4775901422035543388L;
	
	private String msisdn;
	private CampaignManagement management;
	private Long simFk;
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public CampaignManagement getManagement() {
		return management;
	}
	public void setManagement(CampaignManagement management) {
		this.management = management;
	}
	public Long getSimFk() {
		return simFk;
	}
	public void setSimFk(Long simFk) {
		this.simFk = simFk;
	}
	
}
