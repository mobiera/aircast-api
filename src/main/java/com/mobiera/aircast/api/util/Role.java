package com.mobiera.aircast.api.util;

import java.util.List;

public class Role {

	private String name;
	private String description;
	private List<Role> subRoles;
	
	public Role(String name, String description, List<Role> subRoles) {
		this.name = name;
		this.description = description;
		this.subRoles = subRoles;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Role> getSubRoles() {
		return subRoles;
	}
	public void setSubRoles(List<Role> subRoles) {
		this.subRoles = subRoles;
	}
}
