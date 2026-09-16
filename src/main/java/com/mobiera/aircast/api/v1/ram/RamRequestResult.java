package com.mobiera.aircast.api.v1.ram;

import java.io.Serializable;

/**
 * Outcome of a RamRequest (one 03.48 command packet of a RAM session) submitted to rest-endpoint.
 */
public enum RamRequestResult implements Serializable {
	SPOOLED, ERROR_DISABLED_ENTITY, ERROR_NO_TARGET, ERROR_MISSING_REQUEST_ID, ERROR_MISSING_CAMPAIGN_ID, ERROR_INVALID_CAMPAIGN_TYPE, ERROR_NO_SIM, ERROR_NO_RAM_APPLET, ERROR_NO_KEYS, ERROR_NO_PARAMETERS, ERROR_CAP_FILE, ERROR_CRYPTO, ERROR_PACKET_INDEX, ERROR_QUEUE_FULL, ERROR_NOT_SUPPORTED, ERROR_PERMISSION_DENIED, ERROR_UNKNOWN;
}
