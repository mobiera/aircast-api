package com.mobiera.aircast.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class JsonUtil {

	public static String serialize(Object obj, boolean pretty) throws JsonProcessingException {
	    ObjectMapper mapper = JsonMapper.builder()
	            .findAndAddModules()
	            .build(); 
	    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

	    if (pretty) {
	        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
	    } else {
	    	 return mapper.writeValueAsString(obj);
	    }

	   
	}
	
	/*public static Object deserialize(String json) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Request request = mapper.readValue(json, Request.class);
		return 
	    
	}
	
	
	public class RawJsonDeserializer extends JsonDeserializer<String> {

	    @Override
	    public String deserialize(JsonParser jp, DeserializationContext ctxt)
	           throws IOException, JsonProcessingException {

	        ObjectMapper mapper = (ObjectMapper) jp.getCodec();
	        JsonNode node = mapper.readTree(jp);
	        return mapper.writeValueAsString(node);
	    }
	}
	
	public class Request {

	    @JsonDeserialize(using = RawJsonDeserializer.class)
	    private String text;

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}


	    // Getters and setters omitted
	}*/
}
