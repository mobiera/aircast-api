package com.mobiera.aircast.api.v1.stats;

import java.io.IOException;
import java.util.Date;
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
import com.mobiera.ms.commons.stats.api.StatGranularity;
import com.mobiera.ms.commons.stats.api.StatResultType;
import com.mobiera.ms.mno.aircast.stats.ActionTriggerStat;
import com.mobiera.ms.mno.aircast.stats.AircastStatClass;
import com.mobiera.ms.mno.aircast.stats.CampaignScheduleStat;
import com.mobiera.ms.mno.aircast.stats.CampaignStat;
import com.mobiera.ms.mno.aircast.stats.EndpointStat;
import com.mobiera.ms.mno.aircast.stats.SmppAccountStat;

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
		
        Long from = (Long) (node.get("from")).longValue();
        Date fromDate = null;
        if (from != null) {
        	fromDate = new Date(from);
        	request.setFrom(fromDate);
        }
        Long to = (Long) (node.get("to")).longValue();
        Date toDate = null;
        if (to != null) {
        	toDate = new Date(to);
        	request.setTo(toDate);
        }
        String statClass = node.get("statClass").asText();
        if (statClass != null) {
        	request.setStatClass(AircastStatClass.valueOf(statClass));
        }
        String statGranularity = node.get("statGranularity").asText();
        if (statGranularity != null) {
        	request.setStatGranularity(StatGranularity.valueOf(statGranularity));
        }
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
    		switch (request.getStatClass()) {
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
