package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Condition;
import com.mobiera.commons.introspection.Conditions;
import com.mobiera.commons.introspection.DisplayWhen;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.UI;

@JsonInclude(Include.NON_NULL)
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
@Type(value = DisplayTextVO.class),
@Type(value = SelectItemVO.class),
@Type(value = GetInputVO.class),
@Type(value = UrlVO.class),
@Type(value = CallVO.class),
@Type(value = UssdVO.class),
@Type(value = MoVO.class),
@Type(value = TriggerVO.class),
@Type(value = ConcatenateVO.class),

})
public abstract class StkActionVO implements Serializable
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY)
	private Long id;
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY)
	private Long campaignId;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Name", 
			description="Name")
	@Required
	@Section(name="TITLE")
	private String name;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Ok Action", 
			description="Action to perform if Action exits with OK")
	private String okAction;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Cancel Action", 
			description="Action to perform if Action is canceled")
	private String cancelAction;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Back Action", 
			description="Action to perform if User hits Back")
	private String backAction;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Timeout Action", 
			description="Action to perform if Action times out")
	private String timeoutAction;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Ok Stat Label", 
			description="If flow exits here, select label to show in stats")
	@DisplayWhen({
		@Conditions({
			@Condition(field="sleepyFlowType", values = {"PUSH"})
		})
	})
	private String okStatLabel;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Timeout Stat Label", 
			description="If flow exits here, select label to show in stats")
	@DisplayWhen({
		@Conditions({
			@Condition(field="sleepyFlowType", values = {"PUSH"})
		})
	})
	private String timeoutStatLabel;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Cancel Stat Label", 
			description="If flow exits here, select label to show in stats")
	@DisplayWhen({
		@Conditions({
			@Condition(field="sleepyFlowType", values = {"PUSH"})
		})
	})
	private String cancelStatLabel;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Back Stat Label", 
			description="If flow exits here, select label to show in stats")
	@DisplayWhen({
		@Conditions({
			@Condition(field="sleepyFlowType", values = {"PUSH"})
		})
	})
	private String backStatLabel;
	//private String viewStatLabel;
	
		
	
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_ONLY)
	private StkStatVO stats;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public String getOkAction() {
		return okAction;
	}
	public void setOkAction(String okAction) {
		this.okAction = okAction;
	}
	public String getCancelAction() {
		return cancelAction;
	}
	public void setCancelAction(String cancelAction) {
		this.cancelAction = cancelAction;
	}
	public String getBackAction() {
		return backAction;
	}
	public void setBackAction(String backAction) {
		this.backAction = backAction;
	}
	
	public String getTimeoutAction() {
		return timeoutAction;
	}
	public void setTimeoutAction(String timeoutAction) {
		this.timeoutAction = timeoutAction;
	}
	public StkStatVO getStats() {
		return stats;
	}
	public void setStats(StkStatVO stats) {
		this.stats = stats;
	}
	public String getOkStatLabel() {
		return okStatLabel;
	}
	public void setOkStatLabel(String okStatLabel) {
		this.okStatLabel = okStatLabel;
	}
	public String getTimeoutStatLabel() {
		return timeoutStatLabel;
	}
	public void setTimeoutStatLabel(String timeoutStatLabel) {
		this.timeoutStatLabel = timeoutStatLabel;
	}
	public String getCancelStatLabel() {
		return cancelStatLabel;
	}
	public void setCancelStatLabel(String cancelStatLabel) {
		this.cancelStatLabel = cancelStatLabel;
	}
	public String getBackStatLabel() {
		return backStatLabel;
	}
	public void setBackStatLabel(String backStatLabel) {
		this.backStatLabel = backStatLabel;
	}
	/*public String getViewStatLabel() {
		return viewStatLabel;
	}
	public void setViewStatLabel(String viewStatLabel) {
		this.viewStatLabel = viewStatLabel;
	}*/
	
	
	
	
	
	
	
	
	
	
}
