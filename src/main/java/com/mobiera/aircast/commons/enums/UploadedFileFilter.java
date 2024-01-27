package com.mobiera.aircast.commons.enums;

public enum UploadedFileFilter {
		
	LIST("User Lists", "User Lists"),
	CUSTOM_LIST("User Lists with Custom Attributes", "User Lists with Custom Attributes"),
	ADVERTISING_CAMPAIGNS("Campaign Lists", "Campaign Lists"),
	APPLET("Applet Files", "Applet Files"),
	;

		private UploadedFileFilter(String label, String description){
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
