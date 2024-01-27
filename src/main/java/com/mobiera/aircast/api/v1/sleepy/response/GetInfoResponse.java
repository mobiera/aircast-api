package com.mobiera.aircast.api.v1.sleepy.response;


import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.v1.sleepy.command.GetInfoCommand;

/**
 * List of {@link GetInfoResponseTLV} response TLVs received when sending a {@link GetInfoCommand} command.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class GetInfoResponse extends SleepyResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3517108097452322653L;
	private List<GetInfoResponseTLV> responseTlvs;
	public List<GetInfoResponseTLV> getResponseTlvs() {
		return responseTlvs;
	}
	public void setResponseTlvs(List<GetInfoResponseTLV> responseTlvs) {
		this.responseTlvs = responseTlvs;
	}
	

	
}
