package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.CipheringAlgorithm;

@JsonInclude(Include.NON_NULL)
public class LicenseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 482935584529862370L;
	private byte[] bk;
	private CipheringAlgorithm alg;
	public byte[] getBk() {
		return bk;
	}
	public void setBk(byte[] bk) {
		this.bk = bk;
	}
	public CipheringAlgorithm getAlg() {
		return alg;
	}
	public void setAlg(CipheringAlgorithm alg) {
		this.alg = alg;
	}
	

	
}
