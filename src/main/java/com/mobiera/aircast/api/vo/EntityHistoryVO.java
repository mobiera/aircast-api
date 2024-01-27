package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.commons.enums.EntityType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class EntityHistoryVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 286608528040069275L;

	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	private Long id;
	
	private EntityType type;
	
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant createdTs;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant modifiedTs;
	private Long creator;
	private Long modifier;
	private String creatorEmail;
	private String modifierEmail;
	
	private List<EntityHistoryActionVO> actions;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Instant getCreatedTs() {
		return createdTs;
	}
	public void setCreatedTs(Instant createdTs) {
		this.createdTs = createdTs;
	}
	
	
	public List<EntityHistoryActionVO> getActions() {
		return actions;
	}
	public void setActions(List<EntityHistoryActionVO> actions) {
		this.actions = actions;
	}
	public Instant getModifiedTs() {
		return modifiedTs;
	}
	public void setModifiedTs(Instant modifiedTs) {
		this.modifiedTs = modifiedTs;
	}
	public Long getCreator() {
		return creator;
	}
	public void setCreator(Long creator) {
		this.creator = creator;
	}
	public Long getModifier() {
		return modifier;
	}
	public void setModifier(Long modifier) {
		this.modifier = modifier;
	}
	public String getCreatorEmail() {
		return creatorEmail;
	}
	public void setCreatorEmail(String creatorEmail) {
		this.creatorEmail = creatorEmail;
	}
	public String getModifierEmail() {
		return modifierEmail;
	}
	public void setModifierEmail(String modifierEmail) {
		this.modifierEmail = modifierEmail;
	}
	public EntityType getType() {
		return type;
	}
	public void setType(EntityType type) {
		this.type = type;
	}
	
	
	

}
