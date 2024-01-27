package com.mobiera.aircast.api.v1.sleepy.response;


import java.io.Serializable;
import java.util.List;

import com.mobiera.aircast.api.v1.sleepy.command.UpdateConfigParametersCommand;

/**
 * List of {@link UpdateConfigParametersResponseTLV} response TLVs received when sending a {@link UpdateConfigParametersCommand} command.
 * <p>
 * @author mj
 */
public class UpdateConfigParametersResponse extends SleepyResponse implements Serializable {

	private static final long serialVersionUID = 4817958428073934034L;
	private List<UpdateConfigParametersResponseTLV> responseTlvs;
	public List<UpdateConfigParametersResponseTLV> getResponseTlvs() {
		return responseTlvs;
	}
	public void setResponseTlvs(List<UpdateConfigParametersResponseTLV> responseTlvs) {
		this.responseTlvs = responseTlvs;
	}
	
}
