package com.mobiera.aircast.api.enums;

public enum SimProfileSection {
		
	HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	REMOTE_APPLICATION_MANAGEMENT("Remote Application Management (ETSI TS 102 226)", "Remote Application Management (RAM) according to ETSI TS 102 226"),
	REMOTE_FILE_MANAGEMENT("Remote File Management (RFM)", "Remote File Management (RFM)"),
	SLEEPY_CONFIGURATION("Sleepy Configuration", "Sleepy Configuration (STK)"),
	TP_APPLICATION_CONFIGURATION("Third Party Application Configuration", "Third Party APplication Configuration"),
	ENTITY_HISTORY("Entity History", "Entity History");
	
		private SimProfileSection(String label, String description){
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
