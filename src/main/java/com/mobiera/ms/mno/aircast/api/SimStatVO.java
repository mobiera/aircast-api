package com.mobiera.ms.mno.aircast.api;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class SimStatVO implements Serializable {

	private static final long serialVersionUID = -4775907422035543388L;
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant ts;
	
	private Long aliveUsers = 0l;
	
	private Long p0AvUsers = 0l;
	private Long p1AvUsers = 0l;
	private Long p2AvUsers = 0l;
	
	private Long p0AvUsers_mnoAdTrue = 0l;
	private Long p0AvUsers_mnoAdFalse = 0l;
	private Long p0AvUsers_mnoAdNull = 0l;
	private Long p0AvUsers_tpAdTrue = 0l;
	private Long p0AvUsers_tpAdFalse = 0l;
	private Long p0AvUsers_tpAdNull = 0l;
	
	private Long p1AvUsers_mnoAdTrue = 0l;
	private Long p1AvUsers_mnoAdFalse = 0l;
	private Long p1AvUsers_mnoAdNull = 0l;
	private Long p1AvUsers_tpAdTrue = 0l;
	private Long p1AvUsers_tpAdFalse = 0l;
	private Long p1AvUsers_tpAdNull = 0l;
	
	private Long p2AvUsers_mnoAdTrue = 0l;
	private Long p2AvUsers_mnoAdFalse = 0l;
	private Long p2AvUsers_mnoAdNull = 0l;
	private Long p2AvUsers_tpAdTrue = 0l;
	private Long p2AvUsers_tpAdFalse = 0l;
	private Long p2AvUsers_tpAdNull = 0l;
	
	
	private Long mnoAdAllowed_true = 0l;
	private Long mnoAdAllowed_false = 0l;
	private Long mnoAdAllowed_null = 0l;
	
	private Long tpAdAllowed_true = 0l;
	private Long tpAdAllowed_false = 0l;
	private Long tpAdAllowed_null = 0l;
	
	private Long appletImpl_null = 0l;
	private Long appletImpl_1 = 0l;
	private Long appletImpl_2 = 0l;
	private Long appletImpl_3 = 0l;
	private Long appletImpl_4 = 0l;
	private Long appletImpl_5 = 0l;
	private Long appletImpl_6 = 0l;
	

	private Long stk_aliveUsers = 0l;
	
	private Long stk_p0AvUsers = 0l;
	private Long stk_p1AvUsers = 0l;
	private Long stk_p2AvUsers = 0l;
	
	private Long stk_p0AvUsers_mnoAdTrue = 0l;
	private Long stk_p0AvUsers_mnoAdFalse = 0l;
	private Long stk_p0AvUsers_mnoAdNull = 0l;
	private Long stk_p0AvUsers_tpAdTrue = 0l;
	private Long stk_p0AvUsers_tpAdFalse = 0l;
	private Long stk_p0AvUsers_tpAdNull = 0l;
	
	private Long stk_p1AvUsers_mnoAdTrue = 0l;
	private Long stk_p1AvUsers_mnoAdFalse = 0l;
	private Long stk_p1AvUsers_mnoAdNull = 0l;
	private Long stk_p1AvUsers_tpAdTrue = 0l;
	private Long stk_p1AvUsers_tpAdFalse = 0l;
	private Long stk_p1AvUsers_tpAdNull = 0l;
	
	private Long stk_p2AvUsers_mnoAdTrue = 0l;
	private Long stk_p2AvUsers_mnoAdFalse = 0l;
	private Long stk_p2AvUsers_mnoAdNull = 0l;
	private Long stk_p2AvUsers_tpAdTrue = 0l;
	private Long stk_p2AvUsers_tpAdFalse = 0l;
	private Long stk_p2AvUsers_tpAdNull = 0l;
	
	
	
	private Long stk_mnoAdAllowed_true = 0l;
	private Long stk_mnoAdAllowed_false = 0l;
	private Long stk_mnoAdAllowed_null = 0l;
	
	private Long stk_tpAdAllowed_true = 0l;
	private Long stk_tpAdAllowed_false = 0l;
	private Long stk_tpAdAllowed_null = 0l;
	
	
	private Long sleepy_aliveUsers = 0l;
	
	private Long sleepy_p0AvUsers = 0l;
	private Long sleepy_p1AvUsers = 0l;
	private Long sleepy_p2AvUsers = 0l;
	
	private Long sleepy_p0AvUsers_mnoAdTrue = 0l;
	private Long sleepy_p0AvUsers_mnoAdFalse = 0l;
	private Long sleepy_p0AvUsers_mnoAdNull = 0l;
	private Long sleepy_p0AvUsers_tpAdTrue = 0l;
	private Long sleepy_p0AvUsers_tpAdFalse = 0l;
	private Long sleepy_p0AvUsers_tpAdNull = 0l;
	
	private Long sleepy_p1AvUsers_mnoAdTrue = 0l;
	private Long sleepy_p1AvUsers_mnoAdFalse = 0l;
	private Long sleepy_p1AvUsers_mnoAdNull = 0l;
	private Long sleepy_p1AvUsers_tpAdTrue = 0l;
	private Long sleepy_p1AvUsers_tpAdFalse = 0l;
	private Long sleepy_p1AvUsers_tpAdNull = 0l;
	
	private Long sleepy_p2AvUsers_mnoAdTrue = 0l;
	private Long sleepy_p2AvUsers_mnoAdFalse = 0l;
	private Long sleepy_p2AvUsers_mnoAdNull = 0l;
	private Long sleepy_p2AvUsers_tpAdTrue = 0l;
	private Long sleepy_p2AvUsers_tpAdFalse = 0l;
	private Long sleepy_p2AvUsers_tpAdNull = 0l;
	
	
	
	private Long sleepy_mnoAdAllowed_true = 0l;
	private Long sleepy_mnoAdAllowed_false = 0l;
	private Long sleepy_mnoAdAllowed_null = 0l;
	
	private Long sleepy_tpAdAllowed_true = 0l;
	private Long sleepy_tpAdAllowed_false = 0l;
	private Long sleepy_tpAdAllowed_null = 0l;
	
	
	private String customData;
	
	public Long getAliveUsers() {
		return aliveUsers;
	}
	public void setAliveUsers(Long aliveUsers) {
		this.aliveUsers = aliveUsers;
	}
	
	public Long getMnoAdAllowed_true() {
		return mnoAdAllowed_true;
	}
	public void setMnoAdAllowed_true(Long mnoAdAllowed_true) {
		this.mnoAdAllowed_true = mnoAdAllowed_true;
	}
	public Long getMnoAdAllowed_false() {
		return mnoAdAllowed_false;
	}
	public void setMnoAdAllowed_false(Long mnoAdAllowed_false) {
		this.mnoAdAllowed_false = mnoAdAllowed_false;
	}
	public Long getMnoAdAllowed_null() {
		return mnoAdAllowed_null;
	}
	public void setMnoAdAllowed_null(Long mnoAdAllowed_null) {
		this.mnoAdAllowed_null = mnoAdAllowed_null;
	}
	public Long getTpAdAllowed_true() {
		return tpAdAllowed_true;
	}
	public void setTpAdAllowed_true(Long tpAdAllowed_true) {
		this.tpAdAllowed_true = tpAdAllowed_true;
	}
	public Long getTpAdAllowed_false() {
		return tpAdAllowed_false;
	}
	public void setTpAdAllowed_false(Long tpAdAllowed_false) {
		this.tpAdAllowed_false = tpAdAllowed_false;
	}
	public Long getTpAdAllowed_null() {
		return tpAdAllowed_null;
	}
	public void setTpAdAllowed_null(Long tpAdAllowed_null) {
		this.tpAdAllowed_null = tpAdAllowed_null;
	}
	public Instant getTs() {
		return ts;
	}
	public void setTs(Instant ts) {
		this.ts = ts;
	}
	public Long getAppletImpl_null() {
		return appletImpl_null;
	}
	public void setAppletImpl_null(Long appletImpl_null) {
		this.appletImpl_null = appletImpl_null;
	}
	public Long getAppletImpl_1() {
		return appletImpl_1;
	}
	public void setAppletImpl_1(Long appletImpl_1) {
		this.appletImpl_1 = appletImpl_1;
	}
	public Long getAppletImpl_2() {
		return appletImpl_2;
	}
	public void setAppletImpl_2(Long appletImpl_2) {
		this.appletImpl_2 = appletImpl_2;
	}
	public Long getAppletImpl_3() {
		return appletImpl_3;
	}
	public void setAppletImpl_3(Long appletImpl_3) {
		this.appletImpl_3 = appletImpl_3;
	}
	public Long getAppletImpl_4() {
		return appletImpl_4;
	}
	public void setAppletImpl_4(Long appletImpl_4) {
		this.appletImpl_4 = appletImpl_4;
	}
	public Long getAppletImpl_5() {
		return appletImpl_5;
	}
	public void setAppletImpl_5(Long appletImpl_5) {
		this.appletImpl_5 = appletImpl_5;
	}
	public Long getAppletImpl_6() {
		return appletImpl_6;
	}
	public void setAppletImpl_6(Long appletImpl_6) {
		this.appletImpl_6 = appletImpl_6;
	}
	
	public Long getP0AvUsers() {
		return p0AvUsers;
	}
	public void setP0AvUsers(Long p0AvUsers) {
		this.p0AvUsers = p0AvUsers;
	}
	public Long getP1AvUsers() {
		return p1AvUsers;
	}
	public void setP1AvUsers(Long p1AvUsers) {
		this.p1AvUsers = p1AvUsers;
	}
	public Long getP2AvUsers() {
		return p2AvUsers;
	}
	public void setP2AvUsers(Long p2AvUsers) {
		this.p2AvUsers = p2AvUsers;
	}
	public Long getP0AvUsers_mnoAdTrue() {
		return p0AvUsers_mnoAdTrue;
	}
	public void setP0AvUsers_mnoAdTrue(Long p0AvUsers_mnoAdTrue) {
		this.p0AvUsers_mnoAdTrue = p0AvUsers_mnoAdTrue;
	}
	public Long getP0AvUsers_mnoAdFalse() {
		return p0AvUsers_mnoAdFalse;
	}
	public void setP0AvUsers_mnoAdFalse(Long p0AvUsers_mnoAdFalse) {
		this.p0AvUsers_mnoAdFalse = p0AvUsers_mnoAdFalse;
	}
	public Long getP0AvUsers_mnoAdNull() {
		return p0AvUsers_mnoAdNull;
	}
	public void setP0AvUsers_mnoAdNull(Long p0AvUsers_mnoAdNull) {
		this.p0AvUsers_mnoAdNull = p0AvUsers_mnoAdNull;
	}
	public Long getP0AvUsers_tpAdTrue() {
		return p0AvUsers_tpAdTrue;
	}
	public void setP0AvUsers_tpAdTrue(Long p0AvUsers_tpAdTrue) {
		this.p0AvUsers_tpAdTrue = p0AvUsers_tpAdTrue;
	}
	public Long getP0AvUsers_tpAdFalse() {
		return p0AvUsers_tpAdFalse;
	}
	public void setP0AvUsers_tpAdFalse(Long p0AvUsers_tpAdFalse) {
		this.p0AvUsers_tpAdFalse = p0AvUsers_tpAdFalse;
	}
	public Long getP0AvUsers_tpAdNull() {
		return p0AvUsers_tpAdNull;
	}
	public void setP0AvUsers_tpAdNull(Long p0AvUsers_tpAdNull) {
		this.p0AvUsers_tpAdNull = p0AvUsers_tpAdNull;
	}
	public Long getP1AvUsers_mnoAdTrue() {
		return p1AvUsers_mnoAdTrue;
	}
	public void setP1AvUsers_mnoAdTrue(Long p1AvUsers_mnoAdTrue) {
		this.p1AvUsers_mnoAdTrue = p1AvUsers_mnoAdTrue;
	}
	public Long getP1AvUsers_mnoAdFalse() {
		return p1AvUsers_mnoAdFalse;
	}
	public void setP1AvUsers_mnoAdFalse(Long p1AvUsers_mnoAdFalse) {
		this.p1AvUsers_mnoAdFalse = p1AvUsers_mnoAdFalse;
	}
	public Long getP1AvUsers_mnoAdNull() {
		return p1AvUsers_mnoAdNull;
	}
	public void setP1AvUsers_mnoAdNull(Long p1AvUsers_mnoAdNull) {
		this.p1AvUsers_mnoAdNull = p1AvUsers_mnoAdNull;
	}
	public Long getP1AvUsers_tpAdTrue() {
		return p1AvUsers_tpAdTrue;
	}
	public void setP1AvUsers_tpAdTrue(Long p1AvUsers_tpAdTrue) {
		this.p1AvUsers_tpAdTrue = p1AvUsers_tpAdTrue;
	}
	public Long getP1AvUsers_tpAdFalse() {
		return p1AvUsers_tpAdFalse;
	}
	public void setP1AvUsers_tpAdFalse(Long p1AvUsers_tpAdFalse) {
		this.p1AvUsers_tpAdFalse = p1AvUsers_tpAdFalse;
	}
	public Long getP1AvUsers_tpAdNull() {
		return p1AvUsers_tpAdNull;
	}
	public void setP1AvUsers_tpAdNull(Long p1AvUsers_tpAdNull) {
		this.p1AvUsers_tpAdNull = p1AvUsers_tpAdNull;
	}
	public Long getP2AvUsers_mnoAdTrue() {
		return p2AvUsers_mnoAdTrue;
	}
	public void setP2AvUsers_mnoAdTrue(Long p2AvUsers_mnoAdTrue) {
		this.p2AvUsers_mnoAdTrue = p2AvUsers_mnoAdTrue;
	}
	public Long getP2AvUsers_mnoAdFalse() {
		return p2AvUsers_mnoAdFalse;
	}
	public void setP2AvUsers_mnoAdFalse(Long p2AvUsers_mnoAdFalse) {
		this.p2AvUsers_mnoAdFalse = p2AvUsers_mnoAdFalse;
	}
	public Long getP2AvUsers_mnoAdNull() {
		return p2AvUsers_mnoAdNull;
	}
	public void setP2AvUsers_mnoAdNull(Long p2AvUsers_mnoAdNull) {
		this.p2AvUsers_mnoAdNull = p2AvUsers_mnoAdNull;
	}
	public Long getP2AvUsers_tpAdTrue() {
		return p2AvUsers_tpAdTrue;
	}
	public void setP2AvUsers_tpAdTrue(Long p2AvUsers_tpAdTrue) {
		this.p2AvUsers_tpAdTrue = p2AvUsers_tpAdTrue;
	}
	public Long getP2AvUsers_tpAdFalse() {
		return p2AvUsers_tpAdFalse;
	}
	public void setP2AvUsers_tpAdFalse(Long p2AvUsers_tpAdFalse) {
		this.p2AvUsers_tpAdFalse = p2AvUsers_tpAdFalse;
	}
	public Long getP2AvUsers_tpAdNull() {
		return p2AvUsers_tpAdNull;
	}
	public void setP2AvUsers_tpAdNull(Long p2AvUsers_tpAdNull) {
		this.p2AvUsers_tpAdNull = p2AvUsers_tpAdNull;
	}
	public Long getStk_aliveUsers() {
		return stk_aliveUsers;
	}
	public void setStk_aliveUsers(Long stk_aliveUsers) {
		this.stk_aliveUsers = stk_aliveUsers;
	}
	public Long getStk_p0AvUsers() {
		return stk_p0AvUsers;
	}
	public void setStk_p0AvUsers(Long stk_p0AvUsers) {
		this.stk_p0AvUsers = stk_p0AvUsers;
	}
	public Long getStk_p1AvUsers() {
		return stk_p1AvUsers;
	}
	public void setStk_p1AvUsers(Long stk_p1AvUsers) {
		this.stk_p1AvUsers = stk_p1AvUsers;
	}
	public Long getStk_p2AvUsers() {
		return stk_p2AvUsers;
	}
	public void setStk_p2AvUsers(Long stk_p2AvUsers) {
		this.stk_p2AvUsers = stk_p2AvUsers;
	}
	public Long getStk_p0AvUsers_mnoAdTrue() {
		return stk_p0AvUsers_mnoAdTrue;
	}
	public void setStk_p0AvUsers_mnoAdTrue(Long stk_p0AvUsers_mnoAdTrue) {
		this.stk_p0AvUsers_mnoAdTrue = stk_p0AvUsers_mnoAdTrue;
	}
	public Long getStk_p0AvUsers_mnoAdFalse() {
		return stk_p0AvUsers_mnoAdFalse;
	}
	public void setStk_p0AvUsers_mnoAdFalse(Long stk_p0AvUsers_mnoAdFalse) {
		this.stk_p0AvUsers_mnoAdFalse = stk_p0AvUsers_mnoAdFalse;
	}
	public Long getStk_p0AvUsers_mnoAdNull() {
		return stk_p0AvUsers_mnoAdNull;
	}
	public void setStk_p0AvUsers_mnoAdNull(Long stk_p0AvUsers_mnoAdNull) {
		this.stk_p0AvUsers_mnoAdNull = stk_p0AvUsers_mnoAdNull;
	}
	public Long getStk_p0AvUsers_tpAdTrue() {
		return stk_p0AvUsers_tpAdTrue;
	}
	public void setStk_p0AvUsers_tpAdTrue(Long stk_p0AvUsers_tpAdTrue) {
		this.stk_p0AvUsers_tpAdTrue = stk_p0AvUsers_tpAdTrue;
	}
	public Long getStk_p0AvUsers_tpAdFalse() {
		return stk_p0AvUsers_tpAdFalse;
	}
	public void setStk_p0AvUsers_tpAdFalse(Long stk_p0AvUsers_tpAdFalse) {
		this.stk_p0AvUsers_tpAdFalse = stk_p0AvUsers_tpAdFalse;
	}
	public Long getStk_p0AvUsers_tpAdNull() {
		return stk_p0AvUsers_tpAdNull;
	}
	public void setStk_p0AvUsers_tpAdNull(Long stk_p0AvUsers_tpAdNull) {
		this.stk_p0AvUsers_tpAdNull = stk_p0AvUsers_tpAdNull;
	}
	public Long getStk_p1AvUsers_mnoAdTrue() {
		return stk_p1AvUsers_mnoAdTrue;
	}
	public void setStk_p1AvUsers_mnoAdTrue(Long stk_p1AvUsers_mnoAdTrue) {
		this.stk_p1AvUsers_mnoAdTrue = stk_p1AvUsers_mnoAdTrue;
	}
	public Long getStk_p1AvUsers_mnoAdFalse() {
		return stk_p1AvUsers_mnoAdFalse;
	}
	public void setStk_p1AvUsers_mnoAdFalse(Long stk_p1AvUsers_mnoAdFalse) {
		this.stk_p1AvUsers_mnoAdFalse = stk_p1AvUsers_mnoAdFalse;
	}
	public Long getStk_p1AvUsers_mnoAdNull() {
		return stk_p1AvUsers_mnoAdNull;
	}
	public void setStk_p1AvUsers_mnoAdNull(Long stk_p1AvUsers_mnoAdNull) {
		this.stk_p1AvUsers_mnoAdNull = stk_p1AvUsers_mnoAdNull;
	}
	public Long getStk_p1AvUsers_tpAdTrue() {
		return stk_p1AvUsers_tpAdTrue;
	}
	public void setStk_p1AvUsers_tpAdTrue(Long stk_p1AvUsers_tpAdTrue) {
		this.stk_p1AvUsers_tpAdTrue = stk_p1AvUsers_tpAdTrue;
	}
	public Long getStk_p1AvUsers_tpAdFalse() {
		return stk_p1AvUsers_tpAdFalse;
	}
	public void setStk_p1AvUsers_tpAdFalse(Long stk_p1AvUsers_tpAdFalse) {
		this.stk_p1AvUsers_tpAdFalse = stk_p1AvUsers_tpAdFalse;
	}
	public Long getStk_p1AvUsers_tpAdNull() {
		return stk_p1AvUsers_tpAdNull;
	}
	public void setStk_p1AvUsers_tpAdNull(Long stk_p1AvUsers_tpAdNull) {
		this.stk_p1AvUsers_tpAdNull = stk_p1AvUsers_tpAdNull;
	}
	public Long getStk_p2AvUsers_mnoAdTrue() {
		return stk_p2AvUsers_mnoAdTrue;
	}
	public void setStk_p2AvUsers_mnoAdTrue(Long stk_p2AvUsers_mnoAdTrue) {
		this.stk_p2AvUsers_mnoAdTrue = stk_p2AvUsers_mnoAdTrue;
	}
	public Long getStk_p2AvUsers_mnoAdFalse() {
		return stk_p2AvUsers_mnoAdFalse;
	}
	public void setStk_p2AvUsers_mnoAdFalse(Long stk_p2AvUsers_mnoAdFalse) {
		this.stk_p2AvUsers_mnoAdFalse = stk_p2AvUsers_mnoAdFalse;
	}
	public Long getStk_p2AvUsers_mnoAdNull() {
		return stk_p2AvUsers_mnoAdNull;
	}
	public void setStk_p2AvUsers_mnoAdNull(Long stk_p2AvUsers_mnoAdNull) {
		this.stk_p2AvUsers_mnoAdNull = stk_p2AvUsers_mnoAdNull;
	}
	public Long getStk_p2AvUsers_tpAdTrue() {
		return stk_p2AvUsers_tpAdTrue;
	}
	public void setStk_p2AvUsers_tpAdTrue(Long stk_p2AvUsers_tpAdTrue) {
		this.stk_p2AvUsers_tpAdTrue = stk_p2AvUsers_tpAdTrue;
	}
	public Long getStk_p2AvUsers_tpAdFalse() {
		return stk_p2AvUsers_tpAdFalse;
	}
	public void setStk_p2AvUsers_tpAdFalse(Long stk_p2AvUsers_tpAdFalse) {
		this.stk_p2AvUsers_tpAdFalse = stk_p2AvUsers_tpAdFalse;
	}
	public Long getStk_p2AvUsers_tpAdNull() {
		return stk_p2AvUsers_tpAdNull;
	}
	public void setStk_p2AvUsers_tpAdNull(Long stk_p2AvUsers_tpAdNull) {
		this.stk_p2AvUsers_tpAdNull = stk_p2AvUsers_tpAdNull;
	}
	public Long getStk_mnoAdAllowed_true() {
		return stk_mnoAdAllowed_true;
	}
	public void setStk_mnoAdAllowed_true(Long stk_mnoAdAllowed_true) {
		this.stk_mnoAdAllowed_true = stk_mnoAdAllowed_true;
	}
	public Long getStk_mnoAdAllowed_false() {
		return stk_mnoAdAllowed_false;
	}
	public void setStk_mnoAdAllowed_false(Long stk_mnoAdAllowed_false) {
		this.stk_mnoAdAllowed_false = stk_mnoAdAllowed_false;
	}
	public Long getStk_mnoAdAllowed_null() {
		return stk_mnoAdAllowed_null;
	}
	public void setStk_mnoAdAllowed_null(Long stk_mnoAdAllowed_null) {
		this.stk_mnoAdAllowed_null = stk_mnoAdAllowed_null;
	}
	public Long getStk_tpAdAllowed_true() {
		return stk_tpAdAllowed_true;
	}
	public void setStk_tpAdAllowed_true(Long stk_tpAdAllowed_true) {
		this.stk_tpAdAllowed_true = stk_tpAdAllowed_true;
	}
	public Long getStk_tpAdAllowed_false() {
		return stk_tpAdAllowed_false;
	}
	public void setStk_tpAdAllowed_false(Long stk_tpAdAllowed_false) {
		this.stk_tpAdAllowed_false = stk_tpAdAllowed_false;
	}
	public Long getStk_tpAdAllowed_null() {
		return stk_tpAdAllowed_null;
	}
	public void setStk_tpAdAllowed_null(Long stk_tpAdAllowed_null) {
		this.stk_tpAdAllowed_null = stk_tpAdAllowed_null;
	}
	public String getCustomData() {
		return customData;
	}
	public void setCustomData(String customData) {
		this.customData = customData;
	}
	public Long getSleepy_aliveUsers() {
		return sleepy_aliveUsers;
	}
	public void setSleepy_aliveUsers(Long sleepy_aliveUsers) {
		this.sleepy_aliveUsers = sleepy_aliveUsers;
	}
	public Long getSleepy_p0AvUsers() {
		return sleepy_p0AvUsers;
	}
	public void setSleepy_p0AvUsers(Long sleepy_p0AvUsers) {
		this.sleepy_p0AvUsers = sleepy_p0AvUsers;
	}
	public Long getSleepy_p1AvUsers() {
		return sleepy_p1AvUsers;
	}
	public void setSleepy_p1AvUsers(Long sleepy_p1AvUsers) {
		this.sleepy_p1AvUsers = sleepy_p1AvUsers;
	}
	public Long getSleepy_p2AvUsers() {
		return sleepy_p2AvUsers;
	}
	public void setSleepy_p2AvUsers(Long sleepy_p2AvUsers) {
		this.sleepy_p2AvUsers = sleepy_p2AvUsers;
	}
	public Long getSleepy_p0AvUsers_mnoAdTrue() {
		return sleepy_p0AvUsers_mnoAdTrue;
	}
	public void setSleepy_p0AvUsers_mnoAdTrue(Long sleepy_p0AvUsers_mnoAdTrue) {
		this.sleepy_p0AvUsers_mnoAdTrue = sleepy_p0AvUsers_mnoAdTrue;
	}
	public Long getSleepy_p0AvUsers_mnoAdFalse() {
		return sleepy_p0AvUsers_mnoAdFalse;
	}
	public void setSleepy_p0AvUsers_mnoAdFalse(Long sleepy_p0AvUsers_mnoAdFalse) {
		this.sleepy_p0AvUsers_mnoAdFalse = sleepy_p0AvUsers_mnoAdFalse;
	}
	public Long getSleepy_p0AvUsers_mnoAdNull() {
		return sleepy_p0AvUsers_mnoAdNull;
	}
	public void setSleepy_p0AvUsers_mnoAdNull(Long sleepy_p0AvUsers_mnoAdNull) {
		this.sleepy_p0AvUsers_mnoAdNull = sleepy_p0AvUsers_mnoAdNull;
	}
	public Long getSleepy_p0AvUsers_tpAdTrue() {
		return sleepy_p0AvUsers_tpAdTrue;
	}
	public void setSleepy_p0AvUsers_tpAdTrue(Long sleepy_p0AvUsers_tpAdTrue) {
		this.sleepy_p0AvUsers_tpAdTrue = sleepy_p0AvUsers_tpAdTrue;
	}
	public Long getSleepy_p0AvUsers_tpAdFalse() {
		return sleepy_p0AvUsers_tpAdFalse;
	}
	public void setSleepy_p0AvUsers_tpAdFalse(Long sleepy_p0AvUsers_tpAdFalse) {
		this.sleepy_p0AvUsers_tpAdFalse = sleepy_p0AvUsers_tpAdFalse;
	}
	public Long getSleepy_p0AvUsers_tpAdNull() {
		return sleepy_p0AvUsers_tpAdNull;
	}
	public void setSleepy_p0AvUsers_tpAdNull(Long sleepy_p0AvUsers_tpAdNull) {
		this.sleepy_p0AvUsers_tpAdNull = sleepy_p0AvUsers_tpAdNull;
	}
	public Long getSleepy_p1AvUsers_mnoAdTrue() {
		return sleepy_p1AvUsers_mnoAdTrue;
	}
	public void setSleepy_p1AvUsers_mnoAdTrue(Long sleepy_p1AvUsers_mnoAdTrue) {
		this.sleepy_p1AvUsers_mnoAdTrue = sleepy_p1AvUsers_mnoAdTrue;
	}
	public Long getSleepy_p1AvUsers_mnoAdFalse() {
		return sleepy_p1AvUsers_mnoAdFalse;
	}
	public void setSleepy_p1AvUsers_mnoAdFalse(Long sleepy_p1AvUsers_mnoAdFalse) {
		this.sleepy_p1AvUsers_mnoAdFalse = sleepy_p1AvUsers_mnoAdFalse;
	}
	public Long getSleepy_p1AvUsers_mnoAdNull() {
		return sleepy_p1AvUsers_mnoAdNull;
	}
	public void setSleepy_p1AvUsers_mnoAdNull(Long sleepy_p1AvUsers_mnoAdNull) {
		this.sleepy_p1AvUsers_mnoAdNull = sleepy_p1AvUsers_mnoAdNull;
	}
	public Long getSleepy_p1AvUsers_tpAdTrue() {
		return sleepy_p1AvUsers_tpAdTrue;
	}
	public void setSleepy_p1AvUsers_tpAdTrue(Long sleepy_p1AvUsers_tpAdTrue) {
		this.sleepy_p1AvUsers_tpAdTrue = sleepy_p1AvUsers_tpAdTrue;
	}
	public Long getSleepy_p1AvUsers_tpAdFalse() {
		return sleepy_p1AvUsers_tpAdFalse;
	}
	public void setSleepy_p1AvUsers_tpAdFalse(Long sleepy_p1AvUsers_tpAdFalse) {
		this.sleepy_p1AvUsers_tpAdFalse = sleepy_p1AvUsers_tpAdFalse;
	}
	public Long getSleepy_p1AvUsers_tpAdNull() {
		return sleepy_p1AvUsers_tpAdNull;
	}
	public void setSleepy_p1AvUsers_tpAdNull(Long sleepy_p1AvUsers_tpAdNull) {
		this.sleepy_p1AvUsers_tpAdNull = sleepy_p1AvUsers_tpAdNull;
	}
	public Long getSleepy_p2AvUsers_mnoAdTrue() {
		return sleepy_p2AvUsers_mnoAdTrue;
	}
	public void setSleepy_p2AvUsers_mnoAdTrue(Long sleepy_p2AvUsers_mnoAdTrue) {
		this.sleepy_p2AvUsers_mnoAdTrue = sleepy_p2AvUsers_mnoAdTrue;
	}
	public Long getSleepy_p2AvUsers_mnoAdFalse() {
		return sleepy_p2AvUsers_mnoAdFalse;
	}
	public void setSleepy_p2AvUsers_mnoAdFalse(Long sleepy_p2AvUsers_mnoAdFalse) {
		this.sleepy_p2AvUsers_mnoAdFalse = sleepy_p2AvUsers_mnoAdFalse;
	}
	public Long getSleepy_p2AvUsers_mnoAdNull() {
		return sleepy_p2AvUsers_mnoAdNull;
	}
	public void setSleepy_p2AvUsers_mnoAdNull(Long sleepy_p2AvUsers_mnoAdNull) {
		this.sleepy_p2AvUsers_mnoAdNull = sleepy_p2AvUsers_mnoAdNull;
	}
	public Long getSleepy_p2AvUsers_tpAdTrue() {
		return sleepy_p2AvUsers_tpAdTrue;
	}
	public void setSleepy_p2AvUsers_tpAdTrue(Long sleepy_p2AvUsers_tpAdTrue) {
		this.sleepy_p2AvUsers_tpAdTrue = sleepy_p2AvUsers_tpAdTrue;
	}
	public Long getSleepy_p2AvUsers_tpAdFalse() {
		return sleepy_p2AvUsers_tpAdFalse;
	}
	public void setSleepy_p2AvUsers_tpAdFalse(Long sleepy_p2AvUsers_tpAdFalse) {
		this.sleepy_p2AvUsers_tpAdFalse = sleepy_p2AvUsers_tpAdFalse;
	}
	public Long getSleepy_p2AvUsers_tpAdNull() {
		return sleepy_p2AvUsers_tpAdNull;
	}
	public void setSleepy_p2AvUsers_tpAdNull(Long sleepy_p2AvUsers_tpAdNull) {
		this.sleepy_p2AvUsers_tpAdNull = sleepy_p2AvUsers_tpAdNull;
	}
	public Long getSleepy_mnoAdAllowed_true() {
		return sleepy_mnoAdAllowed_true;
	}
	public void setSleepy_mnoAdAllowed_true(Long sleepy_mnoAdAllowed_true) {
		this.sleepy_mnoAdAllowed_true = sleepy_mnoAdAllowed_true;
	}
	public Long getSleepy_mnoAdAllowed_false() {
		return sleepy_mnoAdAllowed_false;
	}
	public void setSleepy_mnoAdAllowed_false(Long sleepy_mnoAdAllowed_false) {
		this.sleepy_mnoAdAllowed_false = sleepy_mnoAdAllowed_false;
	}
	public Long getSleepy_mnoAdAllowed_null() {
		return sleepy_mnoAdAllowed_null;
	}
	public void setSleepy_mnoAdAllowed_null(Long sleepy_mnoAdAllowed_null) {
		this.sleepy_mnoAdAllowed_null = sleepy_mnoAdAllowed_null;
	}
	public Long getSleepy_tpAdAllowed_true() {
		return sleepy_tpAdAllowed_true;
	}
	public void setSleepy_tpAdAllowed_true(Long sleepy_tpAdAllowed_true) {
		this.sleepy_tpAdAllowed_true = sleepy_tpAdAllowed_true;
	}
	public Long getSleepy_tpAdAllowed_false() {
		return sleepy_tpAdAllowed_false;
	}
	public void setSleepy_tpAdAllowed_false(Long sleepy_tpAdAllowed_false) {
		this.sleepy_tpAdAllowed_false = sleepy_tpAdAllowed_false;
	}
	public Long getSleepy_tpAdAllowed_null() {
		return sleepy_tpAdAllowed_null;
	}
	public void setSleepy_tpAdAllowed_null(Long sleepy_tpAdAllowed_null) {
		this.sleepy_tpAdAllowed_null = sleepy_tpAdAllowed_null;
	}
	
	
	
}
