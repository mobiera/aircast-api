package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * Abstract class representing a Sleepy Action.
 * <p>
 * <b>id</b>: Id of Action.
 * <p>
 * <b>okAction</b>: Id of Action to link to if Action performs properly.
 * <p>
 * <b>backAction</b>: In interactive Actions, Id of Action to link to if User presses Back.
 * <p>
 * <b>cancelAction</b>: In interactive Actions, Id of Action to link to if User presses Cancel.
 * <p>
 * <b>timeoutAction</b>: Id of Action to link to if Action timeouts.
 * <p>
 * @author mj
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
@Type(value = CompareAction.class),
@Type(value = ConcatenateAction.class),
@Type(value = SetVariableAction.class),
@Type(value = DisplayTextAction.class),
@Type(value = GenericStkCommandAction.class),
@Type(value = GetInputAction.class),
@Type(value = LaunchBrowserAction.class),
@Type(value = SelectItemAction.class),
@Type(value = SendUssdAction.class),
@Type(value = SetUpCallAction.class),
@Type(value = PlayToneAction.class),
@Type(value = SmsAction.class),
})
@JsonInclude(Include.NON_NULL)
public abstract class Action implements Serializable {
	
	private static final long serialVersionUID = -1520858186453927532L;
	private Byte id;
	private Byte okAction;
	private Byte backAction;
	private Byte cancelAction;
	private Byte timeoutAction;
	
	public Byte getId() {
		return id;
	}
	public void setId(Byte id) {
		this.id = id;
	}
	public Byte getOkAction() {
		return okAction;
	}
	public void setOkAction(Byte okAction) {
		this.okAction = okAction;
	}
	public Byte getBackAction() {
		return backAction;
	}
	public void setBackAction(Byte backAction) {
		this.backAction = backAction;
	}
	public Byte getCancelAction() {
		return cancelAction;
	}
	public void setCancelAction(Byte cancelAction) {
		this.cancelAction = cancelAction;
	}
	public Byte getTimeoutAction() {
		return timeoutAction;
	}
	public void setTimeoutAction(Byte timeoutAction) {
		this.timeoutAction = timeoutAction;
	}
	
	
	
}
