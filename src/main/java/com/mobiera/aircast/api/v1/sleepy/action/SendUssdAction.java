package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;

/**
 * Perform a SendUssd Action. Does not work on all MEs.
 * <p>
 * <b>title</b>: Title to show.
 * <p>
 * <b>dcs</b>: {@link Dcs} to use for title. Null means auto-gathered. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * <b>ussdString</b>: Ussd String to send.
 * <p>
 * If User presses Cancel, Back or OK, or a timeout occurs, normal {@link Action} action linking will occur.
 * <p> 
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class SendUssdAction extends Action implements Serializable {

	private static final long serialVersionUID = 432483507525970368L;
	private String title;
	@Required
	private String ussdString;
	private Dcs dcs;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUssdString() {
		return ussdString;
	}
	public void setUssdString(String ussdString) {
		this.ussdString = ussdString;
	}
	public Dcs getDcs() {
		return dcs;
	}
	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}
	
	
	
	
	
}
