package com.mobiera.aircast.api.v1.endpoint;

public enum SaveEndpointRequestResult {
	OK,
	ERROR_MISSING_ENTITY,
	ERROR_INVALID_ENTITY,
	ERROR_INVALID_URL,
	ERROR_PERMISSION_DENIED,
	ERROR_UNKNOWN, ERROR_NULL_ARGUMENT, ERROR_BAD_ARGUMENT,
}
