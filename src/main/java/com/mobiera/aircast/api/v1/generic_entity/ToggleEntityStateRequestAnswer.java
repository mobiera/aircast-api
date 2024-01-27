package com.mobiera.aircast.api.v1.generic_entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.EntityType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.ServiceStatus;

@JsonInclude(Include.NON_NULL)
public class ToggleEntityStateRequestAnswer implements Serializable {
	

	private static final long serialVersionUID = 8765744603505042850L;
	
	private ToggleEntityStateRequestResult result;
	private String errorMessage;
	private Long id;
	private EntityState state;
	private EntityType type;
	private ServiceStatus serviceStatus;
	private List<EntityState> allowedTransitionStates;
	
	
	public ToggleEntityStateRequestResult getResult() {
		return result;
	}
	public void setResult(ToggleEntityStateRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(ServiceStatus serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}
	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}
	
	
}
