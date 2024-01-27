package com.mobiera.aircast.commons.enums;

public enum CampaignFilter {
		
	ADVERTISING("Advertising", "Advertising Campaigns"),
	PUSH_MKT("Push Marketing", "Interactive and Silent STK Campaigns"),
	SIM_MENU("Sim Menu", "Resident Sim Menu Configuration"),
	SIM_MANAGEMENT("Sim Apps and Files", "RAM and RFM campaigns"),
	API("Api", "Api based campaigns: SMS_API, USTK_API, SLEEPY_API"),
	DEMO("Demo", "Demo Campaigns"),
	TEMPLATE("Template", "Template Campaigns"),
	SYSTEM("System", "System Campaigns");
	

		private CampaignFilter(String label, String description){
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
