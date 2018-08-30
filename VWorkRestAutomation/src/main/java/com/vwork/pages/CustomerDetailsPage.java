package com.vwork.pages;

import java.io.IOException;

import com.vwork.base.Base;
import com.vwork.pojo.EmpDetails;
import com.vwork.utils.JsonUtils;
import com.vwork.utils.PayLoad;
import com.vwork.utils.RestClient;
import com.vwork.utils.ValidateResponse;

public class CustomerDetailsPage extends Base {
	
	public void getResponse()
	{

		RestClient.getRequest("http://localhost:3000/customers");
		
		String respString=response.asString();
		System.out.println(respString);
	}
	
	public void postResponse() throws IOException
	{
		EmpDetails o=PayLoad.getEmpDetailsPayLoad();//16, "test6", "Author6"
		
		
		String jsonstring=JsonUtils.marshling(o); //converted POJO object to json string
	   // System.out.println(jsonstring); 
	    
		RestClient.post("http://localhost:3000/customers",jsonstring); //send json string as payload
		
		String respString=response.asString();
		System.out.println(respString);
				
		
	}
	
	public void validateCustomerGetRequest()
	{
		String resCustomername=ValidateResponse.getAttributeValue("name");
		String actualCusomername=getData("name");
		ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		
		
	}
	
	public boolean isCorrectResponse()
	{
		
		testpass=ValidateResponse.validateHTTPResponse();
		return testpass;
	}

}
