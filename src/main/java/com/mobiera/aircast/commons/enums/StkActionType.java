package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum StkActionType implements Serializable {
	
	
	DisplayTextVO("Display Text", "Display Text Action"),
	SelectItemVO("Select Item", "Select Item Action"),
	GetInputVO("Get Input", "Get Input Action"),
	UrlVO("Url", "Url Action"),
	CallVO("Call", "Call Action"),
	UssdVO("Ussd", "Ussd Action"),
	MoVO("Mo SMS", "Mo SMS Action"),
	TriggerVO("Trigger", "Trigger Action"),
	ConcatenateVO("Concatenate", "Concatenate Action");
	
	
	
	
	private StkActionType(String label, String description){
		this.label = label;
		this.description = description;
		
	}

	
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
