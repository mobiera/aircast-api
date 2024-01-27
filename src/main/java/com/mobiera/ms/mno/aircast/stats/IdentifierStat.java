package com.mobiera.ms.mno.aircast.stats;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum IdentifierStat implements StatEnum {

	DATE_TS(-1, "Date", true),
	
	MT_ATTEMPT(48, "MT Attempt", false),
	MT_OK(49, "Mt", true),
	MT_ERROR(50, "MT Error", false),
	MO_OK(51, "Mo", true),
	SUBSCRIBE(52, "Subscribe", true),
	SUBSCRIBE_KEYWORD(53, "Subscribe Keyword", true),
	SUBSCRIBE_SIM(54, "Subscribe Sim", true),
	SUBSCRIBE_AUTH_HE(55, "Subscribe Auth HE", true),
	SUBSCRIBE_AUTH_OTP(56, "Subscribe Auth OTP", true),
	SUBSCRIBE_PM(57, "Subscribe PM", true),
	SUBSCRIBE_USSD(58, "Subscribe Ussd", false),
	SUBSCRIBE_OTHERS(59, "Subscribe Others", true),
	CHARGED(128, "Charged", true),
	UNSUBSCRIBE(60, "Unsubscribe", true),
	UNSUBSCRIBE_KEYWORD(61, "Unsubscribe Keyword", true),
	UNSUBSCRIBE_API(62, "Unsubscribe API", true),
	UNSUBSCRIBE_SERVICE_UI(63, "Unsubscribe Service UI", true),
	UNSUBSCRIBE_SUPPORT(64, "Unsubscribe Support", false),
	UNSUBSCRIBE_OTHERS(65, "Unsubscribe Others", false),
	UNSUBSCRIBE_POLICY(66, "Unsubscribe Policy", false),
	
	
	NOTIF_ADN(67, "Notif Adn", true),
	
	
	CHARGING_ATTEMPT(70, "Charging Attempt", true),
	CHARGING_OK(71, "Charging OK", true),
	CHARGING_NO_FUNDS(72, "Charging No Funds", true),
	CHARGING_ERROR(73, "Charging Error", false),
	
	SENT_OTP(76, "Sent OTP", false),
	AUTH_HE(77, "Auth HE", false),
	AUTH_OTP(78, "Auth OTP", false),
	
	
	O_SUBS_ATTEMPT(80, "O Subscribe Attempt", true),
	O_SUBS_SUCCESS(81, "O Subscribe Success", true),
	O_SUBS_ERROR(82, "O Subscribe Error", false),
	O_UNSUBS_ATTEMPT(83, "O Unsubscribe Attempt", true),
	O_UNSUBS_SUCCESS(84, "O Unsubscribe Success", true),
	O_UNSUBS_ERROR(85, "O Subscribe Error", false),
	
	
	;
	private Boolean showByDefault;
	
	private IdentifierStat(Integer index, String label, Boolean showByDefault){
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
	
	public static IdentifierStat getEnum(Integer index){
		if (index == null)
	return null;
		
		switch(index){
			case -1: return DATE_TS;
			
			case 48: return MT_ATTEMPT;
			case 49: return MT_OK;
			case 50: return MT_ERROR;
			case 51: return MO_OK;
			case 52: return SUBSCRIBE;
			case 53: return SUBSCRIBE_KEYWORD;
			case 54: return SUBSCRIBE_SIM;
			case 55: return SUBSCRIBE_AUTH_HE;
			case 56: return SUBSCRIBE_AUTH_OTP;
			case 57: return SUBSCRIBE_PM;
			case 58: return SUBSCRIBE_USSD;
			case 59: return SUBSCRIBE_OTHERS;
			case 60: return UNSUBSCRIBE;
			case 61: return UNSUBSCRIBE_KEYWORD;
			case 62: return UNSUBSCRIBE_API;
			case 63: return UNSUBSCRIBE_SERVICE_UI;
			case 64: return UNSUBSCRIBE_SUPPORT;
			case 65: return UNSUBSCRIBE_OTHERS;
			case 70: return CHARGING_ATTEMPT;
			case 71: return CHARGING_OK;
			case 72: return CHARGING_NO_FUNDS;
			case 73: return CHARGING_ERROR;
			
			case 76: return SENT_OTP;
			case 77: return AUTH_HE;
			case 78: return AUTH_OTP;
			
			
			case 80: return O_SUBS_ATTEMPT;
			case 81: return O_SUBS_SUCCESS;
			case 82: return O_SUBS_ERROR;
			case 83: return O_UNSUBS_ATTEMPT;
			case 84: return O_UNSUBS_SUCCESS;
			case 85: return O_UNSUBS_ERROR;
			
			case 128: return CHARGED;
			
			
			
			
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