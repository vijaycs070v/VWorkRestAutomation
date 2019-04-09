package com.vwork.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.vwork.Services.CustomerDetailsPage;
import com.vwork.base.Base;
import com.vwork.base.TestBase;
import com.vwork.flow.Flow;
import com.vwork.utils.RestClient;

public class TestCustomerGetResponse extends TestBase{

	public String tcname;
	@BeforeMethod
	public void setup()
	{
		super.setup(tcname);
		headerMap.put("ContentType", "Application-JSON");
		headerMap.put("AUTH_TOCKEN",RestClient.getAuthTocken(getPropValue("AuthURL"), getPropValue("UserId"), getPropValue("Pwd")));
	}
	@Test
	public void getResponse() throws JsonGenerationException, JsonMappingException, IOException
	{
		
/*		Flow f=new Flow();
		f.testGetResponse();*/
		
		new CustomerDetailsPage().getResponse();
		
		if(response.getStatusCode()==200)
		{
		softassert.assertEquals(getAttributeValue("id"), getValue("id"));
		softassert.assertEquals(getAttributeValue("account"), getValue("account"));
		softassert.assertEquals(getAttributeValue("skils[0]"), getValue("skils[0]"));
		softassert.assertEquals(getAttributeValue("skils[1]"), getValue("skils[1]"));
		softassert.assertEquals(getAttributeValue("persionaldetails.firstname"), getValue("persionaldetails.firstname"));
		softassert.assertEquals(getAttributeValue("persionaldetails.lastname"), getValue("persionaldetails.lastname"));
		softassert.assertEquals(getAttributeValue("mobiles[0].operator"), getValue("mobiles[0].operator"));
		softassert.assertEquals(getAttributeValue("mobiles[0].mob"), getValue("mobiles[0].mob"));
		softassert.assertEquals(getAttributeValue("mobiles[1].operator"), getValue("mobiles[1].operator"));
		
		}
		
		else
		{
			softassert.assertTrue(false);
		}
		
		softassert.assertAll();
	}
	
}
