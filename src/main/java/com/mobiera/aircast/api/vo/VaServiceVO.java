package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.AcrMode;
import com.mobiera.aircast.commons.enums.MpsMode;
import com.mobiera.aircast.commons.enums.VaServiceType;
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

@JsonInclude(Include.NON_NULL)
@SectionEnum(name="VasSection")
@Label(singular="VaService", plural="VaServices", newEntityLabel="New VaService", newEntityDescription="Create a new VaService")
@Description(data="VaService are Value Added Services such as games, social, content streaming or entertainment Apps.")
public class VaServiceVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3123667467679189800L;
	
	/*HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	ACR_CONFIG("Acr Configuration", "Acr Configuration"),
	VIETTEL_MPS("Viettel Mps", "Viettel Mps"),
	STATS("Stats", "Stats");
	*/
	
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
			description="Name of VaService")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=100)
	private String name;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="MNO Service Provider Name", 
			description="MNO Service Provider Name")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS", "GENERIC"})
		})
	})
	@Validator(minSize=1, maxSize=100)
	private String mnoServiceProviderName;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="MNO Service Name", 
			description="MNO Service Name")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS", "GENERIC"})
		})
	})
	@Validator(minSize=1, maxSize=100)
	private String mnoServiceName;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="MNO Service Id", 
			description="MNO Service Id")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"TELENITY"})
		})
	})
	@Validator(minSize=1, maxSize=32)
	private String mnoServiceId;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Type", 
			description="Type")
	@Section(name = "BASIC_INFORMATION")
	@Required
	private VaServiceType type;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Url", 
			description="Url of VaService")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=500)
	private String url;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Shortcode", 
			description="Shortcode")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=500)
	private String shortcode;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Max MTs per user and per day", 
			description="Max MTs per user and per day")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="0", maxValue="500")
	private Integer maxMTsPerUserPerDay;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Forward MOs", 
			description="Forward MOs")
	@Section(name = "BASIC_INFORMATION")
	private Boolean forwardMos;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Mps Shortcode Username", 
			description="Mps Shortcode Username")
	@Section(name = "VIETTEL_MPS")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS"})
		})
	})
	@Validator(minSize=1, maxSize=500)
	private String mpsShortcodeUsername;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Mps Shortcode Password", 
			description="Mps Shortcode Password")
	@Section(name = "VIETTEL_MPS")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS"})
		})
	})
	@Validator(minSize=1, maxSize=500)
	private String mpsShortcodePassword;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Mps Mode", 
			description="Mps Mode")
	@Section(name = "VIETTEL_MPS")
	@TargetClass(type=ClassType.ENUM, name="MpsMode")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS"})
		})
	})
	@Required
	private MpsMode mpsMode;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Acr Mode", 
			description="Acr Mode")
	@Section(name = "ACR_CONFIG")
	@TargetClass(type=ClassType.ENUM, name="AcrMode")
	@Required
	private AcrMode acrMode;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Respool SubscriptionEvent When Renew", 
			description="Respool SubscriptionEvent When Renew")
	@Section(name = "BASIC_INFORMATION")
	@Validator(defaultValue="false")
	@Required
	private Boolean respoolSubscriptionEventWhenRenew;

	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Notify charging errors", 
			description="Notify charging errors, when possible")
	@Section(name = "BASIC_INFORMATION")
	@Validator(defaultValue="false")
	private Boolean notifyChargingErrors;

	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Tp Charging Notif Endpoint", 
			description="Tp Charging Notif Endpoint")
	@Section(name = "CONTENT_PROVIDER")
	@TargetClass(type=ClassType.VO, name="EndpointVO")
	@Filter(field="type", values = { "KINETIC" })
	private Long tpChargingNotifEndpointFk;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Tp Messaging Notif Endpoint", 
			description="Tp Messaging Notif Endpoint")
	@Section(name = "CONTENT_PROVIDER")
	@TargetClass(type=ClassType.VO, name="EndpointVO")
	@Filter(field="type", values = { "SMPP_SERVER" })
	private Long tpMessagingNotifEndpointFk;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Mno Acr", 
			description="Mno Acr")
	@Section(name = "ACR_CONFIG")
	@Filter(field="acrMode", values = { "FAKE_MSISDN" })
	@Required
	private Boolean mnoAcr;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Landing Hive Keyword", 
			description="Landing Hive Keyword")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=1, maxSize=100)
	private String landingHiveKeyword;
	
	
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Amount Decimals", 
			description="Amount Decimals")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="0", maxValue="10", defaultValue="2")
	private Integer amountDecimals;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Force Tel Prefix For Acr", 
			description="Force Tel Prefix For Acr")
	@Section(name = "ACR_CONFIG")
	@Required
	@Filter(field="acrMode", values = { "FAKE_MSISDN" })
	private Boolean forceTelPrefixForAcr;
	
	/*
	 * Adsafe
	 * 
	 */
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Adsafe Head1", 
			description="Adsafe Head1")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authHead1;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Adsafe Head2", 
			description="Adsafe Head2")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authHead2;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Adsafe FootIcon1", 
			description="Adsafe FootIcon1")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authFootIcon1;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Adsafe FootIcon2", 
			description="Adsafe FootIcon2")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authFootIcon2;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Adsafe FootIcon3", 
			description="Adsafe FootIcon3")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authFootIcon3;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Adsafe Disabled Landing", 
			description="Adsafe Disabled Landing")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authDisabledLanding;
	
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Input Msisdn", 
			description="Auth Input Msisdn")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authInputMsisdn;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Msisdn Required", 
			description="Auth Msisdn Required")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authMsisdnRequired;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Msisdn Length Error", 
			description="Auth Msisdn Length Error")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authMsisdnLengthError;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Submit Msisdn", 
			description="Auth Submit Msisdn")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authSubmitMsisdn;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Input Otp", 
			description="Auth Input Otp")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authInputOtp;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Otp Required", 
			description="Auth Otp Required")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authOtpRequired;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Otp Length Error", 
			description="Auth Otp Length Error")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	
	private String authOtpLengthError;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Submit Otp", 
			description="Auth Submit Otp")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	
	private String authSubmitOtp;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Auth Failed", 
			description="Auth Auth Failed")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authAuthFailed;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Auth Authenticated", 
			description="Auth Authenticated")
	@Section(name = "ADSAFE")
	@Validator(minSize=1, maxSize=512)
	private String authAuthenticated;
	
	
	
	
	private Long authLandingFk;
	
	
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


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getMpsShortcodeUsername() {
		return mpsShortcodeUsername;
	}


	public void setMpsShortcodeUsername(String mpsShortcodeUsername) {
		this.mpsShortcodeUsername = mpsShortcodeUsername;
	}


	public String getMpsShortcodePassword() {
		return mpsShortcodePassword;
	}


	public void setMpsShortcodePassword(String mpsShortcodePassword) {
		this.mpsShortcodePassword = mpsShortcodePassword;
	}


	public MpsMode getMpsMode() {
		return mpsMode;
	}


	public void setMpsMode(MpsMode mpsMode) {
		this.mpsMode = mpsMode;
	}


	public AcrMode getAcrMode() {
		return acrMode;
	}


	public void setAcrMode(AcrMode acrMode) {
		this.acrMode = acrMode;
	}


	public Boolean getRespoolSubscriptionEventWhenRenew() {
		return respoolSubscriptionEventWhenRenew;
	}


	public void setRespoolSubscriptionEventWhenRenew(Boolean respoolSubscriptionEventWhenRenew) {
		this.respoolSubscriptionEventWhenRenew = respoolSubscriptionEventWhenRenew;
	}


	public Long getTpChargingNotifEndpointFk() {
		return tpChargingNotifEndpointFk;
	}


	public void setTpChargingNotifEndpointFk(Long tpChargingNotifEndpointFk) {
		this.tpChargingNotifEndpointFk = tpChargingNotifEndpointFk;
	}


	public Long getTpMessagingNotifEndpointFk() {
		return tpMessagingNotifEndpointFk;
	}


	public void setTpMessagingNotifEndpointFk(Long tpMessagingNotifEndpointFk) {
		this.tpMessagingNotifEndpointFk = tpMessagingNotifEndpointFk;
	}


	public String getShortcode() {
		return shortcode;
	}


	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}


	public Boolean getMnoAcr() {
		return mnoAcr;
	}


	public void setMnoAcr(Boolean mnoAcr) {
		this.mnoAcr = mnoAcr;
	}


	public String getLandingHiveKeyword() {
		return landingHiveKeyword;
	}


	public void setLandingHiveKeyword(String landingHiveKeyword) {
		this.landingHiveKeyword = landingHiveKeyword;
	}


	public Integer getAmountDecimals() {
		return amountDecimals;
	}


	public void setAmountDecimals(Integer amountDecimals) {
		this.amountDecimals = amountDecimals;
	}


	public Boolean getForceTelPrefixForAcr() {
		return forceTelPrefixForAcr;
	}


	public void setForceTelPrefixForAcr(Boolean forceTelPrefixForAcr) {
		this.forceTelPrefixForAcr = forceTelPrefixForAcr;
	}


	public VaServiceType getType() {
		return type;
	}


	public void setType(VaServiceType type) {
		this.type = type;
	}


	public String getMnoServiceProviderName() {
		return mnoServiceProviderName;
	}


	public void setMnoServiceProviderName(String mnoServiceProviderName) {
		this.mnoServiceProviderName = mnoServiceProviderName;
	}


	public String getMnoServiceName() {
		return mnoServiceName;
	}


	public void setMnoServiceName(String mnoServiceName) {
		this.mnoServiceName = mnoServiceName;
	}


	public Long getAuthLandingFk() {
		return authLandingFk;
	}


	public void setAuthLandingFk(Long authLandingFk) {
		this.authLandingFk = authLandingFk;
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


	public Integer getMaxMTsPerUserPerDay() {
		return maxMTsPerUserPerDay;
	}


	public void setMaxMTsPerUserPerDay(Integer maxMTsPerUserPerDay) {
		this.maxMTsPerUserPerDay = maxMTsPerUserPerDay;
	}


	public Boolean getForwardMos() {
		return forwardMos;
	}


	public void setForwardMos(Boolean forwardMos) {
		this.forwardMos = forwardMos;
	}


	public Boolean getNotifyChargingErrors() {
		return notifyChargingErrors;
	}


	public void setNotifyChargingErrors(Boolean notifyChargingErrors) {
		this.notifyChargingErrors = notifyChargingErrors;
	}


	
	
	
	
}
