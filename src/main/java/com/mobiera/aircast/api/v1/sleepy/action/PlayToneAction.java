package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;

/**
 
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class PlayToneAction extends Action implements Serializable {

	private static final long serialVersionUID = -7320573296391779468L;
	@Required
	private String title;
	private Dcs dcs;
	private ToneType toneType;
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public Dcs getDcs() {
		return dcs;
	}

	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}

	public ToneType getToneType() {
		return toneType;
	}

	public void setToneType(ToneType toneType) {
		this.toneType = toneType;
	}

	
	
	

}
