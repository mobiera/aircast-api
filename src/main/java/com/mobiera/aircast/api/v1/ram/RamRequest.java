package com.mobiera.aircast.api.v1.ram;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * One command packet of an over the air applet management (RAM) session.
 * Sent by cm to rest-endpoint; rest-endpoint asks ustk for the ciphered SMS and spools them.
 */
@JsonInclude(Include.NON_NULL)
public class RamRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Target sim **/
	private String msisdn;
	/** RAM campaign **/
	private Long campaignId;
	/** RAM session id, used as SMPP session request id so that the PoR is correlated back **/
	private Long requestId;
	/** 0-based index of the command packet to send **/
	private Integer packetIndex;
	/** 03.48 counter to cipher this packet with **/
	private Long counter;
	/** SMPP account instance id the session is pinned to; null for packet 0 (best account is selected) **/
	private String smppAccount;
	/** When true the queue usage gate applies (packet 0). Continuation packets bypass it **/
	private Boolean checkQueue;
	private Boolean testing;
	private Boolean requestDeliveryReport;
	/** SMS validity period in seconds, keeps stale packets from reaching the card after an abort **/
	private Long validityPeriod;

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

	public Integer getPacketIndex() {
		return packetIndex;
	}
	public void setPacketIndex(Integer packetIndex) {
		this.packetIndex = packetIndex;
	}

	public Long getCounter() {
		return counter;
	}
	public void setCounter(Long counter) {
		this.counter = counter;
	}

	public String getSmppAccount() {
		return smppAccount;
	}
	public void setSmppAccount(String smppAccount) {
		this.smppAccount = smppAccount;
	}

	public Boolean getCheckQueue() {
		return checkQueue;
	}
	public void setCheckQueue(Boolean checkQueue) {
		this.checkQueue = checkQueue;
	}

	public Boolean getTesting() {
		return testing;
	}
	public void setTesting(Boolean testing) {
		this.testing = testing;
	}

	public Boolean getRequestDeliveryReport() {
		return requestDeliveryReport;
	}
	public void setRequestDeliveryReport(Boolean requestDeliveryReport) {
		this.requestDeliveryReport = requestDeliveryReport;
	}

	public Long getValidityPeriod() {
		return validityPeriod;
	}
	public void setValidityPeriod(Long validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

}
