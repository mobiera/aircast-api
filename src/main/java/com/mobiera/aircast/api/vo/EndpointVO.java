package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.EndpointType;
import com.mobiera.aircast.commons.enums.KineticProtocolVersion;
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
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;
import com.mobiera.mno.adapters.smpp.server.enums.SmppServerMode;

@JsonInclude(Include.NON_NULL)
@SectionEnum(name="EndpointSection")
@Label(singular="Endpoint", plural="Endpoints", newEntityLabel="New Endpoint", newEntityDescription="Create a new Endpoint")
@Description(data="Endpoints are used by Aircast to call Third Party remote APIs. Endpoints can be used for notification purposes, or to get data from a Third Party service.")
public class EndpointVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 286608528040069275L;

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
			description="Name of Endpoint")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=100)
	private String name;
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Type", description="Type of Endpoint")
	@Section(name = "BASIC_INFORMATION")
	@Required
	private EndpointType type;
	
	
	
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="Url", description="Url of Endpoint")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"NOTIFICATION", "CAMPAIGN", "DEVICE_DB", "KINETIC_SUBSCRIBE_API",
			"TP", "VIETTEL_MPS_SUBSCRIBE_API", 	"MO_CALLBACK", "API", "KINETIC"})})})
	private String url;
	
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Protocol Version", description="Kinetic Protocol Version")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"KINETIC"})})})
	private KineticProtocolVersion protocolVersion;
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE)
	@Section( name = "HEADER")
	private String title;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE)
	@Section( name = "HEADER")
	private String description;
	
	@UI( widgetType = WidgetType.TEXTAREA, mode = Mode.READ_WRITE, label="Content to send to Server", 
			description="Put here soap content. put MSISDN for msisdn, TRANSID for transId and SERVICEID for serviceId.")
	@Section( name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"VIETTEL_MPS"})
		})
	})
	private String httpContent;
	
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="Consumer Threads", description="Number of threads that will attempt to process the pending requests")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="32")
	private Short consumerThreads;
	
	private List<EntityState> allowedTransitionStates;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, label="Service Status", description="Status of the backend service")
	@Section( name = "HEADER")
	private ServiceStatus serviceStatus;
	
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Server Port", description="Server Port")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(minValue="1025", maxValue="65534")
	private Integer port;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Max Connection Size", description="Max Connection Size")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(minValue="1", maxValue="10")
	private Integer maxConnexionSize;
			
			
			
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Request Expiry Timeout", description="Request Expiry Timeout")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(minValue="5000", maxValue="60000", defaultValue="30000")
	private Long requestExpiryTimeout;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Window Monitor Interval", description="Window Monitor Interval")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(minValue="5000", maxValue="30000", defaultValue="15000")
	private Long windowMonitorInterval;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Window Size", description="Window Size")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(minValue="1", maxValue="100", defaultValue="20")
	private Integer windowSize;
	
			
			
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="User Ton", description="User Ton")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(minValue="0", maxValue="5", defaultValue="1")
	private Integer userTon;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="User Npi", description="User Npi")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(minValue="0", maxValue="5", defaultValue="0")
	private Integer userNpi;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Service Ton", description="Service Ton")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(minValue="0", maxValue="5", defaultValue="1")
	private Integer serviceTon;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Service Npi", description="Service Npi")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(minValue="0", maxValue="5", defaultValue="1")
	private Integer serviceNpi;
	
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, 
			label="Server Mode", description="Server Mode")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(defaultValue="TEXT")
	private SmppServerMode serverMode;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Default Alphabet", description="Default Alphabet")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	@Validator(defaultValue="GSM")
	private String defaultAlphabet;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="SystemID", description="SystemID")
	@Section( name = "SMPP_SERVER")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER"})
		})
	})
	@Required
	private String systemId;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Password", description="Password")
	@Section( name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER", "KINETIC"})
		})
	})
	@Required
	private String password;
	
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, 
			label="Allowed TP IPs", description="IPs allowed to call APIs related to this Endpoint")
	@Section( name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMPP_SERVER", "KINETIC"})
		})
	})
	@Required
	private String allowedTpIps;
	
	public final EndpointType getType() {
		return type;
	}
	public final void setType(EndpointType type) {
		this.type = type;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getUrl() {
		return url;
	}
	public final void setUrl(String url) {
		this.url = url;
	}
	public final EntityState getState() {
		return state;
	}
	public final void setState(EntityState state) {
		this.state = state;
	}
	public Short getConsumerThreads() {
		return consumerThreads;
	}
	public void setConsumerThreads(Short consumerThreads) {
		this.consumerThreads = consumerThreads;
	}
	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}
	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(ServiceStatus serviceStatus) {
		this.serviceStatus = serviceStatus;
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
	public String getHttpContent() {
		return httpContent;
	}
	public void setHttpContent(String httpContent) {
		this.httpContent = httpContent;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Integer getMaxConnexionSize() {
		return maxConnexionSize;
	}
	public void setMaxConnexionSize(Integer maxConnexionSize) {
		this.maxConnexionSize = maxConnexionSize;
	}
	public Long getRequestExpiryTimeout() {
		return requestExpiryTimeout;
	}
	public void setRequestExpiryTimeout(Long requestExpiryTimeout) {
		this.requestExpiryTimeout = requestExpiryTimeout;
	}
	public Long getWindowMonitorInterval() {
		return windowMonitorInterval;
	}
	public void setWindowMonitorInterval(Long windowMonitorInterval) {
		this.windowMonitorInterval = windowMonitorInterval;
	}
	public Integer getWindowSize() {
		return windowSize;
	}
	public void setWindowSize(Integer windowSize) {
		this.windowSize = windowSize;
	}
	public Integer getUserTon() {
		return userTon;
	}
	public void setUserTon(Integer userTon) {
		this.userTon = userTon;
	}
	public Integer getUserNpi() {
		return userNpi;
	}
	public void setUserNpi(Integer userNpi) {
		this.userNpi = userNpi;
	}
	public Integer getServiceTon() {
		return serviceTon;
	}
	public void setServiceTon(Integer serviceTon) {
		this.serviceTon = serviceTon;
	}
	public Integer getServiceNpi() {
		return serviceNpi;
	}
	public void setServiceNpi(Integer serviceNpi) {
		this.serviceNpi = serviceNpi;
	}
	public SmppServerMode getServerMode() {
		return serverMode;
	}
	public void setServerMode(SmppServerMode serverMode) {
		this.serverMode = serverMode;
	}
	public String getDefaultAlphabet() {
		return defaultAlphabet;
	}
	public void setDefaultAlphabet(String defaultAlphabet) {
		this.defaultAlphabet = defaultAlphabet;
	}
	
	public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public KineticProtocolVersion getProtocolVersion() {
		return protocolVersion;
	}
	public void setProtocolVersion(KineticProtocolVersion protocolVersion) {
		this.protocolVersion = protocolVersion;
	}
	public String getAllowedTpIps() {
		return allowedTpIps;
	}
	public void setAllowedTpIps(String allowedTpIps) {
		this.allowedTpIps = allowedTpIps;
	}
	
	
	
}
