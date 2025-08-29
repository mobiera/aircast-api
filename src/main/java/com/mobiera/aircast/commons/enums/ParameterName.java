package com.mobiera.aircast.commons.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;



public enum ParameterName {
	
	
	/*
	 * DEFAULT PARAMS
	 */
	STRING_NODE_TIMEZONE(ParameterType.GLOBAL, "Node Timezone", "Timezone of node."),
	STRING_LICENSE_KEY(ParameterType.GLOBAL, "License Key", "License Key"),
	STRING_LICENSE_CTL(ParameterType.GLOBAL, "License Ctl", "License Ctl"),
	LONG_PARAMETER_REFRESH_MILLIS(ParameterType.GLOBAL, "Parameter Refresh Interval (ms)", "Default refresh interval in milliseconds for all ParameterName cached values."),
	STRING_STK_BROWSER_VERSION_BLACKLIST(ParameterType.GLOBAL, "broken browser blacklist", "broken browser blacklist, ie 1:1360,1:0 blocks SAT impl browser with versions 1360 and 0"),
	INTEGER_UI_REFRESH_STATUS_SECONDS(ParameterType.GLOBAL, "Refresh rate for node status", "Refresh rate for node status SANE/INSANE"),
	STRING_REGISTERY_UUID(ParameterType.GLOBAL, "Registry UUID", "Registry UUID."),
	
	STRING_MSISDN_COUNTRY_PREFIX(ParameterType.GLOBAL, "Msisdn Country Prefix", "Msisdn Country Prefix"),
	BOOLEAN_MSISDN_DISCARD_UNKNOWN(ParameterType.GLOBAL, "Discard MSISDNs that are not in db", "Discard MSISDNs that are not in db"),

	BOOLEAN_GROUPS_MANAGEMENT_ENABLED(ParameterType.GLOBAL, "Groups Managemet Enabled", "Groups Management Enabled"),
	BOOLEAN_SENDERS_MANAGEMENT_ENABLED(ParameterType.GLOBAL, "Senders Managemet Enabled", "Senders Management Enabled"),

	BOOLEAN_SCHEDULER_STATS_ABBREVIATED(ParameterType.GLOBAL, "Abbreviated Scheduler Statistics", "Abbreviated Scheduler Statistics"),

	/*
	 * KEYCLOAK
	 */
	
	
	STRING_KC_URL(ParameterType.KEYCLOAK, "Keycloak URL", "Keycloak URL"),
	STRING_KC_REALM(ParameterType.KEYCLOAK, "Keycloak REALM", "Keycloak REALM"),
	STRING_KC_CLIENT_ID(ParameterType.KEYCLOAK, "Keycloak clientId", "Keycloak clientId"),
	STRING_KC_CLIENT_SECRET(ParameterType.KEYCLOAK, "Keycloak client secret", "Keycloak client secret"),
	BOOLEAN_REGENERATE_KC_ROLES(ParameterType.KEYCLOAK, "Force Regenerate of Keycloak Roles", "Force Regenerate of Keycloak Roles"),
	STRING_KC_LDAP_PREFIX(ParameterType.KEYCLOAK, "LDAP Prefix", "LDAP Prefix"),
	
	/*
	 * ADSAFE / VAS
	 */
	
	STRING_ADSAFE_OTP_MESSAGE_DRAFT(ParameterType.VAS, "Otp Message Draft", "Otp Message Draft"),
	STRING_VAS_HE_MNO_IP_POOL_WHITELIST(ParameterType.VAS, "Header Enrichment MNO Data IP Pool Whitelist", "Header Enrichment MNO Data IP Pool Whitelist"),// 
	STRING_VAS_VIETTEL_MPS_AMOUNT_DIVISER(ParameterType.VAS, "Viettel Mps Amount diviser", "Viettel Mps Amount diviser"),// 
	
	
	STRING_ADSAFE_AUTH_HEAD1_DEFAULT(ParameterType.VAS, "Adsafe Auth Head1 Default", "Adsafe Auth Head1 Default"),
	STRING_ADSAFE_AUTH_HEAD2_DEFAULT(ParameterType.VAS, "Adsafe Auth Head2 Default", "Adsafe Auth Head2 Default"),
	STRING_ADSAFE_AUTH_FOOT_ICON1_DEFAULT(ParameterType.VAS, "Adsafe Auth Foot Icon1 Default", "Adsafe Auth Foot Icon1 Default"),
	STRING_ADSAFE_AUTH_FOOT_ICON2_DEFAULT(ParameterType.VAS, "Adsafe Auth Foot Icon2 Default", "Adsafe Auth Foot Icon2 Default"),
	STRING_ADSAFE_AUTH_FOOT_ICON3_DEFAULT(ParameterType.VAS, "Adsafe Auth Foot Icon3 Default", "Adsafe Auth Foot Icon3 Default"),
	STRING_ADSAFE_AUTH_DISABLED_LANDING_DEFAULT(ParameterType.VAS, "Adsafe Auth Disabled Landing Default", "Adsafe Auth Disabled Landing Default"),
	STRING_ADSAFE_AUTH_INPUT_MSISDN_DEFAULT(ParameterType.VAS, "Adsafe Auth Input Msisdn Default", "Adsafe Auth Input Msisdn Default"),
	STRING_ADSAFE_AUTH_HEADER_ENRICHMENT_DEFAULT(ParameterType.VAS, "Adsafe Auth Header Enrichment Default", "Adsafe Auth Header Enrichment Default"),
	STRING_ADSAFE_AUTH_MSISDN_REQUIRED_DEFAULT(ParameterType.VAS, "Adsafe Auth Msisdn Required Default", "Adsafe Auth Msisdn Required Default"),
	STRING_ADSAFE_AUTH_MSISDN_LENGTH_ERROR_DEFAULT(ParameterType.VAS, "Adsafe Auth Msisdn Length Error Default", "Adsafe Auth Msisdn Length Error Default"),
	STRING_ADSAFE_AUTH_SUBMIT_MSISDN_DEFAULT(ParameterType.VAS, "Adsafe Auth Submit Msisdn Default", "Adsafe Auth Submit Msisdn Default"),
	STRING_ADSAFE_AUTH_INPUT_OTP_DEFAULT(ParameterType.VAS, "Adsafe Auth Input Otp Default", "Adsafe Auth Input Otp Default"),
	STRING_ADSAFE_AUTH_OTP_REQUIRED_DEFAULT(ParameterType.VAS, "Adsafe Auth Otp Required Default", "Adsafe Auth Otp Required Default"),
	STRING_ADSAFE_AUTH_OTP_LENGTH_ERROR_DEFAULT(ParameterType.VAS, "Adsafe Auth Length Error Default", "Adsafe Auth Length Error Default"),
	STRING_ADSAFE_AUTH_SUBMIT_OTP_DEFAULT(ParameterType.VAS, "Adsafe Auth Submit Otp Default", "Adsafe Auth Submit Otp Default"),
	STRING_ADSAFE_AUTH_AUTH_FAILED_DEFAULT(ParameterType.VAS, "Adsafe Auth Auth Failed Default", "Adsafe Auth Auth Failed Default"),
	STRING_ADSAFE_AUTH_AUTHENTICATED_DEFAULT(ParameterType.VAS, "Adsafe Auth Authenticated Default", "Adsafe Auth Authenticated Default"),
	STRING_ADSAFE_AUTH_TERMS_CONDITIONS_DEFAULT(ParameterType.VAS, "Adsafe Auth Terms Conditions Default", "Adsafe Auth Terms Conditions Default"),
	
	
	
	STRING_ADSAFE_AUTHZ_HEAD1_DEFAULT(ParameterType.VAS, "Adsafe Authz Head1 Default", "Adsafe Authz Head1 Default"),
	STRING_ADSAFE_AUTHZ_HEAD2_DEFAULT(ParameterType.VAS, "Adsafe Authz Head2 Default", "Adsafe Authz Head2 Default"),
	STRING_ADSAFE_AUTHZ_FOOT_ICON1_DEFAULT(ParameterType.VAS, "Adsafe Authz Foot Icon1 Default", "Adsafe Authz Foot Icon1 Default"),
	STRING_ADSAFE_AUTHZ_FOOT_ICON2_DEFAULT(ParameterType.VAS, "Adsafe Authz Foot Icon2 Default", "Adsafe Authz Foot Icon2 Default"),
	STRING_ADSAFE_AUTHZ_FOOT_ICON3_DEFAULT(ParameterType.VAS, "Adsafe Authz Foot Icon3 Default", "Adsafe Authz Foot Icon3 Default"),
	STRING_ADSAFE_AUTHZ_DISABLED_LANDING_DEFAULT(ParameterType.VAS, "Adsafe Authz Disabled Landing Default", "Adsafe Authz Disabled Landing Default"),
	
	STRING_ADSAFE_AUTHZ_SUBMIT_DEFAULT(ParameterType.VAS, "Adsafe Authz Submit Default", "Adsafe Authz Submit Default"),
	STRING_ADSAFE_AUTHZ_SUBSCRIPTION_SUCCESSFUL1_DEFAULT(ParameterType.VAS, "Adsafe Authz Subscription Successful #1 Default", "Adsafe Authz Subscription Successful #1 Default"),
	STRING_ADSAFE_AUTHZ_SUBSCRIPTION_SUCCESSFUL2_DEFAULT(ParameterType.VAS, "Adsafe Authz Subscription Successful #2 Default", "Adsafe Authz Subscription Successful #2 Default"),
	STRING_ADSAFE_AUTHZ_SUBSCRIPTION_SUCCESSFUL_INSTRUCTIONS_DEFAULT(ParameterType.VAS, "Adsafe Authz Subscription Instructions Default", "Adsafe Authz Subscription Instructions Default"),
	STRING_ADSAFE_AUTHZ_SUBSCRIPTION_FAILED_DEFAULT(ParameterType.VAS, "Adsafe Authz Subscription Failed Default", "Adsafe Authz Subscription Failed Default"),
	STRING_ADSAFE_AUTHZ_UNSUBSCRIBED_DEFAULT(ParameterType.VAS, "Adsafe Authz Unsubscribed Default", "Adsafe Authz Unsubscribed Default"),
	STRING_ADSAFE_AUTHZ_SEND_TO_SHORTCODE_DEFAULT(ParameterType.VAS, "Adsafe Authz Send to Shortcode Default", "Adsafe Authz Send to Shortcode Default"),
	STRING_ADSAFE_AUTHZ_EXPIRED_SUBSCRIPTION_DEFAULT(ParameterType.VAS, "Adsafe Authz Expired Subscription Default", "Adsafe Authz Expired Subscription Default"),
	STRING_ADSAFE_AUTHZ_INVITATION_TO_RECHARGE_DEFAULT(ParameterType.VAS, "Adsafe Authz Invitation to recharge", "Adsafe Authz Invitation to recharge"),
	STRING_ADSAFE_AUTHZ_AUTHENTICATED_DEFAULT(ParameterType.VAS, "Adsafe Authz Authenticated Default", "Adsafe Authz Authenticated Default"),
	
	
	/*
	 * Dashboard
	 */
	
	
	INTEGER_DASHBOARD_DISCOVERY_SAMPLES(ParameterType.DASHBOARD, "Samples for database size stats", "Number of recurrent samples for database size stats"),
	
	LONG_DASHBOARD_SHOW_RESIDENT_MIN_ATTEMPTED(ParameterType.DASHBOARD, "Min attempted to show resident campaign", "Min attempted to show resident campaign in dashboard"),
	
	LONG_DASHBOARD_SHOW_RESIDENT_MIN_ATTEMPTED_LAST24(ParameterType.DASHBOARD, "Min attempted last 24h to show resident campaign", "Min attempted last 24h to show resident campaign in dashboard"),
	
	LONG_DASHBOARD_SHOW_SCHEDULED_RUN_LAST_N_DAYS(ParameterType.DASHBOARD, "Show scheduled campaign run in the last N days", "Show scheduled campaign run in the last N days in dashboard"),
	
	LONG_DASHBOARD_SHOW_SIM_OS_MIN_ATTEMPTED_7DAYSAGO(ParameterType.DASHBOARD, "Min attempted 7 days ago to show sim os campaign", "Min attempted 7 days ago to show sim os campaign in dashboard"),
	LONG_DASHBOARD_SHOW_SIM_OS_MIN_ATTEMPTED_LAST24(ParameterType.DASHBOARD, "Min attempted last 24h to show sim os campaign", "Min attempted last 24h to show sim os campaign in dashboard"),
	
	LONG_DASHBOARD_SHOW_API_MIN_SENT_LAST24(ParameterType.DASHBOARD, "Min sent last 24h to show api campaign", "Min sent last 24h to show api campaign in dashboard"),
	LONG_DASHBOARD_SHOW_API_MIN_SENT_7DAYSAGO(ParameterType.DASHBOARD, "Min sent 7 days ago to show api campaign", "Min sent 7 days ago to show api campaign"),
	
	INTEGER_DASHBOARD_DATA_REFRESH_INTERVAL_SECONDS(ParameterType.DASHBOARD, "Interval between 2 data refresh", "Interval between 2 dashbiard data refresh"),
	/*
	 * Discovery
	 */
	
	LONG_DISCOVERY_ENABLED_REFRESH_MILLIS(ParameterType.DISCOVERY, "Discovery Enabled refresh (ms)", "Wait time in which the Smpp account discovery information must be Refresh"),// cada tiempo que se debe refrescar el cache de la informacion discovery  de la cuenta smpp
	BOOLEAN_DISCOVERY_GUESS_IMPLEMENTATION(ParameterType.DISCOVERY, "Guess STK Implementation", "When MNO has several STK impl and we do not know which sim has which impl, set this to true"),
	BOOLEAN_DISCOVERY_ONLY_NULL_STKIMPL(ParameterType.DISCOVERY, "Discover only SIMs with null stkImpl", "Discover only SIMs with null stkImpl"),
	LONG_DISCOVERY_GUESS_IMPLEMENTATION_TIMEOUT(ParameterType.DISCOVERY, "Guess Implementation Timeout (ms)", "Time to wait between 2 probes"),
	INTEGER_SIM_DISCOVERY_POLICY(ParameterType.DISCOVERY, "Sim Discovery Policy", "Define what to do when a sim has been discovered"),
	INTEGER_SIM_PROVISIONING_IDENTIFIER(ParameterType.DISCOVERY, "Sim provisionning identifier", "Sim provisionning identifier, usually best use ICCID"),
	INTEGER_SIM_KEYING_IDENTIFIER(ParameterType.DISCOVERY, "Sim Keying Identifier", "Sim Keying Identifier"),
	INTEGER_SIM_MIN_MSISDN_LENGTH(ParameterType.DISCOVERY, "Min MSISDN length", "Min MSISDN length"),
	INTEGER_SIM_MAX_MSISDN_LENGTH(ParameterType.DISCOVERY, "Max MSISDN length", "Max MSISDN length"),
	INTEGER_SIM_MIN_IMSI_LENGTH(ParameterType.DISCOVERY, "Min IMSI length", "Min IMSI length"),
	INTEGER_SIM_MAX_IMSI_LENGTH(ParameterType.DISCOVERY, "Max IMSI length", "Max IMSI length"),
	LONG_SIM_MSISDN_DEFAULT_LIFETIME_MILLIS(ParameterType.DISCOVERY, "Default lifetime of MSISDN (ms)", "When a msisdn is seen alive, consider it will be valid until now + this ms"), // time a msisdn is considered alive
	LONG_SIM_MSISDN_RECYCLE_AFTER_MILLIS(ParameterType.DISCOVERY, "Msisdn recycle after (ms)", "Set a msisdn as recycled if not seen alive more than this ms"),
	LONG_ALIVE_UPDATE_SIM_INTERVAL_MILLIS(ParameterType.DISCOVERY, "Alive update SIM each min (ms)", "To avoid updating last seen alive to often"),
	STRING_SIM_ROAMING_IMSI_PREFIX(ParameterType.DISCOVERY, "Sim Roaming imsi prefix", "Sim Roaming imsi prefix"),
	LONG_NOTIFY_SIM_INTERVAL_MILLIS(ParameterType.DISCOVERY, "Notify interval (ms)", "If enabled (see endpoints), set minimum interval between two notifications (ms)"),
	
	STRING_DISCOVERY_ALLOWED_HOURS(ParameterType.DISCOVERY, "Discovery Allowed Hours", "Hours allowed for discovery"),
	
	STRING_SCHEDULED_ALLOWED_HOURS(ParameterType.CAMPAIGN_POLICIES, "Scheduled Allowed Hours", "Hours allowed for Scheduled"),
	
	STRING_SIM_DEFAULT_STK_IMPL(ParameterType.CAMPAIGN_POLICIES, "Scheduled Allowed Hours", "Hours allowed for Scheduled"),
	STRING_FAILOVER_SIM_SET_DEFAULT_STK_IMPL(ParameterType.DISCOVERY, "Set a StkImpl to unknown SIMs with failover profile", "Set a StkImpl to unknown SIMs with failover profile"),
	/*
	 * SMS
	 */
	
	STRING_SMS_API_ALLOWED_HOURS(ParameterType.SMS, "Sms API Allowed Hours", "Hours allowed for SMS API"),

	
	
	/*
	 * Campaign Policies
	 */
	
	LONG_RUN_INTERACTIVE_INTERVAL_POLICY_MILLIS(ParameterType.CAMPAIGN_POLICIES, "Interactive Campaigns Interval (ms)", "Minimum Time Interval between 2 Interactive Campaigns for a given SIM."), // Numero de dias que debe esperar el usuario para poder recibir otra campaña de tipo interactiva
    LONG_RUN_DISCOVERY_INTERVAL_POLICY_MILLIS(ParameterType.CAMPAIGN_POLICIES, "Discovery Campaigns Interval (ms)", "Minimum Time Interval between 2 Discovery Attempts for a given SIM."),// Numero de dias que debe esperar el usuario para poder recibir otra campaña de tipo discovery 
    LONG_RUN_PERMANENT_INTERVAL_POLICY_MILLIS(ParameterType.CAMPAIGN_POLICIES, "Permanent Campaigns Interval (ms)", "Minimum Time Interval between 2 Permanent Campaigns for a given SIM."),// Numero de dias que debe esperar el usuario para poder recibir otra campaña de tipo Permanebte despues de que se han ejecutado todas las permanentes requeridas.
    
    
    
	/*
	 * Run Management
	 */
	
	INTEGER_RUN_TIMEOUT_MAX_PER_ITERATION(ParameterType.RUN_TUNING, "Run Timeout Max Per Iteration", "When looking for stucked run, maximum number of run to look for by query"),//
	LONG_RUN_TIMEOUT_SLEEP_PER_ITERATION_MILLIS(ParameterType.RUN_TUNING, "Run Timeout Sleep (ms)", "Thread wait time to query for timeout messages if previous query returned no run"),//Tiempo de espera en la cual el hilo busca los envios en timeout.
	LONG_RUN_NEXT_SCHEDULE_ADD_MILLIS(ParameterType.RUN_TUNING, "Run Next Schedule Add (ms)", "After how many ms to retry a failed run"),// Cuando hay un error o timeout en cuanto tiempo se debe esperar para volver a ejecutar la campaña para el usuario.
	LONG_RUN_BLOCK_TIMEOUT_MILLIS(ParameterType.RUN_TUNING, "Run Block Timeout after (ms)", "In case of run with several packets, after how many ms we will consider response timeout"), //Tiempo maximo de espera en la cual una campaña con sesion ( multiples paquetes) se considera timeout is no se recibe respuesta.
	INTEGER_RUN_SERVICE_MAX_OPENENED_SESSIONS(ParameterType.RUN_TUNING, "Maximum number of opened sessions", "The max number of concurrent sessions that can be used in parrallel for a given SIM."),// Minimo de tiempo de espera en la cual se deben ejecutar campañas exitosas consecutivas para un mismo usuario.
	LONG_RUN_PERMANENT_NO_RESULTS_SLEEP_PER_ITERATION_MILLIS(ParameterType.RUN_TUNING, "Permanent no result sleep (ms)", "Permanent no result sleep (ms)"),//Tiempo de inactividad en el cual el servicio que busca campañas permanentes activas debe esperar para volverse a ejecutar cuando no hay resultados.
	LONG_RUN_PERMANENT_OVERLOAD_SLEEP_PER_ITERATION_MILLIS(ParameterType.RUN_TUNING, "Permanent overload sleep (ms)", "Permanent overload sleep (ms)"),//Tiempo de espera para reintentar enviar mo, o mt cuando el sistema esta sobrecargado campañas permamentes
	LONG_RUN_DISCOVERY_NO_RESULTS_SLEEP_PER_ITERATION_MILLIS(ParameterType.RUN_TUNING, "Discovery no results slep (ms)", "Discovery no results slep (ms)"),//Tiempo de inactividad en el cual el servicio que busca campañas discovery activas debe esperar para volverse a ejecutar cuando no hay resultados.
	LONG_RUN_DISCOVERY_OVERLOAD_SLEEP_PER_ITERATION_MILLIS(ParameterType.RUN_TUNING, "Discovery overload sleep (ms)", "Discovery overload sleep (ms)"),//Tiempo de espera para reintentar enviar mo, o mt cuando el sistema esta sobrecargado campañas discovery
	LONG_RUN_INTERACTIVE_NO_RESULTS_SLEEP_PER_ITERATION_MILLIS(ParameterType.RUN_TUNING, "Interactive no results slep (ms)", "Interactive no results slep (ms)"),//Tiempo de inactividad en el cual el servicio que busca campañas interactivas activas debe esperar para volverse a ejecutar cuando no hay resultados.
	LONG_RUN_INTERACTIVE_OVERLOAD_SLEEP_PER_ITERATION_MILLIS(ParameterType.RUN_TUNING, "Interactive overload sleep (ms)", "Interactive overload sleep (ms)"),//Tiempo de espera para reintentar enviar mo, o mt cuando el sistema esta sobrecargado campañas interactivas
	LONG_RUN_GOSPOOL_NO_RESULTS_SLEEP_PER_ITERATION_MILLIS(ParameterType.RUN_TUNING, "Gospool no results slep (ms)", "Gospool no results slep (ms)"),//Tiempo de inactividad en el cual el servicio que busca colas gospool activas en la base de datos debe esperar para volverse a ejecutar cuando no hay resultados.
	LONG_RUN_GOSPOOL_OVERLOAD_SLEEP_PER_ITERATION_MILLIS(ParameterType.RUN_TUNING, "Gospool overload sleep (ms)", "Gospool overload sleep (ms)"),//Tiempo de espera para reintentar enviar mo, o mt cuando el sistema esta sobrecargado colas gospool

	
    INTEGER_RUN_MAIN_QUEUE_SIZE(ParameterType.RUN_TUNING, "Main queue size", "MAIN QUEUE size"), // Tamaños de la cola main
    INTEGER_RUN_UNIT_TEST_QUEUE_SIZE(ParameterType.RUN_TUNING, "Unit queue size", "UNIT TEST QUEUE size"), // Tamaño de la cola unit test en run service
    INTEGER_RUN_API_QUEUE_SIZE(ParameterType.RUN_TUNING, "API queue size", "API QUEUE size"),// Tamaño de la cola api 
    INTEGER_RUN_CONSUMER_THREADS(ParameterType.RUN_TUNING, "Max consumer threads", "Number of CONSUMER THREADS to queue processing"), // Tamaño de hilos del consumer para el procesamiento de las colas
	INTEGER_RUN_DESPOOL_MAX_TRIES(ParameterType.RUN_TUNING, "Max number of retries", "Number of tries when the GOSPOOL execution throws exceptions "),// Numero de intentos cuando se generan exepciones al ejecutar el gospool
	LONG_RUN_DESPOOL_NEXT_RETRY_MILLIS(ParameterType.RUN_TUNING, "Retry after (ms)", "Max wait time to retry the execution of GO process"),// CUando hay un error es el tiempo maximo en el cual se debe reintentar ejecutar el go
	
	LONG_RUN_INTERACTIVE_INTERVAL_DISCOVERED_MILLIS(ParameterType.RUN_TUNING, "Allow interactive campaigns after discovered (ms)", "In order to avoid sending interactive campaigns when sending permanent campaigns"), //Tiempo adicional que se debe sumar a la campaña interactiva para no interferir con las campañas permanentes. cuando se recibe la respuesta de la segmentacion solo cuando son sim nuevas
	
	
	INTEGER_RUN_DISCOVERY_PRODUCER_PER_ITERATION_MULTIPLIER(ParameterType.RUN_TUNING, "Discovery run factory multiplier fine tune", "Increase if production of new run is too slow"), // 
	INTEGER_RUN_INTERACTIVE_PRODUCER_PER_ITERATION_MULTIPLIER(ParameterType.RUN_TUNING, "Interactive run factory multiplier fine tune", "Increase if production of new run is too slow"),
	INTEGER_RUN_PERMANENT_PRODUCER_PER_ITERATION_MULTIPLIER(ParameterType.RUN_TUNING, "Permanent run factory multiplier fine tune", "Increase if production of new run is too slow"),
	INTEGER_RUN_GOSPOOL_PRODUCER_PER_ITERATION_MULTIPLIER(ParameterType.RUN_TUNING, "Gospool run factory multiplier fine tune", "Increase if production of new run is too slow"),

	STRING_RUN_TARGET_CAMPAIGN_ALLOWED_HOURS(ParameterType.RUN_TUNING, "Target Campaign allowed hours", "Target Campaign allowed hours"),
	STRING_RUN_TARGET_CAMPAIGN_ALLOWED_DAYS(ParameterType.RUN_TUNING, "Target Campaign allowed days", "Target Campaign allowed hours"),
	INTEGER_RUN_TARGET_CAMPAIGN_MAX_DAY_DELAY(ParameterType.RUN_TUNING, "Target Campaign max delay in days", "Target Campaign max delay in days"),
	
	
	/*
	 * SMPP
	 */
	INTEGER_SMPP_MO_DESPOOL_MAX_TRIES(ParameterType.SMPP, "MO despool max number of tries", "MO despool max number of tries"),
	LONG_SMPP_MO_SLEEP_PER_ITERATION_MILLIS(ParameterType.SMPP, "Time to sleep if no MO found (ms)", "Time to sleep if no MO found (ms)"),
	INTEGER_SMPP_MT_DESPOOL_MAX_TRIES(ParameterType.SMPP, "MT despool max number of tries", "MT despool max number of tries"),
	LONG_SMPP_MT_SLEEP_PER_ITERATION_MILLIS(ParameterType.SMPP, "Time to sleep if no MT found (ms)", "Time to sleep if no MT found (ms)"),
	LONG_SMPP_LOAD_FACTOR_THROTTLING_PERCENT(ParameterType.SMPP, "Load Factor Throttling Percent", "In case of full load of SMSC, this will affect throttling wait time at client side."),
	
	LONG_SMPP_MO_NEXT_RETRY_DELAY_MILLIS(ParameterType.SMPP, "Reschedule failed MO after (ms)", "Reschedule failed MO after (ms)"),
	LONG_SMPP_MT_NEXT_RETRY_DELAY_MILLIS(ParameterType.SMPP, "Reschedule failed MT after (ms)", "Reschedule failed MT after (ms)"),
//	STRING_SMPP_OUTGOING_MSISDN_PREFIX_REWRITE(ParameterType.SMPP, "Outgoing MSISDN rewrite regexp", "In case of being necessary, adjust rewriting of MSISDN"),
//	STRING_SMPP_INCOMING_MSISDN_PREFIX_REWRITE(ParameterType.SMPP, "Incoming MSISDN rewrite regexp", "In case of being necessary, adjust rewriting of MSISDN"),
	LONG_SMPP_VALIDITY_PERIOD_REFRESH_MILLIS(ParameterType.SMPP, "Validity Period refresh (ms)", "If validity period has been reconfigured, it will be taken into account afetr these ms."),
	LONG_SMPP_UNSUPPORTED_VALIDITY_PERIOD_DEFAULT_TTL_MILLIS(ParameterType.SMPP, "In case of unsupported validity period, use this one (ms)", "desc"),
	LONG_DEFAULT_SMPP_ACCOUNT_ID(ParameterType.SMPP, "Default Smpp Account id", "Set default smpp account"),
	
	INTEGER_SMPP_NON_INTERACTIVE_MAX_PENDING_MTS_PER_TPS(ParameterType.SMPP, "Max number of non interactive pending MTs", "Max number of non interactive pending MTs"), // maximum pending MTs in spool per TPS for NON INTERACTIVE campaigns
	INTEGER_SMPP_INTERACTIVE_MAX_PENDING_MTS_PER_TPS(ParameterType.SMPP, "Max number of interactive pending MTs", "Max number of interactive pending MTs"), // maximum pending MTs in spool per TPS for INTERACTIVE campaigns
	
	LONG_SMPP_FREE_TPS_RESSOURCE_REFRESH_MILLIS(ParameterType.SMPP, "Free Tps resource refresh (ms)", "refresh available TPS resources each this ms"),
	LONG_SMPP_SMPP_ACCOUNT_VO_REFRESH_MILLIS(ParameterType.SMPP, "Smpp Account subservice info refresh (ms)", "Smpp Account subservice info refresh (ms)"),
	
	BOOLEAN_SMPP_PERSIST_MT_IN_DLR_SPOOL(ParameterType.SMPP, "Persist MTs in Dlr Spool table", "Persist MTs in Dlr Spool table. Works only if DLR is requested"),
	
	/*
	 * MESSAGING
	 */
	LONG_MESSAGING_PURGE_INTERVAL_MILLIS(ParameterType.MESSAGING, "Messaging purge interval (ms)", "Look for purgeable messages each this ms"),
	INTEGER_MESSAGING_MT_DESPOOL_THREADS(ParameterType.MESSAGING, "Messaging MT Despool Threads", "If not configured in Smpp Account, this default value will be used"),
	INTEGER_MESSAGING_MT_DESPOOL_QUEUE_SIZE(ParameterType.MESSAGING, "MT Despool queue size", "MT Despool queue size"),
	INTEGER_MESSAGING_MO_DESPOOL_THREADS(ParameterType.MESSAGING, "Messaging MO Despool Threads", "If not configured in Smpp Account, this default value will be used"),
	INTEGER_MESSAGING_MO_DESPOOL_QUEUE_SIZE(ParameterType.MESSAGING, "MO Despool queue size", "MO Despool queue size"),
	BOOLEAN_SMSC_KEEP_DLRS(ParameterType.MESSAGING, "Keep SMSC msgId information", "Keep row in DLR table for audit purpose."),
	BOOLEAN_API_ALLOW_OUTGOING_BINARY_MESSAGES(ParameterType.MESSAGING, "Allow sending of binary MT SMS with API", "Allow outgoing binary SMS with API (dangerous)"),
	INTEGER_SMSC_MAX_CONCATENATED_MSGS(ParameterType.MESSAGING, "SMSC max concatenated messages", "SMSC max concatenated messages"),
	INTEGER_SMSC_MAX_LENGTH_MSGS(ParameterType.MESSAGING, "SMSC messages max length", "SMSC messages max length"),	
	
	STRING_VAS_UNSUBSCRIBED_CONFIRMATION_MT(ParameterType.VAS, "Unsubscribed Confirmation MT", "Unsubscribed Confirmation MT"),
	STRING_VAS_SUBSCRIBED_CONFIRMATION_MT(ParameterType.VAS, "Subscribed Confirmation MT", "Subscribed Confirmation MT"),
	STRING_VAS_NOT_SUBSCRIBED_CONFIRMATION_MT(ParameterType.VAS, "Not Subscribed Confirmation MT", "Not Subscribed Confirmation MT"),
	STRING_VAS_RENEWED_CONFIRMATION_MT(ParameterType.VAS, "Renewed Subscription Confirmation MT", "Renewed Subscription Confirmation MT"),
	STRING_VAS_DOUBLE_OPTIN_CONFIRMATION_MT(ParameterType.VAS, "Double Optin Confirmation MT", "Double Optin Confirmation MT"),

	STRING_VAS_DOUBLE_OPTIN_KW(ParameterType.VAS, "Double Optin Keyword", "Double Optin Keyword"),
	BOOLEAN_VAS_SMS_DOUBLE_OPTIN_ENABLED(ParameterType.VAS, "Enable double-optin for SMS subscriptions", "Enable double-optin for SMS subscriptions"),
	
	INTEGER_VAS_CHARGING_ATTEMPTS_PER_DAY(ParameterType.VAS, "Charging attempts per day", "Charging attempts per day"),
	
	STRING_VAS_CHARGING_ALLOWED_HOURS(ParameterType.VAS, "Charging allowed hours", "Charging allowed hours"),
	STRING_VAS_RENEW_MESSAGE_ALLOWED_HOURS(ParameterType.VAS, "Renew message allowed hours", "Renew message allowed hours"),
	
	INTEGER_VAS_CHARGING_TEMP_ERROR_MAX_DAYS(ParameterType.VAS, "Max days with temp error", "Max days with temp error"),
	
	
	
	/*
	 * SLEEPY
	 */
	BOOLEAN_SLEEPY_RESPONSE_USE_0348UDH(ParameterType.SLEEPY, "Use 03.48 header in sleepy response", "If set to true, response with include a 03.48 header"),
	INTEGER_SLEEPY_RESPONSE_DCS(ParameterType.SLEEPY, "Dcs of Sleepy responses", "Dcs for Sleepy response, usually 0xF6 (246)"),
	INTEGER_SLEEPY_RESPONSE_PID(ParameterType.SLEEPY, "Pid of Sleepy responses", "PID for Sleepy response, usually 0x7F (127)"),
	INTEGER_SLEEPY_RESPONSE_ALT_EXPECTED_PID(ParameterType.SLEEPY, "Alt Pid of Sleepy responses", "Sometimes, response arrives with pid=0, even if set to another value."),
	STRING_SLEEPY_OUTGOING_SHORTCODE(ParameterType.SLEEPY, "Outgoing shortcode", "Usually not used as defined in smpp account. Shortcode must match default smpp account"),
	STRING_SLEEPY_RESPONSE_SHORTCODE(ParameterType.SLEEPY, "Incoming shortcode", "Usually not used as defined in smpp account. Shortcode must match default smpp account"),
	INTEGER_SLEEPY_CLIENT_VER(ParameterType.SLEEPY, "Default client version", "Sleepy default client version"),
	INTEGER_SLEEPY_MAX_COMMAND_LENGTH(ParameterType.SLEEPY, "Max command length", "In bytes"),
	INTEGER_SLEEPY_DEFAULT_MENU_ENTRIES(ParameterType.SLEEPY, "Default number of menu entries", "Default number of menu entries, set the lowest number of entries, in case someone forgets to set it in Sim Profile"),
	BOOLEAN_API_ALLOW_SLEEPY_ADMINISTRATIVE_COMMANDS(ParameterType.SLEEPY, "Enable sleepy admin commands in API", "Allow sleepy admin commands (dangerous)"),
	BOOLEAN_API_ALLOW_SLEEPY_KEY_CHANGE(ParameterType.SLEEPY, "Allow API sleepy key change", "Do not enable!"),
	INTEGER_SLEEPY_FLOW_CACHE_LIFETIME_SECONDS(ParameterType.SLEEPY, "Sleepy Flow cache liftime (seconds)", "Sleepy Flow cache liftime (seconds)"),
	STRING_SLEEPY_API_ALLOWED_HOURS(ParameterType.SLEEPY, "Sleepy API Allowed Hours", "Hours allowed for SLEEPY API"),
	BOOLEAN_SLEEPY_DISABLE_RESPONSE_CIPHERING(ParameterType.SLEEPY, "Force disabling ciphering for sleepy response", "If set to true, response will never be ciphered"),

	/*
	 * API Config
	 */
	
	INTEGER_PUSH_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Push API concurrent requests", "Push API concurrent requests"),
	INTEGER_SIM_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Sim API concurrent requests", "Sim API concurrent requests"),
	INTEGER_SIM_PROFILE_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Sim Profile API concurrent requests", "Sim Profile API concurrent requests"),
	INTEGER_GENERIC_ENTITY_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Generic Entity API concurrent requests", "Generic Entity API concurrent requests"),
	INTEGER_CAMPAIGN_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Campaign API concurrent requests", "Campaign API concurrent requests"),
	INTEGER_ENDPOINT_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Endpoint API concurrent requests", "Endpoint API concurrent requests"),
	INTEGER_PARAMETER_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Parameter API concurrent requests", "Parameter API concurrent requests"),
	INTEGER_SMPP_ACCOUNT_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Smpp Account API concurrent requests", "Smpp Account API concurrent requests"),
	INTEGER_STAT_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Stat API concurrent requests", "Stat API concurrent requests"),
	INTEGER_TP_RULE_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Tp Rule API concurrent requests", "Tp Rule API concurrent requests"),
	INTEGER_AUTHORIZATION_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Authorization API concurrent requests", "Authorization API concurrent requests"),
	INTEGER_CAMPAIGN_SCHEDULE_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Campaign Schedule API concurrent requests", "Campaign Schedule API concurrent requests"),
	INTEGER_NODE_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Node API concurrent requests", "Node API concurrent requests"),
	INTEGER_DEVICE_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Device API concurrent requests", "Device API concurrent requests"),
	INTEGER_APPLET_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Applet API concurrent requests", "Applet API concurrent requests"),
	INTEGER_PREFERENCE_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Preference API concurrent requests", "Preference API concurrent requests"),
	INTEGER_FILE_UPLOAD_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "File Upload API concurrent requests", "File Upload API concurrent requests"),
	INTEGER_USTK_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Ustk API concurrent requests", "Ustk API concurrent requests"),
	INTEGER_INTROSPECTION_API_MAX_CONCURRENT_REQUESTS(ParameterType.API_LIMITS, "Introspection API concurrent requests", "Introspection API concurrent requests"),
	
	
	/*
	 * API Policies
	 */
	
	
	
	STRING_API_PUSH_ALLOWED_IP_ADDRESSES(ParameterType.API_POLICIES, "Allowed IPs for Sleepy/Sms API", "To bypass auth token"),// 
	STRING_API_KINETIC_TP_ALLOWED_IP_ADDRESSES(ParameterType.API_POLICIES, "Allowed TP IPs for Kinetic API", "To bypass auth token"),// 
	STRING_API_KINETIC_ADSAFE_ALLOWED_IP_ADDRESSES(ParameterType.API_POLICIES, "Allowed Adsafe IPs for Kinetic API", "To bypass auth token"),// 
	STRING_API_AUTHORIZATION_ALLOWED_IP_ADDRESSES(ParameterType.API_POLICIES, "Allowed IPs for Authorization API", "To bypass auth token"),// 
	STRING_API_ADMINISTRATIVE_ALLOWED_IP_ADDRESSES(ParameterType.API_POLICIES, "Allowed IPs for Administrative access", "To bypass auth token"), // 
	STRING_API_UI_ALLOWED_IP_ADDRESSES(ParameterType.API_POLICIES, "Allowed IPs for UI testing", "To bypass auth token"), // 
	STRING_API_USTK_ALLOWED_IP_ADDRESSES(ParameterType.API_POLICIES, "Allowed IPs for USTK API", "To bypass auth token"),
	BOOLEAN_CONVERT_TO_STANDARD_OK_HTTP_CODE(ParameterType.API_POLICIES, "Convert to standard http code", "To always answer 200 and note 201"),
	STRING_API_REQUIRES_STANDARD_HTTP_CODE(ParameterType.API_POLICIES, "Api Requires standard http code", "Api Requires standard http code"),
	LONG_PUSH_API_THROTTLING_DELAY_MILLIS(ParameterType.API_POLICIES, "Push API testing throttling delay (ms)", "Push API testing throttling delay (ms)"),
	STRING_API_MICROSERVICE_INTERNAL_IP_ADDRESSES(ParameterType.API_POLICIES, "Allowed IPs for inter service communication", "Allowed IPs for inter service communication"), // 
	
	
	/*
	 * POLICIES
	 */
	
	STRING_POLICY_P0_NAME(ParameterType.CAMPAIGN_POLICIES, "Name of P0 Policy", "Name of P0 Policy"),// 
	STRING_POLICY_P1_NAME(ParameterType.CAMPAIGN_POLICIES, "Name of P1 Policy", "Name of P1 Policy"),// 
	STRING_POLICY_P2_NAME(ParameterType.CAMPAIGN_POLICIES, "Name of P2 Policy", "Name of P2 Policy"),// 
	STRING_POLICY_P3_NAME(ParameterType.CAMPAIGN_POLICIES, "Name of P3 Policy", "Name of P3 Policy"),// 
	STRING_POLICY_P4_NAME(ParameterType.CAMPAIGN_POLICIES, "Name of P4 Policy", "Name of P4 Policy"),// 
	STRING_POLICY_P5_NAME(ParameterType.CAMPAIGN_POLICIES, "Name of P5 Policy", "Name of P5 Policy"),// 
	
	INTEGER_POLICY_P0_DAYS(ParameterType.CAMPAIGN_POLICIES, "Number of days between 2 impacts for P0 Policy", "Number of days between 2 impacts when looking for msisdn in full database for P0 Policy"),// 
	INTEGER_POLICY_P1_DAYS(ParameterType.CAMPAIGN_POLICIES, "Number of days between 2 impacts for P1 Policy", "Number of days between 2 impacts when looking for msisdn in full database for P1 Policy"),// 
	INTEGER_POLICY_P2_DAYS(ParameterType.CAMPAIGN_POLICIES, "Number of days between 2 impacts for P2 Policy", "Number of days between 2 impacts when looking for msisdn in full database for P2 Policy"),// 
	INTEGER_POLICY_P3_DAYS(ParameterType.CAMPAIGN_POLICIES, "Number of days between 2 impacts for P3 Policy", "Number of days between 2 impacts when looking for msisdn in full database for P3 Policy"),// 
	INTEGER_POLICY_P4_DAYS(ParameterType.CAMPAIGN_POLICIES, "Number of days between 2 impacts for P4 Policy", "Number of days between 2 impacts when looking for msisdn in full database for P4 Policy"),// 
	INTEGER_POLICY_P5_DAYS(ParameterType.CAMPAIGN_POLICIES, "Number of days between 2 impacts for P5 Policy", "Number of days between 2 impacts when looking for msisdn in full database for P5 Policy"),// 
	
	STRING_POLICY_P0_IMPACT_LIMIT(ParameterType.CAMPAIGN_POLICIES, "Max number of impacts per periodicity for P0 Policy", "Max number of impacts per periodicity for P0 Policy when using lists in campaigns. Ex 3/DAY, 10/WEEK, 5/MONTH"),// 
	STRING_POLICY_P1_IMPACT_LIMIT(ParameterType.CAMPAIGN_POLICIES, "Max number of impacts per periodicity for P1 Policy", "Max number of impacts per periodicity for P1 Policy when using lists in campaigns. Ex 3/DAY, 10/WEEK, 5/MONTH"),// 
	STRING_POLICY_P2_IMPACT_LIMIT(ParameterType.CAMPAIGN_POLICIES, "Max number of impacts per periodicity for P2 Policy", "Max number of impacts per periodicity for P2 Policy when using lists in campaigns. Ex 3/DAY, 10/WEEK, 5/MONTH"),// 
	STRING_POLICY_P3_IMPACT_LIMIT(ParameterType.CAMPAIGN_POLICIES, "Max number of impacts per periodicity for P3 Policy", "Max number of impacts per periodicity for P3 Policy when using lists in campaigns. Ex 3/DAY, 10/WEEK, 5/MONTH"),// 
	STRING_POLICY_P4_IMPACT_LIMIT(ParameterType.CAMPAIGN_POLICIES, "Max number of impacts per periodicity for P4 Policy", "Max number of impacts per periodicity for P4 Policy when using lists in campaigns. Ex 3/DAY, 10/WEEK, 5/MONTH"),// 
	STRING_POLICY_P5_IMPACT_LIMIT(ParameterType.CAMPAIGN_POLICIES, "Max number of impacts per periodicity for P5 Policy", "Max number of impacts per periodicity for P5 Policy when using lists in campaigns. Ex 3/DAY, 10/WEEK, 5/MONTH"),// 
	
	INTEGER_AUTO_ARCHIVE_EXECUTED_CAMPAIGNS_AFTER_DAYS(ParameterType.CAMPAIGN_POLICIES, "Auto archive campaigns after N days", "Auto archive campaigns after N days"),
	INTEGER_AUTO_PURGE_LISTS_OF_ARCHIVED_CAMPAIGNS_AFTER_DAYS(ParameterType.CAMPAIGN_POLICIES, "Auto purge list of archived campaigns after N days", "Auto purge list of archived campaigns after N days"),

	/*
	 * Device API & TAC DB Update
	 */
	LONG_MAX_DELAY_BETWEEN_DEVICE_UPDATE_MILLIS(ParameterType.DEVICE_AND_TAC_DB, "Delay between device updates (ms)", "Delay between device updates (ms)"),
	BOOLEAN_DEVICE_DEFAULT_SMART_DEVICE(ParameterType.DEVICE_AND_TAC_DB, "Smart device by default", "Smart device by default"),
	BOOLEAN_DEVICE_DEFAULT_STK_DT_HP(ParameterType.DEVICE_AND_TAC_DB, "High Priority DisplayText supported by default", "High Priority DisplayText supported by default"),
	BOOLEAN_DEVICE_DEFAULT_STK_DT_HP_FC(ParameterType.DEVICE_AND_TAC_DB, "High Priority DisplayText first Action supported by default", "High Priority DisplayText first Action supported by default"),
	BOOLEAN_DEVICE_DEFAULT_STK_DT_LP(ParameterType.DEVICE_AND_TAC_DB, "Low Priority DisplayText supported by default", "Low Priority DisplayText supported by default"),
	BOOLEAN_DEVICE_DEFAULT_STK_GI(ParameterType.DEVICE_AND_TAC_DB, "GetInput supported by default", "GetInput supported by default"),
	BOOLEAN_DEVICE_DEFAULT_STK_GI_PWD(ParameterType.DEVICE_AND_TAC_DB, "GetInput Password supported by default", "GetInput Password supported by default"),
	BOOLEAN_DEVICE_DEFAULT_STK_LB(ParameterType.DEVICE_AND_TAC_DB, "LaunchBrowser supported by default", "LaunchBrowser supported by default"),
	BOOLEAN_DEVICE_DEFAULT_STK_LB_TITLE(ParameterType.DEVICE_AND_TAC_DB, "LaunchBrowser title supported by default", "LaunchBrowser title supported by default"),
	BOOLEAN_DEVICE_DEFAULT_SI(ParameterType.DEVICE_AND_TAC_DB, "Select Item supported by default", "Select Item supported by default"),
	BOOLEAN_DEVICE_DEFAULT_USSD(ParameterType.DEVICE_AND_TAC_DB, "USSD supported by default", "USSD supported by default"),
	BOOLEAN_DEVICE_DEFAULT_USSD_TITLE(ParameterType.DEVICE_AND_TAC_DB, "USSD Title supported by default", "USSD Title supported by default"),
	BOOLEAN_DEVICE_DEFAULT_SC(ParameterType.DEVICE_AND_TAC_DB, "Setup Call supported by default", "Setup Call supported by default"),
	BOOLEAN_DEVICE_DEFAULT_SC_TITLE(ParameterType.DEVICE_AND_TAC_DB, "Setup Call title supported by default", "Setup Call title supported by default"),
	INTEGER_DEVICE_DEFAULT_GATHERED_TYPE(ParameterType.DEVICE_AND_TAC_DB, "Default gathered type", "Default gathered type"),
	INTEGER_DEVICE_DEFAULT_GATHERED_OS(ParameterType.DEVICE_AND_TAC_DB, "Default gathered OS", "Default gathered OS"),
	
	
	
    /*
	 * Authorization
	 */
	LONG_AUTHORIZATION_SESSION_TIMEOUT_MILLIS(ParameterType.GLOBAL, "LONG_AUTHORIZATION_SESSION_TIMEOUT_MILLIS", "After this timeout in milliseconds, a response to an Authorization challenge will be considered refused."),

	
	
	
	
	/*
	 * MICROSERVICES (NEW)
	 */
	
	
	/*
	 * MM7
	 */
	
	BOOLEAN_DEBUG_MS_MM7_CONTROLLER(ParameterType.MMS, "Debug MM7 Controller", "Debug MM7 Controller"),
	BOOLEAN_DEBUG_MS_MM7_STAT_PRODUCER(ParameterType.MMS, "Debug MM7 Stat Producer", "Debug MM7 Stat Producer"),
	BOOLEAN_DEBUG_MS_MM7_SERVICE_STATUS_CONSUMER(ParameterType.MMS, "Debug MM7 Service Status Consumer", "Debug MM7 Service Status Consumer"),
	BOOLEAN_DEBUG_MS_MM7_CONSUMER(ParameterType.MMS, "Debug MM7 Consumer", "Debug MM7 Consumer"),
	BOOLEAN_DEBUG_MS_MM7_PRODUCER(ParameterType.MMS, "Debug MM7 Producer", "Debug MM7 Producer"),
	BOOLEAN_DEBUG_MS_MM7_SERVICE(ParameterType.MMS, "Debug MM7 Service", "Debug MM7 Service"),
	
	BOOLEAN_DEBUG_MS_MESSAGING_API_MMS_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Mms Producer", "Debug Messaging API Mms Producer"),
	BOOLEAN_DEBUG_MS_MESSAGING_API_MMS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Mms Consumer", "Debug Messaging API Mms Consumer"),
	
	
		BOOLEAN_DEBUG_MS_SMPP_CLIENT_LMBD_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client LMBD Service", "Debug Smpp Client LMBD Service"),
	
		BOOLEAN_DEBUG_MS_SMPP_CLIENT_SMPP_CONTROLLER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Smpp Controller", "Debug Smpp Client Smpp Controller"),

		BOOLEAN_DEBUG_MS_SMPP_CLIENT_SMPP_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Smpp Service", "Debug Smpp Client Smpp Service"),

		BOOLEAN_DEBUG_MS_SMPP_CLIENT_SMS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Sms Comsumer", "Debug Smpp Client Sms Comsumer"),

		BOOLEAN_DEBUG_MS_SMPP_CLIENT_SMS_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Sms Producer", "Debug Smpp Client Sms Producer"),
		BOOLEAN_DEBUG_MS_SMPP_CLIENT_STAT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Stat Producer", "Debug Smpp Client Stat Producer"),
		BOOLEAN_DEBUG_MS_SMPP_CLIENT_SERVICE_LOG_PRODUCER	(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Service Log Producer", "Debug Smpp Client Service Log Producer"),
		BOOLEAN_DEBUG_MS_SMPP_CLIENT_SERVICE_STATUS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Service Status Consumer", "Debug Smpp Client Service Status Consumer"),

		
		BOOLEAN_DEBUG_MS_SMPP_SERVER_STATUS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Server Service Status Consumer", "Debug Smpp Server Service Status Consumer"),
		BOOLEAN_DEBUG_MS_SMPP_SERVER_ENDPOINT_CONTROLLER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Server Endpoint Controller", "Debug Smpp Server Endpoint Controller"),
		BOOLEAN_DEBUG_MS_SMPP_SERVER_STAT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Server Stat Producer", "Debug Smpp Server Stat Producer"),
		BOOLEAN_DEBUG_MS_VIETTEL_MPS_ADAPTER_STAT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Viettel Mps Adapter Stat Producer", "Debug Viettel Mps Adapter Stat Producer"),
		BOOLEAN_DEBUG_MS_GENERIC_VAS_ADAPTER_STAT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Generic Vas Adapter Stat Producer", "Debug Generic Vas Adapter Stat Producer"),
		BOOLEAN_DEBUG_MS_BILLING_ADAPTER_STAT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Billing Adapter Stat Producer", "Debug Billing Adapter Stat Producer"),
		BOOLEAN_DEBUG_MS_SMPP_SERVER_SMS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Server Sms Consumer", "Debug Smpp Server Sms Consumer"),
		BOOLEAN_DEBUG_MS_SMPP_SERVER_SMS_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Server Sms Producer", "Debug Smpp Server Sms Producer"),
		BOOLEAN_DEBUG_MS_SMPP_SERVER_CH(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Server Cloud Hopper", "Debug Smpp Server Cloud Hopper"),
		
		BOOLEAN_DEBUG_MS_KINETIC_STATUS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Kinetic Status Consumer", "Debug Kinetic Status Consumer"),
		BOOLEAN_DEBUG_MS_KINETIC_ENDPOINT_CONTROLLER(ParameterType.MICROSERVICE_DEBUG, "Debug Kinetic Endpoint Controller", "Debug Kinetic Endpoint Controller"),
		BOOLEAN_DEBUG_MS_KINETIC_STAT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Kinetic Stat Producer", "Debug Kinetic Stat Producer"),
		BOOLEAN_DEBUG_MS_KINETIC_EVENT_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Kinetic Event Consumer", "Debug Kinetic Event Consumer"),
		BOOLEAN_DEBUG_MS_KINETIC_EVENT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Kinetic Event Producer", "Debug Kinetic Event Producer"),
		BOOLEAN_DEBUG_MS_KINETIC_SERVER_API(ParameterType.MICROSERVICE_DEBUG, "Debug Kinetic Server API", "Debug Kinetic Server API"),
		BOOLEAN_DEBUG_MS_KINETIC_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Kinetic Kinetic Service", "Debug Kinetic Kinetic Service"),
		
		BOOLEAN_DEBUG_MS_SMPP_CLIENT_CLOUD_HOPPER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Cloudhopper", "Debug Smpp Client Cloudhopper"),
			
		BOOLEAN_DEBUG_MS_USTK_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Ustk Service", "Debug Ustk Service"),
				
		BOOLEAN_DEBUG_MS_MESSAGING_API_SMS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Sms Consumer", "Debug Messaging API Sms Consumer"),

		BOOLEAN_DEBUG_MS_MESSAGING_API_SMS_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Sms Producer", "Debug Messaging API Sms Producer"),
		
		BOOLEAN_DEBUG_MS_SIM_ALIVE_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Sim Alive Producer", "Debug Sim Alive Producer"),
		BOOLEAN_DEBUG_MS_SIM_ALIVE_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Sim Alive Consumer", "Debug Sim Alive Consumer"),
		
		BOOLEAN_DEBUG_MS_SIM_FILE_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Sim File Producer", "Debug Sim Ota File Producer"),
		BOOLEAN_DEBUG_MS_SIM_FILE_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Sim File Comsumer", "Debug Sim Ota File Consumer"),
		
		BOOLEAN_DEBUG_MS_PM_FILE_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Pm File Producer", "Debug Pm File Producer"),
		BOOLEAN_DEBUG_MS_PM_FILE_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Pm File Consumer", "Debug Pm File Consumer"),
		
		
		
		BOOLEAN_DEBUG_MS_SIM_DISCOVERY_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Sim Discovery Service", "Debug Sim Discovery Service"),
		
		BOOLEAN_DEBUG_MS_MESSAGING_API_STATUS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Status Consumer", "Debug Messaging API Status Consumer"),
		
		BOOLEAN_DEBUG_MS_MESSAGING_API_ENDPOINT_CONTROLLER(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Endpoint Controller", "Debug Messaging API Endpoint Controller"),
		
		BOOLEAN_DEBUG_MS_MESSAGING_API_QUEUE_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Queue Service", "Debug Messaging API Queue Service"),
		
		BOOLEAN_DEBUG_MS_MESSAGING_API_SLEEPY_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Sleepy Service", "Debug Messaging API Sleepy Service"),
		
		BOOLEAN_DEBUG_MS_MESSAGING_API_SMS_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Sms Service", "Debug Messaging API Sms Service"),
		
		BOOLEAN_DEBUG_MS_MESSAGING_API_USTK_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Ustk Service", "Debug Messaging API Ustk Service"),

		BOOLEAN_DEBUG_MS_PM_SIM_APPLET_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Pm Sim Applet Service", "Debug Pm Sim Applet Service"),
		BOOLEAN_DEBUG_MS_PM_SIM_STAT_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Pm Sim Stat Service", "Debug Pm Sim Stat Service"),
		
		BOOLEAN_DEBUG_MS_PM_SIM_PROFILE_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Pm Sim Sim Profile Service", "Debug Pm Sim Sim Profile Service"),
		
		BOOLEAN_DEBUG_MS_PM_SIM_SIM_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Pm Sim Sim Service", "Debug Pm Sim Sim Service"),
		
		BOOLEAN_DEBUG_MS_PM_FILE_UPLOAD_API(ParameterType.MICROSERVICE_DEBUG, "Debug Pm File Upload API", "Debug Pm File Upload API"),
		
		
		
		BOOLEAN_DEBUG_MS_GENERIC_ENTITY_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Generic Entity Service", "Debug Generic Entity Service"),
		
		
		
		BOOLEAN_DEBUG_MS_MESSAGING_API_CAMPAIGN_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Campaign Service", "Debug Campaign Service"),

		BOOLEAN_DEBUG_MS_CM_CONTROLLER(ParameterType.MICROSERVICE_DEBUG, "Debug Controller", "Debug Controller"),
		
		BOOLEAN_DEBUG_MS_CM_DISCOVERY_RUNNER(ParameterType.MICROSERVICE_DEBUG, "Debug CM Discovery Runner", "Debug CM Discovery Runner"),
		BOOLEAN_DEBUG_MS_CM_SCHEDULED_RUNNER(ParameterType.MICROSERVICE_DEBUG, "Debug CM Scheduled Runner", "Debug CM Scheduled Runner"),
		BOOLEAN_DEBUG_MS_CM_DELAYED_RUNNER(ParameterType.MICROSERVICE_DEBUG, "Debug CM Delayed Campaign Runner", "Debug CM Delayed Campaign Runner"),
		
		BOOLEAN_DEBUG_MS_CM_CAMPAIGN_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug CM Campaign Service", "Debug CM Campaign Service"),

		BOOLEAN_DEBUG_MS_CM_STATUS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug CM Status Consumer", "Debug CM Status Consumer"),

		BOOLEAN_DEBUG_MS_CM_CAMPAIGN_RESOURCE(ParameterType.MICROSERVICE_DEBUG, "Debug CM Campaign Resource", "Debug CM Campaign Resource"),

		BOOLEAN_DEBUG_MS_CM_SLEEPY_FLOW(ParameterType.MICROSERVICE_DEBUG, "Debug CM Sleepy Flow", "Debug CM Sleepy Flow"),

		BOOLEAN_DEBUG_MS_CM_API_RESPONSE_CLIENT(ParameterType.MICROSERVICE_DEBUG, "Debug CM Api Response Client", "Debug CM Api Response Client"),

		BOOLEAN_DEBUG_MS_CM_STAT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug CM Stat Producer", "Debug CM Stat Producer"),

		BOOLEAN_DEBUG_MS_CM_ADVERTISING_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug CM Advertising Service", "Debug CM Advertising Service"),

		BOOLEAN_DEBUG_MS_PM_AD_API(ParameterType.MICROSERVICE_DEBUG, "Debug PM Ad API", "Debug PM Ad API"),

		
		BOOLEAN_DEBUG_MS_SMPP_CLIENT_APPLET_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Applet Service", "Debug Smpp Client Applet Service"),
		
		BOOLEAN_DEBUG_MS_SMPP_CLIENT_TRAFFIC_ANALYSER(ParameterType.MICROSERVICE_DEBUG, "Debug Smpp Client Traffic Analyser", "Debug Smpp Client Traffic Analyser"),

		BOOLEAN_DEBUG_MS_MESSAGING_API_STAT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Messaging API Stat Producer", "Debug Messaging API Stat Producer"),

		
		BOOLEAN_DEBUG_MS_VIETTEL_MPS_ADAPTER_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Viettel Mps Adapter Consumer", "Debug Viettel Mps Adapter Consumer"),
		BOOLEAN_DEBUG_MS_VIETTEL_MPS_ADAPTER_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Viettel Mps Adapter Producer", "Debug Viettel Mps Adapter Producer"),
		BOOLEAN_DEBUG_MS_VIETTEL_MPS_CHARGE_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Viettel Mps Charge Service", "Debug Viettel Mps Charge Service"),
		BOOLEAN_DEBUG_MS_VIETTEL_MPS_NOTIF_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Viettel Mps Notif Service", "Debug Viettel Mps Notif Service"),
		
		BOOLEAN_DEBUG_MS_VIETTEL_MPS_ADAPTER_CONTROLLER(ParameterType.MICROSERVICE_DEBUG, "Debug Viettel Mps Adapter Controller", "Debug Viettel Mps Adapter Controller"),
		
		BOOLEAN_DEBUG_MS_VIETTEL_MPS_ADAPTER_SERVICE_STATUS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Viettel Mps Adapter Service Status Consumer", "Debug Viettel Mps Adapter Service Status Consumer"),
		
		
		BOOLEAN_DEBUG_MS_TELENITY_ADAPTER_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Telenity Adapter Consumer", "Debug Telenity Adapter Consumer"),
		BOOLEAN_DEBUG_MS_TELENITY_ADAPTER_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Telenity Adapter Producer", "Debug Telenity Adapter Producer"),
		BOOLEAN_DEBUG_MS_TELENITY_CHARGE_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Telenity Charge Service", "Debug Telenity Charge Service"),
		BOOLEAN_DEBUG_MS_TELENITY_NOTIF_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Telenity Notif Service", "Debug Telenity Notif Service"),
		
		BOOLEAN_DEBUG_MS_TELENITY_ADAPTER_CONTROLLER(ParameterType.MICROSERVICE_DEBUG, "Debug Telenity Adapter Controller", "Debug Telenity Adapter Controller"),
		
		BOOLEAN_DEBUG_MS_TELENITY_ADAPTER_SERVICE_STATUS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Telenity Adapter Service Status Consumer", "Debug Telenity Adapter Service Status Consumer"),
		
		
		BOOLEAN_DEBUG_MS_TELENITY_ADAPTER_STAT_PRODUCER(ParameterType.MICROSERVICE_DEBUG, "Debug Telenity Adapter Stat Producer", "Debug Telenity Adapter Stat Producer"),
		
		
		BOOLEAN_DEBUG_MS_GENERIC_VAS_ADAPTER_CP_MO(ParameterType.MICROSERVICE_DEBUG, "Debug Generic Vas Cp MO Queue", "Debug Generic Vas Cp MO Queue"),
		BOOLEAN_DEBUG_MS_GENERIC_VAS_ADAPTER_CP_MT(ParameterType.MICROSERVICE_DEBUG, "Debug Generic Vas Cp MT Queue", "Debug Generic Vas Cp MT Queue"),
		BOOLEAN_DEBUG_MS_GENERIC_VAS_ADAPTER_MNO_MO(ParameterType.MICROSERVICE_DEBUG, "Debug Generic Vas Mno MO Queue", "Debug Generic Vas Mno MO Queue"),
		BOOLEAN_DEBUG_MS_GENERIC_VAS_ADAPTER_MNO_MT(ParameterType.MICROSERVICE_DEBUG, "Debug Generic Vas Mno MT Queue", "Debug Generic Vas Mno MT Queue"),
		BOOLEAN_DEBUG_MS_GENERIC_VAS_ADAPTER_SERVICE_STATUS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Generic VAS Adapter Service Status Consumer", "Debug Generic VAS Adapter Service Status Consumer"),
		BOOLEAN_DEBUG_MS_GENERIC_VAS_ADAPTER_CONTROLLER(ParameterType.MICROSERVICE_DEBUG, "Debug Generic VAS Adapter Controller", "Debug Generic VAS Adapter Controller"),
		BOOLEAN_DEBUG_MS_GENERIC_VAS_GENERIC_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Generic VAS Adapter Service", "Debug Generic VAS Adapter Service"),
		
		
		
		
		BOOLEAN_DEBUG_MS_BILLING_ADAPTER_SERVICE_STATUS_CONSUMER(ParameterType.MICROSERVICE_DEBUG, "Debug Billing Service Status Consumer", "Debug Billing Adapter Service Status Consumer"),
		BOOLEAN_DEBUG_MS_BILLING_ADAPTER_CONTROLLER(ParameterType.MICROSERVICE_DEBUG, "Debug Billing Controller", "Debug Billing Controller"),
		BOOLEAN_DEBUG_MS_BILLING_CHARGING_SERVICE(ParameterType.MICROSERVICE_DEBUG, "Debug Billing Charging Service", "Debug Billing Charging Service"),
		
		BOOLEAN_DEBUG_MS_BILLING_PRODUCER_QUEUE(ParameterType.MICROSERVICE_DEBUG, "Debug Billing Producer Queue", "Debug Billing Producer Queue"),
		
		BOOLEAN_DEBUG_MS_BILLING_RUNNER(ParameterType.MICROSERVICE_DEBUG, "Debug Billing Runner", "Debug Billing Runner"),
		
		
		
		INTEGER_CM_MAX_QTY_PER_RUN(ParameterType.RUN_TUNING, "Max Quantity Per run", "Max Quantity of SIMs a CM can select for executing a campaign"),
		
		
		
		/*
	 * SERVICE DEBUG
	 */
	BOOLEAN_DEBUG_SMPP_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Smpp Service", "Enables log messages for the SMPP Service business methods."),
	BOOLEAN_DEBUG_CAMPAIGN_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Campaign Service", "Enable log messages for the CAMPAIGN Service business methods."),
	BOOLEAN_DEBUG_RAM_CAMPAIGN_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Ram Campaign Service", "Enable log messages for the RAM CAMPAIGN Service business methods."), // 
	BOOLEAN_DEBUG_SLEEPY_CAMPAIGN_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Sleepy Campaign Service", "Enable log messages for the SLEEPY CAMPAIGN Service business methods."),
	BOOLEAN_DEBUG_RAM_OTA_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Ram Ota Service", "Enable log messages for the RAM OTA Service business methods."),
	BOOLEAN_DEBUG_SLEEPY_OTA_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Sleepy Ota Service", "Enable log messages for the SLEEPY OTA Service business methods."), 
	BOOLEAN_DEBUG_SLEEPY_FLOW_OTA_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Sleepy Flow Ota Service", "Enable log messages for the SLEEPY OTA Service business methods."), 
	BOOLEAN_DEBUG_PARAMETER_CACHE_MANAGER(ParameterType.SERVICE_DEBUG, "Debug Parameter Cache Manager", "Enable log messages for the PARAMETER CACHE MANAGER business methods."),// 
	BOOLEAN_DEBUG_STAT_CACHE_MANAGER(ParameterType.SERVICE_DEBUG, "Debug Cache Manager", "Enable log messages for the STAT CACHE MANAGER methods."), // 
	BOOLEAN_DEBUG_CLIENT_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Rest Client Service", "Enable log messages for the CLIENT Service business methods. This log shows the requests and responses for the configured endpoints."),// 
	BOOLEAN_DEBUG_MESSAGING_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Messaging Service", "Enable log messages for the MESSAGING Service business methods. This log shows the status on SMPP accounts."), //
	BOOLEAN_DEBUG_SMS_CAMPAIGN_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Sms Campaign Service", "Enable log messages for the SMS CAMPAIGN Service business methods. This log shows the status of SMS campaigns."),// 
	BOOLEAN_DEBUG_STAT_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Stat Service", "Enable log messages for the STAT Service business methods."), // 
	BOOLEAN_DEBUG_APPLET_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Applet Service", "Enables log messages for the APPLET Service business methods."),// 
	BOOLEAN_DEBUG_PICO_OTA_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Pico Ota Service", "Enables log messages for the PICO OTA Service business methods."),// 
	BOOLEAN_DEBUG_SAT_OTA_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Sat Ota Service", "Enables log messages for the SAT OTA Service business methods."),// 
	BOOLEAN_DEBUG_COMMON_OTA_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Common Ota Service", " Enables log messages for the COMMON OTA Service business methods."), //
	BOOLEAN_DEBUG_RAW_CAMPAIGN_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Raw Campaign Service", "Enables log messages for the RAW CAMPAIGN Service business methods."),// 
	BOOLEAN_DEBUG_SLEEPY_FLOW_KINETIC(ParameterType.SERVICE_DEBUG, "Debug Sleepy Flow Endpoint Calls", "Enable Kinetic calls debug"),// 
	BOOLEAN_DEBUG_DISCOVERY_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Discovery Service", "Enables log messages for the DISCOVERY Service business methods."),// 
	BOOLEAN_DEBUG_AUTHORIZATION_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Authorization Service", "Enables log messages for the AUTHORIZATION and USTK Service business methods."),// QUESTION
	BOOLEAN_DEBUG_USTK_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Ustk Service", "Enables log messages for the USTK Service business methods."),// QUESTION
	BOOLEAN_DEBUG_RUN_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Run Service", "Enables log messages for the RUN service."),//
	BOOLEAN_DEBUG_FILE_SERVICE(ParameterType.SERVICE_DEBUG, "Debug File Service", "Enable log messages for BOOLEAN_DEBUG_FILE_SERVICE"),
	BOOLEAN_DEBUG_SLEEPY_FLOW_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Sleepy Flow Service", "Enable log messages for BOOLEAN_DEBUG_SLEEPY_FLOW_SERVICE"),
	BOOLEAN_DEBUG_INIT_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Init Service", "Enable log messages for BOOLEAN_DEBUG_INIT_SERVICE"),
	BOOLEAN_DEBUG_DEVICE_SERVICE(ParameterType.SERVICE_DEBUG, "Debug Device Service", "Debug Device Service"),
	
	
	/*
	 * Queue debug
	 */
	
	BOOLEAN_DEBUG_MESSAGING_QUEUES(ParameterType.QUEUE_DEBUG, "Debug Messaging Queues", "Enable log messages for the MESSAGING QUEUES Service business methods. This log shows the status of messaging queues."),// 
	BOOLEAN_DEBUG_GO_QUEUES(ParameterType.QUEUE_DEBUG, "Debug Go Queues", "Enables the log messages for GO Queue"),//Habilita mensajes de log para la cola GO
	BOOLEAN_DEBUG_CLIENT_QUEUES(ParameterType.QUEUE_DEBUG, "Debug rest client queues", "Enables log messages for the CLIENT QUEUES processing."), // 
	
	
	
	
	/*
	 * API DEBUG
	 */
	
	
	BOOLEAN_DEBUG_REQUEST_FILTER(ParameterType.API_DEBUG, "Debug Request Filter", "Enable log messages for BOOLEAN_DEBUG_REQUEST_FILTER"),
	BOOLEAN_DEBUG_STATS_API(ParameterType.API_DEBUG, "Debug Stat API", "Enables log messages for the STATS REQUEST Server Rest API."),// 
	BOOLEAN_DEBUG_PUSH_API(ParameterType.API_DEBUG, "Debug Push API", "Enables log messages for the PUSH REQUEST Server Rest API."),// 
	BOOLEAN_DEBUG_SIM_API(ParameterType.API_DEBUG, "Debug Sim API", "Enables log messages for the SIM REQUEST Server Rest API."),// 
	BOOLEAN_DEBUG_SIM_PROFILE_API(ParameterType.API_DEBUG, "Debug Sim Profile API", "Enables log messages for the DEVICE REQUEST Server Rest API."),// 
	BOOLEAN_DEBUG_ENDPOINT_API(ParameterType.API_DEBUG, "Debug Endpoint API", "Enables log messages for the ENDPOINT REQUEST Server Rest API."),// 
	BOOLEAN_DEBUG_CAMPAIGN_API(ParameterType.API_DEBUG, "Debug Campaign API", "Enables log messages for the CAMPAIGN REQUEST Server Rest API."),// 
	BOOLEAN_DEBUG_TP_RULE_API(ParameterType.API_DEBUG, "Debug Tp Rule API", " Enables log messages for the TP RULE REQUEST Server Rest API."),// 
	BOOLEAN_DEBUG_AUTHORIZATION_API(ParameterType.API_DEBUG, "Debug Authorization API", "Enables log messages for the AUTHORIZATION REQUEST Server Rest API."),// 
	BOOLEAN_DEBUG_PARAMETER_API(ParameterType.API_DEBUG, "Debug Parameter API", "Enables log messages for the PARAMETER REQUEST Server Rest API."),// 
	BOOLEAN_DEBUG_SMPP_ACCOUNT_API(ParameterType.API_DEBUG, "Debug Smpp Account API", "Enables log messages for the SMPP ACCOUNT API"),// 
	BOOLEAN_DEBUG_CAMPAIGN_SCHEDULE_API(ParameterType.API_DEBUG, "Debug Campaign Schedule API", "Enable log messages for CAMPAIGN SCHEDULE remote service"),
	BOOLEAN_DEBUG_APPLET_API(ParameterType.API_DEBUG, "Debug Applet API", "Enable log messages for APPLET API service"),
	BOOLEAN_DEBUG_PREFERENCE_API(ParameterType.API_DEBUG, "Debug Preference API", "Enable log messages for PREFERENCE API service"),
	BOOLEAN_DEBUG_INTROSPECTION_API(ParameterType.API_DEBUG, "Debug Introspection API", "Enable log messages for BOOLEAN_DEBUG_INTROSPECTION_API"),
	BOOLEAN_DEBUG_NODE_API(ParameterType.API_DEBUG, "Debug Node API", "Enable log messages for BOOLEAN_DEBUG_NODE_API"),
	BOOLEAN_DEBUG_USTK_API(ParameterType.API_DEBUG, "Debug USTK API", "Debug USTK API"),
	BOOLEAN_DEBUG_VA_SERVICE_API(ParameterType.API_DEBUG, "Debug VaService API", "Debug VaService API"),
	BOOLEAN_DEBUG_PRICEPOINT_API(ParameterType.API_DEBUG, "Debug Pricepoint API", "Debug Pricepoint API"),
	BOOLEAN_DEBUG_KEYCLOAK_USER_MANAGEMENT_API(ParameterType.API_DEBUG, "Debug KEYCLOAK USER MANAGEMENT API", "Debug KEYCLOAK USER MANAGEMENT API"),
	BOOLEAN_DEBUG_SENDER_API(ParameterType.API_DEBUG, "Debug Sender API", "Debug Sender API"),

	/*
	 * REMOTE SERVICE DEBUG
	 */
	
	
	BOOLEAN_DEBUG_SIM_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Sim Remote Service", "Enables log messages for the SIM REMOTE Service business methods."), // 
	BOOLEAN_DEBUG_SIM_PROFILE_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Sim Profile Remote Service", "Enables log messages for the SIM PROFILE REMOTE Service business methods (not in use)."), // 
	BOOLEAN_DEBUG_STAT_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Stat Remote Service", "Enables log messages for the STAT REMOTE Service business methods."),// 
	BOOLEAN_DEBUG_SMPP_ACCOUNT_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Smpp Account Remote Service", "Enables log messages for the SMPP ACCOUNT Service business methods (not in use)."), // 
	BOOLEAN_DEBUG_ENDPOINT_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Endpoint Remote Service", "Enables log messages for the ENDPOINT REMOTE Service business methods (not in use)."),// 
	BOOLEAN_DEBUG_DEVICE_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Device Remote Service", "Enables log messages for the DEVICE REMOTE Service business methods (not in use)."),// 
	BOOLEAN_DEBUG_CAMPAIGN_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Campaign Remote Service", "Enables log messages for the CAMPAIGN REMOTE Service business methods (not in use)."),// 
	BOOLEAN_DEBUG_TP_RULE_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Tp Rule Remote Service", "Enables log messages for the TP RULE REMOTE Service business methods (not in use)."),// 
	BOOLEAN_DEBUG_PARAMETER_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Parameter Remote Service", "Enables log messages for the TP RULE REMOTE Service business methods (not in use)."),// 
	BOOLEAN_DEBUG_PREFERENCE_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Preference Remote Service", "Enable log messages for PREFERENCE remote service"),
	BOOLEAN_DEBUG_DASHBOARD_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Dashboard Remote Service", "Enable log messages for DASHBOARD remote service"),
	BOOLEAN_DEBUG_VA_SERVICE_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Va Service Remote Service", "Enable log messages for Va Service remote service"),
	BOOLEAN_DEBUG_PRICEPOINT_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Pricepoint Remote Service", "Enable log messages for Pricepoint remote service"),
	BOOLEAN_DEBUG_IDENTIFIER_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Identifier Remote Service", "Enable log messages for Identifier remote service"),
	BOOLEAN_DEBUG_SENDER_REMOTE_SERVICE(ParameterType.REMOTE_SERVICE_DEBUG, "Debug Sender Remote Service", "Enable log messages for Sender remote service"),
	
	
	/*
	 * Test campaigns ids
	 * 
	 */
	 
	
	LONG_TEST_CAMPAIGN_DT_ID(ParameterType.TEST_CAMPAIGN_IDS, "DT test campaign default id", "DT test campaign default id"),
	LONG_TEST_CAMPAIGN_SI_ID(ParameterType.TEST_CAMPAIGN_IDS, "SI test campaign default id", "SI test campaign default id"),
	LONG_TEST_CAMPAIGN_GI_ID(ParameterType.TEST_CAMPAIGN_IDS, "GI test campaign default id", "GI test campaign default id"),
	LONG_TEST_CAMPAIGN_LB_ID(ParameterType.TEST_CAMPAIGN_IDS, "LB test campaign default id", "LB test campaign default id"),
	LONG_TEST_CAMPAIGN_SMS_ID(ParameterType.TEST_CAMPAIGN_IDS, "SMS test campaign default id", "SMS test campaign default id"),
	LONG_TEST_CAMPAIGN_CALL_ID(ParameterType.TEST_CAMPAIGN_IDS, "CALL test campaign default id", "CALL test campaign default id"),
	LONG_TEST_CAMPAIGN_USSD_ID(ParameterType.TEST_CAMPAIGN_IDS, "USSD test campaign default id", "USSD test campaign default id"),
	LONG_TEST_CAMPAIGN_TONE_ID(ParameterType.TEST_CAMPAIGN_IDS, "TONE test campaign default id", "TONE test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM0_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM0 test campaign default id", "SIM0 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM1_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM1 test campaign default id", "SIM1 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM2_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM2 test campaign default id", "SIM2 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM3_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM3 test campaign default id", "SIM3 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM4_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM4 test campaign default id", "SIM4 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM5_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM5 test campaign default id", "SIM5 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM6_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM6 test campaign default id", "SIM6 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM7_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM7 test campaign default id", "SIM7 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM8_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM8 test campaign default id", "SIM8 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM9_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM9 test campaign default id", "SIM9 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM10_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM10 test campaign default id", "SIM10 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM11_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM11 test campaign default id", "SIM11 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM12_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM12 test campaign default id", "SIM12 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM13_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM13 test campaign default id", "SIM13 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM14_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM14 test campaign default id", "SIM14 test campaign default id"),
	LONG_TEST_CAMPAIGN_SIM15_ID(ParameterType.TEST_CAMPAIGN_IDS, "SIM15 test campaign default id", "SIM15 test campaign default id"),
	LONG_TEST_CAMPAIGN_UTEXT_ID(ParameterType.TEST_CAMPAIGN_IDS, "UTEXT test campaign default id", "UTEXT test campaign default id"),
	LONG_TEST_CAMPAIGN_UMENU_ID(ParameterType.TEST_CAMPAIGN_IDS, "UMENU test campaign default id", "UMENU test campaign default id"),
	LONG_TEST_CAMPAIGN_UURL_ID(ParameterType.TEST_CAMPAIGN_IDS, "UURL test campaign default id", "UURL test campaign default id"),
	LONG_TEST_CAMPAIGN_UCALL_ID(ParameterType.TEST_CAMPAIGN_IDS, "UCALL test campaign default id", "UCALL test campaign default id"),
	LONG_TEST_CAMPAIGN_SLEEPY_API_ID(ParameterType.TEST_CAMPAIGN_IDS, "Sleepy API test campaign default id", "Sleepy API test campaign default id"),
	LONG_TEST_CAMPAIGN_USTK_API_ID(ParameterType.TEST_CAMPAIGN_IDS, "USTK API test campaign default id", "USTK API test campaign default id"),
	LONG_TEST_CAMPAIGN_OPTIN_MNO_AD_ID(ParameterType.TEST_CAMPAIGN_IDS, "Optin MNO Ad test campaign default id", "Optin MNO Ad test campaign default id"),
	LONG_TEST_CAMPAIGN_OPTOUT_MNO_AD_ID(ParameterType.TEST_CAMPAIGN_IDS, "Optout MNO Ad test campaign default id", "Optout MNO Ad test campaign default id"),
	LONG_TEST_CAMPAIGN_OPTIN_TP_AD_ID(ParameterType.TEST_CAMPAIGN_IDS, "Optin TP Ad test campaign default id", "Optin TP Ad test campaign default id"),
	LONG_TEST_CAMPAIGN_OPTOUT_TP_AD_ID(ParameterType.TEST_CAMPAIGN_IDS, "Optout Tp Ad test campaign default id", "Optout Tp Ad test campaign default id"),
	LONG_TEST_CAMPAIGN_OPTIN_AD_ID(ParameterType.TEST_CAMPAIGN_IDS, "Optin Ad test campaign default id", "Optin Ad test campaign default id"),
	LONG_TEST_CAMPAIGN_OPTOUT_AD_ID(ParameterType.TEST_CAMPAIGN_IDS, "Optout Ad test campaign default id", "Optout Ad test campaign default id"),
	
	
	
	
	
	/*
	 * FILE
	 */
	
	
	STRING_FILE_UPLOAD_TMP_DIRECTORY(ParameterType.FILE_MANAGEMENT, "File upload tmp directory", "File upload tmp directory"),
	STRING_FILE_UPLOAD_LIST_DIRECTORY(ParameterType.FILE_MANAGEMENT, "File upload List directory", "File upload List directory"),
	STRING_FILE_UPLOAD_APPLET_DIRECTORY(ParameterType.FILE_MANAGEMENT, "File upload Applet directory", "File upload Applet directory"),
	STRING_FILE_UPLOAD_PUBLIC_DIRECTORY(ParameterType.FILE_MANAGEMENT, "File upload public directory", "File upload public directory"),
	STRING_FILE_CAMPAIGN_LIST_DIRECTORY(ParameterType.FILE_MANAGEMENT, "File Campaign List directory", "File Campaign List directory"),
	STRING_SORT_BINARY_LOCATION(ParameterType.FILE_MANAGEMENT, "Sort binary location", "Sort binary location"),
	STRING_COMM_BINARY_LOCATION(ParameterType.FILE_MANAGEMENT, "Comm binary location", "Comm binary location"),
	STRING_MV_BINARY_LOCATION(ParameterType.FILE_MANAGEMENT, "Mv binary location", "Mv binary location"),
	STRING_FILE_UPLOAD_SEPARATOR(ParameterType.FILE_MANAGEMENT, "File upload separator", "File upload separator"),
	
	
	STRING_FILE_DATE_FORMATTER_PATTERN(ParameterType.FILE_MANAGEMENT, "File Date Formatter Pattern", "File Date Formatter Pattern"),
	
	INTEGER_FILE_UPLOAD_PUBLIC_DIRECTORY_MIN_MTIME_DELTA_SECONDS(ParameterType.FILE_MANAGEMENT, "Wait delay since last modification before loading a file", "Wait delay since last modification before loading a file"),
	
	
	/*
	 * Rest Client
	 */
	LONG_CLIENT_SLEEP_PER_ITERATION_MILLIS(ParameterType.REST_CLIENT, "Sleep per iteration when not found (ms)", "Sleep per iteration when not found (ms)"),
	INTEGER_CLIENT_DESPOOL_MAX_TRIES(ParameterType.REST_CLIENT, "Despool max tries", "Despool max tries"),
	INTEGER_CLIENT_CP_DESPOOL_QUEUE_SIZE(ParameterType.REST_CLIENT, "Client queue size", "Client queue size"),
	LONG_CLIENT_CP_NEXT_RETRY_DELAY_MILLIS(ParameterType.REST_CLIENT, "Next retry delay (ms)", "\"Next retry delay (ms)"),
	
	
	/*
	 * Ponderation
	 */
	
	INTEGER_SLEEPY_FLOW_PONDERATION_MIN_FOR_TESTING_MODE(ParameterType.PONDERATION, "Min for testing mode", "Min for testing mode"),
	INTEGER_SLEEPY_FLOW_PONDERATION_DEFAULT_PERCENT_RULE(ParameterType.PONDERATION, "Default percent rule", "Default percent rule"),
	
	
	/*
	 * Stats
	 */
	LONG_STAT_SLEEP_PER_FLUSH_MILLIS(ParameterType.STATS, "Sleep pr flush (ms)", "Sleep pr flush (ms)"),
	STRING_STAT_TS_FORMAT(ParameterType.STATS, "Stat timestamp format", "Stat timestamp format"),
	INTEGER_STAT_IN_MEMORY_PAST_UNITS(ParameterType.STATS, "In memory past units", "In memory past units"),
	
	
	
	
	/*
	 * ENTITY HISTORY
	 */
	INTEGER_MAX_ENTITY_HISTORY_ACTIONS(ParameterType.ENTITY_MANAGEMENT, "Max entity histories to show", "Max number of entity history actions to show"),
	INTEGER_SHOW_DELETED_ENTITIES_SECONDS(ParameterType.ENTITY_MANAGEMENT, "Show deleted entity seconds", "Show deleted entity in normal view until this seconds after delete"),
	
	
	
	
	
	/*
	 * USTK
	 */
	INTEGER_STK_SMS_GSM8_DCS(ParameterType.USTK, "STK MO Sms GSM8 dcs", "set 0 or 4"),
	STRING_USTK_TEXT_REQ_SET_DATA_CAMPAIGN_IDS(ParameterType.USTK, "Id of campaigns (CP workaround)", "List of campaigns that will have data field set to USTK if user accepts textRequest"),
	LONG_FAKE_KINETIC_USTK_CAMPAIGN_ID(ParameterType.USTK, "Fake Kinetic USTK CampaignId", "Fake Kinetic USTK CampaignId"),
	STRING_USTK_API_ALLOWED_HOURS(ParameterType.USTK, "Ustk API Allowed Hours", "Hours allowed for USTK API"),
	
	
	INTEGER_MAX_DT_TEXT_BC_SIZE(ParameterType.USTK, "Max DT text bytecode size", "Max DT text bytecode size"),
	INTEGER_MAX_CALL_BC_SIZE(ParameterType.USTK, "Max Call text bytecode size", "Max Call text bytecode size"),
	INTEGER_MAX_USSD_BC_SIZE(ParameterType.USTK, "Max USSD text bytecode size", "Max USSD text bytecode size"),
	INTEGER_MAX_URL_BC_SIZE(ParameterType.USTK, "Max URL text bytecode size", "Max URL text bytecode size"),
	INTEGER_MAX_SI_BC_SIZE(ParameterType.USTK, "Max SI text bytecode size", "Max SI text bytecode size"),
	
	
	
;	
	
	private static class Maps {
		private static ConcurrentHashMap<ParameterType, List<String>> map = new ConcurrentHashMap<ParameterType, List<String>>();
		
	}
	
	public static List<String> listForType(ParameterType type) {
		List<String> params = null;
		
		synchronized (Maps.map) {
			params = Maps.map.get(type);
			if (params == null) {
				params = new ArrayList<String>();
				Maps.map.put(type, params);
			}
		}
		return params;
	}
	
	private ParameterType type;
	private String description;
	private String label;
	
	private ParameterName(ParameterType type, String label, String description) {
		this.type = type;
		this.description = description;
		this.label = label;
		synchronized (Maps.map) {
			List<String> params = Maps.map.get(type);
			if (params == null) {
				params = new ArrayList<String>();
			}
			params.add(this.toString());
			Maps.map.put(type, params);
		}
		
	}
	
	public String getDescription() {
		return description;
	}
	
	
	public ParameterType getType() {
		return type;
	}

	public String getLabel() {
		return label;
	}
}
