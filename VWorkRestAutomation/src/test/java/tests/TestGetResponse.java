package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;


import Json.EmpDetails;
import Json.PayLoad;
import Utils.JsonUtils;
import Utils.RestClient;
import base.Base;

public class TestGetResponse extends Base{

	@Test
	public void getResponse() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		RestClient.getRequest("http://localhost:3000/customers");
		
		String respString=response.asString();
		System.out.println(respString);
		
		
	}
	
}
