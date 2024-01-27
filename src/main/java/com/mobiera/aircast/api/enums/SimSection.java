package com.mobiera.aircast.api.enums;

public enum SimSection {
		
	HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	SUBSCRIBER("Subscriber", "Subscriber Information"),
	DEVICE("Device", "Device Information"),
	LOCATION("Location", "Device Locatin"),
	STK("Stk", "Stk Information"),
	OTA("OTA", "Over The Air Information"),
	ENTITY_HISTORY("Entity History", "Entity History");
	
		private SimSection(String label, String description){
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
