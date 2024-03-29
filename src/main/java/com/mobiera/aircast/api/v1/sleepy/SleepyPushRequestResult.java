package com.mobiera.aircast.api.v1.sleepy;

public enum SleepyPushRequestResult {
	SPOOLED,
	ERROR_DISABLED_ENTITY,
	ERROR_TARGET_NOT_SLEEPY_ENABLED,
	ERROR_DEAD_SIM,
	ERROR_TARGET_NOT_PROVISIONED,
	ERROR_NO_TARGET,
	ERROR_MISSING_SLEEPY_COMMAND,
	ERROR_PERMISSION_DENIED,
	ERROR_SLEEPY_API,
	ERROR_SLEEPY_AIRCAST_FACTORY,
	ERROR_INVALID_CAMPAIGN,
	ERROR_INVALID_CAMPAIGN_TYPE,
	ERROR_ETSI102225,
	ERROR_NO_SLEEPY_KEY,
	ERROR_CRYPTO,
	ERROR_CHARSET,
	ERROR_IO,
	ERROR_QUEUE_FULL,
	ERROR_DUPLICATED_REQUEST_ID,
	ERROR_MISSING_REQUEST_ID,
	ERROR_DATA_LENGTH_NOT_SUPPORTED,
	ERROR_UNKNOWN,
	ERROR_DLR_NOT_SUPPORTED
}
