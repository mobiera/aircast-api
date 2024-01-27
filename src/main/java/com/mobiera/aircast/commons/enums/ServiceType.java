package com.mobiera.aircast.commons.enums;

public enum ServiceType {
	SMPP_ACCOUNT, CAMPAIGN, STATS, ENDPOINT;
	
	
	
	public String getValue() {
		return this.name();
	}
	private String label;
	public String getLabel() {
		return label;
	}
	
	private String description;
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return this.toString();
	}
}
