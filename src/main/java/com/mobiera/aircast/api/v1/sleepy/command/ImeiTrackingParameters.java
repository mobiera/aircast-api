package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;


/**
 * 
 * Represents a IMEI tracking configuration.
 * <p>
 * <b>statusTrigger</b>: number of status to wait to trigger action.
 * <p>
 * <b>maxRetryCount</b>: maximum number of attempts.
 * <p>
 * <b>enabled</b>: Enable/disable IMEI tracking.
 * <p>
 * <b>action</b>: {@link ApiSleepyCommand} action to perform when IMEI changed, usually a SendSms.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class ImeiTrackingParameters implements Serializable {

	private static final long serialVersionUID = 1037932664801740770L;
	@Required
	private Boolean enabled;
	@Required
	private Byte statusTrigger;
	@Required
	private Byte maxRetryCount;
	@Required
	private ApiSleepyCommand action;
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Byte getStatusTrigger() {
		return statusTrigger;
	}
	public void setStatusTrigger(Byte statusTrigger) {
		this.statusTrigger = statusTrigger;
	}
	public Byte getMaxRetryCount() {
		return maxRetryCount;
	}
	public void setMaxRetryCount(Byte maxRetryCount) {
		this.maxRetryCount = maxRetryCount;
	}
	public ApiSleepyCommand getAction() {
		return action;
	}
	public void setAction(ApiSleepyCommand action) {
		this.action = action;
	}
	
}
