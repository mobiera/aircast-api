package com.mobiera.aircast.api.tp.viettel;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MpsSubscribeRequest implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8472331497248500198L;
	
	private MpsSubscription mpsSubscription;

	public MpsSubscription getMpsSubscription() {
		return mpsSubscription;
	}

	public void setMpsSubscription(MpsSubscription mpsSubscription) {
		this.mpsSubscription = mpsSubscription;
	}
	
	
}
