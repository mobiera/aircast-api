package com.mobiera.ms.mno.api.json;

import java.io.Serializable;

public class MmsMedia implements Serializable {
	
	private String contentType;
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
