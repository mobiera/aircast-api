package com.mobiera.ms.mno.aircast.api.ms;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.TpRuleVO;
import com.mobiera.aircast.commons.enums.SmppSmsIdFormat;
import com.mobiera.commons.enums.EntityState;

@JsonInclude(Include.NON_NULL)
public class SmppAccountMS implements Serializable {
	private static final long serialVersionUID = -453030923402466559L;
	private Long id;
	private String instanceId;
	private EntityState state;
	private String addressRange;
	private String bindType;
	private Integer connectTimeout;
	private Integer destNpi;
	private Integer destTon;
	private String ip;
	private String maxConnexionSize;
	private String name;
	private String password;
	private String port;
	private Integer requestExpiryTimeout;
	private Integer srcNpi;
	private Integer srcTon;
	private String systemId;
	private String systemType;
	private String defaultAlphabetCharsetName;
	private TpRuleVO defaultTpRuleVO;
	private TpRuleVO dayMonTpRuleVO;
	private TpRuleVO dayTueTpRuleVO;
	private TpRuleVO dayWedTpRuleVO;
	private TpRuleVO dayThuTpRuleVO;
	private TpRuleVO dayFriTpRuleVO;
	private TpRuleVO daySatTpRuleVO;
	private TpRuleVO daySunTpRuleVO;
	private TpRuleVO dayHolidayTpRuleVO;
	private Long minValidityPeriod;
	private Long maxValidityPeriod;
	private Long defaultValidityPeriod;
	private SmppSmsIdFormat smppSmsIdFormat;
	private Boolean supportsDlr;
	private Integer windowMonitorInterval;
	private Integer windowSize;
	private Short messagingMoConsumerThreads;
	private Short messagingMtConsumerThreads;
	private Short runConsumerThreads;
	private String sleepyIncomingShortcode;
	private String sleepyOutgoingShortcode;
	private Integer enquireLinkPeriod;
	private Integer enquireLinkTimeout;
	private Instant deletedTs;
	private String defaultShortcode;
	private String defaultUstkShortcode;
	private String defaultSleepyShortcode;
	private String overrideMtSleepyShortcode;
	private String defaultRamShortcode;
	private String defaultRfmShortcode;
	
	
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
	public String getAddressRange() {
		return addressRange;
	}
	public void setAddressRange(String addressRange) {
		this.addressRange = addressRange;
	}
	public String getBindType() {
		return bindType;
	}
	public void setBindType(String bindType) {
		this.bindType = bindType;
	}
	public Integer getConnectTimeout() {
		return connectTimeout;
	}
	public void setConnectTimeout(Integer connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	public Integer getDestNpi() {
		return destNpi;
	}
	public void setDestNpi(Integer destNpi) {
		this.destNpi = destNpi;
	}
	public Integer getDestTon() {
		return destTon;
	}
	public void setDestTon(Integer destTon) {
		this.destTon = destTon;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMaxConnexionSize() {
		return maxConnexionSize;
	}
	public void setMaxConnexionSize(String maxConnexionSize) {
		this.maxConnexionSize = maxConnexionSize;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public Integer getRequestExpiryTimeout() {
		return requestExpiryTimeout;
	}
	public void setRequestExpiryTimeout(Integer requestExpiryTimeout) {
		this.requestExpiryTimeout = requestExpiryTimeout;
	}
	public Integer getSrcNpi() {
		return srcNpi;
	}
	public void setSrcNpi(Integer srcNpi) {
		this.srcNpi = srcNpi;
	}
	public Integer getSrcTon() {
		return srcTon;
	}
	public void setSrcTon(Integer srcTon) {
		this.srcTon = srcTon;
	}
	public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getSystemType() {
		return systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	public String getDefaultAlphabetCharsetName() {
		return defaultAlphabetCharsetName;
	}
	public void setDefaultAlphabetCharsetName(String defaultAlphabetCharsetName) {
		this.defaultAlphabetCharsetName = defaultAlphabetCharsetName;
	}
	
	public Long getMinValidityPeriod() {
		return minValidityPeriod;
	}
	public void setMinValidityPeriod(Long minValidityPeriod) {
		this.minValidityPeriod = minValidityPeriod;
	}
	public Long getMaxValidityPeriod() {
		return maxValidityPeriod;
	}
	public void setMaxValidityPeriod(Long maxValidityPeriod) {
		this.maxValidityPeriod = maxValidityPeriod;
	}
	public Long getDefaultValidityPeriod() {
		return defaultValidityPeriod;
	}
	public void setDefaultValidityPeriod(Long defaultValidityPeriod) {
		this.defaultValidityPeriod = defaultValidityPeriod;
	}
	public SmppSmsIdFormat getSmppSmsIdFormat() {
		return smppSmsIdFormat;
	}
	public void setSmppSmsIdFormat(SmppSmsIdFormat smppSmsIdFormat) {
		this.smppSmsIdFormat = smppSmsIdFormat;
	}
	public Boolean getSupportsDlr() {
		return supportsDlr;
	}
	public void setSupportsDlr(Boolean supportsDlr) {
		this.supportsDlr = supportsDlr;
	}
	public Integer getWindowMonitorInterval() {
		return windowMonitorInterval;
	}
	public void setWindowMonitorInterval(Integer windowMonitorInterval) {
		this.windowMonitorInterval = windowMonitorInterval;
	}
	public Integer getWindowSize() {
		return windowSize;
	}
	public void setWindowSize(Integer windowSize) {
		this.windowSize = windowSize;
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
	public Instant getDeletedTs() {
		return deletedTs;
	}
	public void setDeletedTs(Instant deletedTs) {
		this.deletedTs = deletedTs;
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
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public TpRuleVO getDefaultTpRuleVO() {
		return defaultTpRuleVO;
	}
	public void setDefaultTpRuleVO(TpRuleVO defaultTpRuleVO) {
		this.defaultTpRuleVO = defaultTpRuleVO;
	}
	public TpRuleVO getDayMonTpRuleVO() {
		return dayMonTpRuleVO;
	}
	public void setDayMonTpRuleVO(TpRuleVO dayMonTpRuleVO) {
		this.dayMonTpRuleVO = dayMonTpRuleVO;
	}
	public TpRuleVO getDayTueTpRuleVO() {
		return dayTueTpRuleVO;
	}
	public void setDayTueTpRuleVO(TpRuleVO dayTueTpRuleVO) {
		this.dayTueTpRuleVO = dayTueTpRuleVO;
	}
	public TpRuleVO getDayWedTpRuleVO() {
		return dayWedTpRuleVO;
	}
	public void setDayWedTpRuleVO(TpRuleVO dayWedTpRuleVO) {
		this.dayWedTpRuleVO = dayWedTpRuleVO;
	}
	public TpRuleVO getDayThuTpRuleVO() {
		return dayThuTpRuleVO;
	}
	public void setDayThuTpRuleVO(TpRuleVO dayThuTpRuleVO) {
		this.dayThuTpRuleVO = dayThuTpRuleVO;
	}
	public TpRuleVO getDayFriTpRuleVO() {
		return dayFriTpRuleVO;
	}
	public void setDayFriTpRuleVO(TpRuleVO dayFriTpRuleVO) {
		this.dayFriTpRuleVO = dayFriTpRuleVO;
	}
	public TpRuleVO getDaySatTpRuleVO() {
		return daySatTpRuleVO;
	}
	public void setDaySatTpRuleVO(TpRuleVO daySatTpRuleVO) {
		this.daySatTpRuleVO = daySatTpRuleVO;
	}
	public TpRuleVO getDaySunTpRuleVO() {
		return daySunTpRuleVO;
	}
	public void setDaySunTpRuleVO(TpRuleVO daySunTpRuleVO) {
		this.daySunTpRuleVO = daySunTpRuleVO;
	}
	public TpRuleVO getDayHolidayTpRuleVO() {
		return dayHolidayTpRuleVO;
	}
	public void setDayHolidayTpRuleVO(TpRuleVO dayHolidayTpRuleVO) {
		this.dayHolidayTpRuleVO = dayHolidayTpRuleVO;
	}
	public String getOverrideMtSleepyShortcode() {
		return overrideMtSleepyShortcode;
	}
	public void setOverrideMtSleepyShortcode(String overrideMtSleepyShortcode) {
		this.overrideMtSleepyShortcode = overrideMtSleepyShortcode;
	}
	
}
