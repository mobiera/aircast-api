package com.mobiera.ms.mno.aircast.stats;

import java.util.ArrayList;
import java.util.List;

public class StatUtil {

	public static List<String> convertLongListToStringList(List<Long> list) {
		
		if (list == null) return null;
		
		List<String> stringList = new ArrayList<String>(list.size());
		
		for (Long l: list) {
			stringList.add(l.toString());
		}
		
		return stringList;
		
	}
	
	
	public static List<Long> convertStringListToLongList(List<String> list) {
		
		if (list == null) return null;
		
		List<Long> stringList = new ArrayList<Long>(list.size());
		
		for (String l: list) {
			stringList.add(Long.parseLong(l));
		}
		
		return stringList;
		
	}
}
