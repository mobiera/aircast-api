package com.mobiera.aircast.commons.enums;

import java.io.Serializable;


public enum AdType implements Serializable {

	
	
	TextAd(0),MenuAd(1), UrlAd(2), CallAd(3), UssdAd(4), MoAd(5);

	private AdType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static AdType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return TextAd;
			case 1: return MenuAd;
			case 2: return UrlAd;
			case 3: return CallAd;
			case 4: return UssdAd;
			case 5: return MoAd;
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