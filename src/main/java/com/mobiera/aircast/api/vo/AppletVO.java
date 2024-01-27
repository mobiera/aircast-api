package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.AppletImpl;
import com.mobiera.aircast.commons.enums.CipheringAlgorithm;
import com.mobiera.aircast.commons.enums.SignatureAlgorithm;
import com.mobiera.aircast.commons.enums.SleepyKeyingMode;
import com.mobiera.aircast.commons.enums.SleepyMenuImpl;
import com.mobiera.aircast.commons.enums.SleepyProtocolVersion;
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
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;
import com.mobiera.lib.etsi102225.api.model.AlgorithmImplementation;
import com.mobiera.lib.etsi102225.api.model.CertificationAlgorithmMode;
import com.mobiera.lib.etsi102225.api.model.CertificationMode;
import com.mobiera.lib.etsi102225.api.model.CipheringAlgorithmMode;
import com.mobiera.lib.etsi102225.api.model.PoRProtocol;
import com.mobiera.lib.etsi102225.api.model.SecurityBytesType;
import com.mobiera.lib.etsi102225.api.model.SynchroCounterMode;

@JsonInclude(Include.NON_NULL)
@SectionEnum(name="AppletSection")
@Label(singular="Applet", plural="Applets", newEntityLabel="New Applet", newEntityDescription="Create a new Applet")
@Description(data="Applets describe software installed on SIMs. Depending on which Applet a SIM has installed, some Aircast features will be available or not for SIMs linked to a given Sim Profile.")
public class AppletVO implements Serializable {

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
	
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Use GSM 3.48", 
			description="Use GSM 3.48")
	@Section( name = "OTA_CONFIGURATION")
	
	private Boolean gsm348;
	//private Short esmClass; // gathered
	
	
	@UI( widgetType = WidgetType.HEX_TEXT, 
			mode = Mode.READ_WRITE, 
			label="TAR", 
			description="TAR of Application")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator(minSize=3, maxSize=3)
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private byte[] tar;
	
	
	// 3.40, automatic
	//private Short protocolId;
	//private Short dcs;
	
			//KIC
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="KIC Algorithm Implementation", 
			description="KIC Algorithm Implementation")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator( defaultValue="ALGORITHM_KNOWN_BY_BOTH_ENTITIES")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private AlgorithmImplementation kicAlgorithmImplementation;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="KIC Algorithm Mode", 
			description="KIC Algorithm Mode")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator( defaultValue="DES_CBC")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private CipheringAlgorithmMode kicCipheringAlgorithmMode;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="KIC Keyset ID", 
			description="KIC Keyset ID")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator(minValue="0", maxValue="15", defaultValue="0")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private Integer kicKeySetId;
	
			//KID
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="KID Algorithm Implementation", 
			description="KID Algorithm Implementation")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator( defaultValue="ALGORITHM_KNOWN_BY_BOTH_ENTITIES")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private AlgorithmImplementation kidAlgorithmImplementation;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="KID Algorithm Mode", 
			description="KID Algorithm Mode")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator( defaultValue="DES_CBC")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private CertificationAlgorithmMode kidCipheringAlgorithmMode;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="KID Keyset ID", 
			description="KID Keyset ID")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator(minValue="0", maxValue="15", defaultValue="0")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private Short kidKeySetId;
	
			//SPI
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="SPI Ciphered", 
			description="SPI Ciphered")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private Boolean spiCiphered;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="SPI Certification Mode", 
			description="SPI Certification Mode")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator(defaultValue="NO_SECURITY")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private CertificationMode spiCertificationMode;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="SPI Synchro Counter Mode", 
			description="SPI Synchro Counter Mode")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator(defaultValue="NO_COUNTER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private SynchroCounterMode spiSynchroCounterMode;
	
	/*
	 * RSPI
	 * ResponseSPI rspi = new ResponseSPI();
		rspi.setCiphered(false);
		rspi.setPoRCertificateMode(CertificationMode.NO_SECURITY);
		rspi.setPoRMode(PoRMode.REPLY_ALWAYS);
		rspi.setPoRProtocol(PoRProtocol.SMS_SUBMIT);

	 */
			//RSPI
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Response SPI Ciphered", 
			description="Response SPI Ciphered")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private Boolean responseSpiCiphered;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Response SPI PoR Certification Mode", 
			description="Response SPI PoR Certification Mode")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator( defaultValue="NO_SECURITY")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private CertificationMode responseSpiPorCertificateMode;
	// PoR mode handled by core
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Response SPI PoR Protocol", 
			description="Response SPI PoR Protocol")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator( defaultValue="SMS_DELIVER_REPORT")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private PoRProtocol responseSpiPorProtocol;
	
	
	/*
	 * others
	 * profile.setSignatureAlgorithm(SignatureManager.CRC32);
		profile.setSPI(spi);
		profile.setSecurityBytesType(SecurityBytesType.WITH_LENGHTS_AND_UDHL);
	 */
			//OTHERS
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Signature Algorithm", 
			description="Signature Algorithm")
	@Section( name = "OTA_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private SignatureAlgorithm signatureAlgorithm;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Security Bytes Type", 
			description="Security Bytes Type")
	@Section( name = "OTA_CONFIGURATION")
	@Required
	@Validator(defaultValue="NORMAL")
	@DisplayWhen({
		@Conditions({
			@Condition(field="gsm348", values = {"true"})
		})
	})
	private SecurityBytesType securityBytesType;
	
	

	/*
	 * APPLET Specific
	 */
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Applet Implementation", 
			description="Applet Implementation")
	@Section( name = "APPLET_CONFIGURATION")
	@Required
	private AppletImpl appletImpl;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Version", 
			description="Version")
	@Section( name = "APPLET_CONFIGURATION")
	private Integer version;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Pico Supports UCS2", 
			description="Pico Supports UCS2")
	@Section( name = "APPLET_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"PICO", "PICO_SEMPERVIRENT"})
		})
	})
	private Boolean picoSupportsUCS2;
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Pico Buggy UCS2 for Sendsms", 
			description="Pico Buggy UCS2 for Sendsms")
	@Section( name = "APPLET_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"PICO", "PICO_SEMPERVIRENT"})
		})
	})
	private Boolean picoBuggyUCS2forSendSms;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Protocol Version", 
			description="Sleepy Protocol Version")
	@Section( name = "APPLET_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private SleepyProtocolVersion sleepyProtocolVersion;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Keying Mode", 
			description="Sleepy Keying Mode")
	@Section( name = "APPLET_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private SleepyKeyingMode sleepyKeyingMode;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Ciphering Algorithm", 
			description="Sleepy Ciphering Algorithm")
	@Section( name = "APPLET_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private CipheringAlgorithm sleepyCipheringAlgorithm;
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Menu Implementation", 
			description="Sleepy Menu Implementation")
	@Section( name = "APPLET_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private SleepyMenuImpl sleepyMenuImpl;
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Sleepy White List", 
			description="Sleepy White List")
	@Section( name = "APPLET_CONFIGURATION")
	@Required
	@Validator(defaultValue="true")
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private Boolean sleepyWhiteList;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Compare", 
			description="Sleepy Compare")
	@Section( name = "APPLET_CONFIGURATION")
	@Validator(defaultValue="true")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private Boolean sleepyCompare;
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Sleepy IMEI Tracking", 
			description="Sleepy IMEI Tracking")
	@Section( name = "APPLET_CONFIGURATION")
	@Required
	@Validator(defaultValue="true")
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private Boolean sleepyImeiTracking;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Remote Config Management", 
			description="Sleepy Remote Config Management")
	@Section( name = "APPLET_CONFIGURATION")
	@Required
	@Validator(defaultValue="false")
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private Boolean sleepyUpdateConfig;
	@UI( widgetType = WidgetType.HEX_TEXT, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Key", 
			description="Sleepy Key")
	@Section( name = "APPLET_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private byte[] sleepyKey;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Cipher Discovery", 
			description="Sleepy Cipher Discovery")
	@Section( name = "APPLET_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private Boolean sleepyCipherDiscovery;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Command Encryption", 
			description="Sleepy Command Encryption")
	@Section( name = "APPLET_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private Boolean sleepyCommandEncryption;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Response Encryption", 
			description="Sleepy Response Encryption")
	@Section( name = "APPLET_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="appletImpl", values = {"SLEEPY"})
		})
	})
	private Boolean sleepyResponseEncryption;
	
	
	
	
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
	public Boolean getGsm348() {
		return gsm348;
	}
	public void setGsm348(Boolean gsm348) {
		this.gsm348 = gsm348;
	}
	public byte[] getTar() {
		return tar;
	}
	public void setTar(byte[] tar) {
		this.tar = tar;
	}
	public AlgorithmImplementation getKicAlgorithmImplementation() {
		return kicAlgorithmImplementation;
	}
	public void setKicAlgorithmImplementation(AlgorithmImplementation kicAlgorithmImplementation) {
		this.kicAlgorithmImplementation = kicAlgorithmImplementation;
	}
	public CipheringAlgorithmMode getKicCipheringAlgorithmMode() {
		return kicCipheringAlgorithmMode;
	}
	public void setKicCipheringAlgorithmMode(CipheringAlgorithmMode kicCipheringAlgorithmMode) {
		this.kicCipheringAlgorithmMode = kicCipheringAlgorithmMode;
	}
	public Integer getKicKeySetId() {
		return kicKeySetId;
	}
	public void setKicKeySetId(Integer kicKeySetId) {
		this.kicKeySetId = kicKeySetId;
	}
	public AlgorithmImplementation getKidAlgorithmImplementation() {
		return kidAlgorithmImplementation;
	}
	public void setKidAlgorithmImplementation(AlgorithmImplementation kidAlgorithmImplementation) {
		this.kidAlgorithmImplementation = kidAlgorithmImplementation;
	}
	public CertificationAlgorithmMode getKidCipheringAlgorithmMode() {
		return kidCipheringAlgorithmMode;
	}
	public void setKidCipheringAlgorithmMode(CertificationAlgorithmMode kidCipheringAlgorithmMode) {
		this.kidCipheringAlgorithmMode = kidCipheringAlgorithmMode;
	}
	public Short getKidKeySetId() {
		return kidKeySetId;
	}
	public void setKidKeySetId(Short kidKeySetId) {
		this.kidKeySetId = kidKeySetId;
	}
	public Boolean getSpiCiphered() {
		return spiCiphered;
	}
	public void setSpiCiphered(Boolean spiCiphered) {
		this.spiCiphered = spiCiphered;
	}
	public CertificationMode getSpiCertificationMode() {
		return spiCertificationMode;
	}
	public void setSpiCertificationMode(CertificationMode spiCertificationMode) {
		this.spiCertificationMode = spiCertificationMode;
	}
	public SynchroCounterMode getSpiSynchroCounterMode() {
		return spiSynchroCounterMode;
	}
	public void setSpiSynchroCounterMode(SynchroCounterMode spiSynchroCounterMode) {
		this.spiSynchroCounterMode = spiSynchroCounterMode;
	}
	public Boolean getResponseSpiCiphered() {
		return responseSpiCiphered;
	}
	public void setResponseSpiCiphered(Boolean responseSpiCiphered) {
		this.responseSpiCiphered = responseSpiCiphered;
	}
	public CertificationMode getResponseSpiPorCertificateMode() {
		return responseSpiPorCertificateMode;
	}
	public void setResponseSpiPorCertificateMode(CertificationMode responseSpiPorCertificateMode) {
		this.responseSpiPorCertificateMode = responseSpiPorCertificateMode;
	}
	public PoRProtocol getResponseSpiPorProtocol() {
		return responseSpiPorProtocol;
	}
	public void setResponseSpiPorProtocol(PoRProtocol responseSpiPorProtocol) {
		this.responseSpiPorProtocol = responseSpiPorProtocol;
	}
	public SignatureAlgorithm getSignatureAlgorithm() {
		return signatureAlgorithm;
	}
	public void setSignatureAlgorithm(SignatureAlgorithm signatureAlgorithm) {
		this.signatureAlgorithm = signatureAlgorithm;
	}
	public SecurityBytesType getSecurityBytesType() {
		return securityBytesType;
	}
	public void setSecurityBytesType(SecurityBytesType securityBytesType) {
		this.securityBytesType = securityBytesType;
	}
	public AppletImpl getAppletImpl() {
		return appletImpl;
	}
	public void setAppletImpl(AppletImpl appletImpl) {
		this.appletImpl = appletImpl;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Boolean getPicoSupportsUCS2() {
		return picoSupportsUCS2;
	}
	public void setPicoSupportsUCS2(Boolean picoSupportsUCS2) {
		this.picoSupportsUCS2 = picoSupportsUCS2;
	}
	public Boolean getPicoBuggyUCS2forSendSms() {
		return picoBuggyUCS2forSendSms;
	}
	public void setPicoBuggyUCS2forSendSms(Boolean picoBuggyUCS2forSendSms) {
		this.picoBuggyUCS2forSendSms = picoBuggyUCS2forSendSms;
	}
	public SleepyProtocolVersion getSleepyProtocolVersion() {
		return sleepyProtocolVersion;
	}
	public void setSleepyProtocolVersion(SleepyProtocolVersion sleepyProtocolVersion) {
		this.sleepyProtocolVersion = sleepyProtocolVersion;
	}
	public SleepyKeyingMode getSleepyKeyingMode() {
		return sleepyKeyingMode;
	}
	public void setSleepyKeyingMode(SleepyKeyingMode sleepyKeyingMode) {
		this.sleepyKeyingMode = sleepyKeyingMode;
	}
	public CipheringAlgorithm getSleepyCipheringAlgorithm() {
		return sleepyCipheringAlgorithm;
	}
	public void setSleepyCipheringAlgorithm(CipheringAlgorithm sleepyCipheringAlgorithm) {
		this.sleepyCipheringAlgorithm = sleepyCipheringAlgorithm;
	}
	public SleepyMenuImpl getSleepyMenuImpl() {
		return sleepyMenuImpl;
	}
	public void setSleepyMenuImpl(SleepyMenuImpl sleepyMenuImpl) {
		this.sleepyMenuImpl = sleepyMenuImpl;
	}
	public Boolean getSleepyWhiteList() {
		return sleepyWhiteList;
	}
	public void setSleepyWhiteList(Boolean sleepyWhiteList) {
		this.sleepyWhiteList = sleepyWhiteList;
	}
	public Boolean getSleepyCompare() {
		return sleepyCompare;
	}
	public void setSleepyCompare(Boolean sleepyCompare) {
		this.sleepyCompare = sleepyCompare;
	}
	public Boolean getSleepyImeiTracking() {
		return sleepyImeiTracking;
	}
	public void setSleepyImeiTracking(Boolean sleepyImeiTracking) {
		this.sleepyImeiTracking = sleepyImeiTracking;
	}
	public Boolean getSleepyUpdateConfig() {
		return sleepyUpdateConfig;
	}
	public void setSleepyUpdateConfig(Boolean sleepyUpdateConfig) {
		this.sleepyUpdateConfig = sleepyUpdateConfig;
	}
	public byte[] getSleepyKey() {
		return sleepyKey;
	}
	public void setSleepyKey(byte[] sleepyKey) {
		this.sleepyKey = sleepyKey;
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
	public Boolean getSleepyCipherDiscovery() {
		return sleepyCipherDiscovery;
	}
	public void setSleepyCipherDiscovery(Boolean sleepyCipherDiscovery) {
		this.sleepyCipherDiscovery = sleepyCipherDiscovery;
	}
	public Boolean getSleepyCommandEncryption() {
		return sleepyCommandEncryption;
	}
	public void setSleepyCommandEncryption(Boolean sleepyCommandEncryption) {
		this.sleepyCommandEncryption = sleepyCommandEncryption;
	}
	public Boolean getSleepyResponseEncryption() {
		return sleepyResponseEncryption;
	}
	public void setSleepyResponseEncryption(Boolean sleepyResponseEncryption) {
		this.sleepyResponseEncryption = sleepyResponseEncryption;
	} 
	
	
	
}
