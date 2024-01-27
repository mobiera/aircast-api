package com.mobiera.ms.mno.aircast.test;

import com.mobiera.ms.mno.aircast.api.util.BrowserUtil;

public class TestBrowserQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String disabled = "1:1360,1:0";
		
		System.out.println(BrowserUtil.buildSimQueryExclusion(disabled, false, "sim"));
	}

}
