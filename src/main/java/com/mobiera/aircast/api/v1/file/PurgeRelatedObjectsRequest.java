package com.mobiera.aircast.api.v1.file;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class PurgeRelatedObjectsRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	
	private Long id;

	@JsonIgnore
	private UserContextVO userContext;
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public UserContextVO getUserContext() {
		return userContext;
	}


	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	
	
	
	

}
