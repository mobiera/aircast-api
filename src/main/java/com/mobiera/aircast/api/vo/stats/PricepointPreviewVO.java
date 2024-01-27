package com.mobiera.aircast.api.vo.stats;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.mobiera.aircast.commons.enums.CampaignType;


@JsonInclude(Include.NON_NULL)

public class PricepointPreviewVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static String RED = "ff2b2b";
	protected static String GREEN = "09e359";
	protected static String ORANGE = "ff8bfe";
	protected static String BLACK = "000000";
	
	protected static String TEST_PHRASE = "To test, text KEYWORD to SHORTCODE";
	
	
	
	
	protected Long pricepointId;
	protected String pricepointName;
	
	
	protected String testKeyword;
	

	protected String shortcode;
	protected String testPhrase;
	
	
	private List<VasStatVO> dailyStats;
	
	
	/*
	 * 
	 * granularity: DAY
	 * 
	 * show total database and variation vs last week
	 * 
	 * Graphic #1
	 * show per day: subscribed, unsubscribed
	 * 
	 * Grafic #2
	 * show per day: charged
	 * 
	 */
	
	
	private String GRAPHIC1_X_AXIS_LABEL = "Day";
	private String GRAPHIC1_DATA1_LABEL = "susbscribed";
	private String GRAPHIC1_DATA2_LABEL = "unsusbscribed";
	
	private String GRAPHIC2_X_AXIS_LABEL = "Day";
	private String GRAPHIC2_DATA1_LABEL = "charged";
	
	
	private String graphic1XAxisLabel;
	private String graphic1Data1Label;
	private String graphic1Data2Label;
	
	private String graphic2XAxisLabel;
	private String graphic2Data1Label;
	
	
	public String getTestPhrase() {
		if ((testKeyword != null) && (shortcode != null)) {
			return TEST_PHRASE.replace("KEYWORD", testKeyword).replace("SHORTCODE", shortcode);
		}
		return null;
		
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

	public Long getPricepointId() {
		return pricepointId;
	}

	public void setPricepointId(Long pricepointId) {
		this.pricepointId = pricepointId;
	}

	public String getPricepointName() {
		return pricepointName;
	}

	public void setPricepointName(String pricepointName) {
		this.pricepointName = pricepointName;
	}

	public List<VasStatVO> getDailyStats() {
		return dailyStats;
	}

	public void setDailyStats(List<VasStatVO> dailyStats) {
		this.dailyStats = dailyStats;
	}

	public String getGraphic1XAxisLabel() {
		return graphic1XAxisLabel;
	}

	public void setGraphic1XAxisLabel(String graphic1xAxisLabel) {
		graphic1XAxisLabel = graphic1xAxisLabel;
	}

	public String getGraphic1Data1Label() {
		return graphic1Data1Label;
	}

	public void setGraphic1Data1Label(String graphic1Data1Label) {
		this.graphic1Data1Label = graphic1Data1Label;
	}

	public String getGraphic1Data2Label() {
		return graphic1Data2Label;
	}

	public void setGraphic1Data2Label(String graphic1Data2Label) {
		this.graphic1Data2Label = graphic1Data2Label;
	}

	public String getGraphic2XAxisLabel() {
		return graphic2XAxisLabel;
	}

	public void setGraphic2XAxisLabel(String graphic2xAxisLabel) {
		graphic2XAxisLabel = graphic2xAxisLabel;
	}

	public String getGraphic2Data1Label() {
		return graphic2Data1Label;
	}

	public void setGraphic2Data1Label(String graphic2Data1Label) {
		this.graphic2Data1Label = graphic2Data1Label;
	}

	
}
