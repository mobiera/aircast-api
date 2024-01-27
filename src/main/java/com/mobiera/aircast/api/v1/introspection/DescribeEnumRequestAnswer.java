package com.mobiera.aircast.api.v1.introspection;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.EnumValueVO;

@JsonInclude(Include.NON_NULL)
public class DescribeEnumRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private DescribeEnumRequestResult result;
	private String errorMessage;
	private List<EnumValueVO> values;
	private String enumName;
	
	public final DescribeEnumRequestResult getResult() {
		return result;
	}
	public final void setResult(DescribeEnumRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public List<EnumValueVO> getValues() {
		return values;
	}
	public void setValues(List<EnumValueVO> values) {
		this.values = values;
	}
	public String getEnumName() {
		return enumName;
	}
	public void setEnumName(String enumName) {
		this.enumName = enumName;
	}
	
	


}
