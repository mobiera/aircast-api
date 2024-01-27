package com.mobiera.aircast.commons.enums;




public enum ActionResult {	
	ACTION_RESULT_OK((byte)0x81),
	ACTION_RESULT_BACK((byte)0x82),
	ACTION_RESULT_CANCEL((byte)0x83),
	ACTION_RESULT_TIMEOUT((byte)0x84),
	ACTION_RESULT_ERROR((byte)0x85);
	

	private ActionResult(Byte index){
		this.index = index;
	}

	private Byte index;

	public Byte getIndex(){
		return this.index;
	}

	public static ActionResult getEnum(Byte index){
		if (index == null) return null;

		switch(index){
		
			case (byte)0x81: return ACTION_RESULT_OK;
			case (byte)0x82: return ACTION_RESULT_BACK;
			case (byte)0x83: return ACTION_RESULT_CANCEL;
			case (byte)0x84: return ACTION_RESULT_TIMEOUT;
			case (byte)0x85: return ACTION_RESULT_ERROR;
			case (byte)0x00: return ACTION_RESULT_OK;
			default: return null;
		}
	}
}
