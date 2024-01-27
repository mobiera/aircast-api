package com.mobiera.aircast.api.v1.parameter;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.ParameterTypeVO;

@JsonInclude(Include.NON_NULL)
public class ListParameterTypesRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListParameterTypesRequestResult result;
	private String errorMessage;
	private List<ParameterTypeVO> parameterTypes;
	public ListParameterTypesRequestResult getResult() {
		return result;
	}
	public void setResult(ListParameterTypesRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<ParameterTypeVO> getParameterTypes() {
		return parameterTypes;
	}
	public void setParameterTypes(List<ParameterTypeVO> parameterTypes) {
		this.parameterTypes = parameterTypes;
	}
	
	
	
	


}
