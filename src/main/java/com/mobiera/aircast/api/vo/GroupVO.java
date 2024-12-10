package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Knowledge;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.Expertise;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.SectionEnum;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@SectionEnum(name="GroupSection")
@Label(singular="Group", plural="Groups", newEntityLabel="New Group", newEntityDescription="Create a new Group")
@Description(data="Group are asigned to Users")
@JsonInclude(Include.NON_NULL)
public class GroupVO implements Serializable {
	
	private static final long serialVersionUID = 1109667467679189800L;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	@Section(name = "BASIC_INFORMATION")
	private String id;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String title;
			
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String description;

	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	private List<EntityState> allowedTransitionStates;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Name", 
			description="Name of Group")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=100)
	private String name;

	@UI( widgetType = WidgetType.SELECT, 
	mode = Mode.READ_ONLY, 
	label="Parent", 
	description="Parent of Group")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="GroupVO")
	private String parentId;

	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="Path", 
	description="Path of Group")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=100)
	private String path;

	@UI( widgetType = WidgetType.BAG, 
	mode = Mode.READ_ONLY, 
	label="Users in Group", 
	description="Users in Group")
	@Section(name = "MEMBERS")
	@TargetClass(type=ClassType.VO, name="UserVO")
	// @Required
	private List<String> members;

	
	
	
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<String> getMembers() {
		return members;
	}

	public void setMembers(List<String> members) {
		this.members = members;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
		
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EntityState getState() {
		return state;
	}

	public void setState(EntityState state) {
		this.state = state;
	}

	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}

	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}

	
}
