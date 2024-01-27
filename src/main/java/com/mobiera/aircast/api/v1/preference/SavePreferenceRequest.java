package com.mobiera.aircast.api.v1.preference;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.PreferenceType;

@JsonInclude(Include.NON_NULL)
public class SavePreferenceRequest implements Serializable {

	private static final long serialVersionUID = -3856395241874212410L;
	
	private String name;
	private PreferenceType type;
	private Long entityId;
	private String value;
	
	@JsonIgnore
	private Long userId;
	
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Long getEntityId() {
		return entityId;
	}
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
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
