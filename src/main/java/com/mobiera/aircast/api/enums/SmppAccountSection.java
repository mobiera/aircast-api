package com.mobiera.aircast.api.enums;

public enum SmppAccountSection {
		
	HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	//ADVANCED_CONFIGURATION("Advanced Configuration", "Advanced Configuration"),
	SMSC_BIND_CONFIGURATION("SMSC Bind Configuration", "SMSC Bind Configursation"),
	TRAFFIC_CONTROL("Traffic Control", "Traffic Control"),
	STATS("Stats", "Stats"),
	SERVICE_LOGS("Service Logs", "Service Logs");
	
		private SmppAccountSection(String label, String description){
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
