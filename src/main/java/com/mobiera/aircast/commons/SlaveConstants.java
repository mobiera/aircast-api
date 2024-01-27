package com.mobiera.aircast.commons;

import java.util.ArrayList;
import java.util.List;

import com.mobiera.aircast.commons.enums.CampaignType;
import com.mobiera.commons.enums.EntityState;

public class SlaveConstants extends com.mobiera.commons.SlaveConstants{
	public static final byte[] DEFAULT_KEY = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
			0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
	
	/*public static DateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("EEE, d MMM yy HH:mm Z");
	public static DateFormat DEFAULT_HOUR_DATE_FORMAT = new SimpleDateFormat("EEE, d MMM yy HH:mm Z");
	public static DateFormat DEFAULT_DAY_DATE_FORMAT = new SimpleDateFormat("EEE, d MMM yy Z");
	
	public static final String STAT_DATE_HEADER_LABEL = "date";
	*/
	
	public static final byte SLEEPY_RESPONSE_EXEC_OK 					= 0;
	public static final byte SLEEPY_RESPONSE_EXEC_ERR_CMD_NOT_SUPPORTED 	= 1;
	public static final byte SLEEPY_RESPONSE_EXEC_ERR_WRONG_SESSION_ID 		= 2;
	public static final byte SLEEPY_RESPONSE_EXEC_ERR_WRONG_PROTOCOL_VER 	= 3;
	public static final byte SLEEPY_RESPONSE_EXEC_ERR_CMD_FAILED 			= 4;
	public static final byte SLEEPY_RESPONSE_EXEC_ERR_WRONG_RSP_PARAMS 		= 5;
	public static final byte SLEEPY_RESPONSE_EXEC_ERR_UNSPECIFIED 			= 6;
	public static final byte SLEEPY_RESPONSE_EXEC_ERR_RSP_FAILED 			= 7;
	public static final byte SLEEPY_RESPONSE_EXEC_ERR_CMD_ABORTED			= 8;
	public final static byte SLEEPY_RESPONSE_CIPHER_ERROR_CODE = 0x20;
	
	
	private static SlaveConstants INSTANCE = null;
	
	public final static String alfd = "D";
	
	public final static String[] purge= { "2yeh98sqs9g9a" , "0217YAUpUYGYUAVVz", "7wPfqiueg97wAqZ", "392gggABbaUBVAyuvva",
			"Qa7&3deAdbDSef"
	};

	public static final short KEYWORD_TRIGGER_THREAD_NUMBER_OFFSET = 1024;

	public static final short CAMPAIGN_TESTING_THREAD_NUMBER_OFFSET = 2048;

	private static List<EntityState> CAMPAIGN_RESPONSE_ALLOWED_STATES = null;
	
	
	public static SlaveConstants getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SlaveConstants();
		}
		return INSTANCE;
	}
	
	public List<EntityState> getCampaignResponseAllowedStates() {
		if (CAMPAIGN_RESPONSE_ALLOWED_STATES == null) {
			CAMPAIGN_RESPONSE_ALLOWED_STATES = new ArrayList<EntityState>(2);
			CAMPAIGN_RESPONSE_ALLOWED_STATES.add(EntityState.ENABLED);
			CAMPAIGN_RESPONSE_ALLOWED_STATES.add(EntityState.PAUSED);
			
		}
		return CAMPAIGN_RESPONSE_ALLOWED_STATES;
		
	}

	private static List<CampaignType> API_CAMPAIGN_TYPES = null;
	
	public List<CampaignType> getSessionedCampaignTypes() {
		if (API_CAMPAIGN_TYPES == null) {
			API_CAMPAIGN_TYPES = new ArrayList<CampaignType>(7);
			API_CAMPAIGN_TYPES.add(CampaignType.AUTH_API);
			API_CAMPAIGN_TYPES.add(CampaignType.USTK_API);
			API_CAMPAIGN_TYPES.add(CampaignType.SLEEPY_API);
			API_CAMPAIGN_TYPES.add(CampaignType.SLEEPY);
			API_CAMPAIGN_TYPES.add(CampaignType.SLEEPY_FLOW);
			API_CAMPAIGN_TYPES.add(CampaignType.RAW);
			API_CAMPAIGN_TYPES.add(CampaignType.USTK);
		}
		return API_CAMPAIGN_TYPES;
	}
	
	private static List<CampaignType> SYSTEM_CAMPAIGN_TYPES = null;
	
	public List<CampaignType> getSystemCampaignTypes() {
		if (SYSTEM_CAMPAIGN_TYPES == null) {
			SYSTEM_CAMPAIGN_TYPES = new ArrayList<CampaignType>(2);
			SYSTEM_CAMPAIGN_TYPES.add(CampaignType.RAM);
			SYSTEM_CAMPAIGN_TYPES.add(CampaignType.RFM);
		}
		return SYSTEM_CAMPAIGN_TYPES;
	}
	
	
	private static List<CampaignType> MASSIVE_CAMPAIGN_TYPES = null;
	
	public List<CampaignType> getMassiveCampaignTypes() {
		
		if (MASSIVE_CAMPAIGN_TYPES == null) {
			MASSIVE_CAMPAIGN_TYPES = new ArrayList<CampaignType>(6);
			MASSIVE_CAMPAIGN_TYPES.add(CampaignType.RAM);
			MASSIVE_CAMPAIGN_TYPES.add(CampaignType.RFM);
			MASSIVE_CAMPAIGN_TYPES.add(CampaignType.SLEEPY);
			MASSIVE_CAMPAIGN_TYPES.add(CampaignType.SLEEPY_FLOW);
			MASSIVE_CAMPAIGN_TYPES.add(CampaignType.RAW);
			MASSIVE_CAMPAIGN_TYPES.add(CampaignType.USTK);
		}
		return MASSIVE_CAMPAIGN_TYPES;
	}
	

}
