package com.mobiera.aircast.api.v1.ustk;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class MenuRequest extends UstkRequest
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	
	private String text1;
	@Required
	private String title2;
	@Required
	@Validator(minSize=1, maxSize=8)
	private List<Item> items;
	private Boolean useExperimentalFeatures;
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
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
	
	
	
	@Override
	@JsonIgnore
	public String getOptionalParam() {
		return MENU_REQUEST;
	}
	public Boolean getUseExperimentalFeatures() {
		return useExperimentalFeatures;
	}
	public void setUseExperimentalFeatures(Boolean useExperimentalFeatures) {
		this.useExperimentalFeatures = useExperimentalFeatures;
	}
	
	
}
