package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.BindType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class SmppBindVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 286608528040069276L;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="IP address", 
			description="IP address of SMSC")
	@Required
	private String ip;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="IP port", 
			description="Port to connect to")
	@Validator(minValue="1", maxValue="65534")
	@Required
	private Integer port;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Bind Type", 
			description="Bind Type")
	@Required
	@Validator(defaultValue="TRANSCEIVER")
	private BindType bindType;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Connexion Size", 
			description="Number of parrallel connexion that will be opened")
	@Validator(minValue="1", maxValue="20", defaultValue="1")
	@Required
	private Integer maxConnexionSize;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="System ID", 
			description="Account System ID (Login). Usually should not be larger than 8 chars")
	@Validator(minSize=1, maxSize=15)
	@Required
	private String systemId;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Password", 
			description="Account Password")
	@Validator(minValue="1", maxValue="15", defaultValue="1")
	@Required
	private String password;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="System Type", 
			description="Optional bind parameter")
	private String systemType;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public BindType getBindType() {
		return bindType;
	}

	public void setBindType(BindType bindType) {
		this.bindType = bindType;
	}

	public Integer getMaxConnexionSize() {
		return maxConnexionSize;
	}

	public void setMaxConnexionSize(Integer maxConnexionSize) {
		this.maxConnexionSize = maxConnexionSize;
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

	public String getSystemType() {
		return systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	
	
	
}
