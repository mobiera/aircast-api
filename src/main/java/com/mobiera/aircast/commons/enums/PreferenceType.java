package com.mobiera.aircast.commons.enums;

public enum PreferenceType {
	
	STAT_KPIS("Stat KPIs", "Stat KPIs preferences"),
	UI("UI Preferences", "UI Preferences"),
	;
	
	private String label;
	private String description;
	
	private PreferenceType(String label, String description) {
		this.label = label;
		this.description = description;
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

