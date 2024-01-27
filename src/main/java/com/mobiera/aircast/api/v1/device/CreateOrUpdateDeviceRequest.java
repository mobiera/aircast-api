package com.mobiera.aircast.api.v1.device;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.DeviceVO;

@JsonInclude(Include.NON_NULL)
public class CreateOrUpdateDeviceRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private DeviceVO device;
	
	public DeviceVO getDevice() {
		return device;
	}
	public void setDevice(DeviceVO device) {
		this.device = device;
	}
	
}
