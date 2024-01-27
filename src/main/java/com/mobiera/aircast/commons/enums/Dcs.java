package com.mobiera.aircast.commons.enums;

import java.io.Serializable;


public enum Dcs implements Serializable {
	
	DCS_DEFAULT_ALPHABET((byte)0),
	DCS_IA5((byte)1),
	DCS_8BIT_TDMA((byte)2),
	DCS_LATIN1((byte)3),
	DCS_8_BIT_DATA((byte)4),
	DCS_JIS((byte)5),
	DCS_CYRILLIC((byte)6),
	DCS_HEBREW((byte)7),
	DCS_UCS2((byte)8),
	DCS_PICTO((byte)9),
	DCS_MUSIC((byte)10),
	DCS_RSRVD((byte)11),
	DCS_RSRVD2((byte)12),
	DCS_EXKANJI((byte)13),
	DCS_KSC5601((byte)14),
	DCS_RSRVD3((byte)15),
	DCS_SIM_APPLET((byte)246);

	private Dcs(Byte index){
		this.index = index;
	}

	private Byte index;

	public Byte getIndex(){
		return this.index;
	}

	public static Dcs getEnum(Byte index){
		if (index == null) return null;

		switch(index){
		case (byte)0: return DCS_DEFAULT_ALPHABET;
		case (byte)1: return DCS_IA5;
		case (byte)2: return DCS_8BIT_TDMA;
		case (byte)3: return DCS_LATIN1;
		case (byte)4: return DCS_8_BIT_DATA;
		case (byte)5: return DCS_JIS;
		case (byte)6: return DCS_CYRILLIC;
		case (byte)7: return DCS_HEBREW;
		case (byte)8: return DCS_UCS2;
		case (byte)9: return DCS_PICTO;
		case (byte)10: return DCS_MUSIC;
		case (byte)11: return DCS_RSRVD;
		case (byte)12: return DCS_RSRVD2;
		case (byte)13: return DCS_EXKANJI;
		case (byte)14: return DCS_KSC5601;
		case (byte)15: return DCS_RSRVD3;
		case (byte)246: return DCS_SIM_APPLET;
		
		default: return null;
		}
	}

}