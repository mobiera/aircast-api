package com.mobiera.aircast.api.vo.stats;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class ResidentPreviewVO extends CampaignPreviewVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8651480573091155934L;
	
	
	private static String DEFAULT_TITLE_TEXT = "Menu Entry";
	private static String INSTALLED_TEXT = "installed";
	private static String DELETED_TEXT = "deleted";
	private static String RESIDENT_CAMPAIGN_LABEL_TEXT = "Resident Campaign";
	
	
	
	
	private Integer menuEntry;
	private String menuEntryText;
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastContentUpdateTs;
	private Long attempted = 0l;
	private Long installed = 0l;
	private Long activeDatabase = 0l;
	private Long todayAttempted = 0l;
	private Long todayInstalled = 0l;
	private Boolean visible;
	
	
	
	private String title = DEFAULT_TITLE_TEXT;
	private String belowPercentText = INSTALLED_TEXT;
	private String residentCampaignText = RESIDENT_CAMPAIGN_LABEL_TEXT;
	private String percentText = "+0%";
	private String percentColor = "000000";
	
	private String todayInstalls = "today installs";
	
	
	public String getTitle() {
		return title;
	}
	public String getResidentCampaignText() {
		if (menuEntryText == null)
		return residentCampaignText;
		else return (residentCampaignText + ": " + campaignName);
	}
	
	
	public Instant getLastContentUpdateTs() {
		return lastContentUpdateTs;
	}
	public void setLastContentUpdateTs(Instant lastContentUpdateTs) {
		this.lastContentUpdateTs = lastContentUpdateTs;
	}
	public Long getAttempted() {
		return attempted;
	}
	public void setAttempted(Long attempted) {
		this.attempted = attempted;
	}
	public Long getInstalled() {
		return installed;
	}
	public void setInstalled(Long installed) {
		this.installed = installed;
	}
	
	
	public Integer getMenuEntry() {
		return menuEntry;
	}
	public void setMenuEntry(Integer menuEntry) {
		this.menuEntry = menuEntry;
	}
	public Long getTodayAttempted() {
		return todayAttempted;
	}
	public void setTodayAttempted(Long todayAttempted) {
		this.todayAttempted = todayAttempted;
	}
	public Long getTodayInstalled() {
		return todayInstalled;
	}
	public void setTodayInstalled(Long todayInstalled) {
		this.todayInstalled = todayInstalled;
	}
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
		if (visible != null) {
			if (!visible) {
				this.belowPercentText = DELETED_TEXT;
			}
		}
	}
	public String getBelowPercentText() {
		return belowPercentText;
	}
	public String getMenuEntryText() {
		return menuEntryText;
	}
	public void setMenuEntryText(String menuEntryText) {
		this.menuEntryText = menuEntryText;
		this.title = menuEntryText;
	}
	public String getPercentText() {
		
		if ((installed != null) && (activeDatabase != null) && (activeDatabase != 0)) {
			
			
			float x = installed.floatValue()/activeDatabase.floatValue();
			if (x<0.30) percentColor = RED;
			else if (x<0.60) percentColor = ORANGE;
			else percentColor = GREEN;
			
			if (x>1) x=1;
			percentText = (String.format("%.1f", ((x)*100f)) + "%");
		}
		
		
		return percentText;
	}
	public Long getActiveDatabase() {
		return activeDatabase;
	}
	public String getPercentColor() {
		return percentColor;
	}
	public void setActiveDatabase(Long activeDatabase) {
		this.activeDatabase = activeDatabase;
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
	public String getTodayInstalls() {
		return todayInstalls;
	}
	
	
	
	
}
