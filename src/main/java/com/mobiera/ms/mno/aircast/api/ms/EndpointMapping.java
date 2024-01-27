package com.mobiera.ms.mno.aircast.api.ms;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.EndpointType;
import com.mobiera.commons.enums.EntityState;

@JsonInclude(Include.NON_NULL)
public class EndpointMapping implements Serializable {
	private static final long serialVersionUID = 2590787819809352107L;
	private Long id;
	private String instanceId;
	private EndpointType type;
	private String name;
	private String url;
	private EntityState state;
	private List<CampaignMapping> campaignFks;
	private String httpContent;
	private Integer consumerThreads;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public EndpointType getType() {
		return type;
	}
	public void setType(EndpointType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public EntityState getState() {
		return state;
	}
	public void setState(EntityState state) {
		this.state = state;
	}
	public String getHttpContent() {
		return httpContent;
	}
	public void setHttpContent(String httpContent) {
		this.httpContent = httpContent;
	}
	public List<CampaignMapping> getCampaignFks() {
		return campaignFks;
	}
	public void setCampaignFks(List<CampaignMapping> campaignFks) {
		this.campaignFks = campaignFks;
	}
	public Integer getConsumerThreads() {
		return consumerThreads;
	}
	public void setConsumerThreads(Integer consumerThreads) {
		this.consumerThreads = consumerThreads;
	}
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	
	public String toString() {
		return name + " " + state + " " + url;
	}
}
