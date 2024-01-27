package com.mobiera.aircast.commons.enums.statsold;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum CampaignStat implements StatEnum {

	DATE_TS(-1, "Date", true),
	RUN_STARTED(0, "Run Started", true),
	RUN_SUCCESS(1, "Run Success", true),
	RUN_ERROR(2, "Run Error", true),
	RUN_TIMEOUT(3, "Run Timeout", true),
	PKT_SUBMITTED(4, "Packet Submitted", true),
	PKT_ACCEPTED(5, "Packet Accepted", true),
	PKT_DELIVERED(6, " Packet Delivered", true),
	PKT_UNDELIVERABLE(7, "Packet Undeliverable", true),
	PKT_CIPHERING_ERROR(8, "Packet Ciphering Error", true),
	RAM_LOAD_ERROR(9, "Ram Applet Load Error", true),
	RAM_INSTALL_ERROR(10, "Ram Applet Install Error", true),
	RAM_PING_SENT(11, "Ram Applet Ping Sent", true),
	RAM_PING_RESPONSE_RECEIVED(12, "Ram Applet Ping Response Received", true),
	SLEEPY_CMD_NOT_SUPPORTED(13, "Sleepy Command Not Supported", true),
	SLEEPY_WRONG_SESSION_ID(14, "Sleepy Wrong Session Id", true),
	SLEEPY_WRONG_PROTOCOL_VER(15, "Sleepy Wrong Protocol Version", true),
	SLEEPY_CMD_FAILED(16, "Sleepy Command Failed", true),
	SLEEPY_WRONG_RSP_PARAMS(17, "Sleepy Wrong Response Parameters", true),
	SLEEPY_UNSPECIFIED_ERROR(18, "Sleepy Unspecified Error", true),
	SLEEPY_RSP_FAILED(19, "Sleepy Response Failed", true),
	SLEEPY_CMD_ABORTED(20, "Sleepy Command Aborted", true),
	SLEEPY_CIPHER_ERROR(21, "Sleepy Cipher Error", true),
	API_QUEUE_FULL(22, "API Queue Full", true),
	PKT_POR_OK(23, "Packet PoR OK", true),
	PKT_POR_ERROR(24, "Packet PoR Error", true),
	PA(25, "Purchase Attempt", true);
	
	
	
	private Boolean showByDefault;
	public Boolean isShowByDefault() {
		return showByDefault;
	}
	private CampaignStat(Integer index, String label, Boolean showByDefault){
		this.index = index;
		this.label = label;
		this.showByDefault = showByDefault;
	}
	private Integer index;
	public Integer getIndex(){
		return this.index;
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
	public static CampaignStat getEnum(Integer index){
		if (index == null)
	return null;
		switch(index){
			case -1: return DATE_TS;
			case 0: return RUN_STARTED;
			case 1: return RUN_SUCCESS;
			case 2: return RUN_ERROR;
			case 3: return RUN_TIMEOUT;
			case 4: return PKT_SUBMITTED;
			case 5: return PKT_ACCEPTED;
			case 6: return PKT_DELIVERED;
			case 7: return PKT_UNDELIVERABLE;
			case 8: return PKT_CIPHERING_ERROR;
			case 9: return RAM_LOAD_ERROR;
			case 10: return RAM_INSTALL_ERROR;
			case 11: return RAM_PING_SENT;
			case 12: return RAM_PING_RESPONSE_RECEIVED;
			case 13: return SLEEPY_CMD_NOT_SUPPORTED;
			case 14: return SLEEPY_WRONG_SESSION_ID;
			case 15: return SLEEPY_WRONG_PROTOCOL_VER;
			case 16: return SLEEPY_CMD_FAILED;
			case 17: return SLEEPY_WRONG_RSP_PARAMS;
			case 18: return SLEEPY_UNSPECIFIED_ERROR;
			case 19: return SLEEPY_RSP_FAILED;
			case 20: return SLEEPY_CMD_ABORTED;
			case 21: return SLEEPY_CIPHER_ERROR;
			case 22: return API_QUEUE_FULL;
			case 23: return PKT_POR_OK;
			case 24: return PKT_POR_ERROR;
			case 25: return PA;
			
			
			default: return null;
		}
	}

}