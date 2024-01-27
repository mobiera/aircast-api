package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.ms.mno.api.enums.OfferPeriodicity;

@JsonInclude(Include.NON_NULL)
public class Offer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1963753607055593636L;
	private UUID id;
	private Double price;
	private String currency;
	private OfferPeriodicity periodicity;
	private Boolean partialCharging;
	private Boolean complementCharging;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public OfferPeriodicity getPeriodicity() {
		return periodicity;
	}
	public void setPeriodicity(OfferPeriodicity periodicity) {
		this.periodicity = periodicity;
	}
	public Boolean getPartialCharging() {
		return partialCharging;
	}
	public void setPartialCharging(Boolean partialCharging) {
		this.partialCharging = partialCharging;
	}
	public Boolean getComplementCharging() {
		return complementCharging;
	}
	public void setComplementCharging(Boolean complementCharging) {
		this.complementCharging = complementCharging;
	}
}
