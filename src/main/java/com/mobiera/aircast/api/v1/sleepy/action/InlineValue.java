package com.mobiera.aircast.api.v1.sleepy.action;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;

/**
 * Represents a static variable.
 * <p>
 * <b>value</b>: Value.
 * <p>
 * <b>dcs</b>: {@link Dcs} of value. Null means auto-gathered. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class InlineValue extends InputData {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5064517021956515418L;
	private Dcs dcs;
	@Required
	private String value;

	
	public Dcs getDcs() {
		return dcs;
	}
	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}