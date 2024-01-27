package com.mobiera.aircast.api.v1.sim;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.NotifySimVO;

@JsonInclude(Include.NON_NULL)
public class NotifySimRequest implements Serializable
{
	private static final long serialVersionUID = 2241060034966633233L;
	private NotifySimVO sim;
	private Long requestId;
	public final NotifySimVO getSim() {
		return sim;
	}
	public final void setSim(NotifySimVO sim) {
		this.sim = sim;
	}
	public final Long getRequestId() {
		return requestId;
	}
	public final void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	
}
