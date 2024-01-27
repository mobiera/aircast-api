package com.mobiera.aircast.api.vo.ad;

import java.text.DecimalFormat;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat decFormat = new DecimalFormat("#.#%");
		
		System.out.println(decFormat.format(0.0005d));
	}

}
