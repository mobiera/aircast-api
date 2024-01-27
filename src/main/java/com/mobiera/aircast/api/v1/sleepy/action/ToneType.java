package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;


public enum ToneType implements Serializable {
	
	STANDARD_DIAL((byte)1),
	STANDARD_CALLED_SUBSCRIBER_BUSY((byte)2),
	STANDARD_CONGESTION((byte)3),
	STANDARD_RADIO_PATH_ACK((byte)4),
	STANDARD_RADIO_PATH_NA((byte)5),
	STANDARD_ERROR((byte)6),
	STANDARD_CALL_WAITING((byte)7),
	STANDARD_RINGING_TONE((byte)8),
	
	TERMINAL_GENERAL_BEEP((byte)10),
	TERMINAL_POSITIVE_ACK((byte)11),
	TERMINAL_NEGATIVE_ACK((byte)12),
	TERMINAL_USER_RINGING_TONE((byte)13),
	TERMINAL_USER_SMS_TONE((byte)14),
	TERMINAL_CRITICAL_ALERT((byte)15),
	TERMINAL_VIBRATE_ONLY((byte)20),

	
	THEMED_HAPPY((byte)30),
	THEMED_SAD((byte)31),
	THEMED_URGENT_ACTION((byte)32),
	THEMED_QUESTION((byte)33),
	THEMED_MSG_RECEIVED((byte)34),
	
	MELODY_1((byte)40),
	MELODY_2((byte)41),
	MELODY_3((byte)42),
	MELODY_4((byte)43),
	MELODY_5((byte)44),
	MELODY_6((byte)45),
	MELODY_7((byte)46),
	MELODY_8((byte)47);
	
	

	private ToneType(Byte index){
		this.index = index;
	}

	private Byte index;

	public Byte getIndex(){
		return this.index;
	}

	public static ToneType getEnum(Byte index){
		if (index == null) return null;

		switch(index){
		case (byte)1: return STANDARD_DIAL;
		case (byte)2: return STANDARD_CALLED_SUBSCRIBER_BUSY;
		case (byte)3: return STANDARD_CONGESTION;
		case (byte)4: return STANDARD_RADIO_PATH_ACK;
		case (byte)5: return STANDARD_RADIO_PATH_NA;
		case (byte)6: return STANDARD_ERROR;
		case (byte)7: return STANDARD_CALL_WAITING;
		case (byte)8: return STANDARD_RINGING_TONE;
		
		case (byte)10: return TERMINAL_GENERAL_BEEP;
		case (byte)11: return TERMINAL_POSITIVE_ACK;
		case (byte)12: return TERMINAL_NEGATIVE_ACK;
		case (byte)13: return TERMINAL_USER_RINGING_TONE;
		case (byte)14: return TERMINAL_USER_SMS_TONE;
		case (byte)15: return TERMINAL_CRITICAL_ALERT;
		case (byte)20: return TERMINAL_VIBRATE_ONLY;
		
		case (byte)30: return THEMED_HAPPY;
		case (byte)31: return THEMED_SAD;
		case (byte)32: return THEMED_URGENT_ACTION;
		case (byte)33: return THEMED_QUESTION;
		case (byte)34: return THEMED_MSG_RECEIVED;
		
		case (byte)40: return MELODY_1;
		case (byte)41: return MELODY_2;
		case (byte)42: return MELODY_3;
		case (byte)43: return MELODY_4;
		case (byte)44: return MELODY_5;
		case (byte)45: return MELODY_6;
		case (byte)46: return MELODY_7;
		case (byte)47: return MELODY_8;
		
		default: return null;
		}
	}

}