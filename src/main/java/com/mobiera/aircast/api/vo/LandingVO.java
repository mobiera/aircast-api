package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.LandingFlow;
import com.mobiera.aircast.commons.enums.LandingType;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Condition;
import com.mobiera.commons.introspection.Conditions;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.DisplayWhen;
import com.mobiera.commons.introspection.Filter;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.SectionEnum;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@SectionEnum(name="LandingSection")
@Label(singular="Landing", plural="Landings", newEntityLabel="New Landing", newEntityDescription="Create a new Landing")
@Description(data="Landing are linked to Pricepoints (Authorization Landings, for payment) or to VaServices (Authentication Landings).")
@JsonInclude(Include.NON_NULL)
public class LandingVO implements Serializable {

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
			description="Name of Applet")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=100)
	private String name;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Type", 
			description="Identifier Type")
	@Section(name = "BASIC_INFORMATION")
	@Validator(allowedValues = {"AUTH", "AUTHZ"})
	@Required
	private LandingType landingType;
	
	private Instant deletedTs;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="VaService", 
			description="VaService")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="VaServiceVO")
	@Filter(field="type", values = { "VIETTEL_MPS" })
	@DisplayWhen({
		@Conditions({
			@Condition(field="landingType", values = {"AUTH"})	
		})
	})
	@Required
	private Long vaServiceFk;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Pricepoint", 
			description="Pricepoint")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="PricepointVO")
	@Filter(field="type", values = { "VIETTEL_MPS" })
	@DisplayWhen({
		@Conditions({
			@Condition(field="landingType", values = {"AUTHZ"})
			
		})
	})
	@Required
	private Long pricepointFk;
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="He Identifier", 
			description="He Identifier")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="IdentifierVO")
	private Long heIdentifierFk;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Otp Identifier", 
			description="Otp Identifier")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="IdentifierVO")
	private Long otpIdentifierFk;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Authtz Optins", 
			description="Authtz Optins")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="2", defaultValue="2")
	@DisplayWhen({
		@Conditions({
			@Condition(field="landingType", values = {"AUTHZ"})
			
		})
	})
	private Integer authzOptins;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="HE Flow", 
			description="HE Flow")
	@Section(name = "BASIC_INFORMATION")
	@Validator(allowedValues = {"HE", "NONE"})
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="landingType", values = {"AUTH"})	
		})
	})
	private LandingFlow heFlow;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="OTP Flow", 
			description="OTP Flow")
	@Section(name = "BASIC_INFORMATION")
	@Validator(allowedValues = {"OTP", "FORCE_OTP", "NONE"})
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="landingType", values = {"AUTH"})	
		})
	})
	private LandingFlow otpFlow;
	
	
	private String telCountryPrefix;
	
	
	
	
	private String authHead1;
	private String authHead2;
	private String authFootIcon1;
	private String authFootIcon2;
	private String authFootIcon3;
	private String authDisabledLanding;
	private String authInputMsisdn;
	private String authHeaderEnrichment;
	private String authMsisdnRequired;
	private String authMsisdnLengthError;
	private String authSubmitMsisdn;
	private String authInputOtp;
	private String authOtpRequired;
	private String authOtpLengthError;
	private String authSubmitOtp;
	private String authAuthFailed;
	private String authAuthenticated;
	
	
	
	
	private String authzHead1;
	private String authzHead2;
	private String authzFootIcon1;
	private String authzFootIcon2;
	private String authzFootIcon3;
	private String authzDisabledLanding;
	private String authzSubmit;
	private String authzSubscriptionSuccesfull1;
	private String authzSubscriptionSuccesfull2;
	private String authzSubscriptionSuccesfullInstructions;
	private String authzSubscriptionFailed;
	private String authzUserUnsubscribed;
	private String authzSendToShortcode;
	private String authzExpiredSubscription;
	private String authzInvitationToRecharge;
	
	
	private Boolean failover;
	
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

	public Instant getDeletedTs() {
		return deletedTs;
	}

	public void setDeletedTs(Instant deletedTs) {
		this.deletedTs = deletedTs;
	}

	

	public Long getPricepointFk() {
		return pricepointFk;
	}

	public void setPricepointFk(Long pricepointFk) {
		this.pricepointFk = pricepointFk;
	}

	public Long getHeIdentifierFk() {
		return heIdentifierFk;
	}

	public void setHeIdentifierFk(Long heIdentifierFk) {
		this.heIdentifierFk = heIdentifierFk;
	}

	public Long getOtpIdentifierFk() {
		return otpIdentifierFk;
	}

	public void setOtpIdentifierFk(Long otpIdentifierFk) {
		this.otpIdentifierFk = otpIdentifierFk;
	}

	public Boolean getFailover() {
		return failover;
	}

	public void setFailover(Boolean failover) {
		this.failover = failover;
	}

	public Integer getAuthzOptins() {
		return authzOptins;
	}

	public void setAuthzOptins(Integer authzOptins) {
		this.authzOptins = authzOptins;
	}

	public LandingType getLandingType() {
		return landingType;
	}

	public void setLandingType(LandingType landingType) {
		this.landingType = landingType;
	}

	public Long getVaServiceFk() {
		return vaServiceFk;
	}

	public void setVaServiceFk(Long vaServiceFk) {
		this.vaServiceFk = vaServiceFk;
	}

	public LandingFlow getHeFlow() {
		return heFlow;
	}

	public void setHeFlow(LandingFlow heFlow) {
		this.heFlow = heFlow;
	}

	public LandingFlow getOtpFlow() {
		return otpFlow;
	}

	public void setOtpFlow(LandingFlow otpFlow) {
		this.otpFlow = otpFlow;
	}

	public String getTelCountryPrefix() {
		return telCountryPrefix;
	}

	public void setTelCountryPrefix(String telCountryPrefix) {
		this.telCountryPrefix = telCountryPrefix;
	}

	public String getAuthHead1() {
		return authHead1;
	}

	public void setAuthHead1(String authHead1) {
		this.authHead1 = authHead1;
	}

	public String getAuthHead2() {
		return authHead2;
	}

	public void setAuthHead2(String authHead2) {
		this.authHead2 = authHead2;
	}

	public String getAuthFootIcon1() {
		return authFootIcon1;
	}

	public void setAuthFootIcon1(String authFootIcon1) {
		this.authFootIcon1 = authFootIcon1;
	}

	public String getAuthFootIcon2() {
		return authFootIcon2;
	}

	public void setAuthFootIcon2(String authFootIcon2) {
		this.authFootIcon2 = authFootIcon2;
	}

	public String getAuthFootIcon3() {
		return authFootIcon3;
	}

	public void setAuthFootIcon3(String authFootIcon3) {
		this.authFootIcon3 = authFootIcon3;
	}

	public String getAuthDisabledLanding() {
		return authDisabledLanding;
	}

	public void setAuthDisabledLanding(String authDisabledLanding) {
		this.authDisabledLanding = authDisabledLanding;
	}

	public String getAuthInputMsisdn() {
		return authInputMsisdn;
	}

	public void setAuthInputMsisdn(String authInputMsisdn) {
		this.authInputMsisdn = authInputMsisdn;
	}

	public String getAuthHeaderEnrichment() {
		return authHeaderEnrichment;
	}

	public void setAuthHeaderEnrichment(String authHeaderEnrichment) {
		this.authHeaderEnrichment = authHeaderEnrichment;
	}

	public String getAuthMsisdnRequired() {
		return authMsisdnRequired;
	}

	public void setAuthMsisdnRequired(String authMsisdnRequired) {
		this.authMsisdnRequired = authMsisdnRequired;
	}

	public String getAuthMsisdnLengthError() {
		return authMsisdnLengthError;
	}

	public void setAuthMsisdnLengthError(String authMsisdnLengthError) {
		this.authMsisdnLengthError = authMsisdnLengthError;
	}

	public String getAuthSubmitMsisdn() {
		return authSubmitMsisdn;
	}

	public void setAuthSubmitMsisdn(String authSubmitMsisdn) {
		this.authSubmitMsisdn = authSubmitMsisdn;
	}

	public String getAuthInputOtp() {
		return authInputOtp;
	}

	public void setAuthInputOtp(String authInputOtp) {
		this.authInputOtp = authInputOtp;
	}

	public String getAuthOtpRequired() {
		return authOtpRequired;
	}

	public void setAuthOtpRequired(String authOtpRequired) {
		this.authOtpRequired = authOtpRequired;
	}

	public String getAuthOtpLengthError() {
		return authOtpLengthError;
	}

	public void setAuthOtpLengthError(String authOtpLengthError) {
		this.authOtpLengthError = authOtpLengthError;
	}

	public String getAuthSubmitOtp() {
		return authSubmitOtp;
	}

	public void setAuthSubmitOtp(String authSubmitOtp) {
		this.authSubmitOtp = authSubmitOtp;
	}

	public String getAuthAuthFailed() {
		return authAuthFailed;
	}

	public void setAuthAuthFailed(String authAuthFailed) {
		this.authAuthFailed = authAuthFailed;
	}

	public String getAuthAuthenticated() {
		return authAuthenticated;
	}

	public void setAuthAuthenticated(String authAuthenticated) {
		this.authAuthenticated = authAuthenticated;
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

	
	
	
	
	
	
	
}
