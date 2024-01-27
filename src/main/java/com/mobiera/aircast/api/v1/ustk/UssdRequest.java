package com.mobiera.aircast.api.v1.ustk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;

@JsonInclude(Include.NON_NULL)
public class UssdRequest extends UstkRequest
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	private String text1;
	private String title2;
	@Required
	private String ussdString;
	
	

	@Override
	@JsonIgnore
	public String getOptionalParam() {
		return CALL_REQUEST;
	}



	public String getText1() {
		return text1;
	}



	public void setText1(String text1) {
		this.text1 = text1;
	}



	public String getTitle2() {
		return title2;
	}



	public void setTitle2(String title2) {
		this.title2 = title2;
	}



	

	public String getUssdString() {
		return ussdString;
	}



	public void setUssdString(String ussdString) {
		this.ussdString = ussdString;
	}



	
}
