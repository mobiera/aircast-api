package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;


public interface Event extends Serializable {
	/**
	 * 
	 */
	
	public String getUserTpda();
	public void setUserTpda(String userTpda);
	public String getUserAcr();
	public void setUserAcr(String userAcr);
	public String getCustomParam();
	public void setCustomParam(String customParam);
	public Instant getTs();
	public void setTs(Instant ts);
	public String getOfferId();
	public void setOfferId(String offerId);
	public String getTpNotifParam();
	public void setTpNotifParam(String tpNotifParam);
	public Boolean getTest();
	public void setTest(Boolean test);
	
	public String getSmppAccount();
	public void setSmppAccount(String smppAccount);
	public String getEndpoint() ;
	public void setEndpoint(String endpoint);
	public String getCampaign();
	public void setCampaign(String campaign) ;
	
	public String getRequestId();
	public void setRequestId(String requestId);
	
	public Long getPricepointId();
	public void setPricepointId(Long pricepoint);
	
}
