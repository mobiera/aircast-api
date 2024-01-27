package com.mobiera.aircast.api.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.TriggeredAction;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Condition;
import com.mobiera.commons.introspection.Conditions;
import com.mobiera.commons.introspection.DisplayWhen;
import com.mobiera.commons.introspection.Filter;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;

@JsonInclude(Include.NON_NULL)
public class TriggerVO extends StkActionVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Triggered Action", 
			description="Action to trigger")
	private TriggeredAction triggeredAction;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Endpoint", 
			description="Endpoint to Call")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="triggeredAction", values = {"ENDPOINT_CALL"})
			
		})
	})
	@TargetClass(type=ClassType.VO, name="EndpointVO")
	@Filter(field="type", values= {"KINETIC", "VIETTEL_MPS", "TP", "MO_CALLBACK"})
	private Long endpointId;
	

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Endpoint Params", 
			description="Endpoint Paramameters. Depends on Endpoint type.")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="triggeredAction", values = {"ENDPOINT_CALL"})
			
		})
	})
	private String endpointParams;
	
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Target Campaign To Run", 
			description="Campaign to run")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="triggeredAction", values = {"RUN_CAMPAIGN"})
			
		})
	})
	@TargetClass(type=ClassType.VO, name="CampaignVO")
	@Filter(field="management", values= {"SCHEDULED", "TRIGGERED"})
	private Long targetCampaignId;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Run Target Campaign after N days", 
			description="Run Target Campaign after N days")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="triggeredAction", values = {"RUN_CAMPAIGN"})
			
		})
	})
	private Integer runCampaignAfterNDays;
	
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Purchase Attempt", 
			description="If set to true and okAction is set to null, this action will be considered a Purchase Attempt.")
	private Boolean pa;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Log Msisdn", 
			description="If set to true and okAction is set to null, this action will save action for the corresponding msisdn in table action_log")
	private Boolean logMsisdn;
	
	
	
	
	
	
	
	public TriggeredAction getTriggeredAction() {
		return triggeredAction;
	}
	public void setTriggeredAction(TriggeredAction triggeredAction) {
		this.triggeredAction = triggeredAction;
	}
	public Long getEndpointId() {
		return endpointId;
	}
	public void setEndpointId(Long endpointId) {
		this.endpointId = endpointId;
	}
	public String getEndpointParams() {
		return endpointParams;
	}
	public void setEndpointParams(String endpointParams) {
		this.endpointParams = endpointParams;
	}
	
	public Boolean getPa() {
		return pa;
	}
	public void setPa(Boolean pa) {
		this.pa = pa;
	}
	public Boolean getLogMsisdn() {
		return logMsisdn;
	}
	public void setLogMsisdn(Boolean logMsisdn) {
		this.logMsisdn = logMsisdn;
	}
	
	public Integer getRunCampaignAfterNDays() {
		return runCampaignAfterNDays;
	}
	public void setRunCampaignAfterNDays(Integer runCampaignAfterNDays) {
		this.runCampaignAfterNDays = runCampaignAfterNDays;
	}
	public Long getTargetCampaignId() {
		return targetCampaignId;
	}
	public void setTargetCampaignId(Long targetCampaignId) {
		this.targetCampaignId = targetCampaignId;
	}
	
	
	
	
	

	


	
}
