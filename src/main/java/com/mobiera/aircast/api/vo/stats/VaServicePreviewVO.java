package com.mobiera.aircast.api.vo.stats;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.mobiera.aircast.commons.enums.CampaignType;


@JsonInclude(Include.NON_NULL)

public class VaServicePreviewVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static String RED = "ff2b2b";
	protected static String GREEN = "09e359";
	protected static String ORANGE = "ff8bfe";
	protected static String BLACK = "000000";
	
	
	protected Long vaServiceId;
	protected String vaServiceName;
	public Long getVaServiceId() {
		return vaServiceId;
	}
	public void setVaServiceId(Long vaServiceId) {
		this.vaServiceId = vaServiceId;
	}
	
	
	

	
}
