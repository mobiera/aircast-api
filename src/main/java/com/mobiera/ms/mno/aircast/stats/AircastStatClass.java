package com.mobiera.ms.mno.aircast.stats;

import com.mobiera.ms.commons.stats.api.StatClass;

public enum AircastStatClass implements StatClass {

	SMPP_ACCOUNT(0,SmppAccountStat.class.getSimpleName(), "Smpp Account"),
	CAMPAIGN(1,CampaignStat.class.getSimpleName(), "Campaign"),
	CAMPAIGN_PARAMS(2,CampaignStat.class.getSimpleName(), "Campaign Parameter"),
	ENDPOINT(3,EndpointStat.class.getSimpleName(), "Endpoint"),
	ACTION_TRIGGER(4,ActionTriggerStat.class.getSimpleName(), "Action Trigger"),
	CAMPAIGN_SCHEDULE(5,CampaignScheduleStat.class.getSimpleName(), "Campaign Schedule"),
	STK_ACTION(6,StkActionStat.class.getSimpleName(), "Stk Action"),
	STK_ACTION_DATA(7,StkActionDataStat.class.getSimpleName(), "Stk Action Data"),
	STK_ACTION_ITEM(8,StkActionItemStat.class.getSimpleName(), "Stk Action Item"),
	AD(9,AdStat.class.getSimpleName(), "Ad"),
	VA_SERVICE(10,VaServiceStat.class.getSimpleName(), "Va Service"),
	PRICEPOINT(11,PricepointStat.class.getSimpleName(), "Pricepoint"),
	IDENTIFIER(12,IdentifierStat.class.getSimpleName(), "Identifier"),
	LANDING(13,LandingStat.class.getSimpleName(), "Landing");
	
	
	
	private boolean showByDefault;
	
	private String label;
	
	private AircastStatClass(Integer index, String className, String label){
		this.index = index;
		this.statClassName = className;
		this.label = label;
	}

	private String statClassName;
	
	public String getStatClassName() {
		return statClassName;
	}
	
	
	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static AircastStatClass getEnum(Integer index){
		if (index == null)
	return null;
		
		switch(index){
			case 0: return SMPP_ACCOUNT;
			case 1: return CAMPAIGN;
			case 2: return CAMPAIGN_PARAMS;
			case 3: return ENDPOINT;
			case 4: return ACTION_TRIGGER;
			case 5: return CAMPAIGN_SCHEDULE;
			case 6: return STK_ACTION;
			case 7: return STK_ACTION_DATA;
			case 8: return STK_ACTION_ITEM;
			case 9: return AD;
			default: return null;
		}
	}

	public boolean isShowByDefault() {
		return showByDefault;
	}

	public void setShowByDefault(boolean showByDefault) {
		this.showByDefault = showByDefault;
	}

	public void setStatClassName(String statClassName) {
		this.statClassName = statClassName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}