package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;

/**
 * Perform a SetUpCall Action.
 * <p>
 * <b>title</b>: Title to show.
 * <p>
 * <b>dcs</b>: {@link Dcs} to use for title. Null means auto-gathered. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * <b>address</b>: tpda to call.
 * <p>
 * <b>mode</b>: {@link SetUpCallMode}.
 * <p>
 * <i>Important Note:</i>Tpda format is using and abbreviated notation.
 * <p>
 * Use + for international (ton/npi 0x91), N for national (ton/npi 0xA1), or nothing for default SMSC (ton/npi 0x81).
 * <p>
 * Examples :
 * <p>
 * N12345 : will generate TP-OA field 0x05A12143F5
 * <p>
 * 12345 : will generate TP-OA field 0x05812143F5
 * <p>
 * +12345678 or 0012345678 : will generate TP-OA field 0x069121436587
 * <p>
 * If User presses Cancel, Back or OK, or a timeout occurs, normal {@link Action} action linking will occur.
 * <p> 
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class SetUpCallAction extends Action implements Serializable {

	private static final long serialVersionUID = -7320573296391779468L;
	private String title;
	@Required
	private String address;
	private SetUpCallMode mode;
	private Dcs dcs;
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public SetUpCallMode getMode() {
		return mode;
	}

	public void setMode(SetUpCallMode mode) {
		this.mode = mode;
	}

	public Dcs getDcs() {
		return dcs;
	}

	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}

	
	
	

}
