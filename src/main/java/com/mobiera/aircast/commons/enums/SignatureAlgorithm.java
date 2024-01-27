package com.mobiera.aircast.commons.enums;
/*
 * public static final String DES_MAC8_ISO9797_M1 = "DES_MAC8_ISO9797_M1";
	public static final String CRC32 = "CRC32";
	public static final String AES_CMAC4 = "AES_CMAC4";
	public static final String AES_CMAC8 = "AES_CMAC8";
	
 */
public enum SignatureAlgorithm {
	DES_MAC8_ISO9797_M1, CRC32, AES_CMAC4, AES_CMAC8;
	
	
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
