package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class StkBytecode implements Serializable {

	private static final long serialVersionUID = 7960755744857629469L;
	
	private List<Sms> mts;
	private String errorMsg;
	private Integer status;
	private Boolean excluded;
	private Boolean noSimFound;
	private Boolean noAppletImpl;
	
	public List<Sms> getMts() {
		return mts;
	}
	public void setMts(List<Sms> mts) {
		this.mts = mts;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getExcluded() {
		return excluded;
	}
	public void setExcluded(Boolean excluded) {
		this.excluded = excluded;
	}
	public Boolean getNoSimFound() {
		return noSimFound;
	}
	public void setNoSimFound(Boolean noSimFound) {
		this.noSimFound = noSimFound;
	}
	public Boolean getNoAppletImpl() {
		return noAppletImpl;
	}
	public void setNoAppletImpl(Boolean noAppletImpl) {
		this.noAppletImpl = noAppletImpl;
	}
	
	
	
}
