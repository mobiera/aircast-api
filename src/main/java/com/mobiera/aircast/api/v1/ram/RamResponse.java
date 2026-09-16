package com.mobiera.aircast.api.v1.ram;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.time.Instant;

/**
 * Decoded Proof of Receipt (or delivery report) of one RAM command packet, sent by rest-endpoint to cm.
 */
@JsonInclude(Include.NON_NULL)
public class RamResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String msisdn;
	private Long campaignId;
	/** RAM session id, from the SMPP session; may be null when the session was lost **/
	private Long requestId;
	private RamResponseResult result;
	/** ETSI TS 102 225 response status name (POR_OK, RC_CC_DS_FAILED, CNTR_LOW...) **/
	private String porStatus;
	/** Status word of the last executed APDU, null when not available **/
	private Integer statusWord;
	/** Number of APDUs executed by the card, null when not available **/
	private Integer executedCommands;
	/** Counter echoed in the response packet header, null when not available **/
	private Long counter;
	private String errorMessage;
	private Boolean testing;
	private Instant ts;
	/** Hex dump of the response packet, for diagnostics **/
	private String rawData;

	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public Long getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public RamResponseResult getResult() {
		return result;
	}
	public void setResult(RamResponseResult result) {
		this.result = result;
	}

	public String getPorStatus() {
		return porStatus;
	}
	public void setPorStatus(String porStatus) {
		this.porStatus = porStatus;
	}

	public Integer getStatusWord() {
		return statusWord;
	}
	public void setStatusWord(Integer statusWord) {
		this.statusWord = statusWord;
	}

	public Integer getExecutedCommands() {
		return executedCommands;
	}
	public void setExecutedCommands(Integer executedCommands) {
		this.executedCommands = executedCommands;
	}

	public Long getCounter() {
		return counter;
	}
	public void setCounter(Long counter) {
		this.counter = counter;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getTesting() {
		return testing;
	}
	public void setTesting(Boolean testing) {
		this.testing = testing;
	}

	public Instant getTs() {
		return ts;
	}
	public void setTs(Instant ts) {
		this.ts = ts;
	}

	public String getRawData() {
		return rawData;
	}
	public void setRawData(String rawData) {
		this.rawData = rawData;
	}

}
