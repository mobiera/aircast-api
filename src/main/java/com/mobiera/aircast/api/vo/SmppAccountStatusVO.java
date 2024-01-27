package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.ServiceStatus;
import com.mobiera.commons.vo.ServiceStatusVO;

@JsonInclude(Include.NON_NULL)
public class SmppAccountStatusVO extends ServiceStatusVO implements Serializable {

	private static final long serialVersionUID = 7546227796132798728L;

	private ServiceStatus smppServiceStatus;
	private ServiceStatus moDespoolServiceStatus;
	private ServiceStatus mtDespoolServiceStatus;
	private ServiceStatus purgeExpiredServiceStatus;
	
	
	public final ServiceStatus getSmppServiceStatus() {
		return smppServiceStatus;
	}
	public final void setSmppServiceStatus(ServiceStatus smppServiceStatus) {
		this.smppServiceStatus = smppServiceStatus;
	}
	public final ServiceStatus getMoDespoolServiceStatus() {
		return moDespoolServiceStatus;
	}
	public final void setMoDespoolServiceStatus(ServiceStatus moDespoolServiceStatus) {
		this.moDespoolServiceStatus = moDespoolServiceStatus;
	}
	public final ServiceStatus getMtDespoolServiceStatus() {
		return mtDespoolServiceStatus;
	}
	public final void setMtDespoolServiceStatus(ServiceStatus mtDespoolServiceStatus) {
		this.mtDespoolServiceStatus = mtDespoolServiceStatus;
	}
	public final ServiceStatus getPurgeExpiredServiceStatus() {
		return purgeExpiredServiceStatus;
	}
	public final void setPurgeExpiredServiceStatus(ServiceStatus purgeExpiredServiceStatus) {
		this.purgeExpiredServiceStatus = purgeExpiredServiceStatus;
	}
	
}
