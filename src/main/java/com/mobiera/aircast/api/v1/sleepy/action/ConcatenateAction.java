package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Validator;

/**
 * Concatenates a list {@link InputData} to an output {@link Variable}.
 * <p>
 * <b>outputVariable</b>: {@link Variable} to output result to.
 * <p>
 * <b>inputData</b>: List of {@link InputData} to concatenate.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class ConcatenateAction extends Action implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -940923761244278687L;
	
	@Required
	private Variable outputVariable = null;
	@Required
	@Validator(minSize=2)
	private List<InputData> inputData = new ArrayList<InputData>();
	public Variable getOutputVariable() {
		return outputVariable;
	}
	public void setOutputVariable(Variable outputVariable) {
		this.outputVariable = outputVariable;
	}
	public List<InputData> getInputData() {
		return inputData;
	}
	public void setInputData(List<InputData> inputData) {
		this.inputData = inputData;
	}

	
	

}
