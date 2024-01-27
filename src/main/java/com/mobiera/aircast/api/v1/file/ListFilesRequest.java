package com.mobiera.aircast.api.v1.file;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.FileType;
import com.mobiera.aircast.commons.enums.IdentifierType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class ListFilesRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Type", 
			description="Type")
	private FileType type;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Search", 
			description="Search")
	@Validator(minSize=3, maxSize=100)
	private String searchAttribute;
	@JsonIgnore
	private UserContextVO userContext;
	
	
	private List<FileType> includeTypes;
	private List<FileType> excludeTypes;
	
	
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


	public String getSearchAttribute() {
		return searchAttribute;
	}


	public void setSearchAttribute(String searchAttribute) {
		this.searchAttribute = searchAttribute;
	}


	public List<FileType> getIncludeTypes() {
		return includeTypes;
	}


	public void setIncludeTypes(List<FileType> includeTypes) {
		this.includeTypes = includeTypes;
	}


	public List<FileType> getExcludeTypes() {
		return excludeTypes;
	}


	public void setExcludeTypes(List<FileType> excludeTypes) {
		this.excludeTypes = excludeTypes;
	}


	

	

}
