package com.mobiera.ms.mno.aircast.stats;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum SmppAccountStat implements StatEnum {

	DATE_TS(-1, "Date", true),
	SUBMIT_SM(0, "Submit", true),
	SUBMIT_SM_RESP(1, "Submit Resp", true),
	SUBMIT_SM_RESP_OK(2, "Submit Resp OK", true),
	SUBMIT_SM_RESP_ERROR(3, "Submit Resp Error", true),
	SUBMIT_SM_RESP_TEMP_ERROR(4, "Submit Resp Temp Error", true),
	SUBMIT_SM_RESP_FATAL_ERROR(5, "Submit Resp Fatal Error", true),
	SUBMIT_SM_RESP_TIMEOUT(6, "Submit Resp Timeout", true),
	DELIVER_SM(7, "Deliver", true),
	DELIVER_SM_DLR(8, "Deliver Dlr", true),
	DELIVER_SM_DLR_OK(9, "Deliver Dlr OK", true),
	DELIVER_SM_DLR_ERROR(10, "Deliver Dlr Error", true),
	DELIVER_SM_MESSAGING(11, "Deliver Messaging", true),
	DELIVER_SM_USTK_LEGACY(12, "Deliver Ustk Legacy", true),
	DELIVER_SM_USTK_SLEEPY(13, "Deliver Ustk Sleepy", true),
	DELIVER_SM_SLEEPY(14, "Deliver Sleepy", true),
	DELIVER_SM_SLEEPY_FLOW_TRIGGER(15, "Deliver Sleepy Flow Trigger", true),
	DELIVER_SM_DISCOVERY_LEGACY(16, "Deliver Disco Legacy", true),
	DELIVER_SM_DISCOVERY_SLEEPY(17, "Deliver Disco Sleepy", true),
	BIND(18, "Bind", false),
	BIND_RESP(19, "Bind Resp", false),
	BIND_RESP_OK(20, "Bind Resp OK", false),
	BIND_RESP_ERROR(21, "Bind Resp Error", false),
	BIND_RESP_TEMP_ERROR(22, "Bind Resp Temp Error", false),
	BIND_RESP_FATAL_ERROR(23, "Bind Resp Fatal Error", false),
	BIND_RESP_TIMEOUT(24, "Bind Resp Timeout", false),
	EL(25, "El", false),
	EL_RESP(26, "El Resp", false),
	EL_RESP_TIMEOUT(27, "El Resp Timeout", false),
	
	;
	private Boolean showByDefault;
	
	private SmppAccountStat(Integer index, String label, Boolean showByDefault){
		this.index = index;
		this.label = label;
		this.showByDefault = showByDefault;
	}

	public Boolean isShowByDefault() {
		return showByDefault;
	}
	private Integer index;

	public Integer getIndex(){
		return this.index;
	}
	
	public static SmppAccountStat getEnum(Integer index){
		if (index == null)
	return null;
		
		switch(index){
			case -1: return DATE_TS;
			case 0: return SUBMIT_SM;
			case 1: return SUBMIT_SM_RESP;
			case 2: return SUBMIT_SM_RESP_OK;
			case 3: return SUBMIT_SM_RESP_ERROR;
			case 4: return SUBMIT_SM_RESP_TEMP_ERROR;
			case 5: return SUBMIT_SM_RESP_FATAL_ERROR;
			case 6: return SUBMIT_SM_RESP_TIMEOUT;
			case 7: return DELIVER_SM;
			case 8: return DELIVER_SM_DLR;
			case 9: return DELIVER_SM_DLR_OK;
			case 10: return DELIVER_SM_DLR_ERROR;
			case 11: return DELIVER_SM_MESSAGING;
			case 12: return DELIVER_SM_USTK_LEGACY;
			case 13: return DELIVER_SM_USTK_SLEEPY;
			case 14: return DELIVER_SM_SLEEPY;
			case 15: return DELIVER_SM_SLEEPY_FLOW_TRIGGER;
			case 16: return DELIVER_SM_DISCOVERY_LEGACY;
			case 17: return DELIVER_SM_DISCOVERY_SLEEPY;
			case 18: return BIND;
			case 19: return BIND_RESP;
			case 20: return BIND_RESP_OK;
			case 21: return BIND_RESP_ERROR;
			case 22: return BIND_RESP_TEMP_ERROR;
			case 23: return BIND_RESP_FATAL_ERROR;
			case 24: return BIND_RESP_TIMEOUT;
			case 25: return EL;
			case 26: return EL_RESP;
			case 27: return EL_RESP_TIMEOUT;
			
			
			
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