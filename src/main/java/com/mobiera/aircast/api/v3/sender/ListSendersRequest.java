package com.mobiera.aircast.api.v3.sender;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class ListSendersRequest implements Serializable
{
	private static final long serialVersionUID = 2941560034966633233L;

	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Group", 
			description="Group")
	@TargetClass(type=ClassType.VO, name="GroupVO")
	private String group;

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

	@JsonIgnore
	private UserContextVO userContext;
		
	public EntityState getState() {
		return state;
	}
	public void setState(EntityState state) {
		this.state = state;
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
	public String getSearchAttribute() {
		return searchAttribute;
	}
	public void setSearchAttribute(String searchAttribute) {
		this.searchAttribute = searchAttribute;
	}
	public final String getGroup() {
		return group;
	}
	public final void setGroup(String group) {
		this.group = group;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}

}
