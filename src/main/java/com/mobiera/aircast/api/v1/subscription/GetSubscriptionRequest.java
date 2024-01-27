package com.mobiera.aircast.api.v1.subscription;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.PreferenceType;
import com.mobiera.aircast.commons.enums.UserIdType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class GetSubscriptionRequest implements Serializable {

	private static final long serialVersionUID = -2128228772854146969L;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="User Id", 
			description="Msisdn or ACR of User")
	@Required
	@Validator(minSize=1, maxSize=15)
	private String userId;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="User Id Type", 
			description="User Id Type")
	@Required
	private UserIdType userIdType;
	
	@JsonIgnore
	private UserContextVO userContext;
	

	private Long id;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public UserIdType getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(UserIdType userIdType) {
		this.userIdType = userIdType;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	

}
