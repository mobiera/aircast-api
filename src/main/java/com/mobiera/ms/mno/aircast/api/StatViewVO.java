package com.mobiera.ms.mno.aircast.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.ms.commons.stats.api.StatEnum;
import com.mobiera.ms.commons.stats.api.StatGranularity;
import com.mobiera.ms.mno.aircast.stats.AircastStatClass;

@JsonInclude(Include.NON_NULL)
public class StatViewVO implements Serializable {

	private static final long serialVersionUID = 4829415845298862375L;

	private Date from;
	private Date to;
	private List<Long> entityFks;
	private AircastStatClass statClass;
	private StatGranularity statGranularity;
	private List<StatEnum> statEnums;
	private List<String> statLabels;
	private List<List<String>> stats;
	private List<String> sum;
	
	public final Date getFrom() {
		return from;
	}
	public final void setFrom(Date from) {
		this.from = from;
	}
	public final Date getTo() {
		return to;
	}
	public final void setTo(Date to) {
		this.to = to;
	}
	
	public final AircastStatClass getStatClass() {
		return statClass;
	}
	public final void setStatClass(AircastStatClass statClass) {
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
	
	
}
