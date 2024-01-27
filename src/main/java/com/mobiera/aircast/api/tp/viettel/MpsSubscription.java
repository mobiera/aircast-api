package com.mobiera.aircast.api.tp.viettel;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MpsSubscription implements Serializable {

	
	
	/**
	 * 
	 *  <username>54f546875ddf0a50</username>
            <password>b7aecae98b320df9</password>
            <wscode>SubApiMPSMobieraSatpush</wscode>
            <param name="msisdn" value="51956559489"/>
            <param name="serviceid" value="5DMAX_DAILY"/>
 <param name="transid" value="12345678"/> 
	 */
	private static final long serialVersionUID = 8472331497248500198L;
	
	
	private String msisdn;
	private String serviceName;
	
	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	
}
