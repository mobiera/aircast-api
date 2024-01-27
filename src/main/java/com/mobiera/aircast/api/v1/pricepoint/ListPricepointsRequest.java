package com.mobiera.aircast.api.v1.pricepoint;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.PricepointType;
import com.mobiera.aircast.commons.enums.VaServiceType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class ListPricepointsRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private String name;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Type", 
			description="Type")
	private PricepointType type;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="State", 
			description="State")
	private EntityState state;
	private Boolean showDeleted;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Search", 
			description="Search")
	@Validator(minSize=3, maxSize=100)
	private String searchAttribute;
	
	private List<EntityState> includeStates;
	private List<EntityState> excludeStates;
	
	private List<PricepointType> includeTypes;
	private List<PricepointType> excludeTypes;
	
	
	
	public String getSearchAttribute() {
		return searchAttribute;
	}
	public void setSearchAttribute(String searchAttribute) {
		this.searchAttribute = searchAttribute;
	}
	@JsonIgnore
	private UserContextVO userContext;
	
	private Long vaService;
	
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	
	public final EntityState getState() {
		return state;
	}
	public final void setState(EntityState state) {
		this.state = state;
	}
	public Boolean getShowDeleted() {
		return showDeleted;
	}
	public void setShowDeleted(Boolean showDeleted) {
		this.showDeleted = showDeleted;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public PricepointType getType() {
		return type;
	}
	public void setType(PricepointType type) {
		this.type = type;
	}
	public Long getVaService() {
		return vaService;
	}
	public void setVaService(Long vaService) {
		this.vaService = vaService;
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
	public List<PricepointType> getIncludeTypes() {
		return includeTypes;
	}
	public void setIncludeTypes(List<PricepointType> includeTypes) {
		this.includeTypes = includeTypes;
	}
	public List<PricepointType> getExcludeTypes() {
		return excludeTypes;
	}
	public void setExcludeTypes(List<PricepointType> excludeTypes) {
		this.excludeTypes = excludeTypes;
	}
	
}
