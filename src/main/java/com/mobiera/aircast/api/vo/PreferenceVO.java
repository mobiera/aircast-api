package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.PreferenceType;

@JsonInclude(Include.NON_NULL)
public class PreferenceVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5467345816640819350L;
	
	private Long userId;
	private String name;
	private PreferenceType type;
	private String value;
	private String label;
	private String description;
	private Long entityId;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
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
