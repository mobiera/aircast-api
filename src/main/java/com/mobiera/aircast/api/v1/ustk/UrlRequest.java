package com.mobiera.aircast.api.v1.ustk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;

@JsonInclude(Include.NON_NULL)
public class UrlRequest extends UstkRequest
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	private String text1;
	@Required
	private String title2;
	@Required
	private String url;
	@Deprecated
	private String url2;
	private String flashSmsText;
	private String smsText;
	private Boolean alwaysSendSmsText;
	
	

	@Override
	@JsonIgnore
	public String getOptionalParam() {
		return URL_REQUEST;
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



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getFlashSmsText() {
		return flashSmsText;
	}



	public void setFlashSmsText(String flashSmsText) {
		this.flashSmsText = flashSmsText;
	}



	public String getSmsText() {
		return smsText;
	}



	public void setSmsText(String smsText) {
		this.smsText = smsText;
	}



	public Boolean getAlwaysSendSmsText() {
		return alwaysSendSmsText;
	}



	public void setAlwaysSendSmsText(Boolean alwaysSendSmsText) {
		this.alwaysSendSmsText = alwaysSendSmsText;
	}



	@Deprecated
	public String getUrl2() {
		return url2;
	}


	@Deprecated
	public void setUrl2(String url2) {
		this.url2 = url2;
	}
	
	
	
}
