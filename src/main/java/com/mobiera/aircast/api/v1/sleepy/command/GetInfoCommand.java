package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Validator;

/**
 * Represent a command that will be sent to Mobile Entity in order to get useful information.
 * <p>
 * <b>tags</b>: a list of requested information tags {@link GetInfoTag} you would like to get.
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class GetInfoCommand extends ApiSleepyCommand implements Serializable {

	private static final long serialVersionUID = 8798761836495612941L;
	@Required
	@Validator(minSize=1)
	private List<GetInfoTag> tags;
	
	public List<GetInfoTag> getTags() {
		return tags;
	}
	public void setTags(List<GetInfoTag> tags) {
		this.tags = tags;
	}
	
	
	
}
