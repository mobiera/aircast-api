package com.mobiera.ms.mno.aircast.test;

import java.time.Instant;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mobiera.commons.util.JsonUtil;


public class TestJsr310 {

	public static void main(String[] args) throws JsonProcessingException {
		Object sms = new Object();
		sms.setTs(Instant.now());
		
		System.out.println(JsonUtil.serialize(sms, false));
	}

}
