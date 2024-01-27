package com.mobiera.aircast.api.enums;

public enum SubscriptionEventSection {
		
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	MENU("Menu", "Menu");
	
		private SubscriptionEventSection(String label, String description){
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
		
	
}
