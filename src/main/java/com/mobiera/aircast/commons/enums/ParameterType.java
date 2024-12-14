package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum ParameterType implements Serializable {

	GLOBAL("Global configuration", "Global configuration"),
	KEYCLOAK("Keycloak", "Keycloak"),
	
	DASHBOARD("Dashboard", "Dashboard"),

	
	
	CAMPAIGN_POLICIES("Campaign Policies", "Campaign Policies"),
	DISCOVERY("Discovery", "Discovery"),
	SMPP("Smpp", "Smpp"),
	SLEEPY("Sleepy", "Sleepy"), 
	PONDERATION("Ponderation", "Ponderation"),
	USTK("Ustk", "Ustk"),
	SMS("Sms", "Sms"),
	MMS("Mms", "Mms"),
	
	RUN_TUNING("Run Tuning", "Run Tuning"),
	
	
	MESSAGING("Messaging", "Messaging"),
	ENTITY_MANAGEMENT("Entity Management", "Entity Management"),
	REST_CLIENT("Rest Client", "Rest Client"),
	FILE_MANAGEMENT("File Management", "File Management"),
	STATS("Stats", "Stats"), 
	
	VAS("Vas", "Vas"), 
	
	
	TEST_CAMPAIGN_IDS("Test Campaign Ids", "Test Campaign Ids"),
	DEVICE_AND_TAC_DB("Device and tac DB", "Device and tac DB"),
	
	API_LIMITS("API Limits", "API Limits"), 
	API_POLICIES("API Policies", "API Policies"), 
	API_DEBUG("API Debug", "Api Debug"),
	SERVICE_DEBUG("Service Debug", "Service Debug"),
	QUEUE_DEBUG("Queue Debug", "Queue Debug"),
	REMOTE_SERVICE_DEBUG("Remote Service Debug", "Remote Service Debug"),
	
	MICROSERVICE_DEBUG("Microservice Debug", "Microservice Debug"),
	
	
	;
	
	private String description;
	private String label;
	
	private ParameterType(String label, String description) {
		this.description = description;
		this.label = label;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getLabel() {
		return label;
	}


}