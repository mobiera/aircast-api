package com.mobiera.aircast.api.enums;

public enum CampaignSection {
		
	HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	ADVANCED("Advanced", "Advanced"),
	TARGET_USERS("Target Users", "Target Users"),
	SLEEPY_FLOW_CONFIGURATION("Sleepy Flow Configuration", "Sleepy Flow Configuration"),
	SLEEPY_FLOW_ACTIONS("Sleepy Flow Actions", "Sleepy Flow Actions"),
	RAM_CONFIGURATION("Ram Configuration", "Ram Configuration"),
	RFM_CONFIGURATION("Rfm Configuration", "Rfm Configuration"),
	SMS_API_CONFIGURATION("Sms Api Configuration", "Sms Api Configuration"),
	SMS_CONFIGURATION("Sms Configuration", "Sms Configuration"),
	CAMPAIGN_FLOW("Campaign Flow", "Campaign Flow"),
	ADS("Ads", "Ads"),
	KPIS("Kpis", "Kpis"),
	STATS("Stats", "Stats"),
	MENU("Menu", "Menu")
	;
	
		private CampaignSection(String label, String description){
			this.label = label;
			this.description = description;
		}

		private int index;

		public int getIndex(){
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

	
}
