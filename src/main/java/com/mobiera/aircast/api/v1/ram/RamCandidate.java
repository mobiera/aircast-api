package com.mobiera.aircast.api.v1.ram;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

@JsonInclude(Include.NON_NULL)
public class RamCandidate implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long simId;
	private String msisdn;
	private Long simProfileFk;

	public Long getSimId() {
		return simId;
	}
	public void setSimId(Long simId) {
		this.simId = simId;
	}

	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public Long getSimProfileFk() {
		return simProfileFk;
	}
	public void setSimProfileFk(Long simProfileFk) {
		this.simProfileFk = simProfileFk;
	}

}
