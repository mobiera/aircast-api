package com.mobiera.aircast.api.v1.ram;

import java.io.Serializable;

/**
 * POR_OK: response packet status OK (status word still to be checked).
 * POR_ERROR: response packet received with an error status (see porStatus).
 * DELIVERED / UNDELIVERED: SMSC delivery report.
 * ERROR: the PoR could not be decoded.
 */
public enum RamResponseResult implements Serializable {
	POR_OK, POR_ERROR, DELIVERED, UNDELIVERED, ERROR;
}
