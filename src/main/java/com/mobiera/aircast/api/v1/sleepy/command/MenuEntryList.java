package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * Represents a list of {@link MenuEntryParameters}.
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class MenuEntryList implements Serializable {

	private static final long serialVersionUID = -768190586040397865L;
	private List<MenuEntryParameters> entries = 
			new ArrayList<MenuEntryParameters>();
	public List<MenuEntryParameters> getEntries() {
		return entries;
	}
	public void setEntries(List<MenuEntryParameters> entries) {
		this.entries = entries;
	}

	

}
