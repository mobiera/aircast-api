package com.mobiera.aircast.commons.enums;

public enum AppletSectionEnum {
		
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	CIPHERING("Ciphering", "Ciphering"),
	CUSTOM_FIELDS("Custom Fields", "Custom Fields"),
	SLEEPY_FEATURES("Sleepy Features", "Sleepy Features");

		private AppletSectionEnum(String label, String description){
			this.label = label;
			this.description = description;
		}

		private int index;

		public int getIndex(){
			return this.index;
		}

		public static AppletSectionEnum getEnum(Integer index){
			if (index == null)
		return null;

			switch(index){
				case 0: return BASIC_INFORMATION;
				case 1: return CIPHERING;
				case 2: return CUSTOM_FIELDS;
				case 3: return SLEEPY_FEATURES;
				default: return null;
			}
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
