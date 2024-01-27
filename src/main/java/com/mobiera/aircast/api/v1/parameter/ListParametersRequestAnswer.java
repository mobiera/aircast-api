package com.mobiera.aircast.api.v1.parameter;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.ParameterVO;

@JsonInclude(Include.NON_NULL)
public class ListParametersRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListParametersRequestResult result;
	private String errorMessage;
	private List<ParameterVO> parameters;
	public final ListParametersRequestResult getResult() {
		return result;
	}
	public final void setResult(ListParametersRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final List<ParameterVO> getParameters() {
		return parameters;
	}
	public final void setParameters(List<ParameterVO> parameters) {
		this.parameters = parameters;
	}
	
	
	


}
