package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SetVariableAction extends ConcatenateAction implements Serializable {

	private static final long serialVersionUID = 8518520509182427727L;

	
}
