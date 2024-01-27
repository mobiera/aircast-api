package com.mobiera.aircast.api.vo;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.AckType;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class RamInstallParametersVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2293738390405817686L;

	/**
	 * 
	 */
	/*private static final long serialVersionUID = 2348071851472395119L;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	private Long id;
	*/
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sim Profile", 
			description="Sim Profile")
	@TargetClass(type=ClassType.VO, name="SimProfileVO")
	@Required
	private Long simProfileFk;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Cap File URL", 
			description="Cap File URL")
	@Required
	@Validator(minSize=5, maxSize=100)
	private String capFileUrl;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Install Parameters", 
			description="Install Parameters")
	@Required
	@Validator(minSize=0, maxSize=100)
	private String installParameters;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Instance AID", 
			description="Instance AID")
	@Required
	@Validator(minSize=0, maxSize=100)
	private String instanceAid;
	
	
	@UI( widgetType = WidgetType.HEX_TEXT, 
			mode = Mode.READ_WRITE, 
			label="Ping Bytecode", 
			description="Ping Bytecode")
	@Validator(minSize=0, maxSize=140)
	private String pingBytecode;
	
	
	@UI( widgetType = WidgetType.HEX_TEXT, 
			mode = Mode.READ_WRITE, 
			label="Ping response pattern", 
			description="Ping response pattern")
	@Validator(minSize=0, maxSize=20)
	private String pingResponsePattern;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Ping shortcode", 
			description="Ping shortcode")
	@Validator(minSize=0, maxSize=8)
	private String pingShortcode;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Number of Menu Entries", 
			description="Number of Menu Entries")
	@Validator(minValue="0", maxValue="32")
	@Required
	private Integer menuEntries;
	
	@UI( widgetType = WidgetType.HEX_TEXT, 
			mode = Mode.READ_WRITE, 
			label="Menu Entry IDs And Positions", 
			description="Menu Entry IDs And Positions")
	private byte[] menuEntryIdsAndPositions;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Max byte Length for Menu Entry", 
			description="Max Text Length for Menu Entry, in bytes, depends on SIM OS config")
	@Validator(minValue="0", maxValue="50", defaultValue="20")
	private Integer maxTextLengthForMenuEntry;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Volatile Data Space Limit", 
			description="Volatile Data Space Limit")
	@Required
	@Validator(minValue="0", defaultValue="0")
	private Integer volatileDataSpaceLimit;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Non Volatile Data Space Limit", 
			description="Non Volatile Data Space Limit")
	@Required
	@Validator(minValue="0", defaultValue="0")
	private Integer nonVolatileDataSpaceLimit;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Priority Level", 
			description="Priority Level")
	@Required
	@Validator(minValue="0", defaultValue="0")
	private Integer priorityLevel;
	
	
	@UI( widgetType = WidgetType.HEX_TEXT, 
			mode = Mode.READ_WRITE, 
			label="TAR", 
			description="TAR of application")
	@Validator(minSize=3, maxSize=3)
	private byte[] tar;
	
	@UI( widgetType = WidgetType.HEX_TEXT, 
			mode = Mode.READ_WRITE, 
			label="Access Domain", 
			description="Access Domain")
	private byte[] accessDomain;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Max Number of Timers", 
			description="Max Number of Timers")
	@Validator(minValue="0", defaultValue="0")
	private Integer maxNumberOfTimers;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Minimum Security Level", 
			description="Minimum Security Level")
	@Validator(minValue="0", defaultValue="0")
	private Integer minimumSecurityLevel;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Install using UICC", 
			description="Install using UICC")
	@Required
	@Validator(defaultValue="false")
	private Boolean installUseUicc;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Ack Type", 
			description="Ack Type")
	@TargetClass(type=ClassType.ENUM, name="AckType")
	@Required
	private AckType ackType;
	
	
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_WRITE)
	private Long campaignFk;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Provided Applet On Success", 
			description="Provided Applet On Success")
	@TargetClass(type=ClassType.VO, name="AppletVO")
	private Long ramCreateAppletToSimOnSuccessFk;

	public Long getSimProfileFk() {
		return simProfileFk;
	}


	public void setSimProfileFk(Long simProfileFk) {
		this.simProfileFk = simProfileFk;
	}


	public String getCapFileUrl() {
		return capFileUrl;
	}


	public void setCapFileUrl(String capFileUrl) {
		this.capFileUrl = capFileUrl;
	}


	public String getInstallParameters() {
		return installParameters;
	}


	public void setInstallParameters(String installParameters) {
		this.installParameters = installParameters;
	}


	public String getInstanceAid() {
		return instanceAid;
	}


	public void setInstanceAid(String instanceAid) {
		this.instanceAid = instanceAid;
	}


	public String getPingBytecode() {
		return pingBytecode;
	}


	public void setPingBytecode(String pingBytecode) {
		this.pingBytecode = pingBytecode;
	}


	public String getPingResponsePattern() {
		return pingResponsePattern;
	}


	public void setPingResponsePattern(String pingResponsePattern) {
		this.pingResponsePattern = pingResponsePattern;
	}


	public String getPingShortcode() {
		return pingShortcode;
	}


	public void setPingShortcode(String pingShortcode) {
		this.pingShortcode = pingShortcode;
	}


	public Integer getMenuEntries() {
		return menuEntries;
	}


	public void setMenuEntries(Integer menuEntries) {
		this.menuEntries = menuEntries;
	}


	public byte[] getMenuEntryIdsAndPositions() {
		return menuEntryIdsAndPositions;
	}


	public void setMenuEntryIdsAndPositions(byte[] menuEntryIdsAndPositions) {
		this.menuEntryIdsAndPositions = menuEntryIdsAndPositions;
	}


	public Integer getMaxTextLengthForMenuEntry() {
		return maxTextLengthForMenuEntry;
	}


	public void setMaxTextLengthForMenuEntry(Integer maxTextLengthForMenuEntry) {
		this.maxTextLengthForMenuEntry = maxTextLengthForMenuEntry;
	}


	public Integer getVolatileDataSpaceLimit() {
		return volatileDataSpaceLimit;
	}


	public void setVolatileDataSpaceLimit(Integer volatileDataSpaceLimit) {
		this.volatileDataSpaceLimit = volatileDataSpaceLimit;
	}


	public Integer getNonVolatileDataSpaceLimit() {
		return nonVolatileDataSpaceLimit;
	}


	public void setNonVolatileDataSpaceLimit(Integer nonVolatileDataSpaceLimit) {
		this.nonVolatileDataSpaceLimit = nonVolatileDataSpaceLimit;
	}


	public Integer getPriorityLevel() {
		return priorityLevel;
	}


	public void setPriorityLevel(Integer priorityLevel) {
		this.priorityLevel = priorityLevel;
	}


	public byte[] getTar() {
		return tar;
	}


	public void setTar(byte[] tar) {
		this.tar = tar;
	}


	public byte[] getAccessDomain() {
		return accessDomain;
	}


	public void setAccessDomain(byte[] accessDomain) {
		this.accessDomain = accessDomain;
	}


	public Integer getMaxNumberOfTimers() {
		return maxNumberOfTimers;
	}


	public void setMaxNumberOfTimers(Integer maxNumberOfTimers) {
		this.maxNumberOfTimers = maxNumberOfTimers;
	}


	public Integer getMinimumSecurityLevel() {
		return minimumSecurityLevel;
	}


	public void setMinimumSecurityLevel(Integer minimumSecurityLevel) {
		this.minimumSecurityLevel = minimumSecurityLevel;
	}


	public Boolean getInstallUseUicc() {
		return installUseUicc;
	}


	public void setInstallUseUicc(Boolean installUseUicc) {
		this.installUseUicc = installUseUicc;
	}


	public AckType getAckType() {
		return ackType;
	}


	public void setAckType(AckType ackType) {
		this.ackType = ackType;
	}


	public Long getCampaignFk() {
		return campaignFk;
	}


	public void setCampaignFk(Long campaignFk) {
		this.campaignFk = campaignFk;
	}


	public Long getRamCreateAppletToSimOnSuccessFk() {
		return ramCreateAppletToSimOnSuccessFk;
	}


	public void setRamCreateAppletToSimOnSuccessFk(Long ramCreateAppletToSimOnSuccessFk) {
		this.ramCreateAppletToSimOnSuccessFk = ramCreateAppletToSimOnSuccessFk;
	}
	
	
	
}
