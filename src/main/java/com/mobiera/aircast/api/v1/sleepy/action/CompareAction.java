package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;

/**
 * Compares 2 {@link InputData} and link to another {@link Action} depending on command result.
 * <p>
 * <b>inputData1</b>: {@link InputData}.
 * <p>
 * <b>inputData2</b>: {@link InputData}.
 * <p>
 * <b>trueAction</b>: Id of {@link Action} to link to if result is true (inputData1 and inputData2 are equal).
 * <p>
 * <b>falseAction</b>: Id of {@link Action} to link to if result is false (inputData1 and inputData2 are different).
 * <p>
 * <b>caseSensitive</b>: In case of text, specifies if compare is case sensitive or not.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class CompareAction extends Action implements Serializable {

	private static final long serialVersionUID = -6582405430037997374L;
	
	@Required
	private InputData inputData1;
	@Required
	private InputData inputData2;
	@Required
	private Byte trueAction = null;
	@Required
	private Byte falseAction = null;
	@Required
	private boolean caseSensitive = true; 
	
	
	public InputData getInputData1() {
		return inputData1;
	}
	public void setInputData1(InputData inputData1) {
		this.inputData1 = inputData1;
	}
	public InputData getInputData2() {
		return inputData2;
	}
	public void setInputData2(InputData inputData2) {
		this.inputData2 = inputData2;
	}
	
	public boolean isCaseSensitive() {
		return caseSensitive;
	}
	public void setCaseSensitive(boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}
	public Byte getTrueAction() {
		return trueAction;
	}
	public void setTrueAction(Byte trueAction) {
		this.trueAction = trueAction;
	}
	public Byte getFalseAction() {
		return falseAction;
	}
	public void setFalseAction(Byte falseAction) {
		this.falseAction = falseAction;
	}
	public Boolean getCaseSensitive() {
		return caseSensitive;
	}
	
	
	
}
