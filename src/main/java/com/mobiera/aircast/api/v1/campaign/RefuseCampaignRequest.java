package com.mobiera.aircast.api.v1.campaign;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class RefuseCampaignRequest implements Serializable
{
	private static final long serialVersionUID = 1151060034966633233L;
	@Required
	private Long id;
	@Validator(minSize=1, maxSize=100)
	private String comments;
	@JsonIgnore
	private UserContextVO userContext;
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public final Long getId() {
		return id;
	}
	public final void setId(Long id) {
		this.id = id;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}	
	
}
