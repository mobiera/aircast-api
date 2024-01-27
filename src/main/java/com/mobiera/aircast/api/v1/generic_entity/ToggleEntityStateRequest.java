package com.mobiera.aircast.api.v1.generic_entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.EntityType;
import com.mobiera.commons.enums.EntityState;

@JsonInclude(Include.NON_NULL)
public class ToggleEntityStateRequest implements Serializable {

	private static final long serialVersionUID = -6676729964730511905L;
	
	private Long id;
	private EntityType type;
	private EntityState state;
	@JsonIgnore
	private UserContextVO userContext;
	
	public final Long getId() {
		return id;
	}
	public final void setId(Long id) {
		this.id = id;
	}
	
	public EntityState getState() {
		return state;
	}
	public void setState(EntityState state) {
		this.state = state;
	}
	public EntityType getType() {
		return type;
	}
	public void setType(EntityType type) {
		this.type = type;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
}
