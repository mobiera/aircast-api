package com.mobiera.ms.mno.aircast.filter;

public enum HttpInternalAttributes {
	
	/*MOBIERA_ADMIN_USER_ID("user_id"),
	MOBIERA_ADMIN_APP_ID("app_id"),*/
	
	USER_CONTEXT("user_context");
	
	
	
	private String name;
	
	private HttpInternalAttributes(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
