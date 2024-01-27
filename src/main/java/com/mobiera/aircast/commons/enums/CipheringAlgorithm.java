package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public enum CipheringAlgorithm implements Serializable {
	AES(0), DES(1);
	
	private CipheringAlgorithm(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static CipheringAlgorithm getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return AES;
			case 1: return DES;
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
