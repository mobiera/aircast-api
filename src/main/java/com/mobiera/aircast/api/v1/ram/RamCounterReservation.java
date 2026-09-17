package com.mobiera.aircast.api.v1.ram;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * Atomically reserved range of 03.48 counter values for one sim.
 */
@JsonInclude(Include.NON_NULL)
public class RamCounterReservation implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long simId;
	/** First counter value of the reserved range **/
	private Long counterBase;
	/** Number of counter values reserved **/
	private Integer count;

	public Long getSimId() {
		return simId;
	}
	public void setSimId(Long simId) {
		this.simId = simId;
	}

	public Long getCounterBase() {
		return counterBase;
	}
	public void setCounterBase(Long counterBase) {
		this.counterBase = counterBase;
	}

	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}

}
