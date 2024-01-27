package com.mobiera.aircast.api.vo.stats;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ScheduledPreviewVO extends CampaignPreviewVO {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -8651480573091155934L;
	
	private static String DEFAULT_TITLE_TEXT = "Scheduled Campaign";
	private static String DEFAULT_SUBTITLE_TEXT = "No PAs yet";
	private static String DEFAULT_STATS_TEXT = "No stat data yet";
	private static String X_AXIS_LABEL_TEXT = "Hour";
	//private static String CTR_TEXT = "ctr";
	private static String TODAY_CTR_TEXT = "today ctr";
	private static String TOTAL_CTR_TEXT = "total ctr";
	private static String TODAY_TEXT = "Today";
	private static String TOTAL_TEXT = "Total";
	private static String SENT_TEXT = "Sent";
	private static String DELIVERED_TEXT = "Delivered";
	private static String PAS_TEXT = "PAs";
	
	
	private Long sent = 0l;
	private Long delivered = 0l;
	private Long executed = 0l;
	private Long pa = 0l;
	private Float ctr = 0f;
	
	private Long todaySent = 0l;
	private Long todayDelivered = 0l;
	private Long todayExecuted = 0l;
	private Long todayPa = 0l;
	private Float todayCtr = 0f;
	
	
	private String title = DEFAULT_TITLE_TEXT;
	private String subTitle;
	private String todayStats;
	private String totalStats;
	private String xAxisLabelText = X_AXIS_LABEL_TEXT;
	private String ctrText;
	private String percentText = "+0%";
	private String percentColor = BLACK;
	
	private List<ScheduledStatVO> todayHourlyStats;
	
	public String getTitle() {
		if (campaignName != null) return campaignName;
		return title;
	}
	public String getSubTitle() {
		
		if (todayPa != null) {
			if (todayPa != 0) {
				subTitle = (todayPa + " " + PAS_TEXT);
			} else {
				subTitle = DEFAULT_SUBTITLE_TEXT;
			}
		}
		
		
		return subTitle;
	}
	public String getTodayStats() {
		//todayStats = null;
		if (statDetails != null) {
			String retval = TODAY_TEXT + " ";
			boolean ok = false;
			if ((todaySent != null) && (todaySent != 0)) {
				ok = true;
				retval = retval + SENT_TEXT + ": " + todaySent + " ";
			}
			if ((todayDelivered != null) && (todayDelivered != 0)) {
				ok = true;
				retval = retval + DELIVERED_TEXT + ": " + todayDelivered + " ";
			}
			if (ok) {
				todayStats = retval;
			} else {
				todayStats = DEFAULT_STATS_TEXT;
			}
			
		}
		
		return todayStats;
		
	}
	
	public String getTotalStats() {
		//totalStats = null;
		String retval = TOTAL_TEXT + " ";
		boolean ok = false;
		if ((sent != null) && (sent != 0)) {
			ok = true;
			retval = retval + SENT_TEXT + ": " + sent + " ";
		}
		if ((delivered != null) && (delivered != 0)) {
			ok = true;
			retval = retval + DELIVERED_TEXT + ": " + delivered + " ";
		}
		if (ok) {
			totalStats = retval;
		} else {
			totalStats = DEFAULT_STATS_TEXT;
		}
		return totalStats;
	}
	
	
	
	public String getxAxisLabelText() {
		if (this.statDetails != null)
		return xAxisLabelText;
		return null;
	}
	public String getCtrText() {
		if (statDetails != null) {
			ctrText = TODAY_CTR_TEXT;
		} else {
			ctrText = TOTAL_CTR_TEXT;
		}
		return ctrText;
	}
	public String getPercentText() {
		
		if (statDetails != null) {
			if (todayCtr != null) {
				
				if (todayCtr > 0.03f) {
					percentColor = GREEN;
				} else if (todayCtr > 0.015f) {
					percentColor = ORANGE;
				} else if (todayCtr == 0) {
					percentColor = BLACK;
				} else {
					percentColor = RED;
				}
				
				
				percentText = (String.format("%.1f", (todayCtr*100f)) + "%");
			}
		} else {
			
			if (ctr != null) {
				if (ctr > 0.03f) {
					percentColor = GREEN;
				} else if (ctr > 0.015f) {
					percentColor = ORANGE;
				} else if (ctr == 0) {
					percentColor = BLACK;
				} else {
					percentColor = RED;
				}
				
				
				percentText = (String.format("%.1f", (ctr*100f)) + "%");
			} 
			
		}
		return percentText;
	}
	
	
	
	private List<ScheduledStatVO> statDetails;
	
	
	public Long getSent() {
		return sent;
	}
	public void setSent(Long sent) {
		this.sent = sent;
	}
	public Long getDelivered() {
		return delivered;
	}
	public void setDelivered(Long delivered) {
		this.delivered = delivered;
	}
	
	public Long getTodaySent() {
		return todaySent;
	}
	public void setTodaySent(Long todaySent) {
		this.todaySent = todaySent;
	}
	public Long getTodayDelivered() {
		return todayDelivered;
	}
	public void setTodayDelivered(Long todayDelivered) {
		this.todayDelivered = todayDelivered;
	}
	
	
	public Long getPa() {
		return pa;
	}
	public void setPa(Long pa) {
		this.pa = pa;
	}
	public Long getTodayPa() {
		return todayPa;
	}
	public void setTodayPa(Long todayPa) {
		this.todayPa = todayPa;
	}
	
	public Float getCtr() {
		return ctr;
	}
	public void setCtr(Float ctr) {
		this.ctr = ctr;
	}
	public Float getTodayCtr() {
		return todayCtr;
	}
	public void setTodayCtr(Float todayCtr) {
		this.todayCtr = todayCtr;
	}
	public Long getExecuted() {
		return executed;
	}
	public void setExecuted(Long executed) {
		this.executed = executed;
	}
	public Long getTodayExecuted() {
		return todayExecuted;
	}
	public void setTodayExecuted(Long todayExecuted) {
		this.todayExecuted = todayExecuted;
	}
	public List<ScheduledStatVO> getStatDetails() {
		return statDetails;
	}
	public void setStatDetails(List<ScheduledStatVO> statDetails) {
		this.statDetails = statDetails;
	}
	public List<ScheduledStatVO> getTodayHourlyStats() {
		return todayHourlyStats;
	}
	public void setTodayHourlyStats(List<ScheduledStatVO> todayHourlyStats) {
		this.todayHourlyStats = todayHourlyStats;
	}
	public String getPercentColor() {
		return percentColor;
	}
	
	public void setTotalStats(String totalStats) {
		this.totalStats = totalStats;
	}
	
	
	
	
}
