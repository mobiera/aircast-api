package com.mobiera.aircast.commons.enums.statsold;

import java.util.List;

import com.mobiera.ms.commons.stats.api.StatClass;
import com.mobiera.ms.commons.stats.api.StatDiscovery;
import com.mobiera.ms.commons.stats.api.StatEnum;

public class StatDiscoveryImpl implements StatDiscovery {

	@Override
	public StatClass getStatClass(Integer index) {
		return AircastStatClass.getEnum(index);
	}

	@Override
	public StatClass getStatClass(String name) {
		return AircastStatClass.valueOf(name);
	}

	@Override
	public StatEnum getStatEnum(StatClass statClass, String statEnumStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StatEnum> getStatEnums(StatClass statClass, List<String> statEnumStr) {
		// TODO Auto-generated method stub
		return null;
	}

}
