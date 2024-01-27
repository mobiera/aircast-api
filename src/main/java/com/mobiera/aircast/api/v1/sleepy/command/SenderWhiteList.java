package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Used by updateConfigParams command to configure, enable/disable Applet whitelist.
 * <p>
 * When enabled, Applet will only receive command from the specified tpdas (entries).
 * <p>
 * <i>Important Note:</i>Tpda format is using and abbreviated notation.
 * <p>
 * Use + for international (ton/npi 0x91), N for national (ton/npi 0xA1), or nothing for default SMSC (ton/npi 0x81), or any String for alphanumeric shortcodes.
 * <p>
 * Examples :
 * <p>
 * N12345 : will generate TP-OA field 0x05A12143F5
 * <p>
 * 12345 : will generate TP-OA field 0x05812143F5
 * <p>
 * +12345678 or 0012345678 : will generate TP-OA field 0x069121436587
 * <p>
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class SenderWhiteList implements Serializable {

	private static final long serialVersionUID = -2274403789745681303L;
	private Boolean enabled = true;
	private List<String> entries = 
			new ArrayList<String>();

	public Boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public List<String> getEntries() {
		return entries;
	}
	public void setEntries(List<String> entries) {
		this.entries = entries;
	}
	
}
