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

@SectionEnum(name="UserSection")
@Label(singular="User", plural="Users", newEntityLabel="New User", newEntityDescription="Create a new User")
@Description(data="Aircast Users")
@JsonInclude(Include.NON_NULL)
public class UserVO implements Serializable {
	
	private static final long serialVersionUID = 1199667467679189800L;
	
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

	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String name;

	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	private List<EntityState> allowedTransitionStates;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Username", 
			description="User Username")
	@Section(name = "BASIC_INFORMATION")
	@Required
	// @Validator(minSize=1, maxSize=100)
	private String username;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Email", 
			description="Email of User")
	@Section(name = "BASIC_INFORMATION")
	@Required
	// @Validator(minSize=1, maxSize=100)
	private String email;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="First Name", 
			description="User First Name")
	@Section(name = "BASIC_INFORMATION")
	// @Required
	// @Validator(minSize=1, maxSize=100)
	private String firstName;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Last Name", 
			description="User Last Name")
	@Section(name = "BASIC_INFORMATION")
	// @Required
	// @Validator(minSize=1, maxSize=100)
	private String lastName;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Phone", 
			description="Phone of User")
	@Section(name = "BASIC_INFORMATION")
	// @Required
	// @Validator(minSize=1, maxSize=100)
	private String phone;

	@Section(name = "AUTHORIZATION")
	@UI( widgetType = WidgetType.BAG, 
	mode = Mode.READ_WRITE, 
	label="Roles", 
	description="Roles")
	@TargetClass(type=ClassType.VO, name="RoleVO")
	// @Required
	private List<String> roles;

	@Section(name = "AUTHORIZATION")
	@UI( widgetType = WidgetType.BAG, 
	mode = Mode.READ_WRITE, 
	label="Groups", 
	description="Groups")
	@TargetClass(type=ClassType.VO, name="GroupVO")
	// @Required
	private List<String> groups;	

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Max Granted Sent Per Day", 
			description="Max Granted Sent Per Day")
	@Section(name = "BASIC_INFORMATION")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Long maxGrantedSentPerDay;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getGroups() {
		return groups;
	}

	public void setGroups(List<String> groups) {
		this.groups = groups;
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

	public Long getMaxGrantedSentPerDay() {
		return maxGrantedSentPerDay;
	}

	public void setMaxGrantedSentPerDay(Long maxGrantedSentPerDay) {
		this.maxGrantedSentPerDay = maxGrantedSentPerDay;
	}

}
