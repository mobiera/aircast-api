package com.mobiera.aircast.api.enums;

public enum AppletSection {
		
	HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	OTA_CONFIGURATION("OTA Configuration", "OTA Configuration"),
	APPLET_CONFIGURATION("Applet Configuration", "Applet Configuration"),
	SERVICE_LOGS("Service Logs", "Service Logs");
	
		private AppletSection(String label, String description){
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
