package com.mobiera.ms.mno.aircast.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SimUpdate implements Serializable {

	String id;
	String msisdn;
	
}
