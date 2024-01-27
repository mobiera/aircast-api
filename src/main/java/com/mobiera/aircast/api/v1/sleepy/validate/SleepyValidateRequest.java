package com.mobiera.aircast.api.v1.sleepy.validate;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.v1.sleepy.command.ApiSleepyCommand;

@JsonInclude(Include.NON_NULL)
public class SleepyValidateRequest implements Serializable
{
	private static final long serialVersionUID = 5241060034966633234L;
	private ApiSleepyCommand sleepyCommand;
	
	
	public ApiSleepyCommand getSleepyCommand() {
		return sleepyCommand;
	}

	public void setSleepyCommand(ApiSleepyCommand sleepyCommand) {
		this.sleepyCommand = sleepyCommand;
	}

	
	
	
}
