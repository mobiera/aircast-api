package com.mobiera.aircast.api.v1.campaign_schedule;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.CampaignManagement;
import com.mobiera.aircast.commons.enums.CampaignType;
import com.mobiera.aircast.commons.enums.EndpointType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class ListCampaignSchedulesRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant fromTs;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant toTs;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Type", 
			description="Type")
	private CampaignType type;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Management", 
			description="Management")
	private CampaignManagement management;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="State", 
			description="State")
	private EntityState state;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Search", 
			description="Search")
	@Validator(minSize=3, maxSize=100)
	private String searchAttribute;
	
	
	private List<EntityState> includeStates;
	private List<EntityState> excludeStates;
	
	private List<CampaignType> includeTypes;
	private List<CampaignType> excludeTypes;
	
	private List<CampaignManagement> includeManagements;
	private List<CampaignManagement> excludeManagements;
	
	
	
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public Instant getFromTs() {
		return fromTs;
	}
	public void setFromTs(Instant fromTs) {
		this.fromTs = fromTs;
	}
	public Instant getToTs() {
		return toTs;
	}
	public void setToTs(Instant toTs) {
		this.toTs = toTs;
	}
	public EntityState getState() {
		return state;
	}
	public void setState(EntityState state) {
		this.state = state;
	}
	
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public String getSearchAttribute() {
		return searchAttribute;
	}
	public void setSearchAttribute(String searchAttribute) {
		this.searchAttribute = searchAttribute;
	}
	public CampaignType getType() {
		return type;
	}
	public void setType(CampaignType type) {
		this.type = type;
	}
	public CampaignManagement getManagement() {
		return management;
	}
	public void setManagement(CampaignManagement management) {
		this.management = management;
	}
	public List<EntityState> getIncludeStates() {
		return includeStates;
	}
	public void setIncludeStates(List<EntityState> includeStates) {
		this.includeStates = includeStates;
	}
	public List<EntityState> getExcludeStates() {
		return excludeStates;
	}
	public void setExcludeStates(List<EntityState> excludeStates) {
		this.excludeStates = excludeStates;
	}
	public List<CampaignType> getIncludeTypes() {
		return includeTypes;
	}
	public void setIncludeTypes(List<CampaignType> includeTypes) {
		this.includeTypes = includeTypes;
	}
	public List<CampaignType> getExcludeTypes() {
		return excludeTypes;
	}
	public void setExcludeTypes(List<CampaignType> excludeTypes) {
		this.excludeTypes = excludeTypes;
	}
	public List<CampaignManagement> getIncludeManagements() {
		return includeManagements;
	}
	public void setIncludeManagements(List<CampaignManagement> includeManagements) {
		this.includeManagements = includeManagements;
	}
	public List<CampaignManagement> getExcludeManagements() {
		return excludeManagements;
	}
	public void setExcludeManagements(List<CampaignManagement> excludeManagements) {
		this.excludeManagements = excludeManagements;
	}
	
	
}
