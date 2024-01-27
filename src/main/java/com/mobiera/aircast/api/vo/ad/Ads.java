package com.mobiera.aircast.api.vo.ad;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Ads implements Serializable {
	private Long lastUpdateTs;
	private List<AdVO> ads;
	public Long getLastUpdateTs() {
		return lastUpdateTs;
	}
	public void setLastUpdateTs(Long lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}
	public List<AdVO> getAds() {
		return ads;
	}
	public void setAds(List<AdVO> ads) {
		this.ads = ads;
	}
	public static Ads create(List<AdVO> adList) {
		Ads ads = new Ads();
		ads.setAds(adList);
		ads.setLastUpdateTs(System.currentTimeMillis());
		return ads;
	}
}
