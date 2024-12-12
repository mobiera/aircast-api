package com.mobiera.ms.mno.api.json;

import java.io.Serializable;

public class MmsMedia implements Serializable {
	
	private String contentType;
	private String url;
	private String name;
	private Integer visibilityInSeconds;
	
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVisibilityInSeconds() {
		return visibilityInSeconds;
	}
	public void setVisibilityInSeconds(Integer visibilityInSeconds) {
		this.visibilityInSeconds = visibilityInSeconds;
	}
}
