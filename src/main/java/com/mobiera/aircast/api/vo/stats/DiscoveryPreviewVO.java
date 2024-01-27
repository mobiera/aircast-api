package com.mobiera.aircast.api.vo.stats;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DiscoveryPreviewVO extends CampaignPreviewVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8616397438479349815L;
	
	private static String ACTIVE_DATABASE_TEXT = "Active Database";
	private static String TOTAL_DATABASE_TEXT = "Total Database";
	private static String VS_LAST_WEEK_TEXT = "vs. last week";
	private static String X_AXIS_LABEL_TEXT = "Week";
	
	private static String UNKNOWN = "Unknown";
	private static String DEFAULT_TOTAL_DATABASE = "Total Database: Unknown";
	
	
	private String title = ACTIVE_DATABASE_TEXT;
	private String activeDatabaseText = UNKNOWN;
	private String totalDatabaseText = DEFAULT_TOTAL_DATABASE;
	private String vsLastWeekText = VS_LAST_WEEK_TEXT;
	private String xAxisLabel = X_AXIS_LABEL_TEXT;
	private String percentText = "+0%";
	private String percentColor = "000000";
	
	private List<DiscoveryStatVO> stats;
	
	public List<DiscoveryStatVO> getStats() {
		return stats;
	}
	public void setStats(List<DiscoveryStatVO> stats) {
		this.stats = stats;
	}
	public String getPercentText() {
		
		if ((stats != null) && (stats.size() > 1)) {
			DiscoveryStatVO now = stats.get(0);
			Long activeNow = now.getActive();
			DiscoveryStatVO oneWeekAgo = stats.get(1);
			Long activeOneWeekAgo = oneWeekAgo.getActive();
			
			if ((activeNow != null) 
					&& (activeOneWeekAgo != null) 
					&& (activeOneWeekAgo != 0)) {
				
				float x = ((activeNow.floatValue()/activeOneWeekAgo.floatValue())-1)*100f;
				String sign = "";
				if (x>0) {
					sign = "+";
					percentColor = GREEN;
				} else {
					if (x>-0.05f) {
						percentColor = ORANGE;
					} else {
						percentColor = RED;
					}
					
				}
				return (sign + String.format("%.1f", x) + "%");
				
			} 
			
		}
		
		return percentText;
	}
	
	public String getVsLastWeekText() {
		return vsLastWeekText;
	}
	public String getxAxisLabel() {
		return xAxisLabel;
	}
	public String getTitle() {
		return title;
	}
	public String getActiveDatabaseText() {
		if ((stats != null) && (stats.size()>0)) {
			DiscoveryStatVO stat = stats.get(0);
			if (stat.getActive() != null) {
				return String.format("%,1d", stat.getActive());
			}
			
		}
		return activeDatabaseText;
	}
	public String getTotalDatabaseText() {
		if ((stats != null) && (stats.size()>0)) {
			DiscoveryStatVO stat = stats.get(0);
			if (stat.getTotal() != null) {
				return (TOTAL_DATABASE_TEXT + ": " + String.format("%,1d", stat.getTotal()));
			}
			
		}
		return totalDatabaseText;
	}
	public String getPercentColor() {
		getPercentText();
		return percentColor;
	}
	
	
	
	
}
