package com.vwork.arc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vwork.base.Base;
import com.vwork.base.TestBase;
import com.vwork.pojo.CustomerDetails;
import com.vwork.pojo.Mobiles;
import com.vwork.pojo.Persionaldetails;
import com.vwork.utils.Utility;
import com.vwork.utils.PayLoad;
import com.vwork.utils.RestClient;
import com.vwork.utils.ValidateResponse;

public class CustomerDetailsPage extends TestBase {
	
	public CustomerDetailsPage getResponse()
	{

		String uri=Utility.getUrl(getValue("resourceURL"));
		RestClient.getRequest(uri);
		
		String respString=response.asString();
		System.out.println(respString);
		return this;
	}
	
	public CustomerDetailsPage postResponse() throws IOException
	{
		CustomerDetails e=new CustomerDetails();
		e.setId(Integer.parseInt(getValue("id")));
		e.setAccount(getValue("account"));
		e.setIsIndian(Boolean.parseBoolean(getValue("isIndian")));
		
		List<String> sk=new ArrayList<String>();
		sk.add(getValue("skils[0]"));
		sk.add(getValue("skils[1]"));
		e.setSkils(sk);
		
		Persionaldetails p=new Persionaldetails();
		p.setFirstname(getValue("persionaldetails.firstname"));
		p.setLastname(getValue("lastname.lastname"));
		e.setPersionaldetails(p); //passing Persionaldetails object
		//mapper.writeValueAsString(value);
		
		List<Mobiles> mob=new ArrayList<Mobiles>();
		
		Mobiles m1=new Mobiles();
		m1.setOperator(getValue("mobiles[0].operator"));
		m1.setMob(Long.parseLong(getValue("mobiles[0].mob")));
		mob.add(m1);
		
		Mobiles m2=new Mobiles();
		m2.setOperator(getValue("mobiles[1].operator"));
		m2.setMob(Long.parseLong(getValue("mobiles[1].mob")));
		mob.add(m2);
		
		Mobiles m3=new Mobiles();
		m3.setOperator(getValue("mobiles[2].operator"));
		m3.setMob(Long.parseLong(getValue("mobiles[2].mob")));
		mob.add(m3);
		
		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", getValue("salary"));
		props.put("age", getValue("age"));
		e.setProperties(props);
		
		
		e.setMobiles(mob);
		
		//CustomerDetails o=PayLoad.getEmpDetailsPayLoad();//16, "test6", "Author6"
		
		
		String jsonstring=Utility.marshling(e); //converted POJO object to json string
	   // System.out.println(jsonstring); 
	    
		RestClient.post("http://localhost:3000/customers",jsonstring); //send json string as payload
		
		String respString=response.asString();
		System.out.println(respString);
		return this;
				
		
	}
	
	public CustomerDetailsPage validateCustomerGetRequest()
	{
		
		
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
