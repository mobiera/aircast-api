package com.mobiera.aircast.commons.enums;

public enum PreferenceName {
	
	KPI_UI_SMPP_ACCOUNT("SMPP_ACCOUNT", "KPI_UI_SMPP_ACCOUNT", "User kpi for Smpp Account entity"),
	KPI_UI_CAMPAIGN("CAMPAIGN", "KPI_UI_CAMPAIGN", "User kpi for Campaign entity"),
	KPI_UI_CAMPAIGN_PARAMS("CAMPAIGN_PARAMS", "KPI_UI_CAMPAIGN_PARAMS", "User kpi for Campaign Params entity"),
	KPI_UI_CAMPAIGN_DATA("CAMPAIGN_DATA", "KPI_UI_CAMPAIGN_DATA", "User kpi for Campaign Data entity"),
	KPI_UI_CAMPAIGN_SCHEDULE("CAMPAIGN_SCHEDULE", "KPI_UI_CAMPAIGN_SCHEDULE", "User kpi for Campaign Schedule entity"),
	KPI_UI_ENDPOINT("ENDPOINT", "KPI_UI_ENDPOINT", "User kpi for Endpoint entity"),
	;
	
	private String statClass;
	private String label;
	private String description;
	
	private PreferenceName(String statClass, String label, String description) {
		this.statClass = statClass;
		this.label = label;
		this.description = description;
	}

	public String getStatClass() {
		return statClass;
	}

	public void setStatClass(String statClass) {
		this.statClass = statClass;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return this.name();
	}
	
	public String getName() {
		return this.toString();
	}

	public String getLabel() {
		return label;
	}
	
	
}

