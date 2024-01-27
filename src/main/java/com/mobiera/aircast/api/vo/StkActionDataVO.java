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

@SectionEnum(name="StkActionDataSection")
@JsonInclude(Include.NON_NULL)
public class StkActionDataVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2348071851472395117L;

	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY)
	@Section(name="DATA")
	private Long id;
	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Data", 
			description="Data")
	@Required
	@Section(name="DATA")
	private String data;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="State", 
			description="State")
	@Section(name="STATE")
	private EntityState state;
	
	
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY)
	@Section(name="DATA")
	private Long actionId;
	
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_ONLY)
	@Section(name="DATA")
	private StkStatVO stats;
	
	
	private List<EntityState> allowedTransitionStates;
	
	
	
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
	public Long getActionId() {
		return actionId;
	}
	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public StkStatVO getStats() {
		return stats;
	}
	public void setStats(StkStatVO stats) {
		this.stats = stats;
	}
	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}
	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}
	
	
}











/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 
 
 Simple
 
 "flow": {
    "campaignId": 123456;
    "actions": [
 		{
 			"id": 1234,
 			"idx": 1, // internal, for ordering. First action is always entryPoint
 			"name": "First Opt-In",
 			"type": "DisplayTextVO",
 			"view": 0,
 			"cancel": 0,
 			"error": 0,
 			"back": 0,
 			"text" : [
 			{
 				"id": 1234567,
 				"state": "PENDING",
 				"text": "Do you want to get more cash?",
 				"view": 0,
 				"cancel": 0,
 				"error": 0,
 				"back": 0
 			},{
 				"id": 1234568,
 				"state": "ENABLED",
 				"text": "Do you want to get a lot more cash?",
 				"view": 0,
 				"cancel": 0,
 				"error": 0,
 				"back": 0
 			}
 			
 			
 			],
 			"okAction":"Second Opt-In",
 			"backAction":"First Opt-In"
 			
 		
 		}, {
 			//"id": 1235,
 			//"idx": 2,
 			"name": "Second Opt-In",
 			"type": "DisplayTextVO",
 			"view": 0,
 			"cancel": 0,
 			"error": 0,
 			"back": 0,
 			"text" : [
 			{
 				//"id": 12345670,
 				//"state": "PENDING",
 				"text": "Confirm",
 				"view": 0,
 				"cancel": 0,
 				"error": 0,
 				"back": 0
 			},{
 				//"id": 12345681,
 				//"state": "ENABLED",
 				"text": "Confirm?",
 				"view": 0,
 				"cancel": 0,
 				"error": 0,
 				"back": 0
 			}
 			
 			
 			],
 			"backAction":"First Opt-In"
 		
 		}
 	
 	]
 
 }
 
 
 
 More Complex
 
 "flow": {
 // stored in campaign
    "campaignId": 123456;
    "variables": { "res1", "output" },
    "outputVariable": "output",
 	
 	"actions": [
 		{
 			"id": 1234,
 			"idx": 1, // internal, for ordering and sleepy objects. First action is always entryPoint
 			"name": "First Opt-In",
 			"type": "DisplayTextVO",
 			"view": 0,
 			"cancel": 0,
 			"error": 0,
 			"back": 0,
 			"ok":0
 			"text" : [
 			{
 				"id": 1234567,
 				"state": "PENDING",
 				"text": "Do you want to get more cash?",
 				"view": 0,
 				"cancel": 0,
 				"error": 0,
 				"back": 0,
 				"ok":0
 			},{
 				"id": 1234568,
 				"state": "ENABLED",
 				"text": "Do you want to get a lot more cash?",
 				"view": 0,
 				"cancel": 0,
 				"error": 0,
 				"back": 0,
 				"ok":0
 			}
 			
 			
 			],
 			"okAction":"Second Opt-In",
 			"backAction":"First Opt-In"
 			
 		
 		}, {
 			//"id": 1235,
 			//"idx": 2,
 			"name": "Second Opt-In",
 			"type": "SelectItemVO",
 			"output": "res1",
 			"view": 0,
 			"cancel": 0,
 			"error": 0,
 			"back": 0,
 			"ok":0,
 			"title" : [
 			{
 				//"id": 12345670,
 				//"state": "PENDING",
 				"text": "Confirm",
 				"view": 0,
 				"cancel": 0,
 				"error": 0,
 				"back": 0,
 				"ok":0
 			},{
 				//"id": 12345681,
 				//"state": "ENABLED",
 				"text": "Confirm?",
 				"view": 0,
 				"cancel": 0,
 				"error": 0,
 				"back": 0,
 				"ok":0
 			}
 			
	
 			"items" : [ {
 				"id": 765432
 				"value": "1",
 				"okAction": "Send SMS",
 				"label" : "Option #1",
 			}, {
 				"id": 765432
 				"value": "2",
 				"okAction": "Send SMS"
 				"label" : "Option #2"
 			}
 			]
 			
 			],
 			"backAction":"First Opt-In"
 		
 		},
 		{
 			"name": "Send SMS",
 			"type": "MoVO",
 			"view": 0,
 			"cancel": 0,
 			"error": 0,
 			"back": 0,
 			"ok":0
 			"tpda": "00000",
 			"data": [
 				{
 					"type": "INLINE",
 					"value" "HELLO|"
 				}
 				{
 					"type": "REFERENCE",
 					"value" "res1"
 				}
 			]
 			
 		
 		}
 	
 	]
 
 }
 
 
 
 
 
 
 
 
 
 */
