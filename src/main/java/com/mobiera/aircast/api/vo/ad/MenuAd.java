package com.mobiera.aircast.api.vo.ad;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class MenuAd extends AdVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Text #1", 
			description="Text of Optin #1")
	@Validator(minSize=1, maxSize=272)
	private String text1;
	
	@Required
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXTAREA, 
	mode = Mode.READ_WRITE, 
	label="Title #2", 
	description="Title of Menu Action")
	@Validator(minSize=1, maxSize=272)
	private String title2;
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_WRITE, 
			label="Items", 
			description="Items")
	@Section(name = "CREATIVES")
	@Required
	@Validator(minSize=1, maxSize=8)
	private List<MenuAdItem> items;
	
	public List<MenuAdItem> getItems() {
		return items;
	}
	public void setItems(List<MenuAdItem> items) {
		this.items = items;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public String getText1() {
		return text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}
	
	
	
	
	
}
