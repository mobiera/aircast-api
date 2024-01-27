package com.mobiera.aircast.api.v2.stats;

import java.io.IOException;
import java.time.Instant;
import java.util.List;

import org.jboss.logging.Logger;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.mobiera.ms.commons.stats.api.StatResultType;
import com.mobiera.ms.mno.aircast.stats.ActionTriggerStat;
import com.mobiera.ms.mno.aircast.stats.AdStat;
import com.mobiera.ms.mno.aircast.stats.AircastStatClass;
import com.mobiera.ms.mno.aircast.stats.CampaignScheduleStat;
import com.mobiera.ms.mno.aircast.stats.CampaignStat;
import com.mobiera.ms.mno.aircast.stats.EndpointStat;
import com.mobiera.ms.mno.aircast.stats.IdentifierStat;
import com.mobiera.ms.mno.aircast.stats.LandingStat;
import com.mobiera.ms.mno.aircast.stats.PricepointStat;
import com.mobiera.ms.mno.aircast.stats.SmppAccountStat;
import com.mobiera.ms.mno.aircast.stats.VaServiceStat;

public class GetStatViewRequestDeserializer extends StdDeserializer<GetStatViewRequest> {

	
	private static Logger logger = Logger.getLogger(GetStatViewRequestDeserializer.class);

	protected GetStatViewRequestDeserializer(Class<GetStatViewRequest> vc) {
		super(vc);
	}

	public GetStatViewRequestDeserializer() {
	       super(GetStatViewRequest.class);
	   }
	/**
	 * 
	 */
	private static final long serialVersionUID = 7L;

	/*
	 * { "from" : 1515867977015, "to" : 1516121777015, "entityFks" : [ ], 
	 * "statClass" : "SMPP_ACCOUNT", "statGranularity" : "HOUR", 
	 * "statEnums" : [ "SUBMIT_SM", "DELIVER_SM", "STAT_TS" ], 
	 * "statResultType" : "LIST_AND_SUM" }
	 */
	
	@Override
	public GetStatViewRequest deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		GetStatViewRequest request = new GetStatViewRequest();
		JsonNode node = jp.getCodec().readTree(jp);
		/*for (Iterator<String> i = node.fieldNames(); i.hasNext();) {
			logger.warn("nodes: " + i.next());
	    	
		}*/
		
		String from = node.get("from").asText();
		
        if (from != null) {
        	Instant fromDate = Instant.parse(from);
        	request.setFrom(fromDate);
        }
        String to = node.get("to").asText();
        
        if (to != null) {
        	Instant toDate = Instant.parse(to);
        	request.setTo(toDate);
        }
        String statClass = node.get("statClass").asText();
        if (statClass != null) {
        	request.setStatClass(statClass);
        }
        /*String statGranularity = node.get("statGranularity").asText();
        if (statGranularity != null) {
        	request.setStatGranularity(StatGranularity.valueOf(statGranularity));
        }*/
        String statResultType = node.get("statResultType").asText();
        //logger.warn("statResultType: " + statResultType);
    	
        if (statResultType != null) {
        	request.setStatResultType(StatResultType.valueOf(statResultType));
        }
        
        ObjectMapper mapper = new ObjectMapper();
        JsonNode statEnumNode = node.get("statEnums");
       // ArrayNode datasetArray = (ArrayNode)node.get("statEnums");
        //logger.warn("statEnumArray: " + statEnumNode);
        
        
    	if (statEnumNode!=null) {
    		
    		
    		/* List<StatEnum>  res = null;
    	        if (statEnumNode!=null) {
    	             ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<CommonStatEnum>>(){});
    	             res = objectReader.readValue(node);
    	             request.setStatEnums(res);
    	        }
    	        
    		*/
    		
    		
    		switch (AircastStatClass.valueOf(request.getStatClass()) ) {
            case SMPP_ACCOUNT: {
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<SmppAccountStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            case CAMPAIGN:
            case CAMPAIGN_PARAMS:{
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<CampaignStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            case ACTION_TRIGGER:{
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<ActionTriggerStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            case CAMPAIGN_SCHEDULE:{
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<CampaignScheduleStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            case ENDPOINT: {
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<EndpointStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            case AD: {
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<AdStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            case IDENTIFIER: {
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<IdentifierStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            case LANDING: {
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<LandingStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            case PRICEPOINT: {
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<PricepointStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            case VA_SERVICE: {
            	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<VaServiceStat>>(){});
            	request.setStatEnums(objectReader.readValue(statEnumNode));
            	break;
            }
            
            default: 
            }
               
    	}
        
        JsonNode entityFkNode = node.get("entityFks");
        if (entityFkNode != null) {
        	ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<Long>>(){});
        	request.setEntityFks(objectReader.readValue(entityFkNode));
        	
        }
    	
        
		return request;
	}

	
}
