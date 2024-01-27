package com.mobiera.aircast.commons.vo;

import com.mobiera.commons.vo.CommonVO;

public class SimKeysVO implements CommonVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2877738833544499926L;
	private byte[] kic;
	private byte[] kid;
	private byte[] kik;
	public byte[] getKic() {
		return kic;
	}
	public void setKic(byte[] kic) {
		this.kic = kic;
	}
	public byte[] getKid() {
		return kid;
	}
	public void setKid(byte[] kid) {
		this.kid = kid;
	}
	public byte[] getKik() {
		return kik;
	}
	public void setKik(byte[] kik) {
		this.kik = kik;
	}
	
}
