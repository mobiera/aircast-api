package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.SleepyCipheringMode;
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
@SectionEnum(name="SimProfileSection")
@Label(singular="Sim Profile", plural="Sim Profiles", newEntityLabel="New Sim Profile", newEntityDescription="Create a new Sim Profile")
@Description(data="Sim Profiles are used to group SIM cards depending on which batch and profile they belong to. By properly specifying SIM Profile, you can enable or disable Aircast features for specific SIM Profiles.")

public class SimProfileVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4829352845298862370L;

	
	
	private String label;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String title;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String description;
	
	/*
	 * BASIC_INFORMATION
	 */
	
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="id", 
	description="id of Entity")
	@Section(name = "BASIC_INFORMATION")
	private Long id;
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_WRITE, 
	label="Name", 
	description="Name of SIM Profile")
	@Section(name = "BASIC_INFORMATION")
	@Required
	private String name;
	
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Failover", 
			description="Only 1 profile can be configured as the failover profile. If you select this profile as the failover profile, it will replace an already existing failover profile. Failover profile is used by SIM provisionning to assign SIMs to a default SIM Profile when it is not possible to gather the proper SIM profile.")
	@Section(name = "BASIC_INFORMATION")
	private Boolean failover;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="ICCID start range", 
			description="the lowest ICCID of this SIM profile")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=19, maxSize=20)
	private String iccidStartRange;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="ICCID end range", 
			description="the highest ICCID of this SIM profile")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=19, maxSize=20)
	private String iccidEndRange;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="IMSI start range", 
			description="the lowest IMSI of this SIM profile")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=15, maxSize=15)
	private String imsiStartRange;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="IMSI end range", 
			description="the highest IMSI of this SIM profile")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=15, maxSize=15)
	private String imsiEndRange;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="IMSI roaming start range", 
			description="the lowest roaming IMSI of this SIM profile, applies for dual IMSI sims")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=15, maxSize=15)
	private String imsiRoamingStartRange;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="IMSI roaming end range", 
			description="the highest roaming IMSI of this SIM profile, applies for dual IMSI sims")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=15, maxSize=15)
	private String imsiRoamingEndRange;
	
	
	
	/*
	 * Ustk
	 */
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Enable USTK Campaigns", 
			description="if selected, SIM Profile will allow execution of USTK Campaigns. This will work only if at least one STK Applet is linked to this SimProfile, or to a given Sim of this SimProfile")
	@Section(name = "BASIC_INFORMATION")
	private Boolean enableUstkCampaigns;

	
	/*
	 * RAM
	 */
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Enable RAM Campaigns", 
			description="if selected, SIM Profile will allow execution of Remote Application Management (RAM) according to ETSI TS 102 226")
	@Section(name = "REMOTE_APPLICATION_MANAGEMENT")
	private Boolean enableRamCampaigns;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Load Block Size", 
			description="Size of a block")
	@Validator(minValue="50", maxValue="110", defaultValue="100")
	@Section(name = "REMOTE_APPLICATION_MANAGEMENT")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableRamCampaigns", values = {"true"})
			
		})
	})
	private Integer loadBlockSize;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Max Packet Length", 
			description="Max Packet Length")
	@Validator(minValue="120", maxValue="300", defaultValue="120")
	@Section(name = "REMOTE_APPLICATION_MANAGEMENT")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableRamCampaigns", values = {"true"})
		})
	})
	private Integer maxPacketLength;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Counter Value", 
			description="default counter value")
	@Validator(minValue="0", maxValue="100000000000", defaultValue="0")
	@Section(name = "REMOTE_APPLICATION_MANAGEMENT")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableRamCampaigns", values = {"true"})
		})
	})
	private Long defaultCounter;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Seconds between blocks", 
			description="Sometimes SIM OS can be slow, use this features to increase delay between packets for best results")
	@Validator(minValue="1", maxValue="20", defaultValue="1")
	@Section(name = "REMOTE_APPLICATION_MANAGEMENT")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableRamCampaigns", values = {"true"})
		})
	})
	private Integer secondsBetweenBlocks;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="RAM Applet", 
			description="Select RAM Applet configured for this SIM Profile")
	@Section(name = "REMOTE_APPLICATION_MANAGEMENT")
	@TargetClass(type=ClassType.VO, name="AppletVO")
	@Filter(field="appletImpl", values= {"RAM"})
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableRamCampaigns", values = {"true"})
		})
	})
	private Long ramApplet;
	
	/*
	 * RFM
	 * 
	 */
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Enable RFM Campaigns", 
			description="if selected, SIM Profile will allow execution of Remote File Management (RFM)")
	@Section(name = "REMOTE_FILE_MANAGEMENT")
	private Boolean enableRfmCampaigns;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="RFM Applet", 
			description="Select RFM Applet configured for this SIM Profile")
	@Section(name = "REMOTE_FILE_MANAGEMENT")
	@TargetClass(type=ClassType.VO, name="AppletVO")
	@Filter(field="appletImpl", values= {"RFM"})
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableRfmCampaigns", values = {"true"})
		})
	})
	private Long rfmApplet;
	
	/*
	 * Sleepy
	 */
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Enable Sleepy Campaigns", 
			description="if selected, SIM Profile will allow execution of Sleepy Campaigns")
	@Section(name = "SLEEPY_CONFIGURATION")
	private Boolean enableSleepyCampaigns;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Ciphering Mode", 
			description="Select Ciphering mode for Sleepy Campaigns")
	@Section(name = "SLEEPY_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableSleepyCampaigns", values = {"true"})
		})
	})
	private SleepyCipheringMode sleepyCipheringMode;
	
	@UI( widgetType = WidgetType.HEX_TEXT, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Default Key", 
			description="If Sleepy Applet has been configured with a default static key for this SIM profile, please enter key here")
	@Section(name = "SLEEPY_CONFIGURATION")
	@Validator(minSize=16, maxSize=16)
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableSleepyCampaigns", values = {"true"})
		})
	})
	private byte[] sleepyDefaultKey;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Menu Buffer Size", 
			description="Size of Sleepy Menu Buffer, in bytes")
	@Section(name = "SLEEPY_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableSleepyCampaigns", values = {"true"})
		})
	})
	private Integer menuBufferSize;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Sim OS ICCID includes Luhn Number", 
			description="Set to true if SIM OS procides ICCID with Luhn Number, else false.")
	@Section(name = "SLEEPY_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableSleepyCampaigns", values = {"true"})
		})
	})
	private Boolean simOsIccidIncludesLuhnNumber;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Applet", 
			description="Select Sleepy Applet configured for this SIM Profile")
	@Section(name = "SLEEPY_CONFIGURATION")
	@TargetClass(type=ClassType.VO, name="AppletVO")
	@Filter(field="appletImpl", values = {"SLEEPY"})
	@DisplayWhen({
		@Conditions({
			@Condition(field="enableSleepyCampaigns", values = {"true"})
		})
	})
	private Long sleepyApplet;
	
	
	
	private List<EntityState> allowedTransitionStates;
	
	
	
	/*
	 * Other
	 */
	
	/*@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Enable Raw Campaigns", 
			description="if selected, SIM Profile will allow execution of RAW Campaigns")
	@Section(name = "TP_APPLICATION_CONFIGURATION")
	private Boolean enableRawCampaigns;*/
	
	@UI( widgetType = WidgetType.SELECT_MULTIPLE, 
			mode = Mode.READ_WRITE, 
			label="TP Applets", 
			description="Select any additionnal Applet(s) you would like to enable for this SIM Profile")
	@Section(name = "TP_APPLICATION_CONFIGURATION")
	@TargetClass(type=ClassType.VO, name="AppletVO")
	@Filter(field="appletImpl", values = {"RAM", "RFM", "SLEEPY"}, logic="EXCLUDE")
	private List<Long> tpApplets;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public EntityState getState() {
		return state;
	}
	public void setState(EntityState state) {
		this.state = state;
	}
	public Boolean getEnableRamCampaigns() {
		return enableRamCampaigns;
	}
	public void setEnableRamCampaigns(Boolean enableRamCampaigns) {
		this.enableRamCampaigns = enableRamCampaigns;
	}
	public Boolean getEnableRfmCampaigns() {
		return enableRfmCampaigns;
	}
	public void setEnableRfmCampaigns(Boolean enableRfmCampaigns) {
		this.enableRfmCampaigns = enableRfmCampaigns;
	}
	public Boolean getEnableSleepyCampaigns() {
		return enableSleepyCampaigns;
	}
	public void setEnableSleepyCampaigns(Boolean enableSleepyCampaigns) {
		this.enableSleepyCampaigns = enableSleepyCampaigns;
	}
	
	public String getIccidEndRange() {
		return iccidEndRange;
	}
	public void setIccidEndRange(String iccidEndRange) {
		this.iccidEndRange = iccidEndRange;
	}
	public String getIccidStartRange() {
		return iccidStartRange;
	}
	public void setIccidStartRange(String iccidStartRange) {
		this.iccidStartRange = iccidStartRange;
	}
	public String getImsiEndRange() {
		return imsiEndRange;
	}
	public void setImsiEndRange(String imsiEndRange) {
		this.imsiEndRange = imsiEndRange;
	}
	public String getImsiStartRange() {
		return imsiStartRange;
	}
	public void setImsiStartRange(String imsiStartRange) {
		this.imsiStartRange = imsiStartRange;
	}
	public String getImsiRoamingEndRange() {
		return imsiRoamingEndRange;
	}
	public void setImsiRoamingEndRange(String imsiRoamingEndRange) {
		this.imsiRoamingEndRange = imsiRoamingEndRange;
	}
	public String getImsiRoamingStartRange() {
		return imsiRoamingStartRange;
	}
	public void setImsiRoamingStartRange(String imsiRoamingStartRange) {
		this.imsiRoamingStartRange = imsiRoamingStartRange;
	}
	public Integer getLoadBlockSize() {
		return loadBlockSize;
	}
	public void setLoadBlockSize(Integer loadBlockSize) {
		this.loadBlockSize = loadBlockSize;
	}
	public Integer getMaxPacketLength() {
		return maxPacketLength;
	}
	public void setMaxPacketLength(Integer maxPacketLength) {
		this.maxPacketLength = maxPacketLength;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSecondsBetweenBlocks() {
		return secondsBetweenBlocks;
	}
	public void setSecondsBetweenBlocks(Integer secondsBetweenBlocks) {
		this.secondsBetweenBlocks = secondsBetweenBlocks;
	}
	public byte[] getSleepyDefaultKey() {
		return sleepyDefaultKey;
	}
	public void setSleepyDefaultKey(byte[] sleepyDefaultKey) {
		this.sleepyDefaultKey = sleepyDefaultKey;
	}
	public Long getDefaultCounter() {
		return defaultCounter;
	}
	public void setDefaultCounter(Long defaultCounter) {
		this.defaultCounter = defaultCounter;
	}
	public SleepyCipheringMode getSleepyCipheringMode() {
		return sleepyCipheringMode;
	}
	public void setSleepyCipheringMode(SleepyCipheringMode sleepyCipheringMode) {
		this.sleepyCipheringMode = sleepyCipheringMode;
	}
	public Boolean getFailover() {
		return failover;
	}
	public void setFailover(Boolean failover) {
		this.failover = failover;
	}
	public Integer getMenuBufferSize() {
		return menuBufferSize;
	}
	public void setMenuBufferSize(Integer menuBufferSize) {
		this.menuBufferSize = menuBufferSize;
	}
	public Boolean getSimOsIccidIncludesLuhnNumber() {
		return simOsIccidIncludesLuhnNumber;
	}
	public void setSimOsIccidIncludesLuhnNumber(Boolean simOsIccidIncludesLuhnNumber) {
		this.simOsIccidIncludesLuhnNumber = simOsIccidIncludesLuhnNumber;
	}
	
	
	
	public Long getRamApplet() {
		return ramApplet;
	}
	public void setRamApplet(Long ramApplet) {
		this.ramApplet = ramApplet;
	}
	public Long getRfmApplet() {
		return rfmApplet;
	}
	public void setRfmApplet(Long rfmApplet) {
		this.rfmApplet = rfmApplet;
	}
	public Long getSleepyApplet() {
		return sleepyApplet;
	}
	public void setSleepyApplet(Long sleepyApplet) {
		this.sleepyApplet = sleepyApplet;
	}
	public List<Long> getTpApplets() {
		return tpApplets;
	}
	public void setTpApplets(List<Long> tpApplets) {
		this.tpApplets = tpApplets;
	}
	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}
	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
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
	public Boolean getEnableUstkCampaigns() {
		return enableUstkCampaigns;
	}
	public void setEnableUstkCampaigns(Boolean enableUstkCampaigns) {
		this.enableUstkCampaigns = enableUstkCampaigns;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
	
	
	

	
}
