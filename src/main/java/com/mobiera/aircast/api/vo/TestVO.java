package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.SectionEnum;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
@SectionEnum(name="SmppAccountSection")
public class TestVO implements Serializable {

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
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Seconds between blocks", 
			description="Sometimes SIM OS can be slow, use this features to increase delay between packets for best results")
	@Validator(minValue="1", maxValue="20", defaultValue="1")
	@Section(name = "REMOTE_APPLICATION_MANAGEMENT")
	@Required
	
	private Integer secondsBetweenBlocks;
	
	
	
	@Section(name = "SMSC_BIND_CONFIGURATION")
	@Validator(minSize=1, maxSize=15)
	@Required
	private List<SmppBindVO> binds;
	
	@Section(name = "SMSC_BIND_CONFIGURATION")
	@Validator(minSize=1, maxSize=15)
	@Required
	private List bs;
	
	
	public List<SmppBindVO> getBinds() {
		return binds;
	}
	public void setBinds(List<SmppBindVO> binds) {
		this.binds = binds;
	}
	public EntityState getState() {
		return state;
	}
	public void setState(EntityState state) {
		this.state = state;
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
	public List getBs() {
		return bs;
	}
	public void setBs(List bs) {
		this.bs = bs;
	}
	public Integer getSecondsBetweenBlocks() {
		return secondsBetweenBlocks;
	}
	public void setSecondsBetweenBlocks(Integer secondsBetweenBlocks) {
		this.secondsBetweenBlocks = secondsBetweenBlocks;
	}
	


}
