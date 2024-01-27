package com.mobiera.aircast.api.v1.ustk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;

@JsonInclude(Include.NON_NULL)
public class TextRequest extends UstkRequest
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	private String text1;
	@Required
	private String text2;
	private String tpda;
	private String mo;
	private Boolean useExperimentalFeatures;
	
	public String getText1() {
		return text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	public String getTpda() {
		return tpda;
	}
	public void setTpda(String tpda) {
		this.tpda = tpda;
	}
	public String getMo() {
		return mo;
	}
	public void setMo(String mo) {
		this.mo = mo;
	}
	

	@Override
	@JsonIgnore
	public String getOptionalParam() {
		return TEXT_REQUEST;
	}
	public Boolean getUseExperimentalFeatures() {
		return useExperimentalFeatures;
	}
	public void setUseExperimentalFeatures(Boolean useExperimentalFeatures) {
		this.useExperimentalFeatures = useExperimentalFeatures;
	}
	
	
	
}
