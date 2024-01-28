package com.mobiera.aircast.api.v1.sim;

public enum DeleteSimRequestResult {
	OK,
	ERROR_TARGET_NOT_PROVISIONED,
	ERROR_INVALID_MSISDN,
	ERROR_DATA_LENGTH_NOT_SUPPORTED,
	ERROR_NO_TARGET,
	ERROR_PERMISSION_DENIED,
	ERROR_UNKNOWN,
}