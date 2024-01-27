package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
@Type(value = InlineValue.class),
@Type(value = VariableReference.class),
})
@JsonInclude(Include.NON_NULL)
public abstract class InputData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5738535597091894106L;
	
	
	
	
	
		
}
