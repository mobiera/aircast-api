package com.mobiera.aircast.api.v1.mms;

public enum MmsRequestResult {
	SPOOLED,
	ERROR_DISABLED_ENTITY,
	ERROR_DEAD_SIM,
	ERROR_TARGET_NOT_PROVISIONED,
	ERROR_NO_TARGET,
	ERROR_PERMISSION_DENIED,
	ERROR_INVALID_CAMPAIGN,
	ERROR_INVALID_CAMPAIGN_TYPE,
	ERROR_CHARSET,
	ERROR_DCS,
	ERROR_IO,
	ERROR_QUEUE_FULL,
	ERROR_DUPLICATED_REQUEST_ID,
	ERROR_MISSING_REQUEST_ID,
	ERROR_MISSING_DATA,
	ERROR_DLR_NOT_SUPPORTED,
	ERROR_DATA_LENGTH_NOT_SUPPORTED,
	ERROR_UNKNOWN,
}