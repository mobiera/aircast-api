package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum RamCommand implements Serializable {

	/**
	 * CARD_PROBE: reads free memory and key data of the card, one SMS per read, installs nothing.
	 * SECURITY_PROBE: tries candidate OTA security configurations (RAM applets) on the card until
	 * one is accepted, which becomes the RAM applet of the sim; installs nothing.
	 */
	LOAD_AND_INSTALL(0),DELETE(1),LIST(2),CARD_PROBE(3),SECURITY_PROBE(4);

	private RamCommand(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static RamCommand getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return LOAD_AND_INSTALL;
			case 1: return DELETE;
			case 2: return LIST;
			case 3: return CARD_PROBE;
			case 4: return SECURITY_PROBE;
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