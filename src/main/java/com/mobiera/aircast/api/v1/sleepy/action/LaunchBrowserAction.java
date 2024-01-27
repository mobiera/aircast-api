package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;

/**
 * Perform a LaunchBrowser Action (opens an URL). Works on very few ME.
 * <p>
 * <b>title</b>: Title to show.
 * <p>
 * <b>dcs</b>: {@link Dcs} to use for title. Null means auto-gathered. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * <b>url</b>: Url to Open.
 * <p>
 * <b>launchBrowserMode</b>: {@link LaunchBrowserMode} to use.
 * <p>
 * If User presses Cancel, Back or OK, or a timeout occurs, normal {@link Action} action linking will occur.
 * <p> 
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class LaunchBrowserAction extends Action implements Serializable {

	private static final long serialVersionUID = -2985812366023309241L;
	
	
	@Required
	private String title;
	@Required
	private String url;
	public Dcs getDcs() {
		return dcs;
	}
	private Dcs dcs;
	private LaunchBrowserMode launchBrowserMode;
	
	public LaunchBrowserMode getLaunchBrowserMode() {
		return launchBrowserMode;
	}
	public void setLaunchBrowserMode(LaunchBrowserMode launchBrowserMode) {
		this.launchBrowserMode = launchBrowserMode;
	}
	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
