package com.mobiera.aircast.api.v1.stats;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.ms.commons.stats.api.Kpi;
import com.mobiera.ms.commons.stats.api.StatGranularity;
import com.mobiera.ms.commons.stats.api.StatResultType;

@JsonInclude(Include.NON_NULL)
public class GetCompareStatViewRequest implements Serializable
{
	
	
	private static final long serialVersionUID = 1241061034966633284L;
	
	
	private Date from;
	private Date to;
	private List<Kpi> kpis;
	private StatGranularity statGranularity;
	private StatResultType statResultType;
	
	
	
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	public List<Kpi> getKpis() {
		return kpis;
	}
	public void setKpis(List<Kpi> kpis) {
		this.kpis = kpis;
	}
	public StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	public StatResultType getStatResultType() {
		return statResultType;
	}
	public void setStatResultType(StatResultType statResultType) {
		this.statResultType = statResultType;
	}
	
	
}
