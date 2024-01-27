package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.UIMenuEntry;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.Label;

@JsonInclude(Include.NON_NULL)
@Label(singular="Aircast Node", plural="Aircast Nodes")
@Description(data="Aircast Nodes are Aircast integration for Mobile Operators.")
public class NodeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 286608528040069275L;

	private String clientId;
	private String label;
	private String description;
	private String rootUrl;
	
	private List<UIMenuEntry> menuEntries;
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRootUrl() {
		return rootUrl;
	}
	public void setRootUrl(String rootUrl) {
		this.rootUrl = rootUrl;
	}
	public List<UIMenuEntry> getMenuEntries() {
		return menuEntries;
	}
	public void setMenuEntries(List<UIMenuEntry> menuEntries) {
		this.menuEntries = menuEntries;
	}
	
	
}
