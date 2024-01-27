package com.mobiera.aircast.api.enums;

public enum EndpointSection {
		
	HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	SMPP_SERVER("Smpp Server", "Smpp Server"),
	TEST_SECTION("Test Section", "Test Section"),
	STATS("Stats", "Stats"),
	ENTITY_HISTORY("Entity History", "Entity History");
	
		private EndpointSection(String label, String description){
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
