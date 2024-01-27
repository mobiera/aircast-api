package com.mobiera.aircast.api.vo.stats;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ApiPreviewVO extends CampaignPreviewVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8651480573091155934L;
	
	private static String DEFAULT_TITLE_TEXT = "Api Campaign";
	private static String BELOW_PERCENT_TEXT = "vs. 7 days ago";
	private static String TWENTY_FOUR_TEXT = "24h usage";
	private static String SENT_TEXT = "Sent";
	private static String DELIVERED_TEXT = "Delivered";
	private static String RECEIVED_TEXT = "Received";
	private static String DEFAULT_STAT_DATA_TEXT = "No stat data yet";
	
	
	
	
	private Long todaySent = 0l;
	private Long todayDelivered = 0l;
	private Long todayRecv = 0l;
	
	private Long twentyForHourSent = 0l;
	private Long twentyForHourDelivered = 0l;
	private Long twentyForHourRecv = 0l;
	
	private Long yesterdaySent = 0l;
	private Long yesterdayDelivered = 0l;
	private Long yesterdayRecv = 0l;
	
	private Long sevenDaysAgoSent = 0l;
	private Long sevenDaysAgoDelivered = 0l;
	private Long sevenDaysAgoRecv = 0l;
	
	
	private String title = DEFAULT_TITLE_TEXT;
	private String belowPercentText = BELOW_PERCENT_TEXT;
	private String twentyFourText = TWENTY_FOUR_TEXT;
	private String percentText;
	private String percentColor;
	
	private String statData = DEFAULT_STAT_DATA_TEXT;
	
	
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
	public Long getTodayRecv() {
		return todayRecv;
	}
	public void setTodayRecv(Long todayRecv) {
		this.todayRecv = todayRecv;
	}
	public Long getTwentyForHourSent() {
		return twentyForHourSent;
	}
	public void setTwentyForHourSent(Long twentyForHourSent) {
		this.twentyForHourSent = twentyForHourSent;
	}
	public Long getTwentyForHourDelivered() {
		return twentyForHourDelivered;
	}
	public void setTwentyForHourDelivered(Long twentyForHourDelivered) {
		this.twentyForHourDelivered = twentyForHourDelivered;
	}
	public Long getTwentyForHourRecv() {
		return twentyForHourRecv;
	}
	public void setTwentyForHourRecv(Long twentyForHourRecv) {
		this.twentyForHourRecv = twentyForHourRecv;
	}
	public Long getYesterdaySent() {
		return yesterdaySent;
	}
	public void setYesterdaySent(Long yesterdaySent) {
		this.yesterdaySent = yesterdaySent;
	}
	public Long getYesterdayDelivered() {
		return yesterdayDelivered;
	}
	public void setYesterdayDelivered(Long yesterdayDelivered) {
		this.yesterdayDelivered = yesterdayDelivered;
	}
	public Long getYesterdayRecv() {
		return yesterdayRecv;
	}
	public void setYesterdayRecv(Long yesterdayRecv) {
		this.yesterdayRecv = yesterdayRecv;
	}
	public Long getSevenDaysAgoSent() {
		return sevenDaysAgoSent;
	}
	public void setSevenDaysAgoSent(Long sevenDaysAgoSent) {
		this.sevenDaysAgoSent = sevenDaysAgoSent;
	}
	public Long getSevenDaysAgoDelivered() {
		return sevenDaysAgoDelivered;
	}
	public void setSevenDaysAgoDelivered(Long sevenDaysAgoDelivered) {
		this.sevenDaysAgoDelivered = sevenDaysAgoDelivered;
	}
	public Long getSevenDaysAgoRecv() {
		return sevenDaysAgoRecv;
	}
	public void setSevenDaysAgoRecv(Long sevenDaysAgoRecv) {
		this.sevenDaysAgoRecv = sevenDaysAgoRecv;
	}
	public String getTitle() {
		if (campaignName != null) return campaignName;
		return title;
	}
	public String getBelowPercentText() {
		return belowPercentText;
	}
	public String getTwentyFourText() {
		return twentyFourText;
	}
	public String getStatData() {
		boolean ok = false;
		String retval = "";
		boolean first = true;
		if ( (twentyForHourSent != null) && (twentyForHourSent.longValue() != 0l)) {
			retval = retval + SENT_TEXT + ": " + String.format("%,1d", twentyForHourSent);
			
			ok = true;
			first = false;
		}
		if ((twentyForHourDelivered != null) && (twentyForHourDelivered.longValue() != 0l)) {
			if (first) {
				first = false;
				
			} else {
				retval = retval + " ";
			}
			retval = retval + DELIVERED_TEXT + ": " + String.format("%,1d", twentyForHourDelivered);
			ok = true;
		}
		if ((twentyForHourRecv != null) && (twentyForHourRecv.longValue() != 0)) {
			if (first) {
				first = false;
				
			} else {
				retval = retval + " ";
			}
			retval = retval + RECEIVED_TEXT + ": " + String.format("%,1d", twentyForHourRecv);
			ok = true;
		}
		if (ok) return retval;
		return statData;
	}
	public String getPercentText() {
		
		if ( (sevenDaysAgoSent != null) && (sevenDaysAgoSent.longValue() != 0l)) {
			
			
			float x = ((twentyForHourSent.floatValue()/sevenDaysAgoSent.floatValue())-1)*100f;
			String sign = "";
			if (x>0) {
				sign = "+";
				percentColor = GREEN;
			} else if (x<0) {
				percentColor = ORANGE;
			}
			return (sign + String.format("%.1f", x )+ "%");
			
			
		} else if ( (twentyForHourSent!= null  ) && (twentyForHourSent.longValue() != 0l) ){
			percentColor = GREEN;
			return "+∞";
		}
		
		return "0%";
	}
	public String getPercentColor() {
		
		getPercentText();
		
		
		return percentColor;
	}
	
	
	
	
	
}
