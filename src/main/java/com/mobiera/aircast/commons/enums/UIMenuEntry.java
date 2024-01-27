package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum UIMenuEntry implements Serializable {

	DASHBOARD("Dashboard", "Dashboard"),
	APPLET("Applets", "Manage Applets" ),
	TP_RULE("Tp Rules", "Configure MT SMSC throughput"),
	ENDPOINT("Endpoints", "Manage Endpoints"),
	SMPP_ACCOUNT("Smpp Accounts", "Manage Smpp Accounts"),
	SIM_PROFILE("Sim Profiles", "Manage Sim Profiles"),
	CAMPAIGN("Campaigns", "Manage Campaigns"),
	SCHEDULE("Scheduler", "Schedule Campaigns"),
	FILE("Files", "Manage Files"),
	SIM("Sims", "Find and edit SIMs"),
	VA_SERVICE("Va Services", "Manage Value Added Services"),
	PRICEPOINT("Pricepoints", "Manage Pricepoints"),
	IDENTIFIER("Identifiers", "Manage Identifiers"),
	LANDING("Landings", "Manage Landings"),
	SUBSCRIPTION_EVENT("Vas Subscriptions", "Vas Subscriptions"),
	STATS("Stats", "View Statistics"),
	SIM_STATS("Sim Stats", "View Sim Statistics"),
	PARAMETER("Aircast Settings", "Configure Aircast Settings"),
	;
	private UIMenuEntry(String label, String description){
		this.label = label;
		this.description = description;
		
	}
/*
	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static UIMenuEntry getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return APPLET;
			case 1: return CAMPAIGN;
			case 2: return ENDPOINT;
			case 3: return SIM_PROFILE;
			case 4: return SIM;
			case 5: return SMPP_ACCOUNT;
			case 6: return TP_RULE;
			case 7: return PARAMETER;
			case 8: return SCHEDULE;
			case 9: return FILE;
			case 10: return DASHBOARD;
			case 11: return STATS;
			default: return null;
		}
	}
*/
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