package com.mobiera.aircast.api.enums;

public enum PricepointSection {
		
	HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	PRICING("Pricing", "Pricing"),
	CHARGING_PROVIDER("Charging Provider", "Charging Provider"),
	ADSAFE("Adsafe", "Adsafe"),
	STATS("Stats", "Stats");
	
		private PricepointSection(String label, String description){
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
