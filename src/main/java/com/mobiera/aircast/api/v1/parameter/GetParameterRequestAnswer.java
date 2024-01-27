package com.mobiera.aircast.api.v1.parameter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.ParameterVO;

@JsonInclude(Include.NON_NULL)
public class GetParameterRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private GetParameterRequestResult result;
	private String errorMessage;
	private ParameterVO parameter;
	public final GetParameterRequestResult getResult() {
		return result;
	}
	public final void setResult(GetParameterRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final ParameterVO getParameter() {
		return parameter;
	}
	public final void setParameter(ParameterVO parameter) {
		this.parameter = parameter;
	}
	


}
