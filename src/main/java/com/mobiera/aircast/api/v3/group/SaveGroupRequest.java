package com.mobiera.aircast.api.v3.group;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.GroupVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveGroupRequest implements Serializable
{
	private static final long serialVersionUID = 2141160034966633233L;
	private GroupVO group;
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public GroupVO getGroup() {
		return group;
	}
	public void setGroup(GroupVO group) {
		this.group = group;
	}
	

	
	
}
