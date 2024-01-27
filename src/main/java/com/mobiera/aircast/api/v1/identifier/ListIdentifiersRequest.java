package com.mobiera.aircast.api.v1.identifier;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.IdentifierType;
import com.mobiera.aircast.commons.enums.PricepointType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class ListIdentifiersRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private String name;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Type", 
			description="Type")
	private IdentifierType type;
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
	
	private List<IdentifierType> includeTypes;
	private List<IdentifierType> excludeTypes;
	
	
	
	private Long pricepoint;
	
	public String getSearchAttribute() {
		return searchAttribute;
	}
	public void setSearchAttribute(String searchAttribute) {
		this.searchAttribute = searchAttribute;
	}
	@JsonIgnore
	private UserContextVO userContext;
	
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
	public IdentifierType getType() {
		return type;
	}
	public void setType(IdentifierType type) {
		this.type = type;
	}
	public Long getPricepoint() {
		return pricepoint;
	}
	public void setPricepoint(Long pricepoint) {
		this.pricepoint = pricepoint;
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
	public List<IdentifierType> getIncludeTypes() {
		return includeTypes;
	}
	public void setIncludeTypes(List<IdentifierType> includeTypes) {
		this.includeTypes = includeTypes;
	}
	public List<IdentifierType> getExcludeTypes() {
		return excludeTypes;
	}
	public void setExcludeTypes(List<IdentifierType> excludeTypes) {
		this.excludeTypes = excludeTypes;
	}
	
	
}
