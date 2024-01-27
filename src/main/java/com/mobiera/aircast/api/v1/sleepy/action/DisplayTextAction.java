package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;

/**
 * Performs a proactive DisplayText command.
 * <p>
 * <b>text</b>: {@link Variable} to output result to.
 * <p>
 * <b>dcs</b>: {@link Dcs} to use. Null means auto-gathered. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * <b>highPriority</b>: true if you want a high priority DisplayText, else false. Not that in some ME such as Apple iOS, high priority DispalyText may block the ME.
 * <p>
 * <b>waitForUser</b>: if true, DisplayText will wait until User clears the message. Else, after some time that is ME dependent, message will disappear and Timeout event triggered. 
 * <p>
 * If User presses OK, Cancel or Back, or a timeout occurs, normal {@link Action} action linking will occur.
 * <p> 
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class DisplayTextAction extends Action implements Serializable{

	private static final long serialVersionUID = 2060112143256476138L;
	
	@Required
	private String text;
	
	
	private Dcs dcs;
	private Boolean highPriority;
	
	public Boolean getHighPriority() {
		return highPriority;
	}
	public void setHighPriority(Boolean highPriority) {
		this.highPriority = highPriority;
	}
	public Boolean getWaitForUser() {
		return waitForUser;
	}
	public void setWaitForUser(Boolean waitForUser) {
		this.waitForUser = waitForUser;
	}
	private Boolean waitForUser;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public Dcs getDcs() {
		return dcs;
	}
	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}
	
	
}
