package com.mobiera.aircast.api.v1.sleepy.validate;

public enum SleepyValidateRequestResult {
	OK,
	ERROR_MISSING_SLEEPY_COMMAND,
	ERROR_PERMISSION_DENIED,
	ERROR_SLEEPY_API,
	ERROR_SLEEPY_AIRCAST_FACTORY,
	ERROR_CRYPTO,
	ERROR_CHARSET,
	ERROR_ETSI102225,
	ERROR_IO,
	ERROR_DATA_LENGTH_NOT_SUPPORTED,
	ERROR_UNKNOWN,
}
