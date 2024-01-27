package com.mobiera.aircast.api.v1.ustk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DiscoveryRequest extends UstkRequest
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	
	

	@Override
	@JsonIgnore
	public String getOptionalParam() {
		return DISCOVERY_REQUEST;
	}




	
}
