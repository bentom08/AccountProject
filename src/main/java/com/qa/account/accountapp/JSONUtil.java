package com.qa.account.accountapp;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil {
	
	private ObjectMapper mapper = new ObjectMapper();
	
	public <T> T getObjectfromJSON(String json, Class <T> clazz) throws JsonMappingException, IOException {
		return mapper.readValue(json, clazz);
	}
	
	public String getJSONfromObject(Object object) throws JsonProcessingException {
		return mapper.writeValueAsString(object);
	}
}
