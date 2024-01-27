package com.mobiera.aircast.api.v1.preference;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.PreferenceType;

@JsonInclude(Include.NON_NULL)
public class GetPreferenceRequest implements Serializable {

	private static final long serialVersionUID = -2128228772854146969L;
	
	private String name;
	private PreferenceType type;
	private Long entityId;
	
	@JsonIgnore
	private Long userId;

	
	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PreferenceType getType() {
		return type;
	}

	public void setType(PreferenceType type) {
		this.type = type;
	}

	
	

}
