package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.IdentifierType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.UI;
import com.mobiera.ms.mno.api.enums.SubscriptionEventType;

@JsonInclude(Include.NON_NULL)
@Label(singular="Subscription Event", plural="Subscription Events", newEntityLabel="New Subscription Event", newEntityDescription="Create a new Subscription Event")
@Description(data="Subscriptions Event represent the state of a given Subscription. Subscriptions are Mappings of msisdns and Identifiers.")
@JsonIgnoreProperties({ "declaringExecutable" })


public class SubscriptionEvent implements Serializable, Event {

	/**
	 * 
	 */
	private static final long serialVersionUID = -221536639653956800L;
	
	
	private Long id;
	
	private Long vaServiceId;
	
	private String label;
	private String description;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="VaService", 
			description="VaService")
	@Section(name = "BASIC_INFORMATION")
	private String vaServiceName;
	private String vaServiceLabel;
	private Long pricepointId;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Pricepoint", 
			description="Pricepoint")
	@Section(name = "BASIC_INFORMATION")
	private String pricepointName;
	private String pricepointLabel;
	private String pricepointCode;

	
	private String requestId; // tp requestId
	private Boolean test;
	private Instant ts;
	private Long identifierId;
	private IdentifierType identifierType;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Identifier", 
			description="Identifier")
	@Section(name = "BASIC_INFORMATION")
	private String identifierName;
	private String identifierLabel;
	private Long landingId;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="State", 
			description="State")
	@Section(name = "BASIC_INFORMATION")
	private SubscriptionEventType subscriptionEventType;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Usage Count", 
			description="Usage Count")
	@Section(name = "BASIC_INFORMATION")
	private Integer usageCount;
	
	private Long subscriptionId;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Registered", 
			description="Registered")
	@Section(name = "BASIC_INFORMATION")
	private Instant registeredTs;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Canceled", 
			description="Canceled")
	@Section(name = "BASIC_INFORMATION")
	private Instant canceledTs;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Charged", 
			description="Charged")
	@Section(name = "BASIC_INFORMATION")
	private Instant lastChargedTs;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Value", 
			description="Value")
	@Section(name = "BASIC_INFORMATION")
	private Double charged;
	private String offerId;
	private String userTpda;
	private String userAcr;
	private String userId;
	private String customParam;
	private String tpNotifParam;
	private String smppAccount; // smppAccount
	private String endpoint; // endpoint
	private String campaign; // campaign
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="User Ip", 
			description="User Ip")
	@Section(name = "BASIC_INFORMATION")
	private String userIpAddr;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="ExpireTs", 
			description="ExpireTsex")
	@Section(name = "BASIC_INFORMATION")
	private Instant expireTs;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Last MO", 
			description="Last MO")
	@Section(name = "BASIC_INFORMATION")
	private Instant lastMoTs;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Last MT", 
			description="Last MT")
	@Section(name = "BASIC_INFORMATION")
	private Instant lastMtTs;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="MOs", 
			description="MOs")
	@Section(name = "BASIC_INFORMATION")
	private Integer moCount;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="MTs", 
			description="MTs")
	@Section(name = "BASIC_INFORMATION")
	private Integer mtCount;
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_ONLY, 
			label="Unsubscribe", 
			description="Unsubscribe")
	@Section(name = "MENU")
	private Boolean canBeUnsubscribed;
	
	/*@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_ONLY, 
			label="Resubscribe", 
			description="Resubscribe")
	@Section(name = "MENU")
	private Boolean canBeResubscribed;
	*/

	private Integer trialCycles;
	private Boolean trialCyclesFirstSubsOnly;

	
	
	public SubscriptionEventType getSubscriptionEventType() {
		return subscriptionEventType;
	}
	public void setSubscriptionEventType(SubscriptionEventType subscriptionEventType) {
		this.subscriptionEventType = subscriptionEventType;
	}
	public Instant getExpireTs() {
		return expireTs;
	}
	public void setExpireTs(Instant expireTs) {
		this.expireTs = expireTs;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getUserTpda() {
		return userTpda;
	}
	public void setUserTpda(String userTpda) {
		this.userTpda = userTpda;
	}
	public String getUserAcr() {
		return userAcr;
	}
	public void setUserAcr(String userAcr) {
		this.userAcr = userAcr;
	}
	public String getCustomParam() {
		return customParam;
	}
	public void setCustomParam(String customParam) {
		this.customParam = customParam;
	}
	public String getTpNotifParam() {
		return tpNotifParam;
	}
	public void setTpNotifParam(String tpNotifParam) {
		this.tpNotifParam = tpNotifParam;
	}
	
	public Boolean getTest() {
		return test;
	}
	public void setTest(Boolean test) {
		this.test = test;
	}
	public Instant getTs() {
		return ts;
	}
	public void setTs(Instant ts) {
		this.ts = ts;
	}
	public String getSmppAccount() {
		return smppAccount;
	}
	public void setSmppAccount(String smppAccount) {
		this.smppAccount = smppAccount;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public String getCampaign() {
		return campaign;
	}
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Long getPricepointId() {
		return pricepointId;
	}
	public void setPricepointId(Long pricepoint) {
		this.pricepointId = pricepoint;
	}
	public IdentifierType getIdentifierType() {
		return identifierType;
	}
	public void setIdentifierType(IdentifierType identifierType) {
		this.identifierType = identifierType;
	}
	public Long getIdentifierId() {
		return identifierId;
	}
	public void setIdentifierId(Long identifierId) {
		this.identifierId = identifierId;
	}
	public String getIdentifierName() {
		return identifierName;
	}
	public void setIdentifierName(String identifierName) {
		this.identifierName = identifierName;
	}
	public String getUserIpAddr() {
		return userIpAddr;
	}
	public void setUserIpAddr(String userIpAddr) {
		this.userIpAddr = userIpAddr;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Long getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(Long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public Instant getRegisteredTs() {
		return registeredTs;
	}
	public void setRegisteredTs(Instant registeredTs) {
		this.registeredTs = registeredTs;
	}
	public Instant getCanceledTs() {
		return canceledTs;
	}
	public void setCanceledTs(Instant canceledTs) {
		this.canceledTs = canceledTs;
	}
	public Integer getUsageCount() {
		return usageCount;
	}
	public void setUsageCount(Integer usageCount) {
		this.usageCount = usageCount;
	}
	public Double getCharged() {
		return charged;
	}
	public void setCharged(Double charged) {
		this.charged = charged;
	}
	public String getPricepointName() {
		return pricepointName;
	}
	public void setPricepointName(String pricepointName) {
		this.pricepointName = pricepointName;
	}
	public Long getVaServiceId() {
		return vaServiceId;
	}
	public void setVaServiceId(Long vaServiceId) {
		this.vaServiceId = vaServiceId;
	}
	public String getVaServiceName() {
		return vaServiceName;
	}
	public void setVaServiceName(String vaServiceName) {
		this.vaServiceName = vaServiceName;
	}
	public String getPricepointLabel() {
		return pricepointLabel;
	}
	public void setPricepointLabel(String pricepointLabel) {
		this.pricepointLabel = pricepointLabel;
	}
	public String getVaServiceLabel() {
		return vaServiceLabel;
	}
	public void setVaServiceLabel(String vaServiceLabel) {
		this.vaServiceLabel = vaServiceLabel;
	}
	public String getIdentifierLabel() {
		return identifierLabel;
	}
	public void setIdentifierLabel(String identifierLabel) {
		this.identifierLabel = identifierLabel;
	}
	public Instant getLastChargedTs() {
		return lastChargedTs;
	}
	public void setLastChargedTs(Instant lastChargedTs) {
		this.lastChargedTs = lastChargedTs;
	}
	public Instant getLastMoTs() {
		return lastMoTs;
	}
	public void setLastMoTs(Instant lastMoTs) {
		this.lastMoTs = lastMoTs;
	}
	public Instant getLastMtTs() {
		return lastMtTs;
	}
	public void setLastMtTs(Instant lastMtTs) {
		this.lastMtTs = lastMtTs;
	}
	public Integer getMoCount() {
		return moCount;
	}
	public void setMoCount(Integer moCount) {
		this.moCount = moCount;
	}
	public Integer getMtCount() {
		return mtCount;
	}
	public void setMtCount(Integer mtCount) {
		this.mtCount = mtCount;
	}
	public Long getLandingId() {
		return landingId;
	}
	public void setLandingId(Long landingId) {
		this.landingId = landingId;
	}
	public String getDescription() {
		
		description = identifierName;
		
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Boolean getCanBeUnsubscribed() {
		return canBeUnsubscribed;
	}
	public void setCanBeUnsubscribed(Boolean canBeUnsubscribed) {
		this.canBeUnsubscribed = canBeUnsubscribed;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getTrialCycles() {
		return trialCycles;
	}
	public void setTrialCycles(Integer trialCycles) {
		this.trialCycles = trialCycles;
	}
	public Boolean getTrialCyclesFirstSubsOnly() {
		return trialCyclesFirstSubsOnly;
	}
	public void setTrialCyclesFirstSubsOnly(Boolean trialCyclesFirstSubsOnly) {
		this.trialCyclesFirstSubsOnly = trialCyclesFirstSubsOnly;
	}
	public String getPricepointCode() {
		return pricepointCode;
	}
	public void setPricepointCode(String pricepointCode) {
		this.pricepointCode = pricepointCode;
	}
	
	
	
}
