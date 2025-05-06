package com.mobiera.aircast.api.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jboss.logging.Logger;

public class RoleUtil  {

	
	public static boolean ENABLED_SECURITY = true;
	public static RoleUtil instance = null;
	
	
	public static Map<String, Role> roles = null;
	public static List<Role> roleList = null;
	
	public static Role UI_USER = new Role("ui-user", "Access Aircast UI", new ArrayList<Role>(0));
	
	public static Role APPLET_LIST = new Role("applet-list", "List Applets", new ArrayList<Role>(0));
	public static Role APPLET_VIEW = new Role("applet-view", "View an Applet", new ArrayList<Role>(0));
	public static Role APPLET_SAVE = new Role("applet-save", "Save an Applet", new ArrayList<Role>(0));
	
	public static Role CAMPAIGN_LIST = new Role("campaign-list", "List Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_VIEW = new Role("campaign-view", "View a Campaign", new ArrayList<Role>(0));
	public static Role CAMPAIGN_SAVE = new Role("campaign-save", "Save a Campaign", new ArrayList<Role>(0));
	
	
	private static final Logger logger = Logger.getLogger("RoleUtil");
	
	
	
	
	
	public static Role CAMPAIGN_TYPE_SYSTEM_DECIDER = new Role("campaign-type-system-decider", "Approve and Manage System Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_SYSTEM_PREPARER = new Role("campaign-type-system-preparer", "Prepare System Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_SYSTEM_VIEWER = new Role("campaign-type-system-viewer", "View a System Campaign", new ArrayList<Role>(0));
	
	public static Role CAMPAIGN_TYPE_API_DECIDER = new Role("campaign-type-api-decider", "Approve and Manage API Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_API_PREPARER = new Role("campaign-type-api-preparer", "Prepare API Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_API_VIEWER = new Role("campaign-type-api-viewer", "View an API Campaigns", new ArrayList<Role>(0));
	
	public static Role CAMPAIGN_TYPE_AD_DECIDER = new Role("campaign-type-ad-decider", "Approve and Manage Advertising Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_AD_PREPARER = new Role("campaign-type-ad-preparer", "Prepare Advertising Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_AD_VIEWER = new Role("campaign-type-ad-viewer", "View an Advertising Campaign", new ArrayList<Role>(0));
	
	public static Role CAMPAIGN_TYPE_SLEEPY_FLOW_DECIDER = new Role("campaign-type-sleepy-flow-decider", "Approve and Manage Sleepy Flow Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_SLEEPY_FLOW_PREPARER = new Role("campaign-type-sleepy-flow-preparer", "Prepare Sleepy Flow Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_SLEEPY_FLOW_VIEWER = new Role("campaign-type-sleepy-flow-viewer", "View a Sleepy Flow Campaign", new ArrayList<Role>(0));
	
	public static Role CAMPAIGN_TYPE_SIM_MENU_DECIDER = new Role("campaign-type-sim-menu-decider", "Approve and Manage Sim Menu Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_SIM_MENU_PREPARER = new Role("campaign-type-sim-menu-preparer", "Prepare Sim Menu Campaigns", new ArrayList<Role>(0));
	public static Role CAMPAIGN_TYPE_SIM_MENU_VIEWER = new Role("campaign-type-sim-menu-viewer", "View a Sim Menu Campaign", new ArrayList<Role>(0));
	
	/*
	public static Role SIM_MENU_LIST = new Role("sim-menu-list", "", new ArrayList<Role>(0));
	public static Role SIM_MENU_VIEW = new Role("sim-menu-view", "", new ArrayList<Role>(0));
	public static Role SIM_MENU_SAVE = new Role("sim-menu-save", "", new ArrayList<Role>(0));
	*/
	
	public static Role ENDPOINT_LIST = new Role("endpoint-list", "List Endpoints",  new ArrayList<Role>(0));
	public static Role ENDPOINT_VIEW = new Role("endpoint-view", "View an Endpoint",  new ArrayList<Role>(0));
	public static Role ENDPOINT_SAVE = new Role("endpoint-save", "Save an Endpoint",  new ArrayList<Role>(0));
	
	public static Role SIM_PROFILE_LIST = new Role("sim-profile-list", "List Sim Profiles",  new ArrayList<Role>(0));
	public static Role SIM_PROFILE_VIEW = new Role("sim-profile-view", "View a Sim Profile",  new ArrayList<Role>(0));
	public static Role SIM_PROFILE_SAVE = new Role("sim-profile-save", "Save a Sim Profile",  new ArrayList<Role>(0));
	
	public static Role SIM_VIEW = new Role("sim-view", "View a Sim",  new ArrayList<Role>(0));
	public static Role SIM_SAVE = new Role("sim-save", "Save a Sim",  new ArrayList<Role>(0));
	
	public static Role SMPP_ACCOUNT_LIST = new Role("smpp-account-list", "List Smpp Accounts",  new ArrayList<Role>(0));
	public static Role SMPP_ACCOUNT_VIEW = new Role("smpp-account-view", "View a Smpp Account",  new ArrayList<Role>(0));
	public static Role SMPP_ACCOUNT_SAVE = new Role("smpp-account-save", "Save a Smpp Account",  new ArrayList<Role>(0));
	
	public static Role TP_RULE_LIST = new Role("tp-rule-list", "List Tp Rules",  new ArrayList<Role>(0));
	public static Role TP_RULE_VIEW = new Role("tp-rule-view", "View a Tp Rule",  new ArrayList<Role>(0));
	public static Role TP_RULE_SAVE = new Role("tp-rule-save", "Save a Tp Rule",  new ArrayList<Role>(0));
	
	public static Role PARAMETER_LIST = new Role("parameter-list", "List Parameters (Aircast Settings)",  new ArrayList<Role>(0));
	public static Role PARAMETER_VIEW = new Role("parameter-view", "View a Parameter (Aircast Settings)",  new ArrayList<Role>(0));
	public static Role PARAMETER_SAVE = new Role("parameter-save", "Save a Parameter (Aircast Settings)",  new ArrayList<Role>(0));
	
	public static Role LIST_FILE_LIST = new Role("list-file-list", "List (Campaign and List types) Files",  new ArrayList<Role>(0));
	public static Role LIST_FILE_VIEW = new Role("list-file-view", "View a (Campaign and List types) File",  new ArrayList<Role>(0));
	public static Role LIST_FILE_SAVE = new Role("list-file-save", "Save a (Campaign and List types) File",  new ArrayList<Role>(0));
	
	public static Role APPLET_FILE_LIST = new Role("applet-file-list", "List (Applet type) Files",  new ArrayList<Role>(0));
	public static Role APPLET_FILE_VIEW = new Role("applet-file-view", "View a (Applet type) File",  new ArrayList<Role>(0));
	public static Role APPLET_FILE_SAVE = new Role("applet-file-save", "Save a (Applet type) File",  new ArrayList<Role>(0));
	
	public static Role SCHEDULER_LIST = new Role("scheduler-list", "List Calendar Schedules",  new ArrayList<Role>(0));
	public static Role SCHEDULER_VIEW = new Role("scheduler-view", "View a Calendar Schedule",  new ArrayList<Role>(0));
	public static Role SCHEDULER_SAVE = new Role("scheduler-save", "Save a Calendar Schedule",  new ArrayList<Role>(0));
	
	
	/*
	 * VAS
	 */
	
	public static Role VAS_DECIDER = new Role("vas-decider", "Can Approve, Refuse, Enable Va Services, Pricepoints, Landings, Identifiers",  new ArrayList<Role>(0));
	public static Role VAS_PREPARER = new Role("vas-preparer", "Can Edit and request approval of Va Services, Pricepoints, Landings, Identifiers",  new ArrayList<Role>(0));
	
	public static Role VA_SERVICE_LIST = new Role("va-service-list", "List Va Services",  new ArrayList<Role>(0));
	public static Role VA_SERVICE_VIEW = new Role("va-service-view", "View a Va Service",  new ArrayList<Role>(0));
	public static Role VA_SERVICE_SAVE = new Role("va-service-save", "Save a Va Service",  new ArrayList<Role>(0));
	
	public static Role PRICEPOINT_LIST = new Role("pricepoint-list", "List Pricepoints",  new ArrayList<Role>(0));
	public static Role PRICEPOINT_VIEW = new Role("pricepoint-view", "View a Pricepoint",  new ArrayList<Role>(0));
	public static Role PRICEPOINT_SAVE = new Role("pricepoint-save", "Save a Pricepoint",  new ArrayList<Role>(0));
	
	public static Role IDENTIFIER_LIST = new Role("identifier-list", "List Identifiers",  new ArrayList<Role>(0));
	public static Role IDENTIFIER_VIEW = new Role("identifier-view", "View an Identifier",  new ArrayList<Role>(0));
	public static Role IDENTIFIER_SAVE = new Role("identifier-save", "Save an Identifier",  new ArrayList<Role>(0));
	
	public static Role LANDING_LIST = new Role("landing-list", "List Landings",  new ArrayList<Role>(0));
	public static Role LANDING_VIEW = new Role("landing-view", "View a Landing",  new ArrayList<Role>(0));
	public static Role LANDING_SAVE = new Role("landing-save", "Save a Landing",  new ArrayList<Role>(0));
	
	public static Role SUBSCRIPTION_EVENT = new Role("subscription-event", "List Subscriptions and Unsubscribe Users",  new ArrayList<Role>(0));
	
	/*
	 * USERS - ROLES - GROUPS
	 */
	
	 public static Role USER_LIST = new Role("user-list", "List Users",  new ArrayList<Role>(0));
	 public static Role USER_VIEW = new Role("user-view", "View an User",  new ArrayList<Role>(0));
	 public static Role USER_SAVE = new Role("user-save", "Save an User",  new ArrayList<Role>(0));
	 public static Role USER_ADD_PERMISSION = new Role("user-add-permission", "Add permission to the User",  new ArrayList<Role>(0));
	 
	 public static Role GROUP_LIST = new Role("group-list", "List Groups",  new ArrayList<Role>(0));
	 public static Role GROUP_VIEW = new Role("group-view", "View a Group",  new ArrayList<Role>(0));
	 public static Role GROUP_SAVE = new Role("group-save", "Save a Group",  new ArrayList<Role>(0));
	 
	 public static Role ROLE_LIST = new Role("role-list", "List Roles",  new ArrayList<Role>(0));
	 public static Role ROLE_VIEW = new Role("role-view", "View a Role",  new ArrayList<Role>(0));
	 public static Role ROLE_SAVE = new Role("role-save", "Save a Role",  new ArrayList<Role>(0));
	 
	 public static Role SENDER_LIST = new Role("sender-list", "List Senders",  new ArrayList<Role>(0));
	 public static Role SENDER_VIEW = new Role("sender-view", "View a Sender",  new ArrayList<Role>(0));
	 public static Role SENDER_SAVE = new Role("sender-save", "Save a Sender",  new ArrayList<Role>(0));
	
	public static Role APPLET_ADMIN = null;
	public static Role CAMPAIGN_ADMIN = null;
	
	public static Role CAMPAIGN_TYPE_ALL_DECIDER = null;
	public static Role CAMPAIGN_TYPE_ALL_PREPARER = null;
	public static Role CAMPAIGN_TYPE_ALL_VIEWER = null;
	
	public static Role ENDPOINT_ADMIN = null; 
	public static Role SIM_PROFILE_ADMIN = null; 
	public static Role SIM_ADMIN = null; 
	public static Role SMPP_ACCOUNT_ADMIN = null;
	public static Role TP_RULE_ADMIN = null; 
	public static Role PARAMETER_ADMIN = null;
	public static Role LIST_FILE_ADMIN = null;
	public static Role APPLET_FILE_ADMIN = null;
	public static Role SCHEDULER_ADMIN = null; 
	public static Role VA_SERVICE_ADMIN = null; 
	public static Role PRICEPOINT_ADMIN = null; 
	public static Role IDENTIFIER_ADMIN = null; 
	public static Role LANDING_ADMIN = null; 
	public static Role USER_ADMIN = null; 
	public static Role GROUP_ADMIN = null; 
	public static Role ROLE_ADMIN = null; 
	public static Role SENDER_ADMIN = null; 
	
	
	public static Role SUPER_USER = null; 
	public static Role ADMINISTRATOR = null;
	public static Role CAMPAIGN_MANAGER = null;
	public static Role CAMPAIGN_PREPARER = null;
	public static Role VAS_MANAGER = null;
	public static Role VAS_EDITOR = null;
	public static Role VAS_VIEWER = null;
	
	public static Role STATS = null; 
	
			
	public static RoleUtil getInstance() {
		if (instance == null) {
			instance = new RoleUtil();
			roles = new HashMap<String,Role>();
			roleList = new ArrayList<Role>();
			
		
			
			roles.put(UI_USER.getName(), UI_USER);
			roles.put(APPLET_LIST.getName(), APPLET_LIST);
			roles.put(APPLET_VIEW.getName(), APPLET_VIEW);
			roles.put(APPLET_SAVE.getName(), APPLET_SAVE);
			roles.put(CAMPAIGN_LIST.getName(), CAMPAIGN_LIST);
			roles.put(CAMPAIGN_VIEW.getName(), CAMPAIGN_VIEW);
			roles.put(CAMPAIGN_SAVE.getName(), CAMPAIGN_SAVE);
			
			
			roles.put(CAMPAIGN_TYPE_SYSTEM_DECIDER.getName(), CAMPAIGN_TYPE_SYSTEM_DECIDER);
			roles.put(CAMPAIGN_TYPE_SYSTEM_PREPARER.getName(), CAMPAIGN_TYPE_SYSTEM_PREPARER);
			roles.put(CAMPAIGN_TYPE_SYSTEM_VIEWER.getName(), CAMPAIGN_TYPE_SYSTEM_VIEWER);
			roles.put(CAMPAIGN_TYPE_API_DECIDER.getName(), CAMPAIGN_TYPE_API_DECIDER);
			roles.put(CAMPAIGN_TYPE_API_PREPARER.getName(), CAMPAIGN_TYPE_API_PREPARER);
			roles.put(CAMPAIGN_TYPE_API_VIEWER.getName(), CAMPAIGN_TYPE_API_VIEWER);
			roles.put(CAMPAIGN_TYPE_AD_DECIDER.getName(), CAMPAIGN_TYPE_AD_DECIDER);
			roles.put(CAMPAIGN_TYPE_AD_PREPARER.getName(), CAMPAIGN_TYPE_AD_PREPARER);
			roles.put(CAMPAIGN_TYPE_AD_VIEWER.getName(), CAMPAIGN_TYPE_AD_VIEWER);
			roles.put(CAMPAIGN_TYPE_SLEEPY_FLOW_DECIDER.getName(), CAMPAIGN_TYPE_SLEEPY_FLOW_DECIDER);
			roles.put(CAMPAIGN_TYPE_SLEEPY_FLOW_PREPARER.getName(), CAMPAIGN_TYPE_SLEEPY_FLOW_PREPARER);
			roles.put(CAMPAIGN_TYPE_SLEEPY_FLOW_VIEWER.getName(), CAMPAIGN_TYPE_SLEEPY_FLOW_VIEWER);
			roles.put(CAMPAIGN_TYPE_SIM_MENU_DECIDER.getName(), CAMPAIGN_TYPE_SIM_MENU_DECIDER);
			roles.put(CAMPAIGN_TYPE_SIM_MENU_PREPARER.getName(), CAMPAIGN_TYPE_SIM_MENU_PREPARER);
			roles.put(CAMPAIGN_TYPE_SIM_MENU_VIEWER.getName(), CAMPAIGN_TYPE_SIM_MENU_VIEWER);
			
			
			
			roles.put(ENDPOINT_LIST.getName(), ENDPOINT_LIST);
			roles.put(ENDPOINT_VIEW.getName(), ENDPOINT_VIEW);
			roles.put(ENDPOINT_SAVE.getName(), ENDPOINT_SAVE);
			roles.put(SIM_PROFILE_LIST.getName(), SIM_PROFILE_LIST);
			roles.put(SIM_PROFILE_VIEW.getName(), SIM_PROFILE_VIEW);
			roles.put(SIM_PROFILE_SAVE.getName(), SIM_PROFILE_SAVE);
			roles.put(SIM_VIEW.getName(), SIM_VIEW);
			roles.put(SIM_SAVE.getName(), SIM_SAVE);
			roles.put(SMPP_ACCOUNT_LIST.getName(), SMPP_ACCOUNT_LIST);
			roles.put(SMPP_ACCOUNT_VIEW.getName(), SMPP_ACCOUNT_VIEW);
			roles.put(SMPP_ACCOUNT_SAVE.getName(), SMPP_ACCOUNT_SAVE);
			roles.put(TP_RULE_LIST.getName(), TP_RULE_LIST);
			roles.put(TP_RULE_VIEW.getName(), TP_RULE_VIEW);
			roles.put(TP_RULE_SAVE.getName(), TP_RULE_SAVE);
			roles.put(PARAMETER_LIST.getName(), PARAMETER_LIST);
			roles.put(PARAMETER_VIEW.getName(), PARAMETER_VIEW);
			roles.put(PARAMETER_SAVE.getName(), PARAMETER_SAVE);
			roles.put(LIST_FILE_LIST.getName(), LIST_FILE_LIST);
			roles.put(LIST_FILE_VIEW.getName(), LIST_FILE_VIEW);
			roles.put(LIST_FILE_SAVE.getName(), LIST_FILE_SAVE);
			roles.put(APPLET_FILE_LIST.getName(), APPLET_FILE_LIST);
			roles.put(APPLET_FILE_VIEW.getName(), APPLET_FILE_VIEW);
			roles.put(APPLET_FILE_SAVE.getName(), APPLET_FILE_SAVE);
			roles.put(SCHEDULER_LIST.getName(), SCHEDULER_LIST);
			roles.put(SCHEDULER_VIEW.getName(), SCHEDULER_VIEW);
			roles.put(SCHEDULER_SAVE.getName(), SCHEDULER_SAVE);
			
			
			roles.put(VAS_DECIDER.getName(), VAS_DECIDER);
			roles.put(VAS_PREPARER.getName(), VAS_PREPARER);
			
			roles.put(VA_SERVICE_LIST.getName(), VA_SERVICE_LIST);
			roles.put(VA_SERVICE_VIEW.getName(), VA_SERVICE_VIEW);
			roles.put(VA_SERVICE_SAVE.getName(), VA_SERVICE_SAVE);
			
			roles.put(PRICEPOINT_LIST.getName(), PRICEPOINT_LIST);
			roles.put(PRICEPOINT_VIEW.getName(), PRICEPOINT_VIEW);
			roles.put(PRICEPOINT_SAVE.getName(), PRICEPOINT_SAVE);
			
			roles.put(IDENTIFIER_LIST.getName(), IDENTIFIER_LIST);
			roles.put(IDENTIFIER_VIEW.getName(), IDENTIFIER_VIEW);
			roles.put(IDENTIFIER_SAVE.getName(), IDENTIFIER_SAVE);
			
			roles.put(LANDING_LIST.getName(), LANDING_LIST);
			roles.put(LANDING_VIEW.getName(), LANDING_VIEW);
			roles.put(LANDING_SAVE.getName(), LANDING_SAVE);
			
			roles.put(SUBSCRIPTION_EVENT.getName(), SUBSCRIPTION_EVENT);

			roles.put(USER_LIST.getName(), USER_LIST);
			roles.put(USER_VIEW.getName(), USER_VIEW);
			roles.put(USER_SAVE.getName(), USER_SAVE);
			roles.put(USER_ADD_PERMISSION.getName(), USER_ADD_PERMISSION);
			
			roles.put(GROUP_LIST.getName(), GROUP_LIST);
			roles.put(GROUP_VIEW.getName(), GROUP_VIEW);
			roles.put(GROUP_SAVE.getName(), GROUP_SAVE);
			
			roles.put(ROLE_LIST.getName(), ROLE_LIST);
			roles.put(ROLE_VIEW.getName(), ROLE_VIEW);
			roles.put(ROLE_SAVE.getName(), ROLE_SAVE);

			roles.put(SENDER_LIST.getName(), SENDER_LIST);
			roles.put(SENDER_VIEW.getName(), SENDER_VIEW);
			roles.put(SENDER_SAVE.getName(), SENDER_SAVE);

			roleList.add(UI_USER);
			roleList.add(APPLET_LIST);
			roleList.add(APPLET_VIEW);
			roleList.add(APPLET_SAVE);
			roleList.add(CAMPAIGN_LIST);
			roleList.add(CAMPAIGN_VIEW);
			roleList.add(CAMPAIGN_SAVE);
			
			roleList.add(CAMPAIGN_TYPE_SYSTEM_DECIDER);
			roleList.add(CAMPAIGN_TYPE_SYSTEM_PREPARER);
			roleList.add(CAMPAIGN_TYPE_SYSTEM_VIEWER);
			roleList.add(CAMPAIGN_TYPE_API_DECIDER);
			roleList.add(CAMPAIGN_TYPE_API_PREPARER);
			roleList.add(CAMPAIGN_TYPE_API_VIEWER);
			roleList.add(CAMPAIGN_TYPE_AD_DECIDER);
			roleList.add(CAMPAIGN_TYPE_AD_PREPARER);
			roleList.add(CAMPAIGN_TYPE_AD_VIEWER);
			roleList.add(CAMPAIGN_TYPE_SLEEPY_FLOW_DECIDER);
			roleList.add(CAMPAIGN_TYPE_SLEEPY_FLOW_PREPARER);
			roleList.add(CAMPAIGN_TYPE_SLEEPY_FLOW_VIEWER);
			roleList.add(CAMPAIGN_TYPE_SIM_MENU_DECIDER);
			roleList.add(CAMPAIGN_TYPE_SIM_MENU_PREPARER);
			roleList.add(CAMPAIGN_TYPE_SIM_MENU_VIEWER);
			
			
			roleList.add(ENDPOINT_LIST);
			roleList.add(ENDPOINT_VIEW);
			roleList.add(ENDPOINT_SAVE);
			roleList.add(SIM_PROFILE_LIST);
			roleList.add(SIM_PROFILE_VIEW);
			roleList.add(SIM_PROFILE_SAVE);
			roleList.add(SIM_VIEW);
			roleList.add(SIM_SAVE);
			roleList.add(SMPP_ACCOUNT_LIST);
			roleList.add(SMPP_ACCOUNT_VIEW);
			roleList.add(SMPP_ACCOUNT_SAVE);
			roleList.add(TP_RULE_LIST);
			roleList.add(TP_RULE_VIEW);
			roleList.add(TP_RULE_SAVE);
			roleList.add(PARAMETER_LIST);
			roleList.add(PARAMETER_VIEW);
			roleList.add(PARAMETER_SAVE);
			roleList.add(LIST_FILE_LIST);
			roleList.add(LIST_FILE_VIEW);
			roleList.add(LIST_FILE_SAVE);
			roleList.add(APPLET_FILE_LIST);
			roleList.add(APPLET_FILE_VIEW);
			roleList.add(APPLET_FILE_SAVE);
			roleList.add(SCHEDULER_LIST);
			roleList.add(SCHEDULER_VIEW);
			roleList.add(SCHEDULER_SAVE);
			
			roleList.add(VAS_DECIDER);
			roleList.add(VAS_PREPARER);
			
			roleList.add(VA_SERVICE_LIST);
			roleList.add(VA_SERVICE_VIEW);
			roleList.add(VA_SERVICE_SAVE);
			
			roleList.add(PRICEPOINT_LIST);
			roleList.add(PRICEPOINT_VIEW);
			roleList.add(PRICEPOINT_SAVE);
			
			roleList.add(IDENTIFIER_LIST);
			roleList.add(IDENTIFIER_VIEW);
			roleList.add(IDENTIFIER_SAVE);
			
			roleList.add(LANDING_LIST);
			roleList.add(LANDING_VIEW);
			roleList.add(LANDING_SAVE);
			
			roleList.add(SUBSCRIPTION_EVENT);
			
			roleList.add(USER_LIST);
			roleList.add(USER_VIEW);
			roleList.add(USER_SAVE);
			roleList.add(USER_ADD_PERMISSION);
			
			roleList.add(GROUP_LIST);
			roleList.add(GROUP_VIEW);
			roleList.add(GROUP_SAVE);
			
			roleList.add(ROLE_LIST);
			roleList.add(ROLE_VIEW);
			roleList.add(ROLE_SAVE);
			
			roleList.add(SENDER_LIST);
			roleList.add(SENDER_VIEW);
			roleList.add(SENDER_SAVE);

			List<Role> appletAdminSubRoles = new ArrayList<Role>();
			appletAdminSubRoles.add(APPLET_LIST);
			appletAdminSubRoles.add(APPLET_VIEW);
			appletAdminSubRoles.add(APPLET_SAVE);
			APPLET_ADMIN = new Role("applet-admin", "Manage (List, View, Save) Applets", appletAdminSubRoles);
			roles.put(APPLET_ADMIN.getName(), APPLET_ADMIN);
			roleList.add(APPLET_ADMIN);
			
			List<Role> campaignAdminSubRoles = new ArrayList<Role>();
			campaignAdminSubRoles.add(CAMPAIGN_LIST);
			campaignAdminSubRoles.add(CAMPAIGN_VIEW);
			campaignAdminSubRoles.add(CAMPAIGN_SAVE);
			
			CAMPAIGN_ADMIN = new Role("campaign-admin", "Manage (List, View, Save) Campaigns of types defined by CAMPAIGN_TYPE roles", campaignAdminSubRoles);
			roles.put(CAMPAIGN_ADMIN.getName(), CAMPAIGN_ADMIN);
			roleList.add(CAMPAIGN_ADMIN);
			
			
			
			List<Role> campaignAllDeciderSubRoles = new ArrayList<Role>();
			campaignAllDeciderSubRoles.add(CAMPAIGN_TYPE_SYSTEM_DECIDER);
			campaignAllDeciderSubRoles.add(CAMPAIGN_TYPE_API_DECIDER);
			campaignAllDeciderSubRoles.add(CAMPAIGN_TYPE_AD_DECIDER);
			campaignAllDeciderSubRoles.add(CAMPAIGN_TYPE_SLEEPY_FLOW_DECIDER);
			campaignAllDeciderSubRoles.add(CAMPAIGN_TYPE_SIM_MENU_DECIDER);
			
			CAMPAIGN_TYPE_ALL_DECIDER = new Role("campaign-all-decider", "Can Approve and Enable any type of Campaign", campaignAllDeciderSubRoles);
			roles.put(CAMPAIGN_TYPE_ALL_DECIDER.getName(), CAMPAIGN_TYPE_ALL_DECIDER);
			roleList.add(CAMPAIGN_TYPE_ALL_DECIDER);
			
			
			
			
			List<Role> campaignAllPreparerSubRoles = new ArrayList<Role>();
			campaignAllPreparerSubRoles.add(CAMPAIGN_TYPE_SYSTEM_PREPARER);
			campaignAllPreparerSubRoles.add(CAMPAIGN_TYPE_API_PREPARER);
			campaignAllPreparerSubRoles.add(CAMPAIGN_TYPE_AD_PREPARER);
			campaignAllPreparerSubRoles.add(CAMPAIGN_TYPE_SLEEPY_FLOW_PREPARER);
			campaignAllPreparerSubRoles.add(CAMPAIGN_TYPE_SIM_MENU_PREPARER);
			
			CAMPAIGN_TYPE_ALL_PREPARER = new Role("campaign-all-preparer", "Can Prepare and request approval of any type of Campaign", campaignAllPreparerSubRoles);
			roles.put(CAMPAIGN_TYPE_ALL_PREPARER.getName(), CAMPAIGN_TYPE_ALL_PREPARER);
			roleList.add(CAMPAIGN_TYPE_ALL_PREPARER);
			
			
			
			
			List<Role> campaignAllViewerSubRoles = new ArrayList<Role>();
			campaignAllViewerSubRoles.add(CAMPAIGN_TYPE_SYSTEM_VIEWER);
			campaignAllViewerSubRoles.add(CAMPAIGN_TYPE_API_VIEWER);
			campaignAllViewerSubRoles.add(CAMPAIGN_TYPE_AD_VIEWER);
			campaignAllViewerSubRoles.add(CAMPAIGN_TYPE_SLEEPY_FLOW_VIEWER);
			campaignAllViewerSubRoles.add(CAMPAIGN_TYPE_SIM_MENU_VIEWER);
			
			CAMPAIGN_TYPE_ALL_VIEWER = new Role("campaign-all-viewer", "Cannot change state of any type of Campaign", campaignAllViewerSubRoles);
			roles.put(CAMPAIGN_TYPE_ALL_VIEWER.getName(), CAMPAIGN_TYPE_ALL_VIEWER);
			roleList.add(CAMPAIGN_TYPE_ALL_VIEWER);
			
			
			
			List<Role> endpointAdminSubRoles = new ArrayList<Role>();
			endpointAdminSubRoles.add(ENDPOINT_LIST);
			endpointAdminSubRoles.add(ENDPOINT_VIEW);
			endpointAdminSubRoles.add(ENDPOINT_SAVE);
			ENDPOINT_ADMIN = new Role("endpoint-admin", "Manage (List, View, Save) Endpoints", endpointAdminSubRoles);
			roles.put(ENDPOINT_ADMIN.getName(), ENDPOINT_ADMIN);
			roleList.add(ENDPOINT_ADMIN);
			
			List<Role> simProfileAdminSubRoles = new ArrayList<Role>();
			simProfileAdminSubRoles.add(SIM_PROFILE_LIST);
			simProfileAdminSubRoles.add(SIM_PROFILE_VIEW);
			simProfileAdminSubRoles.add(SIM_PROFILE_SAVE);
			SIM_PROFILE_ADMIN = new Role("sim-profile-admin", "Manage (List, View, Save) Sim Profiles", simProfileAdminSubRoles);
			roles.put(SIM_PROFILE_ADMIN.getName(), SIM_PROFILE_ADMIN);
			roleList.add(SIM_PROFILE_ADMIN);
			
			
			List<Role> simAdminSubRoles = new ArrayList<Role>();
			simAdminSubRoles.add(SIM_VIEW);
			simAdminSubRoles.add(SIM_SAVE);
			SIM_ADMIN = new Role("sim-admin", "Administrate SIMs", simAdminSubRoles);
			roles.put(SIM_ADMIN.getName(), SIM_ADMIN);
			roleList.add(SIM_ADMIN);
			
			
			
			List<Role> smppAccountAdminSubRoles = new ArrayList<Role>();
			smppAccountAdminSubRoles.add(SMPP_ACCOUNT_LIST);
			smppAccountAdminSubRoles.add(SMPP_ACCOUNT_VIEW);
			smppAccountAdminSubRoles.add(SMPP_ACCOUNT_SAVE);
			SMPP_ACCOUNT_ADMIN = new Role("smpp-account-admin", "Manage (List, View, Save) Smpp Accounts", smppAccountAdminSubRoles);
			roles.put(SMPP_ACCOUNT_ADMIN.getName(), SMPP_ACCOUNT_ADMIN);
			roleList.add(SMPP_ACCOUNT_ADMIN);
			
			
			
			
			
			List<Role> tpRuleAdminSubRoles = new ArrayList<Role>();
			tpRuleAdminSubRoles.add(TP_RULE_LIST);
			tpRuleAdminSubRoles.add(TP_RULE_VIEW);
			tpRuleAdminSubRoles.add(TP_RULE_SAVE);
			TP_RULE_ADMIN = new Role("tp-rule-admin", "Manage (List, View, Save) Tp Rules", tpRuleAdminSubRoles);
			roles.put(TP_RULE_ADMIN.getName(), TP_RULE_ADMIN);
			roleList.add(TP_RULE_ADMIN);
			
					
					
			List<Role> parameterAdminSubRoles = new ArrayList<Role>();
			parameterAdminSubRoles.add(PARAMETER_LIST);
			parameterAdminSubRoles.add(PARAMETER_VIEW);
			parameterAdminSubRoles.add(PARAMETER_SAVE);
			PARAMETER_ADMIN = new Role("parameter-admin", "Manage (List, View, Save) Parameters (Aircast Settings)", parameterAdminSubRoles);
			roles.put(PARAMETER_ADMIN.getName(), PARAMETER_ADMIN);
			roleList.add(PARAMETER_ADMIN);
			
			
			List<Role> listFileAdminSubRoles = new ArrayList<Role>();
			listFileAdminSubRoles.add(LIST_FILE_LIST);
			listFileAdminSubRoles.add(LIST_FILE_VIEW);
			listFileAdminSubRoles.add(LIST_FILE_SAVE);
			LIST_FILE_ADMIN = new Role("list-file-admin", "Manage (List, View, Save) Files of types Campaign, List", listFileAdminSubRoles);
			roles.put(LIST_FILE_ADMIN.getName(), LIST_FILE_ADMIN);
			roleList.add(LIST_FILE_ADMIN);
			
			List<Role> appletFileAdminSubRoles = new ArrayList<Role>();
			appletFileAdminSubRoles.add(APPLET_FILE_LIST);
			appletFileAdminSubRoles.add(APPLET_FILE_VIEW);
			appletFileAdminSubRoles.add(APPLET_FILE_SAVE);
			APPLET_FILE_ADMIN = new Role("applet-file-admin", "Manage (List, View, Save) Files of types Applet", appletFileAdminSubRoles);
			roles.put(APPLET_FILE_ADMIN.getName(), APPLET_FILE_ADMIN);
			roleList.add(APPLET_FILE_ADMIN);
			
			List<Role> schedulerAdminSubRoles = new ArrayList<Role>();
			schedulerAdminSubRoles.add(SCHEDULER_LIST);
			schedulerAdminSubRoles.add(SCHEDULER_VIEW);
			schedulerAdminSubRoles.add(SCHEDULER_SAVE);
			SCHEDULER_ADMIN = new Role("scheduler-admin", "Manage (List, View, Save) Schedules in Calendar", schedulerAdminSubRoles);
			roles.put(SCHEDULER_ADMIN.getName(), SCHEDULER_ADMIN);
			roleList.add(SCHEDULER_ADMIN);
			
			
			List<Role> vaServiceAdminSubRoles = new ArrayList<Role>();
			vaServiceAdminSubRoles.add(VA_SERVICE_LIST);
			vaServiceAdminSubRoles.add(VA_SERVICE_VIEW);
			vaServiceAdminSubRoles.add(VA_SERVICE_SAVE);
			VA_SERVICE_ADMIN = new Role("va-service-admin", "Manage (List, View, Save) Va Services", vaServiceAdminSubRoles);
			roles.put(VA_SERVICE_ADMIN.getName(), VA_SERVICE_ADMIN);
			roleList.add(VA_SERVICE_ADMIN);
			
			List<Role> pricepointAdminSubRoles = new ArrayList<Role>();
			pricepointAdminSubRoles.add(PRICEPOINT_LIST);
			pricepointAdminSubRoles.add(PRICEPOINT_VIEW);
			pricepointAdminSubRoles.add(PRICEPOINT_SAVE);
			PRICEPOINT_ADMIN = new Role("pricepoint-admin", "Manage (List, View, Save) Pricepoints", pricepointAdminSubRoles);
			roles.put(PRICEPOINT_ADMIN.getName(), PRICEPOINT_ADMIN);
			roleList.add(PRICEPOINT_ADMIN);
			
			List<Role> identifierAdminSubRoles = new ArrayList<Role>();
			identifierAdminSubRoles.add(IDENTIFIER_LIST);
			identifierAdminSubRoles.add(IDENTIFIER_VIEW);
			identifierAdminSubRoles.add(IDENTIFIER_SAVE);
			IDENTIFIER_ADMIN = new Role("identifier-admin", "Manage (List, View, Save) Identifiers", identifierAdminSubRoles);
			roles.put(IDENTIFIER_ADMIN.getName(), IDENTIFIER_ADMIN);
			roleList.add(IDENTIFIER_ADMIN);
			
			List<Role> landingAdminSubRoles = new ArrayList<Role>();
			landingAdminSubRoles.add(LANDING_LIST);
			landingAdminSubRoles.add(LANDING_VIEW);
			landingAdminSubRoles.add(LANDING_SAVE);
			LANDING_ADMIN = new Role("landing-admin", "Manage (List, View, Save) Landings", landingAdminSubRoles);
			roles.put(LANDING_ADMIN.getName(), LANDING_ADMIN);
			roleList.add(LANDING_ADMIN);
			
			List<Role> userAdminSubRoles = new ArrayList<Role>();
			userAdminSubRoles.add(USER_LIST);
			userAdminSubRoles.add(USER_VIEW);
			// userAdminSubRoles.add(USER_SAVE);
			userAdminSubRoles.add(USER_ADD_PERMISSION);
			USER_ADMIN = new Role("user-admin", "Manage (List, View, Add Permission) Users", userAdminSubRoles);
			roles.put(USER_ADMIN.getName(), USER_ADMIN);
			roleList.add(USER_ADMIN);

			List<Role> groupAdminSubRoles = new ArrayList<Role>();
			groupAdminSubRoles.add(GROUP_LIST);
			groupAdminSubRoles.add(GROUP_VIEW);
			// groupAdminSubRoles.add(GROUP_SAVE);
			GROUP_ADMIN = new Role("group-admin", "Manage (List, View, Save) Groups", groupAdminSubRoles);
			roles.put(GROUP_ADMIN.getName(), GROUP_ADMIN);
			roleList.add(GROUP_ADMIN);
			
			List<Role> roleAdminSubRoles = new ArrayList<Role>();
			roleAdminSubRoles.add(ROLE_LIST);
			roleAdminSubRoles.add(ROLE_VIEW);
			roleAdminSubRoles.add(ROLE_SAVE);
			ROLE_ADMIN = new Role("role-admin", "Manage (List, View, Save) Roles", roleAdminSubRoles);
			roles.put(ROLE_ADMIN.getName(), ROLE_ADMIN);
			roleList.add(ROLE_ADMIN);

			List<Role> senderAdminSubRoles = new ArrayList<Role>();
			senderAdminSubRoles.add(SENDER_LIST);
			senderAdminSubRoles.add(SENDER_VIEW);
			senderAdminSubRoles.add(SENDER_SAVE);
			SENDER_ADMIN = new Role("sender-admin", "Manage (List, View, Save) Senders", senderAdminSubRoles);
			roles.put(SENDER_ADMIN.getName(), SENDER_ADMIN);
			roleList.add(SENDER_ADMIN);

			/*
			 * su
			 */
			
			
			List<Role> fullAdminSubRoles = new ArrayList<Role>();
			fullAdminSubRoles.add(UI_USER);
			fullAdminSubRoles.add(APPLET_ADMIN);
			fullAdminSubRoles.add(CAMPAIGN_ADMIN);
			fullAdminSubRoles.add(CAMPAIGN_TYPE_ALL_DECIDER);
			fullAdminSubRoles.add(ENDPOINT_ADMIN);
			fullAdminSubRoles.add(SIM_PROFILE_ADMIN);
			fullAdminSubRoles.add(SIM_ADMIN);
			fullAdminSubRoles.add(SMPP_ACCOUNT_ADMIN);
			fullAdminSubRoles.add(TP_RULE_ADMIN);
			fullAdminSubRoles.add(PARAMETER_ADMIN);
			fullAdminSubRoles.add(LIST_FILE_ADMIN);
			fullAdminSubRoles.add(APPLET_FILE_ADMIN);
			fullAdminSubRoles.add(SCHEDULER_ADMIN);
			
			fullAdminSubRoles.add(VAS_DECIDER);
			fullAdminSubRoles.add(VA_SERVICE_ADMIN);
			fullAdminSubRoles.add(PRICEPOINT_ADMIN);
			fullAdminSubRoles.add(IDENTIFIER_ADMIN);
			fullAdminSubRoles.add(LANDING_ADMIN);
			fullAdminSubRoles.add(SUBSCRIPTION_EVENT);
			
			fullAdminSubRoles.add(USER_ADMIN);
			fullAdminSubRoles.add(GROUP_ADMIN);
			fullAdminSubRoles.add(ROLE_ADMIN);
			fullAdminSubRoles.add(SENDER_ADMIN);
			
			SUPER_USER = new Role("00_SUPER_USER", "A Super User is granted everything. Only for Mobiera geeks", fullAdminSubRoles);
			roles.put(SUPER_USER.getName(), SUPER_USER);
			roleList.add(SUPER_USER);
			
			/*
			 * admin
			 */
			
			
			
			
			List<Role> adminSubRoles = new ArrayList<Role>();
			adminSubRoles.add(UI_USER);
			adminSubRoles.add(APPLET_LIST);
			adminSubRoles.add(CAMPAIGN_ADMIN);
			adminSubRoles.add(CAMPAIGN_TYPE_ALL_VIEWER);
			adminSubRoles.add(CAMPAIGN_TYPE_API_DECIDER);
			adminSubRoles.add(CAMPAIGN_TYPE_AD_DECIDER);
			adminSubRoles.add(CAMPAIGN_TYPE_SLEEPY_FLOW_PREPARER);
			adminSubRoles.add(CAMPAIGN_TYPE_SIM_MENU_PREPARER);
			adminSubRoles.add(ENDPOINT_ADMIN);
			adminSubRoles.add(SIM_PROFILE_ADMIN);
			adminSubRoles.add(SIM_VIEW);
			adminSubRoles.add(SIM_SAVE);
			adminSubRoles.add(SMPP_ACCOUNT_ADMIN);
			adminSubRoles.add(TP_RULE_ADMIN);
			adminSubRoles.add(LIST_FILE_ADMIN);
			adminSubRoles.add(SCHEDULER_ADMIN);
			adminSubRoles.add(PARAMETER_VIEW);
			
			
			
			ADMINISTRATOR = new Role("10_PM_ADMINISTRATOR", "Push Marketing Assignable Role: Highest Push Marketing role, not allowed for Third Parties (Mobiera only)", adminSubRoles);
			roles.put(ADMINISTRATOR.getName(), ADMINISTRATOR);
			roleList.add(ADMINISTRATOR);
			
			/*
			 * campaign manager
			 */
			
			
			
			List<Role> campaignManagerSubRoles = new ArrayList<Role>();
			campaignManagerSubRoles.add(UI_USER);
			campaignManagerSubRoles.add(ENDPOINT_LIST);
			campaignManagerSubRoles.add(ENDPOINT_VIEW);
			campaignManagerSubRoles.add(SMPP_ACCOUNT_LIST);
			//campaignManagerSubRoles.add(SMPP_ACCOUNT_VIEW);
			campaignManagerSubRoles.add(TP_RULE_LIST);
			campaignManagerSubRoles.add(TP_RULE_VIEW);
			campaignManagerSubRoles.add(CAMPAIGN_ADMIN);
			campaignManagerSubRoles.add(CAMPAIGN_TYPE_AD_DECIDER);
			campaignManagerSubRoles.add(CAMPAIGN_TYPE_API_VIEWER);
			campaignManagerSubRoles.add(CAMPAIGN_TYPE_SIM_MENU_VIEWER);
			campaignManagerSubRoles.add(SCHEDULER_ADMIN);
			campaignManagerSubRoles.add(LIST_FILE_ADMIN);
			campaignManagerSubRoles.add(PARAMETER_VIEW);
			campaignManagerSubRoles.add(SENDER_ADMIN);
			campaignManagerSubRoles.add(USER_VIEW);
			campaignManagerSubRoles.add(GROUP_VIEW);
			
			CAMPAIGN_MANAGER = new Role("15_PM_ADVERTISING_CAMPAIGN_DECIDER", "Push Marketing Assignable Role: For teams that need to prepare, approve and schedule Advertising Campaigns, see statistics of Advertising, API and Sim Menu Campaigns", campaignManagerSubRoles);
			roles.put(CAMPAIGN_MANAGER.getName(), CAMPAIGN_MANAGER);
			roleList.add(CAMPAIGN_MANAGER);
			
			
			/*
			 * campaign preparer
			 */
			
			
			List<Role> campaignPreparerSubRolesSubRoles = new ArrayList<Role>();
			campaignPreparerSubRolesSubRoles.add(UI_USER);
			campaignPreparerSubRolesSubRoles.add(ENDPOINT_LIST);
			campaignPreparerSubRolesSubRoles.add(ENDPOINT_VIEW);
			campaignPreparerSubRolesSubRoles.add(SMPP_ACCOUNT_LIST);
			//campaignPreparerSubRolesSubRoles.add(SMPP_ACCOUNT_VIEW);
			campaignPreparerSubRolesSubRoles.add(TP_RULE_LIST);
			campaignPreparerSubRolesSubRoles.add(TP_RULE_VIEW);
			campaignPreparerSubRolesSubRoles.add(CAMPAIGN_ADMIN);
			campaignPreparerSubRolesSubRoles.add(CAMPAIGN_TYPE_AD_PREPARER);
			campaignPreparerSubRolesSubRoles.add(CAMPAIGN_TYPE_API_VIEWER);
			campaignPreparerSubRolesSubRoles.add(CAMPAIGN_TYPE_SIM_MENU_VIEWER);
			campaignPreparerSubRolesSubRoles.add(SCHEDULER_ADMIN);
			campaignPreparerSubRolesSubRoles.add(LIST_FILE_ADMIN);
			campaignPreparerSubRolesSubRoles.add(PARAMETER_VIEW);
			campaignPreparerSubRolesSubRoles.add(SENDER_LIST);
			campaignPreparerSubRolesSubRoles.add(SENDER_VIEW);
			campaignPreparerSubRolesSubRoles.add(USER_VIEW);
			campaignPreparerSubRolesSubRoles.add(GROUP_VIEW);

			CAMPAIGN_PREPARER = new Role("20_PM_ADVERTISING_CAMPAIGN_EDITOR", "Push Marketing Assignable Role: For teams that need to prepare and schedule Advertising Campaigns (no approval), see statistics of Advertising, API and Sim Menu Campaigns", campaignPreparerSubRolesSubRoles);
			roles.put(CAMPAIGN_PREPARER.getName(), CAMPAIGN_PREPARER);
			roleList.add(CAMPAIGN_PREPARER);
	
			
			List<Role> statsSubRolesSubRoles = new ArrayList<Role>();
			statsSubRolesSubRoles.add(UI_USER);
			statsSubRolesSubRoles.add(CAMPAIGN_LIST);
			statsSubRolesSubRoles.add(ENDPOINT_LIST);
			statsSubRolesSubRoles.add(SMPP_ACCOUNT_LIST);
			statsSubRolesSubRoles.add(SCHEDULER_LIST);
			statsSubRolesSubRoles.add(SCHEDULER_VIEW);
			statsSubRolesSubRoles.add(CAMPAIGN_TYPE_AD_VIEWER);
			statsSubRolesSubRoles.add(CAMPAIGN_TYPE_API_VIEWER);
			statsSubRolesSubRoles.add(CAMPAIGN_TYPE_SIM_MENU_VIEWER);
			statsSubRolesSubRoles.add(PARAMETER_VIEW);
			statsSubRolesSubRoles.add(SENDER_LIST);
			statsSubRolesSubRoles.add(SENDER_VIEW);

			STATS = new Role("25_PM_ADVERTISING_CAMPAIGN_VIEWER", "Push Marketing Assignable Role: For teams that need to see statistics of Advertising, API and Sim Menu Campaigns", statsSubRolesSubRoles);
			roles.put(STATS.getName(), STATS);
			roleList.add(STATS);
						
			List<Role> vasManagerSubRoles = new ArrayList<Role>();
			vasManagerSubRoles.add(UI_USER);
			vasManagerSubRoles.add(VAS_DECIDER);
			vasManagerSubRoles.add(VA_SERVICE_ADMIN);
			vasManagerSubRoles.add(PRICEPOINT_ADMIN);
			vasManagerSubRoles.add(IDENTIFIER_ADMIN);
			vasManagerSubRoles.add(ENDPOINT_ADMIN);
			vasManagerSubRoles.add(LANDING_ADMIN);
			vasManagerSubRoles.add(SUBSCRIPTION_EVENT);
			vasManagerSubRoles.add(PARAMETER_VIEW);
			
			
			VAS_MANAGER = new Role("40_VAS_MANAGER", "Value Added Services Assignable Role: For Mobiera teams that are allowed to configure, approve and Enable VAS related entities (VaService, Pricepoints, Landings, Identifiers, Endpoints) and check statistics", vasManagerSubRoles);
			roles.put(VAS_MANAGER.getName(), VAS_MANAGER);
			roleList.add(VAS_MANAGER);
			
			List<Role> vasEditorSubRoles = new ArrayList<Role>();
			vasEditorSubRoles.add(UI_USER);
			vasEditorSubRoles.add(VAS_PREPARER);
			vasEditorSubRoles.add(VA_SERVICE_ADMIN);
			vasEditorSubRoles.add(PRICEPOINT_ADMIN);
			vasEditorSubRoles.add(IDENTIFIER_ADMIN);
			vasEditorSubRoles.add(ENDPOINT_ADMIN);
			vasEditorSubRoles.add(LANDING_ADMIN);
			vasEditorSubRoles.add(SUBSCRIPTION_EVENT);
			vasEditorSubRoles.add(PARAMETER_VIEW);
			
			
			VAS_EDITOR = new Role("45_VAS_EDITOR", "Value Added Services Assignable Role: For Operator or Mobiera teams that are allowed to view, prepare VAS related entities (VaService, Pricepoints, Landings, Identifiers, Endpoints and check statistics", vasEditorSubRoles);
			roles.put(VAS_EDITOR.getName(), VAS_EDITOR);
			roleList.add(VAS_EDITOR);
			
			List<Role> vasViewerSubRoles = new ArrayList<Role>();
			vasViewerSubRoles.add(UI_USER);
			vasViewerSubRoles.add(VA_SERVICE_VIEW);
			vasViewerSubRoles.add(VA_SERVICE_LIST);
			vasViewerSubRoles.add(PRICEPOINT_VIEW);
			vasViewerSubRoles.add(PRICEPOINT_LIST);
			vasViewerSubRoles.add(IDENTIFIER_VIEW);
			vasViewerSubRoles.add(IDENTIFIER_LIST);
			vasViewerSubRoles.add(ENDPOINT_VIEW);
			vasViewerSubRoles.add(ENDPOINT_LIST);
			vasViewerSubRoles.add(LANDING_VIEW);
			vasViewerSubRoles.add(LANDING_LIST);
			vasViewerSubRoles.add(SUBSCRIPTION_EVENT);
			vasViewerSubRoles.add(PARAMETER_VIEW);

			VAS_VIEWER = new Role("49_VAS_VIEWER", "Value Added Services Assignable Role: For Operator or Mobiera teams that are allowed to view VAS realted entities (VaService, Pricepoints, Landings, Identifiers, Endpoints and check statistics", vasViewerSubRoles);
			roles.put(VAS_VIEWER.getName(), VAS_VIEWER);
			roleList.add(VAS_VIEWER);
			
			StringBuffer display = new StringBuffer(32767);
			display.append("\n\n");
			display.append("*************************** ROLES DESCRIPTION  ***************************\n");
			
			for (Role r: roleList) {
				display.append(r.getName()).append(": ").append(r.getDescription()).append("\n");
			}
			
			
			display.append("*************************** ASSIGNABLE ROLES   ***************************\n");
			
			for (Role r: roleList) {
				if (r.getName().matches("[0-9].*")) {
					display.append(r.getName()).append("\n");
					getSubRoles(r, r.getName(), display);
				}
			}
			display.append("*************************** EOROLES            ***************************\n");
			
			
			logger.info(display.toString());
			
		}
		
		return instance;
	}
	
	private static void getSubRoles(Role cr, String prefix, StringBuffer display) {
		
		if (cr.getSubRoles() != null) {
			for (Role r: cr.getSubRoles()) {
				String currentPrefix = prefix + " => " + r.getName();
				display.append(currentPrefix).append("\n");
				
				getSubRoles(r, currentPrefix, display);
				
			}
		}
		
		
	}
	
	
	public Set<String> names() {
		return roles.keySet();
	}
	
	public Collection<Role> values() {
		return roleList;
	}

	public Role valueOf(String name) {
		return roles.get(name);
	}
}
