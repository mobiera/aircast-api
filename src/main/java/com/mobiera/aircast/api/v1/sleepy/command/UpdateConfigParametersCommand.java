package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Available for <b>Sleepy Full</b> Applet only. Not supported by <b>Sleepy Lite</b>.
 * This command is used to update different sets of applet parameters, which will override applet default settings:<br/>
 * - SMS Parameters
 * - Encryption Key
 * - White List
 * - Menu entries
 * - Applet flags
 * - IMEI tracking<br/>
 * Generally, this command is not used through the API but managed by Aircast internally.
 * @author mj
 * 
 * */
/**
 * Represent an administrative set of commands to update applet settings, which will override default settings.
 * <p>
 * This command is not used through the REST API, but managed by Aircast internally.
 * <p>
 * <b>smsParams</b>: default {@link SmsParameters} for Applet response.
 * <p>
 * <b>menuEntryList</b>: {@link MenuEntryList} configuration of SIM Menu.
 * <p>
 * <b>newEncryptionKey</b>: update Encryption Key of Applet.
 * <p>
 * <b>whiteList</b>: Source TPDA Whitelist configuration {@link SenderWhiteList}.
 * <p>
 * <b>appletFlags</b>: {@link AppletFlags} Applet flag configuration.
 * <p>
 * <b>imeiTrackingParams</b>: IMEI Tracking configuration {@link ImeiTrackingParameters}.
 * <p>
 * @author mj
 */

@JsonInclude(Include.NON_NULL)
public class UpdateConfigParametersCommand extends ApiSleepyCommand implements Serializable {

	private static final long serialVersionUID = -8317344028578605982L;
	private SmsParameters smsParams;
	private MenuEntryList menuEntryList;
	
	//@JsonIgnore
	private byte[] newEncryptionKey;
	//@JsonIgnore
	private SenderWhiteList whiteList;
	//@JsonIgnore
	private AppletFlags appletFlags;
	//@JsonIgnore
	private ImeiTrackingParameters imeiTrackingParams;

	public SmsParameters getSmsParams() {
		return smsParams;
	}
	public void setSmsParams(SmsParameters smsParams) {
		this.smsParams = smsParams;
	}
	public MenuEntryList getMenuEntryList() {
		return menuEntryList;
	}
	public void setMenuEntryList(MenuEntryList menuEntryList) {
		this.menuEntryList = menuEntryList;
	}
	
	public SenderWhiteList getWhiteList() {
		return whiteList;
	}
	public void setWhiteList(SenderWhiteList whiteList) {
		this.whiteList = whiteList;
	}
	public AppletFlags getAppletFlags() {
		return appletFlags;
	}
	public void setAppletFlags(AppletFlags appletFlags) {
		this.appletFlags = appletFlags;
	}
	public ImeiTrackingParameters getImeiTrackingParams() {
		return imeiTrackingParams;
	}
	public void setImeiTrackingParams(ImeiTrackingParameters imeiTrackingParams) {
		this.imeiTrackingParams = imeiTrackingParams;
	}
	public byte[] getNewEncryptionKey() {
		return newEncryptionKey;
	}
	public void setNewEncryptionKey(byte[] newEncryptionKey) {
		this.newEncryptionKey = newEncryptionKey;
	}
	
	

}
