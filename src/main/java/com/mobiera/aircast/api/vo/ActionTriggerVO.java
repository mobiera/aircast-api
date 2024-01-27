package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.ActionResult;
import com.mobiera.aircast.commons.enums.TriggeredAction;
import com.mobiera.commons.enums.EntityState;

@JsonInclude(Include.NON_NULL)
public class ActionTriggerVO implements Serializable
{
	
	private Long id;
	private Long campaignId;

	private String strData;

	private EntityState state;

	private String name;
	
	private Short sleepyLastActionId;
	
	private ActionResult sleepyActionResult;
	
	private TriggeredAction action;
	
	private String actionParam;
	
	private Long endpointId;
	
	private String statLabel;
	
	
	
}
