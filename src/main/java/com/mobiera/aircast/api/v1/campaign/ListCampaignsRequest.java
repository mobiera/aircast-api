package com.mobiera.aircast.api.v1.campaign;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.CampaignFilter;
import com.mobiera.aircast.commons.enums.CampaignManagement;
import com.mobiera.aircast.commons.enums.CampaignPriority;
import com.mobiera.aircast.commons.enums.CampaignType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class ListCampaignsRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
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
	private CampaignPriority priority;
	private CampaignFilter filter;
	//private Boolean showDeleted;
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Template", 
			description="Template")
	private Boolean template;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Search", 
			description="Search")
	@Validator(minSize=3, maxSize=100)
	private String searchAttribute;
	
	@JsonIgnore
	private UserContextVO userContext;
	
	private List<EntityState> includeStates;
	private List<EntityState> excludeStates;
	
	private List<CampaignType> includeTypes;
	private List<CampaignType> excludeTypes;
	
	private List<CampaignManagement> includeManagements;
	private List<CampaignManagement> excludeManagements;
	
	
	public final CampaignPriority getPriority() {
		return priority;
	}
	public final void setPriority(CampaignPriority priority) {
		this.priority = priority;
	}
	

	public final CampaignType getType() {
		return type;
	}
	public final void setType(CampaignType type) {
		this.type = type;
	}
	public final EntityState getState() {
		return state;
	}
	public final void setState(EntityState state) {
		this.state = state;
	}
	public CampaignManagement getManagement() {
		return management;
	}
	public void setManagement(CampaignManagement management) {
		this.management = management;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	public CampaignFilter getFilter() {
		return filter;
	}
	public void setFilter(CampaignFilter filter) {
		this.filter = filter;
	}
	public Boolean getTemplate() {
		return template;
	}
	public void setTemplate(Boolean template) {
		this.template = template;
	}
	public String getSearchAttribute() {
		return searchAttribute;
	}
	public void setSearchAttribute(String searchAttribute) {
		this.searchAttribute = searchAttribute;
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
