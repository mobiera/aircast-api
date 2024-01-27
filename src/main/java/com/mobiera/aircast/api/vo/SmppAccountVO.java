package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.commons.enums.CharsetName;
import com.mobiera.aircast.commons.enums.SmppSmsIdFormat;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.ServiceStatus;
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
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
@SectionEnum(name="SmppAccountSection")
@Label(singular="Smpp Account", plural="Smpp Accounts", newEntityLabel="New Smpp Account", newEntityDescription="Create a new Smpp Account")
@Description(data="Smpp Account are SMSC accounts used to run the core of Aircast Service. All Aircast communication is done by using SMSC Smpp Accounts. At least one Smpp Account must be created if you intend to use Aircast.")
public class SmppAccountVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 281608528040069273L;

	/*
	 * HEADER("Header", "Header"),
	BASIC_INFORMATION("Basic Information", "Basic Information"),
	SMSC_BIND_CONFIGURATION("SMSC Bind Configursation", "SMSC Bind Configursation"),
	TRAFFIC_CONTROL("Traffic Control", "Traffic Control"),
	SERVICE_LOGS("Service Logs", "Service Logs");
	
	 */
	private String label;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String title;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String description;
	
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	@Section(name = "BASIC_INFORMATION")
	private Long id;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Name", 
			description="Name of SMPP Account")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=1, maxSize=100)
	@Required
	private String name;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="SMSC default alphabet", 
			description="Default alphabet of SMSC when dcs is set to 0x00")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(defaultValue="NAME_GSM")
	private CharsetName defaultAlphabetCharset;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Supports DLR", 
			description="SMSC Supports Delivery Reports")
	@Section(name = "BASIC_INFORMATION")
	private Boolean supportsDlr;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, label="SmsID format", description="SMSC SmsID format. In order to be able to match IDs in DLR with IDs in submit_sm_resp, select proper format")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="supportsDlr", values = {"true"})
		})
	})
	private SmppSmsIdFormat smppSmsIdFormat;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Src TON", 
			description="Type of Number of src address")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15", defaultValue="1")
	@Required
	private Integer srcTon;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Src NPI", 
			description="Numbering plan identification of src address")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15", defaultValue="1")
	@Required
	private Integer srcNpi;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Dest TON", 
			description="Type of Number of dest address")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15", defaultValue="1")
	@Required
	private Integer destTon;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Dest NPI", 
			description="Numbering plan identification of dest address")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15", defaultValue="1")
	@Required
	private Integer destNpi;
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Address Range", 
			description="Optional SMSC required configuration, mostly ignored")
	@Section(name = "BASIC_INFORMATION")
	private String addressRange;
	
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Min Validity Period", 
			description="shortest message validity period allowed by SMSC in ms")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="300000", maxValue="172800000", defaultValue="86400000")
	private Long minValidityPeriod;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Max Validity Period", 
			description="largest message validity period allowed by SMSC in ms")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="300000", maxValue="172800000", defaultValue="86400000")
	private Long maxValidityPeriod;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Default Validity Period", 
			description="default message validity period of SMSC in ms")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="300000", maxValue="172800000", defaultValue="86400000")
	private Long defaultValidityPeriod;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Window Size", 
			description="Window Size")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="20", maxValue="300", defaultValue="80")
	@Required
	private Integer windowSize;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Window Monitor Interval", 
			description="Time Interval between 2 checks of window state")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="2000", maxValue="30000", defaultValue="5000")
	@Required
	private Integer windowMonitorInterval;
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Connect Timeout", 
			description="Time to wait before considering connection timeout, in ms")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="2000", maxValue="100000", defaultValue="10000")
	@Required
	private Integer connectTimeout;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Request Expiry Timeout", 
			description="Time in ms to consider for request timeout")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="2000", maxValue="100000", defaultValue="10000")
	@Required
	private Integer requestExpiryTimeout;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Enquire Link Period", 
			description="Time Interval between 2 Enquire Link commands")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="2000", maxValue="100000", defaultValue="20000")
	@Required
	private Integer enquireLinkPeriod;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Enquire Link Timeout", 
			description="Time in ms to consider for enquire link timeout")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="1500", maxValue="80000", defaultValue="15000")
	@Required
	private Integer enquireLinkTimeout;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Default Shortcode (Incoming)", 
			description="Default Shortcode for Incoming Traffic")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=2, maxSize=15)
	@Required
	private String sleepyIncomingShortcode;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Default Shortcode (OT)", 
			description="Default Shortcode for Outgoing Traffic")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=2, maxSize=15)
	@Required
	private String sleepyOutgoingShortcode;
	
	
	@UI( widgetType = WidgetType.TABLE, 
			mode = Mode.READ_WRITE, 
			label="Smsc Binds", 
			description="Configuration of Smpp Binds")
	@Section(name = "SMSC_BIND_CONFIGURATION")
	@Validator(minSize=1, maxSize=15)
	@Required
	private List<SmppBindVO> binds;
	
	
	@TargetClass(type=ClassType.VO, name="TpRuleVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Default TPS rule", description="Default TPS rule")
	@Section(name = "TRAFFIC_CONTROL")
	@Required
	private Long defaultTpRuleFk;
	
	@TargetClass(type=ClassType.VO, name="TpRuleVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Monday Optional TPS rule", description="Default TPS rule")
	@Section(name = "TRAFFIC_CONTROL")
	private Long dayMonTpRuleFk;
	
	@TargetClass(type=ClassType.VO, name="TpRuleVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Tuesday Optional TPS rule", description="Monday Optional TPS rule")
	@Section(name = "TRAFFIC_CONTROL")
	private Long dayTueTpRuleFk;
	
	@TargetClass(type=ClassType.VO, name="TpRuleVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Wednesday Optional TPS rule", description="Tuesday Optional TPS rule")
	@Section(name = "TRAFFIC_CONTROL")
	private Long dayWedTpRuleFk;
	
	@TargetClass(type=ClassType.VO, name="TpRuleVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Thursday Optional TPS rule", description="Wednesday Optional TPS rule")
	@Section(name = "TRAFFIC_CONTROL")
	private Long dayThuTpRuleFk;
	
	@TargetClass(type=ClassType.VO, name="TpRuleVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Friday Optional TPS rule", description="Thursday Optional TPS rule")
	@Section(name = "TRAFFIC_CONTROL")
	private Long dayFriTpRuleFk;
	
	@TargetClass(type=ClassType.VO, name="TpRuleVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Saturday Optional TPS rule", description="Friday Optional TPS rule")
	@Section(name = "TRAFFIC_CONTROL")
	private Long daySatTpRuleFk;
	
	@TargetClass(type=ClassType.VO, name="TpRuleVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Sunday Optional TPS rule", description="Saturday Optional TPS rule")
	@Section(name = "TRAFFIC_CONTROL")
	private Long daySunTpRuleFk;
	
	@TargetClass(type=ClassType.VO, name="TpRuleVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Holiday Optional TPS rule", description="Holiday Optional TPS rule")
	@Section(name = "TRAFFIC_CONTROL")
	private Long dayHolidayTpRuleFk;
	
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="Messaging MO Consumer Threads", description="Number of threads that will attempt to process the pending requests. Use about one thread for each 5 TPS ")
	@Section( name = "TRAFFIC_CONTROL")
	@Required
	@Validator(minValue="1", maxValue="32", defaultValue="1")
	private Short messagingMoConsumerThreads;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="Messaging MT Consumer Threads", description="Number of threads that will attempt to process the pending requests. Use about one thread for each 5 TPS ")
	@Section( name = "TRAFFIC_CONTROL")
	@Required
	@Validator(minValue="1", maxValue="32", defaultValue="1")
	private Short messagingMtConsumerThreads;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="Run Consumer Threads", description="Number of threads that will attempt to process the pending requests. Use about one thread for each 5 TPS ")
	@Section( name = "TRAFFIC_CONTROL")
	@Required
	@Validator(minValue="1", maxValue="32", defaultValue="1")
	private Short runConsumerThreads;
	
	
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="Last received MO", 
	description="Last received MO")
	@Section(name = "SERVICE_LOG")
	private Instant lastMoTs;
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="Last sent MT", 
	description="Last sent MT")
	@Section(name = "SERVICE_LOG")
	private Instant lastMtTs;
	
	
	
	private List<EntityState> allowedTransitionStates;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, label="Service Status", description="Status of the backend service")
	@Section( name = "HEADER")
	private ServiceStatus serviceStatus;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Default Shortcode", 
			description="Default Shortcode")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15")
	@Required
	private String defaultShortcode;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Default USTK Shortcode", 
			description="Default USTK Shortcode")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15")
	@Required
	private String defaultUstkShortcode;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Default Sleepy Shortcode", 
			description="Default Sleepy Shortcode")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15")
	@Required
	private String defaultSleepyShortcode;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Default RAM Shortcode", 
			description="Default RAM Shortcode")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15")
	@Required
	private String defaultRamShortcode;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Default RFM Shortcode", 
			description="Default RFM Shortcode")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15")
	@Required
	private String defaultRfmShortcode;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Override Mt Sleepy Shortcode", 
			description="Override Mt Sleepy Shortcode")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minValue="0", maxValue="15")
	@Required
	private String overrideMtSleepyShortcode;
	
	
	
	public final String getAddressRange() {
		return addressRange;
	}
	public final void setAddressRange(String addressRange) {
		this.addressRange = addressRange;
	}
	public final Integer getConnectTimeout() {
		return connectTimeout;
	}
	public final void setConnectTimeout(Integer connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	public final Integer getDestNpi() {
		return destNpi;
	}
	public final void setDestNpi(Integer destNpi) {
		this.destNpi = destNpi;
	}
	public final Integer getDestTon() {
		return destTon;
	}
	public final void setDestTon(Integer destTon) {
		this.destTon = destTon;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final Integer getRequestExpiryTimeout() {
		return requestExpiryTimeout;
	}
	public final void setRequestExpiryTimeout(Integer requestExpiryTimeout) {
		this.requestExpiryTimeout = requestExpiryTimeout;
	}
	public final Integer getSrcNpi() {
		return srcNpi;
	}
	public final void setSrcNpi(Integer srcNpi) {
		this.srcNpi = srcNpi;
	}
	public final Integer getSrcTon() {
		return srcTon;
	}
	public final void setSrcTon(Integer srcTon) {
		this.srcTon = srcTon;
	}
	
	public final Long getDefaultTpRuleFk() {
		return defaultTpRuleFk;
	}
	public final void setDefaultTpRuleFk(Long defaultTpRuleFk) {
		this.defaultTpRuleFk = defaultTpRuleFk;
	}
	public final Long getDayMonTpRuleFk() {
		return dayMonTpRuleFk;
	}
	public final void setDayMonTpRuleFk(Long dayMonTpRuleFk) {
		this.dayMonTpRuleFk = dayMonTpRuleFk;
	}
	public final Long getDayTueTpRuleFk() {
		return dayTueTpRuleFk;
	}
	public final void setDayTueTpRuleFk(Long dayTueTpRuleFk) {
		this.dayTueTpRuleFk = dayTueTpRuleFk;
	}
	public final Long getDayWedTpRuleFk() {
		return dayWedTpRuleFk;
	}
	public final void setDayWedTpRuleFk(Long dayWedTpRuleFk) {
		this.dayWedTpRuleFk = dayWedTpRuleFk;
	}
	public final Long getDayThuTpRuleFk() {
		return dayThuTpRuleFk;
	}
	public final void setDayThuTpRuleFk(Long dayThuTpRuleFk) {
		this.dayThuTpRuleFk = dayThuTpRuleFk;
	}
	public final Long getDayFriTpRuleFk() {
		return dayFriTpRuleFk;
	}
	public final void setDayFriTpRuleFk(Long dayFriTpRuleFk) {
		this.dayFriTpRuleFk = dayFriTpRuleFk;
	}
	public final Long getDaySatTpRuleFk() {
		return daySatTpRuleFk;
	}
	public final void setDaySatTpRuleFk(Long daySatTpRuleFk) {
		this.daySatTpRuleFk = daySatTpRuleFk;
	}
	public final Long getDaySunTpRuleFk() {
		return daySunTpRuleFk;
	}
	public final void setDaySunTpRuleFk(Long daySunTpRuleFk) {
		this.daySunTpRuleFk = daySunTpRuleFk;
	}
	public final Long getDayHolidayTpRuleFk() {
		return dayHolidayTpRuleFk;
	}
	public final void setDayHolidayTpRuleFk(Long dayHolidayTpRuleFk) {
		this.dayHolidayTpRuleFk = dayHolidayTpRuleFk;
	}
	public final Long getMinValidityPeriod() {
		return minValidityPeriod;
	}
	public final void setMinValidityPeriod(Long minValidityPeriod) {
		this.minValidityPeriod = minValidityPeriod;
	}
	public final Long getMaxValidityPeriod() {
		return maxValidityPeriod;
	}
	public final void setMaxValidityPeriod(Long maxValidityPeriod) {
		this.maxValidityPeriod = maxValidityPeriod;
	}
	public final Long getDefaultValidityPeriod() {
		return defaultValidityPeriod;
	}
	public final void setDefaultValidityPeriod(Long defaultValidityPeriod) {
		this.defaultValidityPeriod = defaultValidityPeriod;
	}
	public final SmppSmsIdFormat getSmppSmsIdFormat() {
		return smppSmsIdFormat;
	}
	public final void setSmppSmsIdFormat(SmppSmsIdFormat smppSmsIdFormat) {
		this.smppSmsIdFormat = smppSmsIdFormat;
	}
	public final Boolean getSupportsDlr() {
		return supportsDlr;
	}
	public final void setSupportsDlr(Boolean supportsDlr) {
		this.supportsDlr = supportsDlr;
	}
	public final Integer getWindowMonitorInterval() {
		return windowMonitorInterval;
	}
	public final void setWindowMonitorInterval(Integer windowMonitorInterval) {
		this.windowMonitorInterval = windowMonitorInterval;
	}
	public final Integer getWindowSize() {
		return windowSize;
	}
	public final void setWindowSize(Integer windowSize) {
		this.windowSize = windowSize;
	}
	public final EntityState getState() {
		return state;
	}
	public final void setState(EntityState state) {
		this.state = state;
	}
	
	public String getSleepyIncomingShortcode() {
		return sleepyIncomingShortcode;
	}
	public void setSleepyIncomingShortcode(String sleepyIncomingShortcode) {
		this.sleepyIncomingShortcode = sleepyIncomingShortcode;
	}
	public String getSleepyOutgoingShortcode() {
		return sleepyOutgoingShortcode;
	}
	public void setSleepyOutgoingShortcode(String sleepyOutgoingShortcode) {
		this.sleepyOutgoingShortcode = sleepyOutgoingShortcode;
	}
	public Integer getEnquireLinkPeriod() {
		return enquireLinkPeriod;
	}
	public void setEnquireLinkPeriod(Integer enquireLinkPeriod) {
		this.enquireLinkPeriod = enquireLinkPeriod;
	}
	public Integer getEnquireLinkTimeout() {
		return enquireLinkTimeout;
	}
	public void setEnquireLinkTimeout(Integer enquireLinkTimeout) {
		this.enquireLinkTimeout = enquireLinkTimeout;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CharsetName getDefaultAlphabetCharset() {
		return defaultAlphabetCharset;
	}
	public void setDefaultAlphabetCharset(CharsetName defaultAlphabetCharset) {
		this.defaultAlphabetCharset = defaultAlphabetCharset;
	}
	public List<SmppBindVO> getBinds() {
		return binds;
	}
	public void setBinds(List<SmppBindVO> binds) {
		this.binds = binds;
	}
	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}
	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}
	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(ServiceStatus serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public Short getMessagingMoConsumerThreads() {
		return messagingMoConsumerThreads;
	}
	public void setMessagingMoConsumerThreads(Short messagingMoConsumerThreads) {
		this.messagingMoConsumerThreads = messagingMoConsumerThreads;
	}
	public Short getMessagingMtConsumerThreads() {
		return messagingMtConsumerThreads;
	}
	public void setMessagingMtConsumerThreads(Short messagingMtConsumerThreads) {
		this.messagingMtConsumerThreads = messagingMtConsumerThreads;
	}
	public Short getRunConsumerThreads() {
		return runConsumerThreads;
	}
	public void setRunConsumerThreads(Short runConsumerThreads) {
		this.runConsumerThreads = runConsumerThreads;
	}
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
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDefaultShortcode() {
		return defaultShortcode;
	}
	public void setDefaultShortcode(String defaultShortcode) {
		this.defaultShortcode = defaultShortcode;
	}
	public String getDefaultUstkShortcode() {
		return defaultUstkShortcode;
	}
	public void setDefaultUstkShortcode(String defaultUstkShortcode) {
		this.defaultUstkShortcode = defaultUstkShortcode;
	}
	public String getDefaultSleepyShortcode() {
		return defaultSleepyShortcode;
	}
	public void setDefaultSleepyShortcode(String defaultSleepyShortcode) {
		this.defaultSleepyShortcode = defaultSleepyShortcode;
	}
	public String getDefaultRamShortcode() {
		return defaultRamShortcode;
	}
	public void setDefaultRamShortcode(String defaultRamShortcode) {
		this.defaultRamShortcode = defaultRamShortcode;
	}
	public String getDefaultRfmShortcode() {
		return defaultRfmShortcode;
	}
	public void setDefaultRfmShortcode(String defaultRfmShortcode) {
		this.defaultRfmShortcode = defaultRfmShortcode;
	}
	public String getOverrideMtSleepyShortcode() {
		return overrideMtSleepyShortcode;
	}
	public void setOverrideMtSleepyShortcode(String overrideMtSleepyShortcode) {
		this.overrideMtSleepyShortcode = overrideMtSleepyShortcode;
	}
	


}
