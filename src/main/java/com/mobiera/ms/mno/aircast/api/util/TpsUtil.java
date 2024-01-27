package com.mobiera.ms.mno.aircast.api.util;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import com.mobiera.aircast.api.vo.TpRuleVO;
import com.mobiera.ms.mno.aircast.api.ms.SmppAccountMS;

public class TpsUtil {

	public static Integer getEffectiveTps(SmppAccountMS smppAccount, ZoneId zoneId) {

		Instant instant = Instant.now();

		ZonedDateTime zdt = instant.atZone(zoneId);
		Integer hour = zdt.getHour();
		DayOfWeek day = zdt.getDayOfWeek();
		Integer effectiveTps = null;
		TpRuleVO rule = smppAccount.getDefaultTpRuleVO();

		if (rule == null) return 1;

		switch (day) {
		case MONDAY: { 
			TpRuleVO mday = smppAccount.getDayMonTpRuleVO();
			if (mday != null) rule = mday;
			break;
		}
		case TUESDAY: { 
			TpRuleVO mday = smppAccount.getDayTueTpRuleVO();
			if (mday != null) rule = mday;
			break;
		}
		case WEDNESDAY: { 
			TpRuleVO mday = smppAccount.getDayWedTpRuleVO();
			if (mday != null) rule = mday;
			break;
		}
		case THURSDAY: { 
			TpRuleVO mday = smppAccount.getDayThuTpRuleVO();
			if (mday != null) rule = mday;
			break;
		}
		case FRIDAY: { 
			TpRuleVO mday = smppAccount.getDayFriTpRuleVO();
			if (mday != null) rule = mday;
			break;
		}
		case SATURDAY: { 
			TpRuleVO mday = smppAccount.getDaySatTpRuleVO();
			if (mday != null) rule = mday;
			break;
		}
		case SUNDAY: { 
			TpRuleVO mday = smppAccount.getDaySunTpRuleVO();
			if (mday != null) rule = mday;
			break;
		}
		default: {}
		}


		switch (hour) {
		case 0: effectiveTps = rule.getT00(); break;
		case 1: effectiveTps = rule.getT01(); break;
		case 2: effectiveTps = rule.getT02(); break;
		case 3: effectiveTps = rule.getT03(); break;
		case 4: effectiveTps = rule.getT04(); break;
		case 5: effectiveTps = rule.getT05(); break;
		case 6: effectiveTps = rule.getT06(); break;
		case 7: effectiveTps = rule.getT07(); break;
		case 8: effectiveTps = rule.getT08(); break;
		case 9: effectiveTps = rule.getT09(); break;
		case 10: effectiveTps = rule.getT10(); break;
		case 11: effectiveTps = rule.getT11(); break;
		case 12: effectiveTps = rule.getT12(); break;
		case 13: effectiveTps = rule.getT13(); break;
		case 14: effectiveTps = rule.getT14(); break;
		case 15: effectiveTps = rule.getT15(); break;
		case 16: effectiveTps = rule.getT16(); break;
		case 17: effectiveTps = rule.getT17(); break;
		case 18: effectiveTps = rule.getT18(); break;
		case 19: effectiveTps = rule.getT19(); break;
		case 20: effectiveTps = rule.getT20(); break;
		case 21: effectiveTps = rule.getT21(); break;
		case 22: effectiveTps = rule.getT22(); break;
		case 23: effectiveTps = rule.getT23(); break;
		default :
		}

		if (effectiveTps == null) effectiveTps = 1;


		return effectiveTps;
	}
}
