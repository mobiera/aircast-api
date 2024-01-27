package com.mobiera.ms.mno.aircast.api;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class TachometerVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -946202575092205395L;
	private Integer totalTps;
	private Integer currentTps;
	private String color;
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant ts;
	public Integer getTotalTps() {
		return totalTps;
	}
	public void setTotalTps(Integer totalTps) {
		this.totalTps = totalTps;
	}
	public Integer getCurrentTps() {
		return currentTps;
	}
	public void setCurrentTps(Integer currentTps) {
		this.currentTps = currentTps;
	}
	public Instant getTs() {
		return ts;
	}
	public void setTs(Instant ts) {
		this.ts = ts;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
