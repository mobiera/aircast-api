package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.TpRange;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.SectionEnum;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
@SectionEnum(name="TpRuleSection")
@Label(singular="Tp Rule", plural="Tp Rules", newEntityLabel="New Tp Rule", newEntityDescription="Create a new Tp Rule")
@Description(data="Tp Rule define Smpp Account transaction-per-second rules. In order to create a Smpp Account, at least one Tp Rule must exist.")
public class TpRuleVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 286608528040069275L;

	private String label;
	
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	private List<EntityState> allowedTransitionStates;

	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String title;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String description;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	@Section(name = "BASIC_INFORMATION")
	Long id;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Name", 
			description="Name of Tp Rule")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=100)
	private String name;
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Range", description="Range of the rule")
	@Section(name = "BASIC_INFORMATION")
	@Validator(allowedValues = {"SECOND"}, defaultValue="SECOND")
	@Required
	private TpRange range;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t00", description="Maximum number of allowed transactions per range of time for hour 00 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t00;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t01", description="Maximum number of allowed transactions per range of time for hour 01 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t01;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t02", description="Maximum number of allowed transactions per range of time for hour 02 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t02;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t03", description="Maximum number of allowed transactions per range of time for hour 03 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t03;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t04", description="Maximum number of allowed transactions per range of time for hour 04 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t04;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t05", description="Maximum number of allowed transactions per range of time for hour 05 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t05;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t06", description="Maximum number of allowed transactions per range of time for hour 06 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t06;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t07", description="Maximum number of allowed transactions per range of time for hour 07 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t07;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t08", description="Maximum number of allowed transactions per range of time for hour 08 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t08;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t09", description="Maximum number of allowed transactions per range of time for hour 09 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t09;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t10", description="Maximum number of allowed transactions per range of time for hour 10 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t10;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t11", description="Maximum number of allowed transactions per range of time for hour 11 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t11;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t12", description="Maximum number of allowed transactions per range of time for hour 12 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t12;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t13", description="Maximum number of allowed transactions per range of time for hour 13 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t13;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t14", description="Maximum number of allowed transactions per range of time for hour 14 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t14;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t15", description="Maximum number of allowed transactions per range of time for hour 15 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t15;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t16", description="Maximum number of allowed transactions per range of time for hour 16 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t16;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t17", description="Maximum number of allowed transactions per range of time for hour 17 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t17;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t18", description="Maximum number of allowed transactions per range of time for hour 18 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t18;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t19", description="Maximum number of allowed transactions per range of time for hour 19 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t19;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t20", description="Maximum number of allowed transactions per range of time for hour 20 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t20;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t21", description="Maximum number of allowed transactions per range of time for hour 21 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t21;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t22", description="Maximum number of allowed transactions per range of time for hour 22 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t22;
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="t23", description="Maximum number of allowed transactions per range of time for hour 23 of day")
	@Section( name = "BASIC_INFORMATION")
	@Required
	@Validator(minValue="1", maxValue="1000", defaultValue="1")
	private Integer t23;
	
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final TpRange getRange() {
		return range;
	}
	public final void setRange(TpRange range) {
		this.range = range;
	}
	public final Integer getT00() {
		return t00;
	}
	public final void setT00(Integer t00) {
		this.t00 = t00;
	}
	public final Integer getT01() {
		return t01;
	}
	public final void setT01(Integer t01) {
		this.t01 = t01;
	}
	public final Integer getT02() {
		return t02;
	}
	public final void setT02(Integer t02) {
		this.t02 = t02;
	}
	public final Integer getT03() {
		return t03;
	}
	public final void setT03(Integer t03) {
		this.t03 = t03;
	}
	public final Integer getT04() {
		return t04;
	}
	public final void setT04(Integer t04) {
		this.t04 = t04;
	}
	public final Integer getT05() {
		return t05;
	}
	public final void setT05(Integer t05) {
		this.t05 = t05;
	}
	public final Integer getT06() {
		return t06;
	}
	public final void setT06(Integer t06) {
		this.t06 = t06;
	}
	public final Integer getT07() {
		return t07;
	}
	public final void setT07(Integer t07) {
		this.t07 = t07;
	}
	public final Integer getT08() {
		return t08;
	}
	public final void setT08(Integer t08) {
		this.t08 = t08;
	}
	public final Integer getT09() {
		return t09;
	}
	public final void setT09(Integer t09) {
		this.t09 = t09;
	}
	public final Integer getT10() {
		return t10;
	}
	public final void setT10(Integer t10) {
		this.t10 = t10;
	}
	public final Integer getT11() {
		return t11;
	}
	public final void setT11(Integer t11) {
		this.t11 = t11;
	}
	public final Integer getT12() {
		return t12;
	}
	public final void setT12(Integer t12) {
		this.t12 = t12;
	}
	public final Integer getT13() {
		return t13;
	}
	public final void setT13(Integer t13) {
		this.t13 = t13;
	}
	public final Integer getT14() {
		return t14;
	}
	public final void setT14(Integer t14) {
		this.t14 = t14;
	}
	public final Integer getT15() {
		return t15;
	}
	public final void setT15(Integer t15) {
		this.t15 = t15;
	}
	public final Integer getT16() {
		return t16;
	}
	public final void setT16(Integer t16) {
		this.t16 = t16;
	}
	public final Integer getT17() {
		return t17;
	}
	public final void setT17(Integer t17) {
		this.t17 = t17;
	}
	public final Integer getT18() {
		return t18;
	}
	public final void setT18(Integer t18) {
		this.t18 = t18;
	}
	public final Integer getT19() {
		return t19;
	}
	public final void setT19(Integer t19) {
		this.t19 = t19;
	}
	public final Integer getT20() {
		return t20;
	}
	public final void setT20(Integer t20) {
		this.t20 = t20;
	}
	public final Integer getT21() {
		return t21;
	}
	public final void setT21(Integer t21) {
		this.t21 = t21;
	}
	public final Integer getT22() {
		return t22;
	}
	public final void setT22(Integer t22) {
		this.t22 = t22;
	}
	public final Integer getT23() {
		return t23;
	}
	public final void setT23(Integer t23) {
		this.t23 = t23;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EntityState getState() {
		return state;
	}
	public void setState(EntityState state) {
		this.state = state;
	}
	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}
	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	

}
