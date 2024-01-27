package com.mobiera.aircast.api.v1.sms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BinarySmsRequest extends SmsRequest
{
	private static final long serialVersionUID = 5241060010966633233L;
	private byte[] bytes;
	private Byte pid;
	private Byte esmClass;
	
	
	public final Byte getPid() {
		return pid;
	}
	public final void setPid(Byte pid) {
		this.pid = pid;
	}
	public final Byte getEsmClass() {
		return esmClass;
	}
	public final void setEsmClass(Byte esmClass) {
		this.esmClass = esmClass;
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	
	

	
	
}
