package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.PricepointPeriodicity;
import com.mobiera.aircast.commons.enums.PricepointType;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Condition;
import com.mobiera.commons.introspection.Conditions;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.DisplayWhen;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.SectionEnum;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@SectionEnum(name="PricepointSection")
@Label(singular="Pricepoint", plural="Pricepoints", newEntityLabel="New Pricepoint", newEntityDescription="Create a new Pricepoint")
@Description(data="Pricepoints are charging rules linked to VaServices.")
@JsonInclude(Include.NON_NULL)
public class PricepointVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3123667467679189800L;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String title;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String description;
	
	
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	private List<EntityState> allowedTransitionStates;

	
	private String label;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	@Section(name = "BASIC_INFORMATION")
	private Long id;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Name", 
			description="Name")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=100)
	private String name;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Code", 
			description="A product code")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=1, maxSize=100)
	private String code;
	
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Currency", 
			description="3-letter Currency code")
	@Section(name = "PRICING")
	@Required
	@Validator(minSize=3, maxSize=3)
	private String currency;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Price", 
			description="End-user service price")
	@Section(name = "PRICING")
	@Required
	private Double endUserPrice;
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Price includes taxes", 
			description="Price includes taxes")
	@Section(name = "PRICING")
	@Required
	private Boolean priceIncludesTaxes;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Charging Periodicidy", 
			description="Charging Periodicidy")
	@Section(name = "PRICING")
	@Required
	private PricepointPeriodicity periodicity;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Renew Mt Notification Periodicity", 
			description="Renew Mt Notification Periodicity")
	@Section(name = "PRICING")
	@Validator(allowedValues = {"WEEK", "MONTH"})
	@DisplayWhen({
		@Conditions({
			@Condition(field="periodicity", values = {"DAY", "EACH_TWO_DAY", "WEEK"})
		})
	})
	private PricepointPeriodicity renewMtNotificationPeriodicity;
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Trial Periodicity Cycles", 
			description="Number of Periodicity Cycles that will not be charged to user")
	@Section(name = "PRICING")
	@Validator(defaultValue="0", minValue="0", maxValue="10")
	@Required
	private Integer trialCycles;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Trial for first-time subscription only", 
			description="Trial for first-time subscription only")
	@Section(name = "PRICING")
	@Validator(defaultValue="FALSE")
	@Required
	private Boolean trialCyclesFirstSubsOnly;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Revenue Share", 
			description="Revenue Share")
	@Section(name = "PRICING")
	@Required
	private Double revenueShare;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Type", 
			description="Type")
	@Section(name = "BASIC_INFORMATION")
	@Required
	private PricepointType type;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Provider Rate Data", 
			description="Provider Rate Data")
	@Section(name = "CHARGING_PROVIDER")
	
	@Required
	private String providerRateData;
	
	/*
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Provider Service ID", 
			description="Provider Service ID")
	@Section(name = "CHARGING_PROVIDER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"TELENITY"})
		})
	})
	@Required
	private String providerServiceId;
	
	*/
	private Instant deletedTs;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="VaService", 
			description="VaService linked to this Pricepoint")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="VaServiceVO")
	@Required
	private Long vaServiceFk;

	
	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Vt Public Key", 
			description="Vt Public Key")
	@Section(name = "CHARGING_PROVIDER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS"})
		})
	})
	@Required
	private String vtPublicKey;
	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Cp Private Key", 
			description="Cp Private Key")
	@Section(name = "CHARGING_PROVIDER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS"})
		})
	})
	@Required
	private String cpPrivateKey;
	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Cp Public Key", 
			description="Cp Public Key")
	@Section(name = "CHARGING_PROVIDER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS"})
		})
	})
	@Required
	private String cpPublicKey;
	
	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Client Id", 
			description="Client Id")
	@Section(name = "CHARGING_PROVIDER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"TELENITY"})
		})
	})
	@Required
	private String clientId;
	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Client Secret", 
			description="Client Secret")
	@Section(name = "CHARGING_PROVIDER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"TELENITY"})
		})
	})
	@Required
	private String clientSecret;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Test Keyword", 
			description="Test Keyword")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=1, maxSize=100, defaultValue="ON")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS"})
		})
	})
	@Required
	private String testKeyword;
	
	
	/*
	 * Adsafe
	 * 
	 */
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Head1", 
			description="Authz Head1")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzHead1;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Head2", 
			description="Authz Head2")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzHead2;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz FootIcon1", 
			description="Authz FootIcon1")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzFootIcon1;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz FootIcon2", 
			description="Authz FootIcon2")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzFootIcon2;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz FootIcon3", 
			description="Authz FootIcon3")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzFootIcon3;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Disabled Landing", 
			description="Authz Disabled Landing")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzDisabledLanding;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Submit", 
			description="Authz Submit")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzSubmit;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Subscription Succesfull1", 
			description="Authz Subscription Succesfull1")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzSubscriptionSuccesfull1;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Subscription Succesfull2", 
			description="Authz Subscription Succesfull2")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzSubscriptionSuccesfull2;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Subscription Succesfull Instructions", 
			description="Authz Subscription Succesfull Instructions")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzSubscriptionSuccesfullInstructions;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Subscription Failed", 
			description="Authz Subscription Failed")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzSubscriptionFailed;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz User Unsubscribed", 
			description="Authz User Unsubscribed")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzUserUnsubscribed;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Send To Shortcode", 
			description="Authz Send To Shortcode")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzSendToShortcode;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Expired Subscription", 
			description="Authz Expired Subscription")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzExpiredSubscription;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authz Invitation To Recharge", 
			description="Authz Invitation To Recharge")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authzInvitationToRecharge;
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="MT pricepoint Info", 
			description="MT pricepoint Info")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=1, maxSize=100)
	private String mtInfo;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Unsubscribe Keyword", 
			description="Unsubscribe Keyword")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=1, maxSize=100, defaultValue="CANCEL")
	@Required
	private String unsubscribeKw;
	
	
	
	
	private Long defaultKeywordIdentifierFk;
	private Long defaultAuthLandingFk;
	private Long defaultAuthzLandingFk;
	
	public String getTestKeyword() {
		return testKeyword;
	}

	public void setTestKeyword(String testKeyword) {
		this.testKeyword = testKeyword;
	}

	private String vaServiceShortcode;
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EntityState getState() {
		return state;
	}

	public void setState(EntityState state) {
		this.state = state;
	}

	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}

	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getEndUserPrice() {
		return endUserPrice;
	}

	public void setEndUserPrice(Double endUserPrice) {
		this.endUserPrice = endUserPrice;
	}

	public Boolean getPriceIncludesTaxes() {
		return priceIncludesTaxes;
	}

	public void setPriceIncludesTaxes(Boolean priceIncludesTaxes) {
		this.priceIncludesTaxes = priceIncludesTaxes;
	}

	public PricepointPeriodicity getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(PricepointPeriodicity periodicity) {
		this.periodicity = periodicity;
	}

	public String getVaServiceShortcode() {
		return vaServiceShortcode;
	}

	public void setVaServiceShortcode(String vaServiceShortcode) {
		this.vaServiceShortcode = vaServiceShortcode;
	}

	public Double getRevenueShare() {
		return revenueShare;
	}

	public void setRevenueShare(Double revenueShare) {
		this.revenueShare = revenueShare;
	}

	
	public String getProviderRateData() {
		return providerRateData;
	}

	public void setProviderRateData(String providerRateData) {
		this.providerRateData = providerRateData;
	}

	public Instant getDeletedTs() {
		return deletedTs;
	}

	public void setDeletedTs(Instant deletedTs) {
		this.deletedTs = deletedTs;
	}

	public Long getVaServiceFk() {
		return vaServiceFk;
	}

	public void setVaServiceFk(Long vaServiceFk) {
		this.vaServiceFk = vaServiceFk;
	}

	public PricepointType getType() {
		return type;
	}

	public void setType(PricepointType type) {
		this.type = type;
	}

	

	public String getVtPublicKey() {
		return vtPublicKey;
	}

	public void setVtPublicKey(String vtPublicKey) {
		this.vtPublicKey = vtPublicKey;
	}

	public String getCpPrivateKey() {
		return cpPrivateKey;
	}

	public void setCpPrivateKey(String cpPrivateKey) {
		this.cpPrivateKey = cpPrivateKey;
	}

	public String getCpPublicKey() {
		return cpPublicKey;
	}

	public void setCpPublicKey(String cpPublicKey) {
		this.cpPublicKey = cpPublicKey;
	}

	public Long getDefaultKeywordIdentifierFk() {
		return defaultKeywordIdentifierFk;
	}

	public void setDefaultKeywordIdentifierFk(Long defaultKeywordIdentifierFk) {
		this.defaultKeywordIdentifierFk = defaultKeywordIdentifierFk;
	}

	public Long getDefaultAuthLandingFk() {
		return defaultAuthLandingFk;
	}

	public void setDefaultAuthLandingFk(Long defaultAuthLandingFk) {
		this.defaultAuthLandingFk = defaultAuthLandingFk;
	}

	public Long getDefaultAuthzLandingFk() {
		return defaultAuthzLandingFk;
	}

	public void setDefaultAuthzLandingFk(Long defaultAuthzLandingFk) {
		this.defaultAuthzLandingFk = defaultAuthzLandingFk;
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

	public String getAuthzHead1() {
		return authzHead1;
	}

	public void setAuthzHead1(String authzHead1) {
		this.authzHead1 = authzHead1;
	}

	public String getAuthzHead2() {
		return authzHead2;
	}

	public void setAuthzHead2(String authzHead2) {
		this.authzHead2 = authzHead2;
	}

	public String getAuthzFootIcon1() {
		return authzFootIcon1;
	}

	public void setAuthzFootIcon1(String authzFootIcon1) {
		this.authzFootIcon1 = authzFootIcon1;
	}

	public String getAuthzFootIcon2() {
		return authzFootIcon2;
	}

	public void setAuthzFootIcon2(String authzFootIcon2) {
		this.authzFootIcon2 = authzFootIcon2;
	}

	public String getAuthzFootIcon3() {
		return authzFootIcon3;
	}

	public void setAuthzFootIcon3(String authzFootIcon3) {
		this.authzFootIcon3 = authzFootIcon3;
	}

	public String getAuthzDisabledLanding() {
		return authzDisabledLanding;
	}

	public void setAuthzDisabledLanding(String authzDisabledLanding) {
		this.authzDisabledLanding = authzDisabledLanding;
	}

	public String getAuthzSubmit() {
		return authzSubmit;
	}

	public void setAuthzSubmit(String authzSubmit) {
		this.authzSubmit = authzSubmit;
	}

	public String getAuthzSubscriptionSuccesfull1() {
		return authzSubscriptionSuccesfull1;
	}

	public void setAuthzSubscriptionSuccesfull1(String authzSubscriptionSuccesfull1) {
		this.authzSubscriptionSuccesfull1 = authzSubscriptionSuccesfull1;
	}

	public String getAuthzSubscriptionSuccesfull2() {
		return authzSubscriptionSuccesfull2;
	}

	public void setAuthzSubscriptionSuccesfull2(String authzSubscriptionSuccesfull2) {
		this.authzSubscriptionSuccesfull2 = authzSubscriptionSuccesfull2;
	}

	public String getAuthzSubscriptionSuccesfullInstructions() {
		return authzSubscriptionSuccesfullInstructions;
	}

	public void setAuthzSubscriptionSuccesfullInstructions(String authzSubscriptionSuccesfullInstructions) {
		this.authzSubscriptionSuccesfullInstructions = authzSubscriptionSuccesfullInstructions;
	}

	public String getAuthzSubscriptionFailed() {
		return authzSubscriptionFailed;
	}

	public void setAuthzSubscriptionFailed(String authzSubscriptionFailed) {
		this.authzSubscriptionFailed = authzSubscriptionFailed;
	}

	public String getAuthzUserUnsubscribed() {
		return authzUserUnsubscribed;
	}

	public void setAuthzUserUnsubscribed(String authzUserUnsubscribed) {
		this.authzUserUnsubscribed = authzUserUnsubscribed;
	}

	public String getAuthzSendToShortcode() {
		return authzSendToShortcode;
	}

	public void setAuthzSendToShortcode(String authzSendToShortcode) {
		this.authzSendToShortcode = authzSendToShortcode;
	}

	public String getAuthzExpiredSubscription() {
		return authzExpiredSubscription;
	}

	public void setAuthzExpiredSubscription(String authzExpiredSubscription) {
		this.authzExpiredSubscription = authzExpiredSubscription;
	}

	public String getAuthzInvitationToRecharge() {
		return authzInvitationToRecharge;
	}

	public void setAuthzInvitationToRecharge(String authzInvitationToRecharge) {
		this.authzInvitationToRecharge = authzInvitationToRecharge;
	}

	public String getMtInfo() {
		return mtInfo;
	}

	public void setMtInfo(String mtInfo) {
		this.mtInfo = mtInfo;
	}

	public String getUnsubscribeKw() {
		return unsubscribeKw;
	}

	public void setUnsubscribeKw(String unsubscribeKw) {
		this.unsubscribeKw = unsubscribeKw;
	}

	public PricepointPeriodicity getRenewMtNotificationPeriodicity() {
		return renewMtNotificationPeriodicity;
	}

	public void setRenewMtNotificationPeriodicity(PricepointPeriodicity renewMtNotificationPeriodicity) {
		this.renewMtNotificationPeriodicity = renewMtNotificationPeriodicity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	

	
	
	
	
}


