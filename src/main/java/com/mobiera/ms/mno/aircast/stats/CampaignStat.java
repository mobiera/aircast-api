package com.mobiera.ms.mno.aircast.stats;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum CampaignStat implements StatEnum {

	DATE_TS(-1, "Date", true),
	RUN_STARTED(0, "Run Started", true),
	RUN_SUCCESS(1, "Run Success", true),
	RUN_SUCCESS_USTK_OK(2, "Run Success", true),
	RUN_SUCCESS_USTK_CANCEL(3, "Run Success", true),
	RUN_SUCCESS_USTK_BACK(4, "Run Success", true),
	RUN_SUCCESS_USTK_TIMEOUT(5, "Run Success", true),
	RUN_SUCCESS_USTK_ERROR(6, "Run Success", true),
	RUN_SUCCESS_SLEEPY_OK(7, "Run Success", true),
	RUN_SUCCESS_SLEEPY_CANCEL(8, "Run Success", true),
	RUN_SUCCESS_SLEEPY_BACK(9, "Run Success", true),
	RUN_SUCCESS_SLEEPY_TIMEOUT(10, "Run Success", true),
	RUN_SUCCESS_SLEEPY_ERROR(11, "Run Success", true),
	RUN_SUCCESS_DISCOVERY_LEGACY(12, "Run Success", true),
	RUN_SUCCESS_DISCOVERY_SLEEPY(13, "Run Success", true),
	RUN_ERROR(14, "Run Error", true),
	RUN_TIMEOUT(15, "Run Timeout", true),
	PKT_SUBMITTED(16, "Packet Submitted", true),
	PKT_ACCEPTED(17, "Packet Accepted", true),
	PKT_DELIVERED(18, " Packet Delivered", true),
	PKT_UNDELIVERABLE(19, "Packet Undeliverable", true),
	PKT_CIPHERING_ERROR(20, "Packet Ciphering Error", true),
	RAM_LOAD_ERROR(21, "Ram Applet Load Error", true),
	RAM_INSTALL_ERROR(22, "Ram Applet Install Error", true),
	RAM_PING_SENT(23, "Ram Applet Ping Sent", true),
	RAM_PING_RESPONSE_RECEIVED(24, "Ram Applet Ping Response Received", true),
	API_QUEUE_FULL(25, "API Queue Full", true),
	PKT_POR_OK(26, "Packet PoR OK", true),
	PKT_POR_ERROR(27, "Packet PoR Error", true),
	PA(28, "Purchase Attempt", true),
	VIEWED_1(29, "Viewed 1", true),
	OK_1(30, "Ok 1",  true),
	CANCEL_1(31, "Cancel 1", true),
	BACK_1(32, "Back 1", true),
	TIMEOUT_1(33, "Timeout 1", true),
	ERROR_1(34, "Error 1",  false),
	VIEWED_2(35, "Viewed 2", true),
	OK_2(36, "Ok 2",  true),
	CANCEL_2(37, "Cancel 2",  true),
	BACK_2(38, "Back 2",  true),
	TIMEOUT_2(39, "Timeout 2",  true),
	ERROR_2(40, "Error 2",  false);
	
	
	
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
			case 2: return RUN_SUCCESS_USTK_OK;
			case 3: return RUN_SUCCESS_USTK_CANCEL;
			case 4: return RUN_SUCCESS_USTK_BACK;
			case 5: return RUN_SUCCESS_USTK_TIMEOUT;
			case 6: return RUN_SUCCESS_USTK_ERROR;
			case 7: return RUN_SUCCESS_SLEEPY_OK;
			case 8: return RUN_SUCCESS_SLEEPY_CANCEL;
			case 9: return RUN_SUCCESS_SLEEPY_BACK;
			case 10: return RUN_SUCCESS_SLEEPY_TIMEOUT;
			case 11: return RUN_SUCCESS_SLEEPY_ERROR;
			case 12: return RUN_SUCCESS_DISCOVERY_LEGACY;
			case 13: return RUN_SUCCESS_DISCOVERY_SLEEPY;
			case 14: return RUN_ERROR;
			case 15: return RUN_TIMEOUT;
			case 16: return PKT_SUBMITTED;
			case 17: return PKT_ACCEPTED;
			case 18: return PKT_DELIVERED;
			case 19: return PKT_UNDELIVERABLE;
			case 20: return PKT_CIPHERING_ERROR;
			case 21: return RAM_LOAD_ERROR;
			case 22: return RAM_INSTALL_ERROR;
			case 23: return RAM_PING_SENT;
			case 24: return RAM_PING_RESPONSE_RECEIVED;
			case 25: return API_QUEUE_FULL;
			case 26: return PKT_POR_OK;
			case 27: return PKT_POR_ERROR;
			case 28: return PA;
			case 29: return VIEWED_1;
			case 30: return OK_1;
			case 31: return CANCEL_1;
			case 32: return BACK_1;
			case 33: return TIMEOUT_1;
			case 34: return ERROR_1;
			case 35: return VIEWED_2;
			case 36: return OK_2;
			case 37: return CANCEL_2;
			case 38: return BACK_2;
			case 39: return TIMEOUT_2;
			case 40: return ERROR_2;
			
			
			default: return null;
		}
	}

}