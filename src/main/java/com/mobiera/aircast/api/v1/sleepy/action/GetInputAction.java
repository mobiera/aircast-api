package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.introspection.Required;

/**
 * Performs a GetInput STK command.
 * <p>
 * <b>title</b>: Title of the Input form
 * <p>
 * <b>defaultText</b>: Default pre-filled text to show in output form.
 * <p>
 * <b>minimumLength</b>: Minimum length of output result.
 * <p>
 * <b>maximumLength</b>: Maximum length of output result. 
 * <p>
 * <b>type</b>: {@link InputType} of the text (TEXT, PASSWORD). Note that PASSWORD is not compatible with Apple iOS.
 * <p>
 * <b>format</b>: {@link InputFormat} of the text (NUMERIC, ALPHANUMERIC).
 * <p>
 * <b>titleDcs</b>: {@link Dcs} to use for title. Null means auto-gathered. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * <b>outputDcs</b>: {@link Dcs} to use for outputVariable. Supported: DCS_8_BIT_DATA, DCS_UCS2. 
 * <p>
 * <b>outputVariable</b>: {@link Variable} to output result to. 
 * <p>
 * <b>packingRequired</b>: If outputDcs is DCS_8_BIT_DATA and packingRequired is set to true, outputVariable will be encoded to GSM7.
 * <p>
 * If User presses Cancel, Back or OK, or a timeout occurs, normal {@link Action} action linking will occur.
 * <p> 
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class GetInputAction extends Action implements Serializable {

	
	private static final long serialVersionUID = -8709062070772187472L;

	private String title;
	private List<TextData> titleData;
	private String defaultText;
	@Required
	private Byte minimumLength;
	@Required
	private Byte maximumLength;
	@Required
	private InputType type;
	@Required
	private InputFormat format;
	private Dcs titleDcs;
	private Dcs outputDcs;
	@Required
	private Variable outputVariable;
	private Boolean packingRequired;
	
	public Dcs getTitleDcs() {
		return titleDcs;
	}
	public void setTitleDcs(Dcs titleDcs) {
		this.titleDcs = titleDcs;
	}
	public Dcs getOutputDcs() {
		return outputDcs;
	}
	public void setOutputDcs(Dcs outputDcs) {
		this.outputDcs = outputDcs;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDefaultText() {
		return defaultText;
	}
	public void setDefaultText(String defaultText) {
		this.defaultText = defaultText;
	}
	public Byte getMinimumLength() {
		return minimumLength;
	}
	public void setMinimumLength(Byte minimumLength) {
		this.minimumLength = minimumLength;
	}
	public Byte getMaximumLength() {
		return maximumLength;
	}
	public void setMaximumLength(Byte maximumLength) {
		this.maximumLength = maximumLength;
	}
	public InputType getType() {
		return type;
	}
	public void setType(InputType type) {
		this.type = type;
	}
	public InputFormat getFormat() {
		return format;
	}
	public void setFormat(InputFormat format) {
		this.format = format;
	}
	
	public Variable getOutputVariable() {
		return outputVariable;
	}
	public void setOutputVariable(Variable outputVariable) {
		this.outputVariable = outputVariable;
	}
	public Boolean getPackingRequired() {
		return packingRequired;
	}
	public void setPackingRequired(Boolean packingRequired) {
		this.packingRequired = packingRequired;
	}
	public List<TextData> getTitleData() {
		return titleData;
	}
	public void setTitleData(List<TextData> titleData) {
		this.titleData = titleData;
	}

	

	

}
