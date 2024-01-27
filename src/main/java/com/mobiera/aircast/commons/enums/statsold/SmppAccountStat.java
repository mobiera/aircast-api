package com.mobiera.aircast.commons.enums.statsold;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum SmppAccountStat implements StatEnum {

	DATE_TS(-1, "Date", true),
	SUBMIT_SM(0, "Submit SM", true),
	SUBMIT_SM_RESP(1, "Submit SM Resp", true),
	SUBMIT_SM_RESP_OK(2, "Submit SM Resp OK", true),
	SUBMIT_SM_RESP_ERROR(3, "Submit SM Resp Error", true),
	SUBMIT_SM_RESP_TEMP_ERROR(4, "Submit SM Resp Temp Error", true),
	SUBMIT_SM_RESP_FATAL_ERROR(5, "Submit SM Resp Fatal Error", true),
	SUBMIT_SM_RESP_TIMEOUT(6, "Submit SM Resp Timeout", true),
	DELIVER_SM(10, "Deliver SM", true),
	DELIVER_SM_DLR(11, "Deliver SM Dlr", true),
	DELIVER_SM_SIM(12, "Deliver SM Sim", true),
	DELIVER_SM_USER(13, "Deliver SM User", true),
	BIND(16, "Bind", false),
	BIND_RESP(17, "Bind Resp", false),
	BIND_RESP_OK(18, "Bind Resp OK", false),
	BIND_RESP_ERROR(19, "Bind Resp Error", false),
	BIND_RESP_TEMP_ERROR(20, "Bind Resp Temp Error", false),
	BIND_RESP_FATAL_ERROR(21, "Bind Resp Fatal Error", false),
	BIND_RESP_TIMEOUT(22, "Bind Resp Timeout", false),
	EL(25, "El", false),
	EL_RESP(26, "El Resp", false),
	EL_RESP_TIMEOUT(27, "El Resp Timeout", false),
	DELIVER_SM_ROUTED(28, "Deliver Sm Routed", true),
	DELIVER_SM_SESSION(29, "Deliver Sm Session", true);
	
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
			case 10: return DELIVER_SM;
			case 11: return DELIVER_SM_DLR;
			case 12: return DELIVER_SM_SIM;
			case 13: return DELIVER_SM_USER;
			case 16: return BIND;
			case 17: return BIND_RESP;
			case 18: return BIND_RESP_OK;
			case 19: return BIND_RESP_ERROR;
			case 20: return BIND_RESP_TEMP_ERROR;
			case 21: return BIND_RESP_FATAL_ERROR;
			case 22: return BIND_RESP_TIMEOUT;
			case 25: return EL;
			case 26: return EL_RESP;
			case 27: return EL_RESP_TIMEOUT;
			case 28: return DELIVER_SM_ROUTED;
			case 29: return DELIVER_SM_SESSION;
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