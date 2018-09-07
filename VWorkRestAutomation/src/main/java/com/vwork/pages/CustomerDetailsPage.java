package com.vwork.pages;

import java.io.IOException;

import com.vwork.base.Base;
import com.vwork.pojo.CustomerDetails;
import com.vwork.utils.Utility;
import com.vwork.utils.PayLoad;
import com.vwork.utils.RestClient;
import com.vwork.utils.ValidateResponse;

public class CustomerDetailsPage extends Base {
	
	public CustomerDetailsPage getResponse()
	{

		String uri=Utility.getUrl(getData("resourceURL"));
		RestClient.getRequest(uri);
		
		String respString=response.asString();
		System.out.println(respString);
		return this;
	}
	
	public CustomerDetailsPage postResponse() throws IOException
	{
		CustomerDetails o=PayLoad.getEmpDetailsPayLoad();//16, "test6", "Author6"
		
		
		String jsonstring=Utility.marshling(o); //converted POJO object to json string
	   // System.out.println(jsonstring); 
	    
		RestClient.post("http://localhost:3000/customers",jsonstring); //send json string as payload
		
		String respString=response.asString();
		System.out.println(respString);
		return this;
				
		
	}
	
	public CustomerDetailsPage validateCustomerGetRequest()
	{
		String resCustomerid=ValidateResponse.getAttributeValue("id");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resCustomerid+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		String resCustomeraccount=ValidateResponse.getAttributeValue("account");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resCustomeraccount+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		String resCustomerskils1=ValidateResponse.getAttributeValue("skils[0]");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resCustomerskils1+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		String resCustomerskils2=ValidateResponse.getAttributeValue("skils[1]");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resCustomerskils2+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		String resCustomerspersionaldetailsfname=ValidateResponse.getAttributeValue("persionaldetails.firstname");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resCustomerspersionaldetailsfname+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		

		String resCustomerspersionaldetailslname=ValidateResponse.getAttributeValue("persionaldetails.lastname");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resCustomerspersionaldetailslname+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		

		String resmobiles_0_operator=ValidateResponse.getAttributeValue("mobiles[0].operator");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resmobiles_0_operator+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		String resmobiles_0_mob=ValidateResponse.getAttributeValue("mobiles[0].mob");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resmobiles_0_mob+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		

		String resmobiles_1_operator=ValidateResponse.getAttributeValue("mobiles[1].operator");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resmobiles_1_operator+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		String resmobiles_1_mob=ValidateResponse.getAttributeValue("mobiles[1].mob");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resmobiles_1_mob+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		

		String resmobiles_2_operator=ValidateResponse.getAttributeValue("mobiles[2].operator");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resmobiles_2_operator+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		String resmobiles_2_mob=ValidateResponse.getAttributeValue("mobiles[2].mob");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resmobiles_2_mob+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
		
		String resindian=ValidateResponse.getAttributeValue("indian");
		//String actualCusomername=getData("name");
		System.out.println(" Value "+resindian+"  Stored in map");
	//	ValidateResponse.storeResposeToMap(resCustomername, actualCusomername);
			
		
		return this;
				
	}
	
	public boolean isValidResponse()
	{
				
		return ValidateResponse.validateHTTPResponse();
	}

}
