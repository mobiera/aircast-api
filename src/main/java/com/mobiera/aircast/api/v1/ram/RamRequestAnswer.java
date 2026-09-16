package com.mobiera.aircast.api.v1.ram;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

@JsonInclude(Include.NON_NULL)
public class RamRequestAnswer implements Serializable {

	private static final long serialVersionUID = 1L;

	private RamRequestResult result;
	private String errorMessage;
	private Long requestId;
	private Integer packetIndex;
	/** Total number of command packets of the session, known after packet 0 **/
	private Integer totalPackets;
	/** Number of SMS parts spooled for this packet **/
	private Integer smsCount;
	/** SMPP account instance id actually used, to pin the rest of the session **/
	private String smppAccount;

	public RamRequestResult getResult() {
		return result;
	}
	public void setResult(RamRequestResult result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public Integer getTotalPackets() {
		return totalPackets;
	}
	public void setTotalPackets(Integer totalPackets) {
		this.totalPackets = totalPackets;
	}

	public Integer getSmsCount() {
		return smsCount;
	}
	public void setSmsCount(Integer smsCount) {
		this.smsCount = smsCount;
	}

	public String getSmppAccount() {
		return smppAccount;
	}
	public void setSmppAccount(String smppAccount) {
		this.smppAccount = smppAccount;
	}

}
