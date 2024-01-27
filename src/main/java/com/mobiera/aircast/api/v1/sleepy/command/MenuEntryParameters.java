package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;

/**
 * 
 * Represents a SIM Menu Entry configuration.
 * <p>
 * <b>label</b>: text that will be shown in the SIM menu entry.
 * <p>
 * <b>labelDcs</b>: force {@link Dcs} of label. By default (null) will be automatically gathered from label. Supported {@link Dcs} : DCS_8_BIT_DATA for GSM8, DCS_UCS2 for UCS2.
 * <p>
 * <b>visible</b>: toggle Menu Entry visibility. True: Menu Entry will be visible, false invisible.
 * <p>
 * <b>index</b>: index of the Menu Entry you would like to configure. Must be 0..(n-1) where n is the number of Menu Entries that were enabled when Applet instance was created.
 * <p>
 * <b>SendOptinOfferCommand</b>: {@link SendOptinOfferCommand} than will get triggered when User will press the Menu Entry.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class MenuEntryParameters implements Serializable {

	private static final long serialVersionUID = 2915256752344943689L;
	@Required
	private String label;
	private Dcs labelDcs;
	private SendOptinOfferCommand action;
	@Required
	private Boolean visible;	
	@Required
	private Byte index;
	
	
	public Byte getIndex() {
		return index;
	}
	public void setIndex(byte index) {
		this.index = index;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Dcs getLabelDcs() {
		return labelDcs;
	}
	public void setLabelDcs(Dcs labelDcs) {
		this.labelDcs = labelDcs;
	}
	public SendOptinOfferCommand getAction() {
		return action;
	}
	public void setAction(SendOptinOfferCommand action) {
		this.action = action;
	}
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	
}
