package com.mobiera.aircast.api.vo.stats;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SimOsPreviewVO extends CampaignPreviewVO {

	private static final long serialVersionUID = -8651480573091155934L;
	
	
	private static String DEFAULT_TITLE_TEXT = "SimOS Campaign";
	private static String BELOW_TITLE_LABEL_TEXT = "SimOS Campaign - ";
	private static String INSTALLED_TEXT = "installed";
	private static String TWENTY_FOUR_HOURS_INSTALLS_TEXT = "24h installs";
	
	
	
	private Long succeded = 0l;
	
	private Long todayAttempted = 0l;
	private Long todaySucceded = 0l;
	
	private Long yesterdayAttempted = 0l;
	private Long yesterdaySucceded = 0l;
	
	private Long twentyForHourAttempted = 0l;
	private Long twentyForHourSucceded = 0l;
	
	private Long sevenDaysAgoAttempted = 0l;
	private Long sevenDaysAgoSucceded = 0l;
	
	
	private String title = DEFAULT_TITLE_TEXT;
	private String belowTitle = BELOW_TITLE_LABEL_TEXT;
	private String installedText = INSTALLED_TEXT;
	private String twentyFourInstallsText = TWENTY_FOUR_HOURS_INSTALLS_TEXT;
	
	
	
	
	public Long getSucceded() {
		return succeded;
	}
	public void setSucceded(Long succeded) {
		this.succeded = succeded;
	}
	public Long getTodayAttempted() {
		return todayAttempted;
	}
	public void setTodayAttempted(Long todayAttempted) {
		this.todayAttempted = todayAttempted;
	}
	public Long getTodaySucceded() {
		return todaySucceded;
	}
	public void setTodaySucceded(Long todaySucceded) {
		this.todaySucceded = todaySucceded;
	}
	public Long getTwentyForHourAttempted() {
		return twentyForHourAttempted;
	}
	public void setTwentyForHourAttempted(Long twentyForHourAttempted) {
		this.twentyForHourAttempted = twentyForHourAttempted;
	}
	public Long getTwentyForHourSucceded() {
		return twentyForHourSucceded;
	}
	public void setTwentyForHourSucceded(Long twentyForHourSucceded) {
		this.twentyForHourSucceded = twentyForHourSucceded;
	}
	public Long getSevenDaysAgoAttempted() {
		return sevenDaysAgoAttempted;
	}
	public void setSevenDaysAgoAttempted(Long sevenDaysAgoAttempted) {
		this.sevenDaysAgoAttempted = sevenDaysAgoAttempted;
	}
	public Long getSevenDaysAgoSucceded() {
		return sevenDaysAgoSucceded;
	}
	public void setSevenDaysAgoSucceded(Long sevenDaysAgoSucceded) {
		this.sevenDaysAgoSucceded = sevenDaysAgoSucceded;
	}
	public Long getYesterdayAttempted() {
		return yesterdayAttempted;
	}
	public void setYesterdayAttempted(Long yesterdayAttempted) {
		this.yesterdayAttempted = yesterdayAttempted;
	}
	public Long getYesterdaySucceded() {
		return yesterdaySucceded;
	}
	public void setYesterdaySucceded(Long yesterdaySucceded) {
		this.yesterdaySucceded = yesterdaySucceded;
	}
	public String getTitle() {
		return title;
	}
	public String getBelowTitle() {
		if (campaignType != null) {
			belowTitle = BELOW_TITLE_LABEL_TEXT + " " + campaignType;
 		}
		return belowTitle;
	}
	public String getInstalledText() {
		return installedText;
	}
	public String getTwentyFourInstallsText() {
		return twentyFourInstallsText;
	}
	public String getTestKeyword() {
		return testKeyword;
	}
	public void setTestKeyword(String testKeyword) {
		this.testKeyword = testKeyword;
	}
	public String getShortcode() {
		return shortcode;
	}
	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}
	
	
	
	
}
