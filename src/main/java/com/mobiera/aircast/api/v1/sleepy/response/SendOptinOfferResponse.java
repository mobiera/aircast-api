package com.mobiera.aircast.api.v1.sleepy.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.v1.sleepy.command.SendOptinOfferCommand;
import com.mobiera.aircast.commons.enums.ActionResult;

/**
 * Response to a {@link SendOptinOfferCommand} executed by Applet.

 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class SendOptinOfferResponse extends SleepyResponse implements Serializable {

	private static final long serialVersionUID = 1205228553313195076L;
	private ActionResult flowExecutionCode;
	private byte lastActionId;
	private byte [] outputVarValue;
	private String outputVarValueStr;
	
	
	public byte getLastActionId() {
		return lastActionId;
	}
	public void setLastActionId(byte lastActionId) {
		this.lastActionId = lastActionId;
	}
	public byte[] getOutputVarValue() {
		return outputVarValue;
	}
	public void setOutputVarValue(byte[] outputVarValue) {
		this.outputVarValue = outputVarValue;
	}
	public String getOutputVarValueStr() {
		return outputVarValueStr;
	}
	public void setOutputVarValueStr(String outputVarValueStr) {
		this.outputVarValueStr = outputVarValueStr;
	}
	public ActionResult getFlowExecutionCode() {
		return flowExecutionCode;
	}
	public void setFlowExecutionCode(ActionResult flowExecutionCode) {
		this.flowExecutionCode = flowExecutionCode;
	}
}
