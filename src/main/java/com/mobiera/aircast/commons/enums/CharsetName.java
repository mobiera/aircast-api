package com.mobiera.aircast.commons.enums;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;



public enum CharsetName implements Serializable {
	
	ISO_8859_1("ISO-8859-1","ISO-8859-1"),
	ISO_8859_15("ISO-8859-15", "ISO-8859-15"),
    GSM("GSM", "GSM"),
    PACKED_GSM("PACKED-GSM", "PACKED-GSM"),
    UCS_2("UCS-2", "UCS-2"),
    UCS_2LE("UCS-2LE", "UCS-2LE"),
    UTF_8("UTF-8", "UTF-8"),
    MODIFIED_UTF8("MODIFIED-UTF8", "MODIFIED-UTF8"),
    AIRWIDE_IA5("AIRWIDE-IA5", "AIRWIDE-IA5"),
    VFD2_GSM("VFD2-GSM", "VFD2-GSM"),
    VFTR_GSM("VFTR-GSM", "VFTR-GSM"),
    GSM7("GSM7", "GSM7"),
    GSM8("GSM8", "GSM8"),
    AIRWIDE_GSM("AIRWIDE-GSM", "AIRWIDE-GSM"),
    TMOBILENL_GSM("TMOBILE-NL-GSM", "TMOBILE-NL-GSM");

	private static class Maps {
		private static ConcurrentHashMap<String, CharsetName> map = new ConcurrentHashMap<String, CharsetName>();
		
	}
	
	
    private CharsetName(String label, String description) {
		this.label = label;
		this.description = description;
		
		synchronized (Maps.map) {
			Maps.map.put(label, this);
		}
    }
    
    public static CharsetName getEnum(String label){
		if (label == null)
	return null;
		return Maps.map.get(label);
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