package com.mobiera.aircast.api.v1.pricepoint;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.PricepointVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SavePricepointRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private PricepointVO pricepoint;
	@JsonIgnore
	private UserContextVO userContext;
	
	public final PricepointVO getPricepoint() {
		return pricepoint;
	}
	public final void setPricepoint(PricepointVO pricepoint) {
		this.pricepoint = pricepoint;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	

	
	
}
