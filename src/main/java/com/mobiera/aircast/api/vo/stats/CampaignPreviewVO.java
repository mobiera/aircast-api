package com.mobiera.aircast.api.vo.stats;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.mobiera.aircast.commons.enums.CampaignType;


@JsonInclude(Include.NON_NULL)
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
@Type(value = ApiPreviewVO.class),
@Type(value = DiscoveryPreviewVO.class),
@Type(value = ResidentPreviewVO.class),
@Type(value = ScheduledPreviewVO.class),
@Type(value = SimOsPreviewVO.class),
})
public abstract class CampaignPreviewVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static String RED = "ff2b2b";
	protected static String GREEN = "09e359";
	protected static String ORANGE = "ff8bfe";
	protected static String BLACK = "000000";
	
	protected static String TEST_PHRASE = "To test, text KEYWORD to SHORTCODE";
	
	protected Long campaignId;
	protected CampaignType campaignType;
	protected String campaignName;
	
	
	protected String testKeyword;
	

	protected String shortcode;
	protected String testPhrase;
	
	
	
	
	public Long getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	public CampaignType getCampaignType() {
		return campaignType;
	}
	public void setCampaignType(CampaignType campaignType) {
		this.campaignType = campaignType;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
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
}
