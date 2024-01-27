package com.mobiera.aircast.api.v1.sleepy.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.v1.sleepy.command.UpdateConfigParametersTag;

/**
 * Response TLV representing result of a specific {@link UpdateConfigParametersTag} command execution.
 * <p>
 * <b>updateConfigParametersTag:</b> {@link UpdateConfigParametersTag} identifying the command.
 * <p>
 * <b>resultValue:</b> result value of the command (0 if OK, greater than 0 if error).
 * <p>
 * <b>additionalInformation:</b> a byte[] representing detail of error, in case of error.
 * <p>
 * <b>tlvs:</b> List of {@link Tlv} returned by the command execution.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class UpdateConfigParametersResponseTLV implements Serializable {
	
	private static final long serialVersionUID = 5191395223057877295L;
	private UpdateConfigParametersTag updateConfigParametersTag;
	private byte resultValue = 0;
	private byte [] additionalInformation; // Valid for errors
	private List<Tlv> tlvs;
	
	
	public UpdateConfigParametersTag getUpdateConfigParametersTag() {
		return updateConfigParametersTag;
	}
	public void setUpdateConfigParametersTag(UpdateConfigParametersTag updateConfigParametersTag) {
		this.updateConfigParametersTag = updateConfigParametersTag;
	}
	public byte getResultValue() {
		return resultValue;
	}
	public void setResultValue(byte resultValue) {
		this.resultValue = resultValue;
	}
	public byte[] getAdditionalInformation() {
		return additionalInformation;
	}
	public void setAdditionalInformation(byte[] additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
	public List<Tlv> getTlvs() {
		return tlvs;
	}
	public void setTlvs(List<Tlv> tlvs) {
		this.tlvs = tlvs;
	}
	
	
}
