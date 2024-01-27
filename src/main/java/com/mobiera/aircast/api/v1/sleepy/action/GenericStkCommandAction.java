package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;


/**
 * Performs a generic STK command.
 * <p>
 * <b>commandType</b>: commandType.
 * <p>
 * <b>commandQualifier</b>: commandQualifier.
 * <p>
 * <b>destinationDevice</b>: destinationDevice.
 * <p>
 * <b>outputVariable</b>: {@link Variable} to output result to. 
 * <p>
 * <b>outputAll</b>: true/false. 
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class GenericStkCommandAction extends Action implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6867938230704071589L;
	/**
	 * 
	 */
	@Required
	private byte commandType;
	@Required
	private byte commandQualifier;
	@Required
	private byte destinationDevice;
	@Required
	private Variable outputVariable;
	@Required
	private boolean outputAll;
	
	//protected List<BerTlv> tlvs;
	
	public byte getCommandType() {
		return commandType;
	}
	public void setCommandType(byte commandType) {
		this.commandType = commandType;
	}
	public byte getCommandQualifier() {
		return commandQualifier;
	}
	public void setCommandQualifier(byte commandQualifier) {
		this.commandQualifier = commandQualifier;
	}
	public byte getDestinationDevice() {
		return destinationDevice;
	}
	public void setDestinationDevice(byte destinationDevice) {
		this.destinationDevice = destinationDevice;
	}
	public Variable getOutputVariable() {
		return outputVariable;
	}
	public void setOutputVariable(Variable outputVariable) {
		this.outputVariable = outputVariable;
	}
	public boolean isOutputAll() {
		return outputAll;
	}
	public void setOutputAll(boolean outputAll) {
		this.outputAll = outputAll;
	}
	
	

}
