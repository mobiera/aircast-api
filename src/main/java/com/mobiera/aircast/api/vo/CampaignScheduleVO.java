package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.commons.enums.CampaignPriority;
import com.mobiera.aircast.commons.enums.CampaignType;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Knowledge;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Condition;
import com.mobiera.commons.introspection.Conditions;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.DisplayWhen;
import com.mobiera.commons.introspection.Expertise;
import com.mobiera.commons.introspection.Filter;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.SectionEnum;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
@Label(singular="Schedule", plural="Schedules", newEntityLabel="New Schedule", newEntityDescription="Create a new Schedule")
@Description(data="Schedule are used to program campaign execution in a Calendar")
@SectionEnum(name="CampaignScheduleSection")
public class CampaignScheduleVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String description;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String label;
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	private List<EntityState> allowedTransitionStates;
	
	private String campaignName;
	private CampaignType campaignType;
	
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	@Section( name = "BASIC_INFORMATION")
	private Long id;

	@UI( widgetType = WidgetType.CHECKBOX, 
		mode = Mode.READ_WRITE, 
		label="Simple Schedule", 
		description="Simple Schedule")
	@Section(name = "BASIC_INFORMATION")
	@Validator(defaultValue="FALSE")
	@Required
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Boolean simpleSchedule;

	@TargetClass(type=ClassType.VO, name="CampaignVO")
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Campaign", description="Campaign")
	@Required
	@Section( name = "BASIC_INFORMATION")
	@Filter(field="management", values= {"SCHEDULED"})
	private Long campaignId;
	
	@UI( widgetType = WidgetType.DATE, mode = Mode.READ_WRITE, label="From", description="From")
	@Required
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	@Section( name = "BASIC_INFORMATION")
	private Instant fromTs;

	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Hours", description="Hours")
	@Section( name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="simpleSchedule", values = {"true"})
		})
	})
	private Long fromHh;

	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Minutes", description="Minutes")
	@Section( name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="simpleSchedule", values = {"true"})
		})
	})
	private Long fromMm;

	@UI( widgetType = WidgetType.DATE, mode = Mode.READ_WRITE, label="To", description="To")
	@Required
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	@Section( name = "BASIC_INFORMATION")
	private Instant toTs;
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Hours", description="Hours")
	@Section( name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="simpleSchedule", values = {"true"})
		})
	})
	private Long toHh;

	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_WRITE, label="Minutes", description="Minutes")
	@Section( name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="simpleSchedule", values = {"true"})
		})
	})
	private Long toMm;
	
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="Monday", description="Monday")
	@Required
	@Section( name = "DAYS")
	private Boolean monday;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="Tuesday", description="Tuesday")
	@Required
	@Section( name = "DAYS")
	private Boolean tuesday;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="Wednesday", description="Wednesday")
	@Required
	@Section( name = "DAYS")
	private Boolean wednesday;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="Thursday", description="Thursday")
	@Required
	@Section( name = "DAYS")
	private Boolean thursday;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="Friday", description="Friday")
	@Required
	@Section( name = "DAYS")
	private Boolean friday;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="Saturday", description="Saturday")
	@Required
	@Section( name = "DAYS")
	private Boolean saturday;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="Sunday", description="Sunday")
	@Required
	@Section( name = "DAYS")
	private Boolean sunday;
	
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="00", description="00")
	@Required
	@Section( name = "HOURS")
	private Boolean h0;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="01", description="01")
	@Required
	@Section( name = "HOURS")
	private Boolean h1;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="02", description="02")
	@Required
	@Section( name = "HOURS")
	private Boolean h2;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="03", description="03")
	@Required
	@Section( name = "HOURS")
	private Boolean h3;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="04", description="04")
	@Required
	@Section( name = "HOURS")
	private Boolean h4;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="05", description="05")
	@Required
	@Section( name = "HOURS")
	private Boolean h5;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="06", description="06")
	@Required
	@Section( name = "HOURS")
	private Boolean h6;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="07", description="07")
	@Required
	@Section( name = "HOURS")
	private Boolean h7;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="08", description="08")
	@Required
	@Section( name = "HOURS")
	private Boolean h8;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="09", description="09")
	@Required
	@Section( name = "HOURS")
	private Boolean h9;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="10", description="10")
	@Required
	@Section( name = "HOURS")
	private Boolean h10;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="11", description="11")
	@Required
	@Section( name = "HOURS")
	private Boolean h11;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="12", description="12")
	@Required
	@Section( name = "HOURS")
	private Boolean h12;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="13", description="13")
	@Required
	@Section( name = "HOURS")
	private Boolean h13;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="14", description="14")
	@Required
	@Section( name = "HOURS")
	private Boolean h14;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="15", description="15")
	@Required
	@Section( name = "HOURS")
	private Boolean h15;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="16", description="16")
	@Required
	@Section( name = "HOURS")
	private Boolean h16;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="17", description="17")
	@Required
	@Section( name = "HOURS")
	private Boolean h17;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="18", description="18")
	@Required
	@Section( name = "HOURS")
	private Boolean h18;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="19", description="19")
	@Required
	@Section( name = "HOURS")
	private Boolean h19;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="20", description="20")
	@Required
	@Section( name = "HOURS")
	private Boolean h20;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="21", description="21")
	@Required
	@Section( name = "HOURS")
	private Boolean h21;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="22", description="22")
	@Required
	@Section( name = "HOURS")
	private Boolean h22;
	@UI( widgetType = WidgetType.CHECKBOX, mode = Mode.READ_WRITE, label="23", description="23")
	@Required
	@Section( name = "HOURS")
	private Boolean h23;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_WRITE, label="Sent Limit", description="Sent Limit")
	@Section( name = "BASIC_INFORMATION")
	private Long sentLimit;
	
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant deletedTs;

	
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="TODAY processed", 
	description="Today Processed")
	private String todayProcessed;
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="sent", 
	description="Today Sent")
	private String todaySent;
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="delivered", 
	description="Today Delivered")
	private String todayDelivered;
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.HIDDEN, 
	mode = Mode.READ_ONLY, 
	label="Today Viewed", 
	description="Today Viewed")
	private String todayViewed;

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="PAs", 
	description="Today PA")
	private String todayPa;

	
	
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="ctr", 
	description="Today Ctr")
	private String todayCtr;

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="dr", 
	description="Today Delivery Rate")
	private String todayDr;

	
	private String todayCtrPercentColor;
	private String todayDrPercentColor;

	
	
	public String getTodayDr() {
		return todayDr;
	}

	public void setTodayDr(String todayDr) {
		this.todayDr = todayDr;
	}

	public String getTodayDrPercentColor() {
		return todayDrPercentColor;
	}

	public void setTodayDrPercentColor(String todayDrPercentColor) {
		this.todayDrPercentColor = todayDrPercentColor;
	}

	public String getAllTimeDr() {
		return allTimeDr;
	}

	public void setAllTimeDr(String allTimeDr) {
		this.allTimeDr = allTimeDr;
	}

	public String getAllTimeDrPercentColor() {
		return allTimeDrPercentColor;
	}

	public void setAllTimeDrPercentColor(String allTimeDrPercentColor) {
		this.allTimeDrPercentColor = allTimeDrPercentColor;
	}

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="ALL TIME Processed", 
	description="All Time Processed")
	private String allTimeProcessed;
	
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="sent", 
	description="All Time Sent")
	private String allTimeSent;
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="delivered", 
	description="All Time Delivered")
	private String allTimeDelivered;

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.HIDDEN, 
	mode = Mode.READ_ONLY, 
	label="All Time Viewed", 
	description="All Time Viewed")
	private String allTimeViewed;

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="PAs", 
	description="All Time PA")
	private String allTimePa;

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="ctr", 
	description="All Time Ctr")
	private String allTimeCtr;

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="dr", 
	description="All Time Dr")
	private String allTimeDr;

	
	private String allTimeCtrPercentColor;
	private String allTimeDrPercentColor;

	private Float todayEfficiency; // percent
	private Float allTimeEfficiency; // percent

	private Float todayDrEfficiency; // percent
	private Float allTimeDrEfficiency; // percent

	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="Creator", description="Creator")
	@Section( name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="UserVO")
	private String user;

	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="Group", description="Group")
	@Section( name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="GroupVO")
	private String group;

	//private List<EntityState> allowedTransitionStates;
	
	public Boolean getSimpleSchedule() {
		return simpleSchedule;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setSimpleSchedule(Boolean simpleSchedule) {
		this.simpleSchedule = simpleSchedule;
	}

	public Long getFromHh() {
		return fromHh;
	}

	public void setFromHh(Long fromHh) {
		this.fromHh = fromHh;
	}

	public Long getFromMm() {
		return fromMm;
	}

	public void setFromMm(Long fromMm) {
		this.fromMm = fromMm;
	}

	public Long getToHh() {
		return toHh;
	}

	public void setToHh(Long toHh) {
		this.toHh = toHh;
	}

	public Long getToMm() {
		return toMm;
	}

	public void setToMm(Long toMm) {
		this.toMm = toMm;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public Instant getFromTs() {
		return fromTs;
	}

	public void setFromTs(Instant fromTs) {
		this.fromTs = fromTs;
	}

	public Instant getToTs() {
		return toTs;
	}

	public void setToTs(Instant toTs) {
		this.toTs = toTs;
	}

	public Boolean getMonday() {
		return monday;
	}

	public void setMonday(Boolean monday) {
		this.monday = monday;
	}

	public Boolean getTuesday() {
		return tuesday;
	}

	public void setTuesday(Boolean tuesday) {
		this.tuesday = tuesday;
	}

	public Boolean getWednesday() {
		return wednesday;
	}

	public void setWednesday(Boolean wednesday) {
		this.wednesday = wednesday;
	}

	public Boolean getThursday() {
		return thursday;
	}

	public void setThursday(Boolean thursday) {
		this.thursday = thursday;
	}

	public Boolean getFriday() {
		return friday;
	}

	public void setFriday(Boolean friday) {
		this.friday = friday;
	}

	public Boolean getSaturday() {
		return saturday;
	}

	public void setSaturday(Boolean saturday) {
		this.saturday = saturday;
	}

	public Boolean getSunday() {
		return sunday;
	}

	public void setSunday(Boolean sunday) {
		this.sunday = sunday;
	}

	public Boolean getH0() {
		return h0;
	}

	public void setH0(Boolean h0) {
		this.h0 = h0;
	}

	public Boolean getH1() {
		return h1;
	}

	public void setH1(Boolean h1) {
		this.h1 = h1;
	}

	public Boolean getH2() {
		return h2;
	}

	public void setH2(Boolean h2) {
		this.h2 = h2;
	}

	public Boolean getH3() {
		return h3;
	}

	public void setH3(Boolean h3) {
		this.h3 = h3;
	}

	public Boolean getH4() {
		return h4;
	}

	public void setH4(Boolean h4) {
		this.h4 = h4;
	}

	public Boolean getH5() {
		return h5;
	}

	public void setH5(Boolean h5) {
		this.h5 = h5;
	}

	public Boolean getH6() {
		return h6;
	}

	public void setH6(Boolean h6) {
		this.h6 = h6;
	}

	public Boolean getH7() {
		return h7;
	}

	public void setH7(Boolean h7) {
		this.h7 = h7;
	}

	public Boolean getH8() {
		return h8;
	}

	public void setH8(Boolean h8) {
		this.h8 = h8;
	}

	public Boolean getH9() {
		return h9;
	}

	public void setH9(Boolean h9) {
		this.h9 = h9;
	}

	public Boolean getH10() {
		return h10;
	}

	public void setH10(Boolean h10) {
		this.h10 = h10;
	}

	public Boolean getH11() {
		return h11;
	}

	public void setH11(Boolean h11) {
		this.h11 = h11;
	}

	public Boolean getH12() {
		return h12;
	}

	public void setH12(Boolean h12) {
		this.h12 = h12;
	}

	public Boolean getH13() {
		return h13;
	}

	public void setH13(Boolean h13) {
		this.h13 = h13;
	}

	public Boolean getH14() {
		return h14;
	}

	public void setH14(Boolean h14) {
		this.h14 = h14;
	}

	public Boolean getH15() {
		return h15;
	}

	public void setH15(Boolean h15) {
		this.h15 = h15;
	}

	public Boolean getH16() {
		return h16;
	}

	public void setH16(Boolean h16) {
		this.h16 = h16;
	}

	public Boolean getH17() {
		return h17;
	}

	public void setH17(Boolean h17) {
		this.h17 = h17;
	}

	public Boolean getH18() {
		return h18;
	}

	public void setH18(Boolean h18) {
		this.h18 = h18;
	}

	public Boolean getH19() {
		return h19;
	}

	public void setH19(Boolean h19) {
		this.h19 = h19;
	}

	public Boolean getH20() {
		return h20;
	}

	public void setH20(Boolean h20) {
		this.h20 = h20;
	}

	public Boolean getH21() {
		return h21;
	}

	public void setH21(Boolean h21) {
		this.h21 = h21;
	}

	public Boolean getH22() {
		return h22;
	}

	public void setH22(Boolean h22) {
		this.h22 = h22;
	}

	public Boolean getH23() {
		return h23;
	}

	public void setH23(Boolean h23) {
		this.h23 = h23;
	}

	public Long getSentLimit() {
		return sentLimit;
	}

	public void setSentLimit(Long limit) {
		this.sentLimit = limit;
	}

	

	public Instant getDeletedTs() {
		return deletedTs;
	}

	public void setDeletedTs(Instant deletedTs) {
		this.deletedTs = deletedTs;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTodaySent() {
		return todaySent;
	}

	public void setTodaySent(String todaySent) {
		this.todaySent = todaySent;
	}

	public String getTodayDelivered() {
		return todayDelivered;
	}

	public void setTodayDelivered(String todayDelivered) {
		this.todayDelivered = todayDelivered;
	}

	public String getTodayViewed() {
		return todayViewed;
	}

	public void setTodayViewed(String todayViewed) {
		this.todayViewed = todayViewed;
	}

	public String getTodayCtr() {
		return todayCtr;
	}

	public void setTodayCtr(String todayCtr) {
		this.todayCtr = todayCtr;
	}

	public String getAllTimeSent() {
		return allTimeSent;
	}

	public void setAllTimeSent(String allTimeSent) {
		this.allTimeSent = allTimeSent;
	}

	public String getAllTimeDelivered() {
		return allTimeDelivered;
	}

	public void setAllTimeDelivered(String allTimeDelivered) {
		this.allTimeDelivered = allTimeDelivered;
	}

	public String getAllTimeViewed() {
		return allTimeViewed;
	}

	public void setAllTimeViewed(String allTimeViewed) {
		this.allTimeViewed = allTimeViewed;
	}

	public String getAllTimeCtr() {
		
		return allTimeCtr;
	}

	public void setAllTimeCtr(String allTimeCtr) {
		this.allTimeCtr = allTimeCtr;
	}

	
	public void setTodayEfficiency(Float todayEfficiency) {
		this.todayEfficiency = todayEfficiency;
	}

	
	public void setAllTimeEfficiency(Float allTimeEfficiency) {
		this.allTimeEfficiency = allTimeEfficiency;
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

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	

	public void setTodayCtrPercentColor(String todayCtrPercentColor) {
		this.todayCtrPercentColor = todayCtrPercentColor;
	}

	

	public void setAllTimeCtrPercentColor(String allTimeCtrPercentColor) {
		this.allTimeCtrPercentColor = allTimeCtrPercentColor;
	}

	public Float getTodayEfficiency() {
		return todayEfficiency;
	}

	public Float getAllTimeEfficiency() {
		return allTimeEfficiency;
	}

	public String getTodayPa() {
		return todayPa;
	}

	public void setTodayPa(String todayPa) {
		this.todayPa = todayPa;
	}

	public String getAllTimePa() {
		return allTimePa;
	}

	public void setAllTimePa(String allTimePa) {
		this.allTimePa = allTimePa;
	}

	public String getTodayCtrPercentColor() {
		return todayCtrPercentColor;
	}

	public String getAllTimeCtrPercentColor() {
		return allTimeCtrPercentColor;
	}

	public CampaignType getCampaignType() {
		return campaignType;
	}

	public void setCampaignType(CampaignType campaignType) {
		this.campaignType = campaignType;
	}

	public Float getTodayDrEfficiency() {
		return todayDrEfficiency;
	}

	public void setTodayDrEfficiency(Float todayDrEfficiency) {
		this.todayDrEfficiency = todayDrEfficiency;
	}

	public Float getAllTimeDrEfficiency() {
		return allTimeDrEfficiency;
	}

	public void setAllTimeDrEfficiency(Float allTimeDrEfficiency) {
		this.allTimeDrEfficiency = allTimeDrEfficiency;
	}

	public String getTodayProcessed() {
		return todayProcessed;
	}

	public void setTodayProcessed(String todayProcessed) {
		this.todayProcessed = todayProcessed;
	}

	public String getAllTimeProcessed() {
		return allTimeProcessed;
	}

	public void setAllTimeProcessed(String allTimeProcessed) {
		this.allTimeProcessed = allTimeProcessed;
	}

	

	

}