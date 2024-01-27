package com.mobiera.ms.mno.aircast.api.v2.stats;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GetStatEntityKpiRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5164166548793490058L;
	
	private String statClass;

	public String getStatClass() {
		return statClass;
	}

	public void setStatClass(String statClass) {
		this.statClass = statClass;
	}

}
