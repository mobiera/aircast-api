package com.mobiera.aircast.api.v1.tp_rule;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.EntityState;

@JsonInclude(Include.NON_NULL)
public class DeleteTpRuleRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966637233L;
	private Long id;
	private EntityState state;
	public final Long getId() {
		return id;
	}
	public final void setId(Long id) {
		this.id = id;
	}
	public final EntityState getState() {
		return state;
	}
	public final void setState(EntityState state) {
		this.state = state;
	}

	
	
}
