package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum EndpointType implements Serializable {

	NOTIFICATION(0,"Notification","Notification Endpoints are Endpoints used to send notifications to Third Party services when a subscriber SIM related data has changed." ),
	CAMPAIGN(1, "Campaign", "Campaign"),
	DEVICE_DB(2, "Device DB", "Device DB"),
	KINETIC_SUBSCRIBE_API(3, "Kinetic Subscribe API", "Kinetic Subscribe API"),
	TP(4, "Third Party", "Send Notifications to Third Party"),
	VIETTEL_MPS_SUBSCRIBE_API(5, "Viettel MPS Client", "Client to call Viettel MPS subscription endpoint"),
	MO_CALLBACK(6, "MO Callback", "Produces a USTK triggered MO message to a target KW/SC"),
	API(7, "API", "Produces a USTK triggered MO message to a target KW/SC"),
	KINETIC(8, "Third Party Kinetic Server", "Third Party Kinetic Server, for VaServices"),
	SMPP_SERVER(9, "Smpp Server", "Smpp Server"),
	MM7(10, "MM7 Client", "MM7 Client"),
	CAMPAIGN_SHORT_URL(11, "Campaign Short URL", "Campaign Short URL"),;
	
	private EndpointType(Integer index, String label, String description){
		this.index = index;
		this.label = label;
		this.description = description;
		
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static EndpointType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return NOTIFICATION;
			case 1: return CAMPAIGN;
			case 2: return DEVICE_DB;
			case 3: return KINETIC_SUBSCRIBE_API;
			case 4: return TP;
			case 5: return VIETTEL_MPS_SUBSCRIBE_API;
			case 6: return MO_CALLBACK;
			case 7: return API;
			case 8: return KINETIC;
			case 9: return SMPP_SERVER;
			case 10: return MM7;
			case 11: return CAMPAIGN_SHORT_URL;
			default: return null;
		}
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