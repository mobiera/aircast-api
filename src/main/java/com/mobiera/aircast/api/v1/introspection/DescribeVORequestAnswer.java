package com.mobiera.aircast.api.v1.introspection;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.FieldVO;
import com.mobiera.commons.introspection.MainVO;

@JsonInclude(Include.NON_NULL)
public class DescribeVORequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private DescribeVORequestResult result;
	private String errorMessage;
	private List<FieldVO> fields;
	private MainVO main;
	
	private String voName;
	
	
	public DescribeVORequestResult getResult() {
		return result;
	}
	public void setResult(DescribeVORequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getVoName() {
		return voName;
	}
	public void setVoName(String voName) {
		this.voName = voName;
	}
	public List<FieldVO> getFields() {
		return fields;
	}
	public void setFields(List<FieldVO> fields) {
		this.fields = fields;
	}
	public MainVO getMain() {
		return main;
	}
	public void setMain(MainVO main) {
		this.main = main;
	}
	
	
	
	


}
