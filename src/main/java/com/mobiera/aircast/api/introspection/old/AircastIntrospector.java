package com.mobiera.aircast.api.introspection.old;

import java.util.ArrayList;
import java.util.List;

import com.mobiera.commons.introspection.EnumValueVO;
import com.mobiera.commons.introspection.FieldVO;
import com.mobiera.commons.introspection.Introspector;
import com.mobiera.commons.introspection.MainVO;

public class AircastIntrospector extends Introspector {
	
	
	private static AircastIntrospector instance = null;
	private List<String> defaultEnumPackages = null;
	private List<String> defaultVOPackages = null;

	public static AircastIntrospector getInstance() {
		if(instance == null)
			instance = new AircastIntrospector();
		return instance;
	}

	@Override
	public List<String> getEnumPackages() {
		
		
		if (defaultEnumPackages  == null) {
			defaultEnumPackages = new ArrayList<String>();
			defaultEnumPackages.add(com.mobiera.aircast.commons.enums.AppletImpl.class.getPackage().getName());
			defaultEnumPackages.add(com.mobiera.ms.mno.aircast.stats.AircastStatClass.class.getPackage().getName());
			defaultEnumPackages.add(com.mobiera.aircast.api.enums.AppletSection.class.getPackage().getName());
			defaultEnumPackages.add(com.mobiera.lib.etsi102225.api.model.AlgorithmImplementation.class.getPackage().getName());
			defaultEnumPackages.add(com.mobiera.aircast.api.v1.sleepy.action.Action.class.getPackage().getName());
			defaultEnumPackages.addAll(super.getEnumPackages());
		}
		return defaultEnumPackages;
	}

	@Override
	public List<String> getVOPackages() {
		if (defaultVOPackages == null) {
			defaultVOPackages = new ArrayList<String>();
			defaultVOPackages.add(com.mobiera.aircast.api.vo.ParameterVO.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.vo.stats.CampaignPreviewVO.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.sleepy.action.Action.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.vo.ad.AdVO.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.campaign.ListCampaignsRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.endpoint.ListEndpointsRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.applet.ListAppletsRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.campaign_schedule.ListCampaignSchedulesRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.sim_profile.ListSimProfilesRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.file.ListFilesRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.parameter.ListParametersRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.smpp_account.ListSmppAccountsRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.tp_rule.ListTpRulesRequest.class.getPackage().getName());
			
			defaultVOPackages.add(com.mobiera.aircast.api.v1.identifier.ListIdentifiersRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.pricepoint.ListPricepointsRequest.class.getPackage().getName());
			defaultVOPackages.add(com.mobiera.aircast.api.v1.vaservice.ListVaServicesRequest.class.getPackage().getName());
			
			defaultVOPackages.add(com.mobiera.aircast.api.v1.subscription.FindSubscriptionsRequest.class.getPackage().getName());
			
			defaultVOPackages.add(com.mobiera.ms.mno.api.json.SubscriptionEvent.class.getPackage().getName());
			
			
		}
		return defaultVOPackages;
	}

	public List<String> listEnumValues(String className) throws ClassNotFoundException {
		return listEnumValues(getEnumPackages(), className);
	}

	public List<EnumValueVO> listEnumValueVOs(String targetClassName) throws ClassNotFoundException {
		return super.listEnumValueVOs(getEnumPackages(), targetClassName);
	}

	public MainVO getMainVO(String name) throws ClassNotFoundException {
		return super.getMainVO(getVOPackages(), name);
	}

	public List<FieldVO> listAttributeVOs(String name) throws ClassNotFoundException {
		return super.listAttributeVOs(getVOPackages(), name);
	}
	
	
	
	
}
