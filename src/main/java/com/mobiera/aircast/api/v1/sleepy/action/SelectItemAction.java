package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Validator;

/**
 * Generate a proactive SelectItem.
 * <p>
 * <b>title</b>: Title of the Menu.
 * <p>
 * <b>dcs</b>: {@link Dcs} to use for title of Menu. Null means auto-gathered. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * <b>items</b>: List of {@link Item}.
 * <p>
 * If User presses Cancel or Back, or a timeout occurs, normal {@link Action} action linking will occur.
 * <p> 
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class SelectItemAction extends Action implements Serializable{

	private static final long serialVersionUID = 5143098091950066745L;
	private Variable outputVariable;
	private String title;
	private Dcs dcs;
	@Required
	@Validator(minSize=1)
	private List<Item> items;
	
	public Variable getOutputVariable() {
		return outputVariable;
	}

	public void setOutputVariable(Variable outputVariable) {
		this.outputVariable = outputVariable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Dcs getDcs() {
		return dcs;
	}

	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	
	
	
}
