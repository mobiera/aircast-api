package com.mobiera.aircast.api.enums;

public enum VaServiceSection {
		
	HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	ACR_CONFIG("Acr Configuration", "Acr Configuration"),
	VIETTEL_MPS("Viettel Mps", "Viettel Mps"),
	CONTENT_PROVIDER("Content Provider", "Content Provider"),
	ADSAFE("Adsafe", "Adsafe"),
	STATS("Stats", "Stats");
	
		private VaServiceSection(String label, String description){
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
