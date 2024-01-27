package com.mobiera.aircast.commons.vo;


import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.vo.CommonVO;
import com.mobiera.ms.commons.stats.api.StatGranularity;
import com.mobiera.ms.mno.aircast.stats.AircastStatClass;

@JsonInclude(Include.NON_NULL)
public class StatVO implements CommonVO {

	private static final long serialVersionUID = 4829415845298862370L;

	private Long id;
	private Instant ts;
	private Long entityFk;
	private AircastStatClass statClass;
	private StatGranularity statGranularity;
	
	private Long long0;
	private Long long1;
	private Long long2;
	private Long long3;
	private Long long4;
	private Long long5;
	private Long long6;
	private Long long7;
	private Long long8;
	private Long long9;
	private Long long10;
	private Long long11;
	private Long long12;
	private Long long13;
	private Long long14;
	private Long long15;
	private Long long16;
	private Long long17;
	private Long long18;
	private Long long19;
	private Long long20;
	private Long long21;
	private Long long22;
	private Long long23;
	private Long long24;
	private Long long25;
	private Long long26;
	private Long long27;
	private Long long28;
	private Long long29;
	private Long long30;
	private Long long31;
	public final Long getId() {
		return id;
	}
	public final void setId(Long id) {
		this.id = id;
	}
	public final Instant getTs() {
		return ts;
	}
	public final void setTs(Instant ts) {
		this.ts = ts;
	}
	public final Long getEntityFk() {
		return entityFk;
	}
	public final void setEntityFk(Long entityFk) {
		this.entityFk = entityFk;
	}
	public final AircastStatClass getStatClass() {
		return statClass;
	}
	public final void setStatClass(AircastStatClass statClass) {
		this.statClass = statClass;
	}
	public final StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public final void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	public final Long getLong0() {
		return long0;
	}
	public final void setLong0(Long long0) {
		this.long0 = long0;
	}
	public final Long getLong1() {
		return long1;
	}
	public final void setLong1(Long long1) {
		this.long1 = long1;
	}
	public final Long getLong2() {
		return long2;
	}
	public final void setLong2(Long long2) {
		this.long2 = long2;
	}
	public final Long getLong3() {
		return long3;
	}
	public final void setLong3(Long long3) {
		this.long3 = long3;
	}
	public final Long getLong4() {
		return long4;
	}
	public final void setLong4(Long long4) {
		this.long4 = long4;
	}
	public final Long getLong5() {
		return long5;
	}
	public final void setLong5(Long long5) {
		this.long5 = long5;
	}
	public final Long getLong6() {
		return long6;
	}
	public final void setLong6(Long long6) {
		this.long6 = long6;
	}
	public final Long getLong7() {
		return long7;
	}
	public final void setLong7(Long long7) {
		this.long7 = long7;
	}
	public final Long getLong8() {
		return long8;
	}
	public final void setLong8(Long long8) {
		this.long8 = long8;
	}
	public final Long getLong9() {
		return long9;
	}
	public final void setLong9(Long long9) {
		this.long9 = long9;
	}
	public final Long getLong10() {
		return long10;
	}
	public final void setLong10(Long long10) {
		this.long10 = long10;
	}
	public final Long getLong11() {
		return long11;
	}
	public final void setLong11(Long long11) {
		this.long11 = long11;
	}
	public final Long getLong12() {
		return long12;
	}
	public final void setLong12(Long long12) {
		this.long12 = long12;
	}
	public final Long getLong13() {
		return long13;
	}
	public final void setLong13(Long long13) {
		this.long13 = long13;
	}
	public final Long getLong14() {
		return long14;
	}
	public final void setLong14(Long long14) {
		this.long14 = long14;
	}
	public final Long getLong15() {
		return long15;
	}
	public final void setLong15(Long long15) {
		this.long15 = long15;
	}
	public final Long getLong16() {
		return long16;
	}
	public final void setLong16(Long long16) {
		this.long16 = long16;
	}
	public final Long getLong17() {
		return long17;
	}
	public final void setLong17(Long long17) {
		this.long17 = long17;
	}
	public final Long getLong18() {
		return long18;
	}
	public final void setLong18(Long long18) {
		this.long18 = long18;
	}
	public final Long getLong19() {
		return long19;
	}
	public final void setLong19(Long long19) {
		this.long19 = long19;
	}
	public final Long getLong20() {
		return long20;
	}
	public final void setLong20(Long long20) {
		this.long20 = long20;
	}
	public final Long getLong21() {
		return long21;
	}
	public final void setLong21(Long long21) {
		this.long21 = long21;
	}
	public final Long getLong22() {
		return long22;
	}
	public final void setLong22(Long long22) {
		this.long22 = long22;
	}
	public final Long getLong23() {
		return long23;
	}
	public final void setLong23(Long long23) {
		this.long23 = long23;
	}
	public final Long getLong24() {
		return long24;
	}
	public final void setLong24(Long long24) {
		this.long24 = long24;
	}
	public final Long getLong25() {
		return long25;
	}
	public final void setLong25(Long long25) {
		this.long25 = long25;
	}
	public final Long getLong26() {
		return long26;
	}
	public final void setLong26(Long long26) {
		this.long26 = long26;
	}
	public final Long getLong27() {
		return long27;
	}
	public final void setLong27(Long long27) {
		this.long27 = long27;
	}
	public final Long getLong28() {
		return long28;
	}
	public final void setLong28(Long long28) {
		this.long28 = long28;
	}
	public final Long getLong29() {
		return long29;
	}
	public final void setLong29(Long long29) {
		this.long29 = long29;
	}
	public final Long getLong30() {
		return long30;
	}
	public final void setLong30(Long long30) {
		this.long30 = long30;
	}
	public final Long getLong31() {
		return long31;
	}
	public final void setLong31(Long long31) {
		this.long31 = long31;
	}
	
}
