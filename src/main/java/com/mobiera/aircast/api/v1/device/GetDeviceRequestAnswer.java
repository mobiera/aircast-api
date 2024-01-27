package com.mobiera.aircast.api.v1.device;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.DeviceVO;

@JsonInclude(Include.NON_NULL)
public class GetDeviceRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6097798713620249354L;
	private GetDeviceRequestResult result;
	private String errorMessage;
	
	private DeviceVO device;
	
	public final GetDeviceRequestResult getResult() {
		return result;
	}
	public final void setResult(GetDeviceRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final DeviceVO getDevice() {
		return device;
	}
	public final void setDevice(DeviceVO device) {
		this.device = device;
	}

}
