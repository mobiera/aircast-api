package com.mobiera.aircast.api.v1.file;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.FileType;

@JsonInclude(Include.NON_NULL)
public class CreateFileRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	
	private String name;
	private FileType type;
	
	
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FileType getType() {
		return type;
	}
	public void setType(FileType type) {
		this.type = type;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	
	
	
	

}
