package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;

/**
 * Item of a {@link SelectItemAction} Action.
 * <p>
 * <b>text</b>: Text of the Menu Item.
 * <p>
 * <b>dcs</b>: {@link Dcs} to use for text of Menu Item. Null means auto-gathered. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * <b>okAction</b>: Id of Action to link to if User presses this Menu Item.
 * <p>
 * <b>value</b>: {@link InlineValue} value of the Item. If {@link SelectItemAction} is configured with outputVariable and User selects this Item, InlineValue will be put in outputVariable.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class Item implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3288136543847941945L;
	private Dcs dcs;
	private String text;
	private List<TextData> textData;
	
	@Required
	private Byte okAction;
	private InlineValue value;
	
	public Dcs getDcs() {
		return dcs;
	}
	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Byte getOkAction() {
		return okAction;
	}
	public void setOkAction(Byte okAction) {
		this.okAction = okAction;
	}
	public InlineValue getValue() {
		return value;
	}
	public void setValue(InlineValue value) {
		this.value = value;
	}
	public List<TextData> getTextData() {
		return textData;
	}
	public void setTextData(List<TextData> textData) {
		this.textData = textData;
	}
}