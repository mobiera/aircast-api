package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Filter;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

/**
 * One candidate OTA security configuration of a RAM SECURITY_PROBE campaign: a RAM applet
 * (key set indexes, algorithms, SPI, TAR) tried on the card in the order of the rows. The
 * first candidate the card accepts becomes the RAM applet of the sim. Only ENABLED RAM
 * applets are candidates.
 */
@JsonInclude(Include.NON_NULL)
public class RamSecurityProbeParametersVO implements Serializable {

	private static final long serialVersionUID = 7021488453180237711L;

	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Candidate RAM Applet", 
			description="RAM applet whose OTA security configuration (key set, algorithms, SPI, TAR) is tried on the card. Must be ENABLED. The key values are the ones of each sim")
	@TargetClass(type=ClassType.VO, name="AppletVO")
	@Filter(field="impl", values = { "RAM" })
	@Required
	private Long ramAppletFk;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Position", 
			description="Order in which the candidates are tried, 1 first")
	@Validator(minValue="1", maxValue="99")
	@Required
	private Integer position;

	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_WRITE)
	private Long campaignFk;

	public Long getRamAppletFk() {
		return ramAppletFk;
	}

	public void setRamAppletFk(Long ramAppletFk) {
		this.ramAppletFk = ramAppletFk;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Long getCampaignFk() {
		return campaignFk;
	}

	public void setCampaignFk(Long campaignFk) {
		this.campaignFk = campaignFk;
	}
}
