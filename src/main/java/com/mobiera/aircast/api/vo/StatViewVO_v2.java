package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;
import com.mobiera.ms.commons.stats.api.StatEnum;
import com.mobiera.ms.commons.stats.api.StatGranularity;

@JsonInclude(Include.NON_NULL)
public class StatViewVO_v2 implements Serializable {

	private static final long serialVersionUID = 4829415845298862375L;

	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant from;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant to;
	private List<Long> entityFks;
	private String statClass;
	private StatGranularity statGranularity;
	private List<StatEnum> statEnums;
	private List<String> statLabels;
	private List<List<String>> stats;
	private List<List<Long>> numericStats;
	private List<String> sum;
	@JsonIgnore
	private List<Long> numericSum;
	
	public final Instant getFrom() {
		return from;
	}
	public final void setFrom(Instant from) {
		this.from = from;
	}
	public final Instant getTo() {
		return to;
	}
	public final void setTo(Instant to) {
		this.to = to;
	}
	
	public final String getStatClass() {
		return statClass;
	}
	public final void setStatClass(String statClass) {
		this.statClass = statClass;
	}
	public final StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public final void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	public final List<StatEnum> getStatEnums() {
		return statEnums;
	}
	public final void setStatEnums(List<StatEnum> statEnums) {
		this.statEnums = statEnums;
	}
	
	public List<Long> getEntityFks() {
		return entityFks;
	}
	public void setEntityFks(List<Long> entityFks) {
		this.entityFks = entityFks;
	}
	public final List<List<String>> getStats() {
		return stats;
	}
	public final void setStats(List<List<String>> stats) {
		this.stats = stats;
	}
	public final List<String> getSum() {
		return sum;
	}
	public final void setSum(List<String> sum) {
		this.sum = sum;
	}
	public List<String> getStatLabels() {
		return statLabels;
	}
	public void setStatLabels(List<String> statLabels) {
		this.statLabels = statLabels;
	}
	public List<Long> getNumericSum() {
		return numericSum;
	}
	public void setNumericSum(List<Long> numericSum) {
		this.numericSum = numericSum;
	}
	public List<List<Long>> getNumericStats() {
		return numericStats;
	}
	public void setNumericStats(List<List<Long>> numericStats) {
		this.numericStats = numericStats;
	}
	
	
}
