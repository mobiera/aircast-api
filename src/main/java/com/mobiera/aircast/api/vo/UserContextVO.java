package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.CampaignFilter;
import com.mobiera.aircast.commons.enums.UserType;

@JsonInclude(Include.NON_NULL)
public class UserContextVO implements Serializable
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	private String email;
	private String group;
	private String id;
	private String name;
	private UserType type;
	private Set<String> roles;
	private List<CampaignFilter> allowedCampaignFilters;
	private String remoteAddr;
	private String workingGroup;
	
	public String getWorkingGroup() {
		return workingGroup;
	}
	public void setWorkingGroup(String workingGroup) {
		this.workingGroup = workingGroup;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	public List<CampaignFilter> getAllowedCampaignFilters() {
		return allowedCampaignFilters;
	}
	public void setAllowedCampaignFilters(List<CampaignFilter> allowedCampaignFilters) {
		this.allowedCampaignFilters = allowedCampaignFilters;
	}
	public String getRemoteAddr() {
		return remoteAddr;
	}
	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}
	
	public boolean isAnonymous() {
		return (email == null);
	}

}
