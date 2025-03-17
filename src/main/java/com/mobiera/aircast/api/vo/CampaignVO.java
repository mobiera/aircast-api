package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.api.vo.ad.AdVO;
import com.mobiera.aircast.commons.enums.AckType;
import com.mobiera.aircast.commons.enums.AdType;
import com.mobiera.aircast.commons.enums.CampaignListType;
import com.mobiera.aircast.commons.enums.CampaignManagement;
import com.mobiera.aircast.commons.enums.CampaignPriority;
import com.mobiera.aircast.commons.enums.CampaignType;
import com.mobiera.aircast.commons.enums.ImpactPolicy;
import com.mobiera.aircast.commons.enums.RamCommand;
import com.mobiera.aircast.commons.enums.RfmCommand;
import com.mobiera.aircast.commons.enums.SleepyFlowType;
import com.mobiera.aircast.commons.enums.SubscriberPlan;
import com.mobiera.aircast.commons.enums.SubscriberType;
import com.mobiera.aircast.commons.enums.TriggeredAction;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Knowledge;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Condition;
import com.mobiera.commons.introspection.Conditions;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.DisplayWhen;
import com.mobiera.commons.introspection.Expertise;
import com.mobiera.commons.introspection.Filter;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.SectionEnum;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;
import com.mobiera.ms.mno.aircast.api.util.FileUtil;
import com.mobiera.ms.mno.api.json.MmsMedia;

@JsonInclude(Include.NON_NULL)

@Label(singular="Campaign", plural="Campaigns", newEntityLabel="New Campaign", newEntityDescription="Create a new Campaign")
@Description(data="Campaigns are used to push interactive flows to Users, install resident SIM menu entries flows, or execute maintenance flows transparent to Users.")
@SectionEnum(name="CampaignSection")
public class CampaignVO implements Serializable {

	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String title;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String description;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String label;
	
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	// Agregar Categoría de Campaña.

	private static final long serialVersionUID = 286608528040069273L;
	@Section(name = "BASIC_INFORMATION")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	private Long id;
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="Creator", description="Creator")
	@Section( name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="UserVO")
	private String user;

	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="Group", description="Group")
	@Section( name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="GroupVO")
	private String group;

	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	@Section(name = "BASIC_INFORMATION")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Created", 
			description="Created")
	private Instant createdTs;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Name", 
			description="Name of Campaign")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=100)
	private String name;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Description", 
			description="Description of Campaign")
	@Section(name = "BASIC_INFORMATION")
	// @Required
	@Validator(minSize=0, maxSize=250)
	private String campaignDescription;

	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="Refusal Reason", 
	description="Refusal Reason")
	@Section(name = "BASIC_INFORMATION")
	// @Required
	@Validator(minSize=0, maxSize=250)
	// @DisplayWhen({
	// @Conditions({
	// 	@Condition(field="state", values = {"REFUSED"})
	// })
	// })
	private String comments;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Campaign Type", 
			description="Campaign Type")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Expertise(knowledge = Knowledge.CONFIRMED)
	@Validator(allowedValues = {"ADVERTISING", "SLEEPY", "USTK", "RAM", "SMS", "MMS", "SLEEPY_API", "USTK_API", "SMS_API", "MMS_API", "SLEEPY_FLOW", "ADVERTISING", "DISCOVERY"})
	private CampaignType type;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sender", 
			description="Sender")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="SenderVO")
	@Filter(field="state", values = { "ENABLED" })
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Long senderFk;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Shortcode", 
			description="Shortcode")
	@Section(name = "BASIC_INFORMATION")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private String shortcode;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Maximum TPS", 
			description="Maximum TPS")
	@Section(name = "BASIC_INFORMATION")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Long maxTPS;

	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Smpp Account", 
			description="Smpp Account")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="SmppAccountVO")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Long smppAccountFk;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Management", 
			description="Campaign Management")
	@Section(name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "USTK", "RAW", "SMS", "MMS", "SLEEPY_FLOW", "ADVERTISING"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	@Required
	private CampaignManagement management;
	
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	@UI( widgetType = WidgetType.DATE, 
	mode = Mode.READ_WRITE, 
	label="Run From", 
	description="Run From")
	@Section(name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"PERMANENT", "SCHEDULED"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Instant runFromTs;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	@UI( widgetType = WidgetType.DATE, 
	mode = Mode.READ_WRITE, 
	label="Run Until", 
	description="Run Until")
	@Section(name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"PERMANENT", "SCHEDULED"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Instant runUntilTs;
	
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Priority", 
			description="Priority")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(allowedValues = {"HIGH", "LOW"})
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "USTK", "RAM", "SMS", "MMS", "RAW", "SLEEPY_FLOW", "ADVERTISING"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private CampaignPriority priority;
	
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Endpoint", 
			description="Notification Endpoint")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="EndpointVO")
	@Filter(field="type", values = { "CAMPAIGN" })
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMS_API", "MMS_API", "SLEEPY_API", "USTK_API"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Long endpointFk;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Keyword", 
			description="Keyword to send to shortcode to test campaign")
	@Section(name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "USTK", "RAM", "RAW", "RFM", "SMS", "MMS", "SLEEPY_FLOW", "ADVERTISING"})
		})
	})
	private String testKeyword;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Keyword Action", 
			description="When user sends MO to shortcode and keyword is detected, selected action is performed")
	@Section(name = "BASIC_INFORMATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "USTK", "RAM", "RAW", "RFM", "SMS", "MMS", "SLEEPY_FLOW", "ADVERTISING"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private TriggeredAction keywordAction;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Validity Period", 
			description="Optional SMS validity period. Will work only if SMSC supports it")
	@Section(name = "BASIC_INFORMATION")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Long validityPeriod;
	
	/*
	 * SMS API
	 */
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="MO Forwarding", 
			description="MO Forwarding means received MOs will be forwarded to a configured Endpoint")
	@Section(name = "SMS_API_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMS_API"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Boolean moForwarding;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Treat Dcs 04 As Gsm8 Text", 
			description="Treat Dcs 04 As Gsm8 Text")
	@Section(name = "SMS_API_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="moForwarding", values = {"true"}),
			@Condition(field="type", values = {"SMS_API"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Boolean moForwardingTreatDcs04AsGsm8Text;
	
	
	/*
	 * MMS
	 */
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Mms Client Endpoint", 
			description="Mms Client Endpoint")
	@Section(name = "MMS_CONFIGURATION")
	@TargetClass(type=ClassType.VO, name="EndpointVO")
	@Filter(field="type", values = { "MM7" })
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"MMS", "MMS_API"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	@Required
	private Long mmsClientEndpointFk;

	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Mms Subject", 
			description="Mms Subject")
	@Section(name = "MMS_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"MMS"})
		})
	})
	@Required
	@Validator(minSize=1, maxSize=40)
	private String mmsSubject;
	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Mms Text", 
			description="Mms Text")
	@Section(name = "MMS_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"MMS"})
		})
	})
	@Required
	@Validator(minSize=1, maxSize=40)
	private String mmsText;
	
	
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_WRITE, 
			label="Medias", 
			description="Medias")
	@Section(name = "MMS_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"MMS"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	@Validator(minSize=0, maxSize=5)
	private List<MmsMedia> medias;
	
	
	/*
	 * SMS
	 */
	
	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Sms Text", 
			description="Sms Text")
	@Section(name = "SMS_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMS"})
		})
	})
	@Required
	private String smsText;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Flash Sms", 
			description="Flash Sms")
	@Section(name = "SMS_CONFIGURATION")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SMS"})
		})
	})
	@Validator(defaultValue="FALSE")
	@Required
	private Boolean flashSms;
	
	
	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Json", 
			description="Json")
	@Section(name = "CAMPAIGN_FLOW")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "USTK"})
		})
	})
	private String json;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Raw Applet", 
			description="Raw Applet to use for RAW Campaign")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"RAW"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Long rawAppletFk;
	
	@UI( widgetType = WidgetType.HEX_TEXT, 
			mode = Mode.READ_WRITE, 
			label="Raw Data", 
			description="Raw Data to send")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"RAW"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private byte[] rawData;
	
	
	
	/*
	 * ADVANCED
	 */
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_ONLY, 
			label="Template", 
			description="Flag this campaign as template")
	@Section(name = "ADVANCED")
	//@Validator(defaultValue="false")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"ADVERTISING", "SMS", "MMS"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Boolean template;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Historize Pattern", 
			description="Historize Pattern. Do not set unless you know what you're doing!")
	@Section(name = "ADVANCED")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private String historizePattern;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Ack Type", 
			description="Ack Type for packet delivery report")
	@Section(name = "ADVANCED")
	@Validator(defaultValue="SMSC_DLR")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private AckType ackType;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Rerun when content update", 
			description="Rerun when content update. Do not set unless you know what you're doing!")
	@Section(name = "ADVANCED")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "USTK", "RAW", "SMS", "MMS", "SLEEPY_FLOW"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Boolean rerunWhenContentUpdate;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Resend Even If Existing PA", 
			description="Resend Even If user already accepted the campaign (Existing PA)")
	@Section(name = "ADVANCED")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"ADVERTISING"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Boolean resendEvenIfExistingPa;
	
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Unchanged Content Always Resend", 
			description="Unchanged Content Always Resend. Do not set unless you know what you're doing!")
	@Section(name = "ADVANCED")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "USTK", "RAW", "SMS", "MMS", "SLEEPY_FLOW"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Boolean unchangedContentAlwaysResend;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Min Applet Version", 
			description="Min Applet Version. Do not set unless you know what you're doing!")
	@Section(name = "ADVANCED")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "SLEEPY_FLOW"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Short minBrowserVersion;
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Min Menu Buffer Size", 
			description="Min Menu Buffer Size. Do not set unless you know what you're doing!")
	@Section(name = "ADVANCED")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "SLEEPY_FLOW"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Integer minMenuBufferSize;
	
	
	
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="On Success Run Campaign", 
			description="If this campaign is successfull, chain to this Campaign")
	@TargetClass(type=ClassType.VO, name="CampaignVO")
	@Filter(field="management", values = { "TRIGGERED", "SCHEDULED" })
	@Section(name = "ADVANCED")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "SMS", "MMS", "SLEEPY_FLOW"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Long onSuccessRunCampaignId;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="On Success run after N days", 
			description="Run Campaign after N days")
	@Section(name = "ADVANCED")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY", "SMS", "MMS", "SLEEPY_FLOW"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Integer onSuccessRunCampaignAfterNDays;
	
	
	/*
	 * WHITE / BLACK LISTS
	 */
	
	@Section(name = "TARGET_USERS")
	@UI( widgetType = WidgetType.SELECT, 
	mode = Mode.READ_WRITE, 
	label="List Type", 
	description="type of list that will be used in campaign")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"SCHEDULED"})
			,
			@Condition(field="type", values = {"SLEEPY_FLOW", "SMS", "MMS", "USTK", "SLEEPY", "ADVERTISING"})
		})
	})
	private CampaignListType listType;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Policy", 
			description="Select an impact policy for this campaign")
	@Section(name = "TARGET_USERS")
	/*@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="listType", values = {"FULL_DB", "FULL_DB_WITH_BLACK_LISTS"})
		})
	})*/
	private ImpactPolicy policy;
	
	
	
	@Section(name = "TARGET_USERS")
	@UI( widgetType = WidgetType.BAG, 
	mode = Mode.READ_WRITE, 
	label="White Lists", 
	description="White Lists of Campaign")
	@TargetClass(type=ClassType.VO, name="UploadedFileVO")
	@Filter(field="type", values = { "LIST" })
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"SCHEDULED"})
			,
			@Condition(field="listType", values = {"WHITE_LISTS", "WHITE_AND_BLACK_LISTS"})
		})
	})
	private List<Long> whiteLists;
	
	
	@Section(name = "TARGET_USERS")
	@UI( widgetType = WidgetType.SELECT, 
	mode = Mode.READ_WRITE, 
	label="Custom List", 
	description="Custom List, with optional magic patterns")
	@TargetClass(type=ClassType.VO, name="UploadedFileVO")
	@Filter(field="type", values = { "CUSTOM_LIST" })
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"SCHEDULED"})
			,
			@Condition(field="listType", values = {"CUSTOM_USER_DATA_SINGLE_LIST"})
		})
	})
	private Long customListFk;
	
	@Section(name = "ADS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="Custom Attributes", 
	description="Custom Attributes")
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"SCHEDULED"})
			,
			@Condition(field="listType", values = {"CUSTOM_USER_DATA_SINGLE_LIST"})
		})
	})
	private String customListHeader;
	
	
	@Section(name = "TARGET_USERS")
	@UI( widgetType = WidgetType.BAG, 
	mode = Mode.READ_WRITE, 
	label="Black Lists", 
	description="Black Lists of Campaign")
	@TargetClass(type=ClassType.VO, name="UploadedFileVO")
	@Filter(field="type", values = { "LIST" })
	@DisplayWhen({
		@Conditions({
			
			@Condition(field="listType", values = {"FULL_DB_WITH_BLACK_LISTS", "WHITE_AND_BLACK_LISTS"})
		})
	})
	private List<Long> blackLists;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="List Size", 
			description="Number of entry in this list")
	@Section(name = "TARGET_USERS")
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"SCHEDULED"})
			,
			@Condition(field="listType", values = {"WHITE_LISTS", "WHITE_AND_BLACK_LISTS", "CUSTOM_USER_DATA_SINGLE_LIST"})
		})
	})
	private Long listSize;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="List Current Position", 
			description="Current Position in List for this Campaign")
	@Section(name = "TARGET_USERS")
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"SCHEDULED"})
			,
			@Condition(field="listType", values = {"WHITE_LISTS", "WHITE_AND_BLACK_LISTS", "CUSTOM_USER_DATA_SINGLE_LIST"})
		})
	})
	private Long listPosition;
	
	
	
	
	
	@UI( widgetType = WidgetType.SELECT_MULTIPLE, 
			mode = Mode.READ_WRITE, 
			label="Subscriber Plan Exclude", 
			description="Users with these Subscriber Plan would be excluded from campaign")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private List<SubscriberPlan> subscriberPlanExclude;
	
	
	@UI( widgetType = WidgetType.SELECT_MULTIPLE, 
			mode = Mode.READ_WRITE, 
			label="Subscriber Type Exclude", 
			description="Users with these Subscriber Type would be excluded from campaign")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private List<SubscriberType> subscriberTypeExclude;
	
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Tp Ad Allowed Condition", 
			description="Third Party advertising flag must be set to this Condition for a given User to qualify for this Campaign.")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private com.mobiera.commons.enums.Condition tpAdAllowedCondition;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="MNO Ad Allowed Condition", 
			description="MNO advertising flag must be set to this Condition for a given User to qualify for this Campaign.")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private com.mobiera.commons.enums.Condition mnoAdAllowedCondition;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="State1 Condition", 
			description="State1 flag must be set to this Condition for a given User to qualify for this Campaign.")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private com.mobiera.commons.enums.Condition state1Condition;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="State2 Condition", 
			description="State2 flag must be set to this Condition for a given User to qualify for this Campaign.")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private com.mobiera.commons.enums.Condition state2Condition;
	
	
	@UI( widgetType = WidgetType.SELECT_MULTIPLE, 
			mode = Mode.READ_WRITE, 
			label="TP Ad Exclude Conditions", 
			description="TP advertising flag must NOT be set to these Conditions for a given User to qualify for this Campaign.")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private List<com.mobiera.commons.enums.Condition> tpAdExclude;
	
	@UI( widgetType = WidgetType.SELECT_MULTIPLE, 
			mode = Mode.READ_WRITE, 
			label="MNO Ad Exclude Conditions", 
			description="MNO advertising flag must NOT be set to these Conditions for a given User to qualify for this Campaign.")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private List<com.mobiera.commons.enums.Condition> mnoAdExclude;
	
	@UI( widgetType = WidgetType.SELECT_MULTIPLE, 
			mode = Mode.READ_WRITE, 
			label="State1 Exclude Conditions", 
			description="State1 flag must NOT be set to these Conditions for a given User to qualify for this Campaign.")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private List<com.mobiera.commons.enums.Condition> state1Exclude;
	
	@UI( widgetType = WidgetType.SELECT_MULTIPLE, 
			mode = Mode.READ_WRITE, 
			label="State2 Exclude Conditions", 
			description="State2 flag must NOT be set to these Conditions for a given User to qualify for this Campaign.")
	@Section(name = "TARGET_USERS")
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private List<com.mobiera.commons.enums.Condition> state2Exclude;
	
	
	/*
	 * RAM
	 */
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Ram Command", 
			description="Ram Command")
	@Section(name = "RAM_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"RAM"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private RamCommand ramCmd;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Rfm Command", 
			description="Ram Command")
	@Section(name = "RFM_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"RFM"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private RfmCommand rfmCmd;
	
		
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastSuccessTs;
	
	@JsonIgnore 
	private Long runSuccessValidityMillis;
	
	private Instant lastContentUpdate;
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant deletedTs;

	
	@UI( widgetType = WidgetType.TABLE, 
			mode = Mode.READ_WRITE, 
			label="Ram Applet Install Sim Profile Configurations", 
			description="Ram Applet Install Sim Profile Configurations")
	@Section(name = "RAM_CONFIGURATION")
	@Required
	@Validator(minSize=1)
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"RAM"}),
			@Condition(field="ramCmd", values = {"LOAD_AND_INSTALL"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private List<RamInstallParametersVO> ramInstallParameters;
	
	@UI( widgetType = WidgetType.TABLE, 
			mode = Mode.READ_WRITE, 
			label="Ram Applet Delete Sim Profile Configurations", 
			description="Ram Applet Delete Sim Profile Configurations")
	@Section(name = "RAM_CONFIGURATION")
	@Required
	@Validator(minSize=1)
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"RAM"}),
			@Condition(field="ramCmd", values = {"DELETE"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private List<RamDeleteParametersVO> ramDeleteParameters;
	
	
	
	/*
	 * 
	 * STK / FLOW
	 */
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sleepy Flow Type", 
			description="Tyope of Sleepy Flow. RESIDENT to assign scenario to SIM entry, PUSH for a push campaign.")
	@Section(name = "SLEEPY_FLOW_CONFIGURATION")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY_FLOW"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private SleepyFlowType sleepyFlowType;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Menu Entry", 
			description="Type of Sleepy Flow. RESIDENT to assign scenario to SIM entry, PUSH for a push campaign.")
	@Section(name = "SLEEPY_FLOW_CONFIGURATION")
	@Required
	@Validator(minValue="0", maxValue="15")
	@DisplayWhen({
		@Conditions({
			@Condition(field="sleepyFlowType", values = {"RESIDENT"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Integer menuEntry;
	
	@Section(name = "SLEEPY_FLOW_CONFIGURATION")
	@UI( widgetType = WidgetType.CHECKBOX, 
	mode = Mode.READ_WRITE, 
	label="Menu Entry Visible", 
	description="true if menu entry should be visible, lse false.")
	@Required
	@Validator(minValue="0", maxValue="15")
	@DisplayWhen({
		@Conditions({
			@Condition(field="sleepyFlowType", values = {"RESIDENT"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Boolean menuEntryVisibility;
	
	@Section(name = "SLEEPY_FLOW_CONFIGURATION")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_WRITE, 
	label="Menu Entry Label", 
	description="text that will be assigned to meny entry")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="sleepyFlowType", values = {"RESIDENT"})
		})
	})
	@Validator(minSize=1, maxSize=32)
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private String menuEntryLabel;
	
	@Section(name = "SLEEPY_FLOW_CONFIGURATION")
	@UI( widgetType = WidgetType.CHECKBOX, 
	mode = Mode.READ_WRITE, 
	label="Historize User Response", 
	description="true or false.")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="sleepyFlowType", values = {"PUSH"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private Boolean historizeUserResp;
	
	@Section(name = "SLEEPY_FLOW_CONFIGURATION")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_WRITE, 
	label="Output Variable Name", 
	description="name output variable that will be used in sleepy flow")
	@Required
	@Validator(defaultValue="output")
	@DisplayWhen({
		@Conditions({
			@Condition(field="sleepyFlowType", values = {"PUSH"})
		})
	})
	@Expertise(knowledge = Knowledge.CONFIRMED)
	private String outputVariable;
	
	
	@Section(name = "SLEEPY_FLOW_ACTIONS")
	@UI( widgetType = WidgetType.SPECIAL, 
	mode = Mode.READ_WRITE, 
	label="Sleepy Flow Actions", 
	description="Actions of Sleepy Flow")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"SLEEPY_FLOW"})
		})
	})
	private List<StkActionVO> sleepyFlowActions;
	
	
	@Section(name = "ADS")
	@UI( widgetType = WidgetType.SELECT, 
	mode = Mode.READ_WRITE, 
	label="Ad Type", 
	description="Ad Type")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"ADVERTISING"})
		})
	})
	private AdType adType;
	
	
	
	@Section(name = "ADS")
	@UI( widgetType = WidgetType.SPECIAL, 
	mode = Mode.READ_WRITE, 
	label="Ads", 
	description="Ads")
	@Required
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"ADVERTISING"}),
			@Condition(field="adType", values = {"TEXT", "MENU", "URL", "CALL", "USSD", "MO"})
		})
	})
	private List<AdVO> ads;
	
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="Today Sent", 
	description="Today Sent")
	private String todaySent;
	
	
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="Today Delivered", 
	description="Today Delivered")
	private String todayDelivered;
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="Today Viewed", 
	description="Today Viewed")
	private String todayViewed;

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="Today Ctr", 
	description="Today Ctr")
	private String todayCtr;

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="All Time Sent", 
	description="All Time  Sent")
	private String allTimeSent;
	
	
	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="All Time Delivered", 
	description="All Time Delivered")
	private String allTimeDelivered;

	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="All Time Viewed", 
	description="All Time Viewed")
	private String allTimeViewed;

	
	@Section(name = "KPIS")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="All Time Ctr", 
	description="All Time Ctr")
	private String allTimeCtr;

	
	
	private Float todayEfficiency; // percent
	private Float allTimeEfficiency; // percent

	private Long countedImpactables;
	private Long countedAlives;
	private Long countedDone;
	private String countedError;
	private Boolean countedFinished;
	private Instant countedFinishedTs;
	
	
	
	

	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_ONLY, 
			label="Recalculate available users", 
			description="Recalculate available users")
	@Section(name = "MENU")
	private Boolean recalcAvailableUsers;
		
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_ONLY, 
			label="Refresh", 
			description="Refresh")
	@Section(name = "MENU")
	private Boolean refresh;

	@UI( widgetType = WidgetType.SPECIAL, 
	mode = Mode.READ_ONLY, 
	label="To refuse campaign", 
	description="To refuse campaign")
	@Section(name = "MENU")
	private Boolean refuseCampaign;

	
		/*@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Ignore Impact Policy", 
			description="User can receive the campaign even if marketing impact policy prevent it")
	@Section(name = "ADVANCED")
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"SCHEDULED"})
			,
			@Condition(field="listType", values = {"WHITE_LIST", "BLACK_LIST", "CAMPAIGN_LIST"})
		})
	})
	
	private Boolean ignorePolicy;
	*/
	/*
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Minimum Interval bw 2 impacts (days)", 
			description="Minimum number of days for a given User to be able to receive the same campaign")
	@Section(name = "ADVANCED")
	@DisplayWhen({
		@Conditions({
			@Condition(field="management", values = {"SCHEDULED"}),
			@Condition(field="type", values = {"SLEEPY", "SMS", "SLEEPY_FLOW", "USTK"})
		})
	})
	private Integer minIntervalBwTwoImpacts;
	*/
	
	
	private List<EntityState> allowedTransitionStates;
	private List<SenderVO> allowedSenders;

	public List<SenderVO> getAllowedSenders() {
		return allowedSenders;
	}

	public void setAllowedSenders(List<SenderVO> allowedSenders) {
		this.allowedSenders = allowedSenders;
	}

	public Long getMaxTPS() {
		return maxTPS;
	}

	public void setMaxTPS(Long maxTPS) {
		this.maxTPS = maxTPS;
	}

	public Boolean getRefuseCampaign() {
		return refuseCampaign;
	}

	public void setRefuseCampaign(Boolean refuseCampaign) {
		this.refuseCampaign = refuseCampaign;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getCampaignDescription() {
		return campaignDescription;
	}

	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public EntityState getState() {
		return state;
	}

	public void setState(EntityState state) {
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CampaignType getType() {
		return type;
	}

	public void setType(CampaignType type) {
		this.type = type;
	}

	public String getShortcode() {
		return shortcode;
	}

	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

	public Long getSenderFk() {
		return senderFk;
	}

	public void setSenderFk(Long senderFk) {
		this.senderFk = senderFk;
	}

	public Long getSmppAccountFk() {
		return smppAccountFk;
	}

	public void setSmppAccountFk(Long smppAccountFk) {
		this.smppAccountFk = smppAccountFk;
	}

	public CampaignManagement getManagement() {
		return management;
	}

	public void setManagement(CampaignManagement management) {
		this.management = management;
	}

	public Instant getRunFromTs() {
		return runFromTs;
	}

	public void setRunFromTs(Instant runFromTs) {
		this.runFromTs = runFromTs;
	}

	public Instant getRunUntilTs() {
		return runUntilTs;
	}

	public void setRunUntilTs(Instant runUntilTs) {
		this.runUntilTs = runUntilTs;
	}

	public CampaignPriority getPriority() {
		return priority;
	}

	public void setPriority(CampaignPriority priority) {
		this.priority = priority;
	}

	public Long getEndpointFk() {
		return endpointFk;
	}

	public void setEndpointFk(Long endpointFk) {
		this.endpointFk = endpointFk;
	}

	public String getTestKeyword() {
		return testKeyword;
	}

	public void setTestKeyword(String testKeyword) {
		this.testKeyword = testKeyword;
	}

	public TriggeredAction getKeywordAction() {
		return keywordAction;
	}

	public void setKeywordAction(TriggeredAction keywordAction) {
		this.keywordAction = keywordAction;
	}

	public Long getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(Long validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Boolean getMoForwarding() {
		return moForwarding;
	}

	public void setMoForwarding(Boolean moForwarding) {
		this.moForwarding = moForwarding;
	}

	public Boolean getMoForwardingTreatDcs04AsGsm8Text() {
		return moForwardingTreatDcs04AsGsm8Text;
	}

	public void setMoForwardingTreatDcs04AsGsm8Text(Boolean moForwardingTreatDcs04AsGsm8Text) {
		this.moForwardingTreatDcs04AsGsm8Text = moForwardingTreatDcs04AsGsm8Text;
	}

	public String getSmsText() {
		return smsText;
	}

	public void setSmsText(String smsText) {
		this.smsText = smsText;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getHistorizePattern() {
		return historizePattern;
	}

	public void setHistorizePattern(String historizePattern) {
		this.historizePattern = historizePattern;
	}

	public Boolean getRerunWhenContentUpdate() {
		return rerunWhenContentUpdate;
	}

	public void setRerunWhenContentUpdate(Boolean rerunWhenContentUpdate) {
		this.rerunWhenContentUpdate = rerunWhenContentUpdate;
	}

	public Boolean getUnchangedContentAlwaysResend() {
		return unchangedContentAlwaysResend;
	}

	public void setUnchangedContentAlwaysResend(Boolean unchangedContentAlwaysResend) {
		this.unchangedContentAlwaysResend = unchangedContentAlwaysResend;
	}

	public Short getMinBrowserVersion() {
		return minBrowserVersion;
	}

	public void setMinBrowserVersion(Short minBrowserVersion) {
		this.minBrowserVersion = minBrowserVersion;
	}

	public Integer getMinMenuBufferSize() {
		return minMenuBufferSize;
	}

	public void setMinMenuBufferSize(Integer minMenuBufferSize) {
		this.minMenuBufferSize = minMenuBufferSize;
	}

	public List<SubscriberPlan> getSubscriberPlanExclude() {
		return subscriberPlanExclude;
	}

	public void setSubscriberPlanExclude(List<SubscriberPlan> subscriberPlanExclude) {
		this.subscriberPlanExclude = subscriberPlanExclude;
	}

	public List<SubscriberType> getSubscriberTypeExclude() {
		return subscriberTypeExclude;
	}

	public void setSubscriberTypeExclude(List<SubscriberType> subscriberTypeExclude) {
		this.subscriberTypeExclude = subscriberTypeExclude;
	}

	public com.mobiera.commons.enums.Condition getTpAdAllowedCondition() {
		return tpAdAllowedCondition;
	}

	public void setTpAdAllowedCondition(com.mobiera.commons.enums.Condition tpAdAllowedCondition) {
		this.tpAdAllowedCondition = tpAdAllowedCondition;
	}

	public com.mobiera.commons.enums.Condition getMnoAdAllowedCondition() {
		return mnoAdAllowedCondition;
	}

	public void setMnoAdAllowedCondition(com.mobiera.commons.enums.Condition mnoAdAllowedCondition) {
		this.mnoAdAllowedCondition = mnoAdAllowedCondition;
	}

	public List<com.mobiera.commons.enums.Condition> getTpAdExclude() {
		return tpAdExclude;
	}

	public void setTpAdExclude(List<com.mobiera.commons.enums.Condition> tpAdExclude) {
		this.tpAdExclude = tpAdExclude;
	}

	public List<com.mobiera.commons.enums.Condition> getMnoAdExclude() {
		return mnoAdExclude;
	}

	public void setMnoAdExclude(List<com.mobiera.commons.enums.Condition> mnoAdExclude) {
		this.mnoAdExclude = mnoAdExclude;
	}

	public RamCommand getRamCmd() {
		return ramCmd;
	}

	public void setRamCmd(RamCommand ramCmd) {
		this.ramCmd = ramCmd;
	}

	public RfmCommand getRfmCmd() {
		return rfmCmd;
	}

	public void setRfmCmd(RfmCommand rfmCmd) {
		this.rfmCmd = rfmCmd;
	}

	public Instant getLastSuccessTs() {
		return lastSuccessTs;
	}

	public void setLastSuccessTs(Instant lastSuccessTs) {
		this.lastSuccessTs = lastSuccessTs;
	}

	public Long getRunSuccessValidityMillis() {
		return runSuccessValidityMillis;
	}

	public void setRunSuccessValidityMillis(Long runSuccessValidityMillis) {
		this.runSuccessValidityMillis = runSuccessValidityMillis;
	}

	public AckType getAckType() {
		return ackType;
	}

	public void setAckType(AckType ackType) {
		this.ackType = ackType;
	}

	public Instant getLastContentUpdate() {
		return lastContentUpdate;
	}

	public void setLastContentUpdate(Instant lastContentUpdate) {
		this.lastContentUpdate = lastContentUpdate;
	}

	public Instant getDeletedTs() {
		return deletedTs;
	}

	public void setDeletedTs(Instant deletedTs) {
		this.deletedTs = deletedTs;
	}

	public List<RamInstallParametersVO> getRamInstallParameters() {
		return ramInstallParameters;
	}

	public void setRamInstallParameters(List<RamInstallParametersVO> ramInstallParameters) {
		this.ramInstallParameters = ramInstallParameters;
	}

	public List<RamDeleteParametersVO> getRamDeleteParameters() {
		return ramDeleteParameters;
	}

	public void setRamDeleteParameters(List<RamDeleteParametersVO> ramDeleteParameters) {
		this.ramDeleteParameters = ramDeleteParameters;
	}

	public Long getRawAppletFk() {
		return rawAppletFk;
	}

	public void setRawAppletFk(Long rawAppletFk) {
		this.rawAppletFk = rawAppletFk;
	}

	public byte[] getRawData() {
		return rawData;
	}

	public void setRawData(byte[] rawData) {
		this.rawData = rawData;
	}

	

	

	public CampaignListType getListType() {
		return listType;
	}

	public void setListType(CampaignListType listType) {
		this.listType = listType;
	}

	public SleepyFlowType getSleepyFlowType() {
		return sleepyFlowType;
	}

	public void setSleepyFlowType(SleepyFlowType sleepyFlowType) {
		this.sleepyFlowType = sleepyFlowType;
	}

	public Integer getMenuEntry() {
		return menuEntry;
	}

	public void setMenuEntry(Integer menuEntry) {
		this.menuEntry = menuEntry;
	}

	public Boolean getMenuEntryVisibility() {
		return menuEntryVisibility;
	}

	public void setMenuEntryVisibility(Boolean menuEntryVisibility) {
		this.menuEntryVisibility = menuEntryVisibility;
	}

	public String getMenuEntryLabel() {
		return menuEntryLabel;
	}

	public void setMenuEntryLabel(String menuEntryLabel) {
		this.menuEntryLabel = menuEntryLabel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}

	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}

	public Boolean getHistorizeUserResp() {
		return historizeUserResp;
	}

	public void setHistorizeUserResp(Boolean historizeUserResp) {
		this.historizeUserResp = historizeUserResp;
	}

	public List<StkActionVO> getSleepyFlowActions() {
		return sleepyFlowActions;
	}

	public void setSleepyFlowActions(List<StkActionVO> sleepyFlowActions) {
		this.sleepyFlowActions = sleepyFlowActions;
	}

	public String getOutputVariable() {
		return outputVariable;
	}

	public void setOutputVariable(String outputVariable) {
		this.outputVariable = outputVariable;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Long> getWhiteLists() {
		return whiteLists;
	}

	public void setWhiteLists(List<Long> whiteLists) {
		this.whiteLists = whiteLists;
	}

	public List<Long> getBlackLists() {
		return blackLists;
	}

	public void setBlackLists(List<Long> blackLists) {
		this.blackLists = blackLists;
	}

	public Instant getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(Instant createdTs) {
		this.createdTs = createdTs;
	}

	public com.mobiera.commons.enums.Condition getState1Condition() {
		return state1Condition;
	}

	public void setState1Condition(com.mobiera.commons.enums.Condition state1Condition) {
		this.state1Condition = state1Condition;
	}

	public com.mobiera.commons.enums.Condition getState2Condition() {
		return state2Condition;
	}

	public void setState2Condition(com.mobiera.commons.enums.Condition state2Condition) {
		this.state2Condition = state2Condition;
	}

	public List<com.mobiera.commons.enums.Condition> getState1Exclude() {
		return state1Exclude;
	}

	public void setState1Exclude(List<com.mobiera.commons.enums.Condition> state1Exclude) {
		this.state1Exclude = state1Exclude;
	}

	public List<com.mobiera.commons.enums.Condition> getState2Exclude() {
		return state2Exclude;
	}

	public void setState2Exclude(List<com.mobiera.commons.enums.Condition> state2Exclude) {
		this.state2Exclude = state2Exclude;
	}

	
	public Long getOnSuccessRunCampaignId() {
		return onSuccessRunCampaignId;
	}

	public void setOnSuccessRunCampaignId(Long onSuccessRunCampaignId) {
		this.onSuccessRunCampaignId = onSuccessRunCampaignId;
	}

	public Integer getOnSuccessRunCampaignAfterNDays() {
		return onSuccessRunCampaignAfterNDays;
	}

	public void setOnSuccessRunCampaignAfterNDays(Integer onSuccessRunCampaignAfterNDays) {
		this.onSuccessRunCampaignAfterNDays = onSuccessRunCampaignAfterNDays;
	}

	
	public List<AdVO> getAds() {
		return ads;
	}

	public void setAds(List<AdVO> ads) {
		this.ads = ads;
	}

	public ImpactPolicy getPolicy() {
		return policy;
	}

	public void setPolicy(ImpactPolicy policy) {
		this.policy = policy;
	}

	public Long getCustomListFk() {
		return customListFk;
	}

	public void setCustomListFk(Long customListFk) {
		this.customListFk = customListFk;
	}

	public Long getListSize() {
		return listSize;
	}

	public void setListSize(Long listSize) {
		this.listSize = listSize;
	}

	public Long getListPosition() {
		return listPosition;
	}

	public void setListPosition(Long listPosition) {
		this.listPosition = listPosition;
	}

	public AdType getAdType() {
		return adType;
	}

	public void setAdType(AdType adType) {
		this.adType = adType;
	}

	public Boolean getTemplate() {
		return template;
	}

	public void setTemplate(Boolean template) {
		this.template = template;
	}

	public String getCustomListHeader() {
		return customListHeader;
	}

	public void setCustomListHeader(String customListHeader) {
		this.customListHeader = customListHeader;
	}

	@JsonIgnore
	private String[] parsedHeader = null;
	
	public String customizeText(String text, String customData, String separator) {
		if (text == null) return null;
		if (customListHeader == null) return text;
		if (customData == null) return text;
		if (parsedHeader == null) {
			parsedHeader = customListHeader.split(separator);
		}
		if (parsedHeader.length == 0) return text;

		
		String[] parsedCustomData = FileUtil.getInstance().splitLine(customData, separator);
		
		
		//String[] parsedCustomData = customData.split(separator);
		for (int i=0; i<parsedHeader.length; i++) {
			String currentAttribute = parsedHeader[i];
			if ((currentAttribute != null) && (!currentAttribute.isBlank())) {
				String targetReplacement = "";
				if ((i+1) <= parsedCustomData.length) {
					targetReplacement = parsedCustomData[i];
				}
				text = text.replaceAll("\\{" + currentAttribute + "\\}", targetReplacement);
			}
		}
		text = text.replaceAll("\\{", "").replaceAll("\\}", "");
		text = text.replaceAll("\\\\n", "\n");
		return text;
	}
// 
	public String getTodaySent() {
		return todaySent;
	}

	public void setTodaySent(String todaySent) {
		this.todaySent = todaySent;
	}

	public String getTodayDelivered() {
		return todayDelivered;
	}

	public void setTodayDelivered(String todayDelivered) {
		this.todayDelivered = todayDelivered;
	}

	

	public String getTodayCtr() {
		return todayCtr;
	}

	public void setTodayCtr(String todayCtr) {
		this.todayCtr = todayCtr;
	}

	public String getAllTimeSent() {
		return allTimeSent;
	}

	public void setAllTimeSent(String allTimeSent) {
		this.allTimeSent = allTimeSent;
	}

	public String getAllTimeDelivered() {
		return allTimeDelivered;
	}

	public void setAllTimeDelivered(String allTimeDelivered) {
		this.allTimeDelivered = allTimeDelivered;
	}

	

	public String getAllTimeCtr() {
		return allTimeCtr;
	}

	public void setAllTimeCtr(String allTimeCtr) {
		this.allTimeCtr = allTimeCtr;
	}

	public Float getTodayEfficiency() {
		return todayEfficiency;
	}

	public void setTodayEfficiency(Float todayEfficiency) {
		this.todayEfficiency = todayEfficiency;
	}

	public Float getAllTimeEfficiency() {
		return allTimeEfficiency;
	}

	public void setAllTimeEfficiency(Float allTimeEfficiency) {
		this.allTimeEfficiency = allTimeEfficiency;
	}

	public String[] getParsedHeader() {
		return parsedHeader;
	}

	public void setParsedHeader(String[] parsedHeader) {
		this.parsedHeader = parsedHeader;
	}

	public void setTodayViewed(String todayViewed) {
		this.todayViewed = todayViewed;
	}

	public void setAllTimeViewed(String allTimeViewed) {
		this.allTimeViewed = allTimeViewed;
	}

	public String getTodayViewed() {
		return todayViewed;
	}

	public String getAllTimeViewed() {
		return allTimeViewed;
	}

	public Boolean getResendEvenIfExistingPa() {
		return resendEvenIfExistingPa;
	}

	public void setResendEvenIfExistingPa(Boolean resendEvenIfExistingPa) {
		this.resendEvenIfExistingPa = resendEvenIfExistingPa;
	}

	public Boolean getFlashSms() {
		return flashSms;
	}

	public void setFlashSms(Boolean flashSms) {
		this.flashSms = flashSms;
	}

	public Boolean getRecalcAvailableUsers() {
		return recalcAvailableUsers;
	}

	public void setRecalcAvailableUsers(Boolean recalcAvailableUsers) {
		this.recalcAvailableUsers = recalcAvailableUsers;
	}

	public Long getCountedImpactables() {
		return countedImpactables;
	}

	public void setCountedImpactables(Long countedImpactables) {
		this.countedImpactables = countedImpactables;
	}

	public Long getCountedAlives() {
		return countedAlives;
	}

	public void setCountedAlives(Long countedAlives) {
		this.countedAlives = countedAlives;
	}

	public Long getCountedDone() {
		return countedDone;
	}

	public void setCountedDone(Long countedDone) {
		this.countedDone = countedDone;
	}

	public String getCountedError() {
		return countedError;
	}

	public void setCountedError(String countedError) {
		this.countedError = countedError;
	}

	public Boolean getCountedFinished() {
		return countedFinished;
	}

	public void setCountedFinished(Boolean countedFinished) {
		this.countedFinished = countedFinished;
	}

	public Instant getCountedFinishedTs() {
		return countedFinishedTs;
	}

	public void setCountedFinishedTs(Instant countedFinishedTs) {
		this.countedFinishedTs = countedFinishedTs;
	}

	public Boolean getRefresh() {
		return refresh;
	}

	public void setRefresh(Boolean refresh) {
		this.refresh = refresh;
	}

	public boolean isStkCampaign() {
		boolean retval = false;
		if (type != null) {
			switch (type) {
			case SLEEPY:
			case SLEEPY_API:
			case USTK:
			case USTK_API:
			case SLEEPY_FLOW:
			case ADVERTISING: {
				retval = true;
				break;
			}
			default: {break;}
			}
		}
		return retval;
	}

	public String getMmsSubject() {
		return mmsSubject;
	}

	public void setMmsSubject(String mmsSubject) {
		this.mmsSubject = mmsSubject;
	}

	public String getMmsText() {
		return mmsText;
	}

	public void setMmsText(String mmsText) {
		this.mmsText = mmsText;
	}

	public Long getMmsClientEndpointFk() {
		return mmsClientEndpointFk;
	}

	public void setMmsClientEndpointFk(Long mmsClientEndpointFk) {
		this.mmsClientEndpointFk = mmsClientEndpointFk;
	}

	public List<MmsMedia> getMedias() {
		return medias;
	}

	public void setMedias(List<MmsMedia> medias) {
		this.medias = medias;
	}
	
	
}
