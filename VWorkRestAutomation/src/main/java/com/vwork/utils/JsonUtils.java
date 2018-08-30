package com.vwork.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();	
	}
	public static String marshling(Object o) throws JsonGenerationException, JsonMappingException, IOException
	{
	    
		//mapper.writeValue(new File("C:\\Users\\Vijay\\Desktop\\Trainings\\Rest-AssuredAutomation\\src\\main\\java\\com\\initg\\data\\PayLoadPosts.json"), o);
	 
		String value=mapper.writeValueAsString(o);
		//System.out.println(value);
		
		return value;
	
	}
	
public static  <T>T unMarshling(String jsonstring, Class<T> cls) throws JsonParseException, JsonMappingException, IOException 
{
	
   T result=mapper.readValue(jsonstring, cls);
	return result;
}
}
