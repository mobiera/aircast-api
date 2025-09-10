package com.mobiera.aircast.api.vo.ad;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;

import org.jboss.logging.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.UI;


@JsonInclude(Include.NON_NULL)
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
@Type(value = TextAd.class),
@Type(value = MenuAd.class),
@Type(value = UrlAd.class),
@Type(value = CallAd.class),
@Type(value = UssdAd.class),
@Type(value = MoAd.class),
})

public class AdVO implements Serializable
{
	private static final long serialVersionUID = 1241060039976633233L;
	private static Logger logger = Logger.getLogger(AdVO.class);
	
	private static String RED = "ff2b2b";
	private static String GREEN = "09e359";
	private static String ORANGE = "ff8bfe";
	private static String BLACK = "000000";
	
	
	
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.HIDDEN, 
	mode = Mode.READ_ONLY, 
	label="id", 
	description="id")
	private Long id;
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.HIDDEN, 
	mode = Mode.READ_WRITE, 
	label="campaignFk", 
	description="campaignFk")
	@Required
	private Long campaignFk;
	
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayViewed1", 
	description="todayViewed1")
	private Long todayViewed1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayOk1", 
	description="todayOk1")
	private Long todayOk1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayCancel1", 
	description="todayCancel1")
	private Long todayCancel1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayBack1", 
	description="todayBack1")
	private Long todayBack1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayError1", 
	description="todayError1")
	private Long todayError1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayTimeout1", 
	description="todayTimeout1")
	private Long todayTimeout1;
	
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayViewed2", 
	description="todayViewed2")
	private Long todayViewed2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayOk2", 
	description="todayOk2")
	private Long todayOk2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayCancel2", 
	description="todayCancel2")
	private Long todayCancel2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayBack2", 
	description="todayBack2")
	private Long todayBack2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayError2", 
	description="todayError2")
	private Long todayError2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayTimeout2", 
	description="todayTimeout2")
	private Long todayTimeout2;
	
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todaySent", 
	description="todaySent")
	private Long todaySent;
	
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayProcessed", 
	description="todayProcessed")
	private Long todayProcessed;
	
	
	
	
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="todayDlred", 
	description="todayDlred")
	private Long todayDlred;
	


	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allViewed1", 
	description="allViewed1")
	private Long allViewed1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allOk1", 
	description="allOk1")
	private Long allOk1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allCancel1", 
	description="allCancel1")
	private Long allCancel1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allBack1", 
	description="allBack1")
	private Long allBack1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allError1", 
	description="allError1")
	private Long allError1;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allTimeout1", 
	description="allTimeout1")
	private Long allTimeout1;

	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allViewed2", 
	description="allViewed2")
	private Long allViewed2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allOk2", 
	description="allOk2")
	private Long allOk2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allCancel2", 
	description="allCancel2")
	private Long allCancel2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allBack2", 
	description="allBack2")
	private Long allBack2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allError2", 
	description="allError2")
	private Long allError2;
	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allTimeout2", 
	description="allTimeout2")
	private Long allTimeout2;

	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allSent", 
	description="allSent")
	private Long allSent;

	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allProcessed", 
	description="allProcessed")
	private Long allProcessed;

	@Section(name = "STATS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="allDlred", 
	description="allDlred")
	private Long allDlred;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="processed", 
			description="processed")
	private String processed;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="sent", 
			description="sent")
	private String sent;

	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="delivered", 
			description="delivered")
	private String delivered;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="viewed", 
			description="viewed")
	private String viewed;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="pa", 
			description="pa")
	private String pa;

	
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private Float efficiency; // percent

	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private Float drEfficiency; // percent

	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="ctr", 
			description="ctr")
	private String ctr;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="dr", 
			description="dr")
	private String dr;

	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="all time sent", 
			description="all time sent")
	private String allTimeSent;

	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="all time processed", 
			description="all time processed")
	private String allTimeProcessed;

	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="all time delivered", 
			description="all time delivered")
	private String allTimeDelivered;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="all time viewed", 
			description="all time viewed")
	private String allTimeViewed;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="all time pa", 
			description="all time pa")
	private String allTimePa;

	

	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private Float allTimeEfficiency; // percent


	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private Float allTimeDrEfficiency; // percent


	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="all time ctr", 
			description="all time ctr")
	private String allTimeCtr;


	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="all time dr", 
			description="all time dr")
	private String allTimeDr;



	private String allTimeCtrColor;
	private String todayCtrColor;

	private String allTimeDrColor;
	private String todayDrColor;



	public String getTodayCtrColor() {
		
		Float e = getEfficiency();
		todayCtrColor = BLACK;
		
			if (e != null) {
				
				if (e > 0.03f) {
					todayCtrColor = GREEN;
				} else if (e > 0.015f) {
					todayCtrColor = ORANGE;
				} else if (e == 0) {
					todayCtrColor = BLACK;
				} else {
					todayCtrColor = RED;
				}
			}	
				
		return todayCtrColor;
	}
	
	
	public String getTodayDrColor() {
		
		Float e = getDrEfficiency();
		todayDrColor = BLACK;
		
			if (e != null) {
				
				if (e > 0.75f) {
					todayDrColor = GREEN;
				} else if (e > 0.50f) {
					todayDrColor = ORANGE;
				} else if (e == 0) {
					todayDrColor = BLACK;
				} else {
					todayDrColor = RED;
				}
			}	
				
		return todayDrColor;
	}
	
	public String getAllTimeCtrColor() {
		
		Float e = getAllTimeEfficiency();
		allTimeCtrColor = BLACK;
		
			if (e != null) {
				
				if (e > 0.03f) {
					allTimeCtrColor = GREEN;
				} else if (e > 0.015f) {
					allTimeCtrColor = ORANGE;
				} else if (e == 0) {
					allTimeCtrColor = BLACK;
				} else {
					allTimeCtrColor = RED;
				}
			}	
				
		return allTimeCtrColor;
	}
	
	
	public String getAllTimeDrColor() {
		
		Float e = getAllTimeDrEfficiency();
		allTimeDrColor = BLACK;
		
			if (e != null) {
				
				if (e > 0.75f) {
					allTimeDrColor = GREEN;
				} else if (e > 0.5f) {
					allTimeDrColor = ORANGE;
				} else if (e == 0) {
					allTimeDrColor = BLACK;
				} else {
					allTimeDrColor = RED;
				}
			}	
				
		return allTimeDrColor;
	}

	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private Float probability; //

	
	private EntityState state;
	
	
	private List<EntityState> allowedTransitionStates;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCampaignFk() {
		return campaignFk;
	}
	public void setCampaignFk(Long campaignFk) {
		this.campaignFk = campaignFk;
	}
	
	public Long getTodayCancel1() {
		return todayCancel1;
	}
	public void setTodayCancel1(Long todayCancel1) {
		this.todayCancel1 = todayCancel1;
	}
	public Long getTodayBack1() {
		return todayBack1;
	}
	public void setTodayBack1(Long todayBack1) {
		this.todayBack1 = todayBack1;
	}
	public Long getTodayError1() {
		return todayError1;
	}
	public void setTodayError1(Long todayError1) {
		this.todayError1 = todayError1;
	}
	public Long getTodayTimeout1() {
		return todayTimeout1;
	}
	public void setTodayTimeout1(Long todayTimeout1) {
		this.todayTimeout1 = todayTimeout1;
	}
	
	public Long getTodayCancel2() {
		return todayCancel2;
	}
	public void setTodayCancel2(Long todayCancel2) {
		this.todayCancel2 = todayCancel2;
	}
	public Long getTodayBack2() {
		return todayBack2;
	}
	public void setTodayBack2(Long todayBack2) {
		this.todayBack2 = todayBack2;
	}
	public Long getTodayError2() {
		return todayError2;
	}
	public void setTodayError2(Long todayError2) {
		this.todayError2 = todayError2;
	}
	public Long getTodayTimeout2() {
		return todayTimeout2;
	}
	public void setTodayTimeout2(Long todayTimeout2) {
		this.todayTimeout2 = todayTimeout2;
	}
	
	public Long getAllCancel1() {
		return allCancel1;
	}
	public void setAllCancel1(Long allCancel1) {
		this.allCancel1 = allCancel1;
	}
	public Long getAllBack1() {
		return allBack1;
	}
	public void setAllBack1(Long allBack1) {
		this.allBack1 = allBack1;
	}
	public Long getAllError1() {
		return allError1;
	}
	public void setAllError1(Long allError1) {
		this.allError1 = allError1;
	}
	public Long getAllTimeout1() {
		return allTimeout1;
	}
	public void setAllTimeout1(Long allTimeout1) {
		this.allTimeout1 = allTimeout1;
	}
	
	public Long getAllCancel2() {
		return allCancel2;
	}
	public void setAllCancel2(Long allCancel2) {
		this.allCancel2 = allCancel2;
	}
	public Long getAllBack2() {
		return allBack2;
	}
	public void setAllBack2(Long allBack2) {
		this.allBack2 = allBack2;
	}
	public Long getAllError2() {
		return allError2;
	}
	public void setAllError2(Long allError2) {
		this.allError2 = allError2;
	}
	public Long getAllTimeout2() {
		return allTimeout2;
	}
	public void setAllTimeout2(Long allTimeout2) {
		this.allTimeout2 = allTimeout2;
	}
	public Long getTodayViewed1() {
		return todayViewed1;
	}
	public void setTodayViewed1(Long todayViewed1) {
		this.todayViewed1 = todayViewed1;
	}
	public Long getTodayViewed2() {
		return todayViewed2;
	}
	public void setTodayViewed2(Long todayViewed2) {
		this.todayViewed2 = todayViewed2;
	}
	public Long getTodayOk1() {
		return todayOk1;
	}
	public void setTodayOk1(Long todayOk1) {
		this.todayOk1 = todayOk1;
	}
	public Long getTodayOk2() {
		return todayOk2;
	}
	public void setTodayOk2(Long todayOk2) {
		this.todayOk2 = todayOk2;
	}
	public Long getAllViewed1() {
		return allViewed1;
	}
	public void setAllViewed1(Long allViewed1) {
		this.allViewed1 = allViewed1;
	}
	public Long getAllOk1() {
		return allOk1;
	}
	public void setAllOk1(Long allOk1) {
		this.allOk1 = allOk1;
	}
	public Long getAllViewed2() {
		return allViewed2;
	}
	public void setAllViewed2(Long allViewed2) {
		this.allViewed2 = allViewed2;
	}
	public Long getAllOk2() {
		return allOk2;
	}
	public void setAllOk2(Long allOk2) {
		this.allOk2 = allOk2;
	}
	public Float getEfficiency() {
		
			
		if ((todayDlred != null) && (todayOk2 != null) && (todayDlred != 0)) {
			
			efficiency = todayOk2.floatValue() / todayDlred.floatValue();
		} else {
			
			efficiency = 0f;
		}

		return efficiency;
	}
	
	public Float getDrEfficiency() {
		
		
		if ((todayDlred != null) && (todaySent != null) && (todaySent != 0)) {
			
			drEfficiency = todayDlred.floatValue() / todaySent.floatValue();
		} else {
			
			drEfficiency = 0f;
		}

		return drEfficiency;
	}
	
	public Float getAllTimeEfficiency() {
		//logger.info("AAA1 campaignFk: " + campaignFk + " allTimeEfficiency: " + allTimeEfficiency + " allDlred: " + allDlred + " allOk2: " + allOk2);
		
		//if (allTimeEfficiency == null) {
		//	logger.info("AAA2 campaignFk: " + campaignFk + " allTimeEfficiency: " + allTimeEfficiency + " allDlred: " + allDlred + " allOk2: " + allOk2);
			
			if ((allDlred != null) && (allOk2 != null) && (allDlred != 0)) {
		//		logger.info("AAA3 campaignFk: " + campaignFk + " allTimeEfficiency: " + allTimeEfficiency + " allDlred: " + allDlred + " allOk2: " + allOk2);
				
				allTimeEfficiency = allOk2.floatValue() / allDlred.floatValue();
			} else {
		//		logger.info("AAA4 campaignFk: " + campaignFk + " allTimeEfficiency: " + allTimeEfficiency + " allDlred: " + allDlred + " allOk2: " + allOk2);
				
				allTimeEfficiency = 0f;
			}
		//}
		return allTimeEfficiency;
	}
	
	
	public Float getAllTimeDrEfficiency() {
		//logger.info("AAA1 campaignFk: " + campaignFk + " allTimeEfficiency: " + allTimeEfficiency + " allDlred: " + allDlred + " allOk2: " + allOk2);
		
		//if (allTimeEfficiency == null) {
		//	logger.info("AAA2 campaignFk: " + campaignFk + " allTimeEfficiency: " + allTimeEfficiency + " allDlred: " + allDlred + " allOk2: " + allOk2);
			
			if ((allDlred != null) && (allSent != null) && (allSent != 0)) {
		//		logger.info("AAA3 campaignFk: " + campaignFk + " allTimeEfficiency: " + allTimeEfficiency + " allDlred: " + allDlred + " allOk2: " + allOk2);
				
				allTimeDrEfficiency = allDlred.floatValue() / allSent.floatValue();
			} else {
		//		logger.info("AAA4 campaignFk: " + campaignFk + " allTimeEfficiency: " + allTimeEfficiency + " allDlred: " + allDlred + " allOk2: " + allOk2);
				
				allTimeDrEfficiency = 0f;
			}
		//}
		return allTimeDrEfficiency;
	}
	
	
	public void setEfficiency(Float efficiency) {
		this.efficiency = efficiency;
	}
	public Float getProbability() {
		return probability;
	}
	public void setProbability(Float probability) {
		this.probability = probability;
	}
	public EntityState getState() {
		return state;
	}
	public void setState(EntityState state) {
		this.state = state;
	}
	
	@JsonIgnore
	private DecimalFormat decFormat = new DecimalFormat("#.#%");
	
	public String getCtr() {
		
		Float e = this.getEfficiency();
		if ((e != null) && (e != 0)) {
			return (decFormat.format(this.getEfficiency()));
		} else {
			return "0.0%";
		}
		
	}
	public String getDr() {
		
		Float e = this.getDrEfficiency();
		if ((e != null) && (e != 0)) {
			return (decFormat.format(this.getDrEfficiency()));
		} else {
			return "0.0%";
		}
		
	}
	public void setCtr(String ctr) {
		this.ctr = ctr;
	}
	public String getViewed(boolean abbreviated) {
		
		if (abbreviated) {
			if (this.getTodayViewed1() != null) {
				if (this.getTodayViewed1() < 1000) {
					return ("" + this.getTodayViewed1());
				} else {
					if (this.getTodayViewed1() < 1000000) {
						float kViewed = ((float)(this.getTodayViewed1() / 100))/10f;
						return ("" + kViewed + "k");
					} else if (this.getTodayViewed1() < 1000000000) {
						float mViewed = ((float)(this.getTodayViewed1() / 100000))/10f;
						return ("" + mViewed + "M");
					}
				}
			}
		} else {
			return ("" + this.getTodayViewed1());
		}
		
		
		return viewed;
	}
	
	
	public String getDelivered(boolean abbreviated) {
		if (abbreviated) {
			if (this.getTodayDlred() != null) {
				if (this.getTodayDlred() < 1000) {
					return ("" + this.getTodayDlred());
				} else {
					if (this.getTodayDlred() < 1000000) {
						float kViewed = ((float)(this.getTodayDlred() / 100))/10f;
						return ("" + kViewed + "k");
					} else if (this.getTodayDlred() < 1000000000) {
						float mViewed = ((float)(this.getTodayDlred() / 100000))/10f;
						return ("" + mViewed + "M");
					}
				}
			}
		} else {
			return ("" + this.getTodayDlred());
		}
		
		return delivered;
	}
	
	public String getPa(boolean abbreviated) {
		if (abbreviated) {
			if (this.getTodayOk2() != null) {
				if (this.getTodayOk2() < 1000) {
					return ("" + this.getTodayOk2());
				} else {
					if (this.getTodayOk2() < 1000000) {
						float kViewed = ((float)(this.getTodayOk2() / 100))/10f;
						return ("" + kViewed + "k");
					} else if (this.getTodayOk2() < 1000000000) {
						float mViewed = ((float)(this.getTodayOk2() / 100000))/10f;
						return ("" + mViewed + "M");
					}
				}
			}
		} else {
			return ("" + this.getTodayOk2());
		}
		
		return pa;
	}
	
	public String getAllTimeCtr() {
		
		Float e = this.getAllTimeEfficiency();
		if ((e != null) && (e != 0)) {
			return (decFormat.format(this.getAllTimeEfficiency()));
		} else {
			return "0.0%";
		}
		
	}
	
	
	public String getAllTimeDr() {
		
		Float e = this.getAllTimeDrEfficiency();
		if ((e != null) && (e != 0)) {
			return (decFormat.format(this.getAllTimeDrEfficiency()));
		} else {
			return "0.0%";
		}
		
	}
	
	
	public String getAllTimeViewed(boolean abbreviated) {
		if (abbreviated) {
			if (this.getAllViewed1() != null) {
				if (this.getAllViewed1() < 1000) {
					return ("" + this.getAllViewed1());
				} else {
					if (this.getAllViewed1() < 1000000) {
						float kViewed = ((float)(this.getAllViewed1() / 100))/10f;
						return ("" + kViewed + "k");
					} else if (this.getAllViewed1() < 1000000000) {
						float mViewed = ((float)(this.getAllViewed1() / 100000))/10f;
						return ("" + mViewed + "M");
					}
				}
			}
		} else {
			return ("" + this.getAllViewed1());
		}
		
		return allTimeViewed;
	}
	
	
	public String getAllTimeDelivered(boolean abbreviated) {
		if (abbreviated) {
			if (this.getAllDlred() != null) {
				if (this.getAllDlred() < 1000) {
					return ("" + this.getAllDlred());
				} else {
					if (this.getAllDlred() < 1000000) {
						float kViewed = ((float)(this.getAllDlred() / 100))/10f;
						return ("" + kViewed + "k");
					} else if (this.getAllDlred() < 1000000000) {
						float mViewed = ((float)(this.getAllDlred() / 100000))/10f;
						return ("" + mViewed + "M");
					}
				}
			}
		} else {
			return ("" +  this.getAllDlred());
		}
		
		return allTimeDelivered;
	}
	
	public String getAllTimePa(boolean abbreviated) {
		
		if (abbreviated) {
			if (this.getAllOk2() != null) {
				if (this.getAllOk2() < 1000) {
					return ("" + this.getAllOk2());
				} else {
					if (this.getAllOk2() < 1000000) {
						float kViewed = ((float)(this.getAllOk2() / 100))/10f;
						return ("" + kViewed + "k");
					} else if (this.getAllOk2() < 1000000000) {
						float mViewed = ((float)(this.getAllOk2() / 100000))/10f;
						return ("" + mViewed + "M");
					}
				}
			}
		} else {
			return ("" + this.getAllOk2());
		}
		
		return allTimePa;
	}
	
	
	public String getProcessed(boolean abbreviated) {
		
		if (abbreviated) {
			if (this.getTodayProcessed() != null) {
				if (this.getTodayProcessed() < 1000) {
					return ("" + this.getTodayProcessed());
				} else {
					if (this.getTodayProcessed() < 1000000) {
						float kViewed = ((float)(this.getTodayProcessed() / 100))/10f;
						return ("" + kViewed + "k");
					} else if (this.getTodayProcessed() < 1000000000) {
						float mViewed = ((float)(this.getTodayProcessed() / 100000))/10f;
						return ("" + mViewed + "M");
					}
				}
			}
		} else {
			return ("" + this.getTodayProcessed());
		}
		
		return processed;
	}
	
	public String getSent(boolean abbreviated) {
		
		if (abbreviated) {
			if (this.getTodaySent() != null) {
				if (this.getTodaySent() < 1000) {
					return ("" + this.getTodaySent());
				} else {
					if (this.getTodaySent() < 1000000) {
						float kViewed = ((float)(this.getTodaySent() / 100))/10f;
						return ("" + kViewed + "k");
					} else if (this.getTodaySent() < 1000000000) {
						float mViewed = ((float)(this.getTodaySent() / 100000))/10f;
						return ("" + mViewed + "M");
					}
				}
			}
		} else {
			return ("" + this.getTodaySent());
		}
		
		return sent;
	}
	
	
	public String getAllTimeSent(boolean abbreviated) {
		if (abbreviated) {
			if (this.getAllSent() != null) {
				if (this.getAllSent() < 1000) {
					return ("" + this.getAllSent());
				} else {
					if (this.getAllSent() < 1000000) {
						float kViewed = ((float)(this.getAllSent() / 100))/10f;
						return ("" + kViewed + "k");
					} else if (this.getAllSent() < 1000000000) {
						float mViewed = ((float)(this.getAllSent() / 100000))/10f;
						return ("" + mViewed + "M");
					}
				}
			}
		} else {
			return ("" + this.getAllSent());
		}
		
		return allTimeSent;
	}
	
	
	
	public void setViewed(String viewed) {
		this.viewed = viewed;
	}
	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}
	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}
	public Long getTodaySent() {
		return todaySent;
	}
	public void setTodaySent(Long todaySent) {
		this.todaySent = todaySent;
	}
	public Long getTodayDlred() {
		return todayDlred;
	}
	public void setTodayDlred(Long todayDlred) {
		this.todayDlred = todayDlred;
	}
	public Long getAllSent() {
		return allSent;
	}
	public void setAllSent(Long allSent) {
		this.allSent = allSent;
	}
	public Long getAllDlred() {
		return allDlred;
	}
	public void setAllDlred(Long allDlred) {
		this.allDlred = allDlred;
	}
	public DecimalFormat getDecFormat() {
		return decFormat;
	}
	public void setDecFormat(DecimalFormat decFormat) {
		this.decFormat = decFormat;
	}
	public void setDelivered(String delivered) {
		this.delivered = delivered;
	}
	public void setAllTimeCtr(String allTimeCtr) {
		this.allTimeCtr = allTimeCtr;
	}
	public void setAllTimeViewed(String allTimeViewed) {
		this.allTimeViewed = allTimeViewed;
	}
	public void setAllTimeDelivered(String allTimeDelivered) {
		this.allTimeDelivered = allTimeDelivered;
	}
	public void setAllTimeEfficiency(Float allTimeEfficiency) {
		this.allTimeEfficiency = allTimeEfficiency;
	}
	public void setSent(String sent) {
		this.sent = sent;
	}
	public void setAllTimeSent(String allTimeSent) {
		this.allTimeSent = allTimeSent;
	}
	
	public void setPa(String pa) {
		this.pa = pa;
	}
	public void setAllTimePa(String allTimePa) {
		this.allTimePa = allTimePa;
	}


	public void setAllTimeCtrColor(String allTimeCtrColor) {
		this.allTimeCtrColor = allTimeCtrColor;
	}


	public void setTodayCtrColor(String todayCtrColor) {
		this.todayCtrColor = todayCtrColor;
	}


	public void setDrEfficiency(Float drEfficiency) {
		this.drEfficiency = drEfficiency;
	}


	public void setDr(String dr) {
		this.dr = dr;
	}


	public void setAllTimeDrEfficiency(Float allTimeDrEfficiency) {
		this.allTimeDrEfficiency = allTimeDrEfficiency;
	}


	public void setAllTimeDr(String allTimeDr) {
		this.allTimeDr = allTimeDr;
	}


	public void setAllTimeDrColor(String allTimeDrColor) {
		this.allTimeDrColor = allTimeDrColor;
	}


	public void setTodayDrColor(String todayDrColor) {
		this.todayDrColor = todayDrColor;
	}


	public Long getTodayProcessed() {
		return todayProcessed;
	}


	public void setTodayProcessed(Long todayProcessed) {
		this.todayProcessed = todayProcessed;
	}


	public String getAllTimeProcessed() {
		return allTimeProcessed;
	}


	public void setAllTimeProcessed(String allTimeProcessed) {
		this.allTimeProcessed = allTimeProcessed;
	}


	public Long getAllProcessed() {
		return allProcessed;
	}


	public void setAllProcessed(Long allProcessed) {
		this.allProcessed = allProcessed;
	}


	public String getProcessed() {
		return processed;
	}
	
	
}
