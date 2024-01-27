package com.mobiera.aircast.api.v1.applet;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.AppletImpl;
import com.mobiera.aircast.commons.enums.CampaignType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class ListAppletsRequest implements Serializable {
	

	private static final long serialVersionUID = 3185024801955818013L;	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Impl", 
			description="Impl")
	private AppletImpl impl;
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
	
	private List<AppletImpl> includeImpls;
	private List<AppletImpl> excludeImpls;
	
	
	private Boolean showDeleted;
	
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public AppletImpl getImpl() {
		return impl;
	}
	public void setImpl(AppletImpl impl) {
		this.impl = impl;
	}
	public EntityState getState() {
		return state;
	}
	public void setState(EntityState state) {
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
	public List<AppletImpl> getIncludeImpls() {
		return includeImpls;
	}
	public void setIncludeImpls(List<AppletImpl> includeImpls) {
		this.includeImpls = includeImpls;
	}
	public List<AppletImpl> getExcludeImpls() {
		return excludeImpls;
	}
	public void setExcludeImpls(List<AppletImpl> excludeImpls) {
		this.excludeImpls = excludeImpls;
	}
	
	
	

}
