package com.vwork.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.vwork.base.Base;
import com.vwork.base.TestBase;
import com.vwork.flow.Flow;
import com.vwork.utils.RestClient;

public class TestCustomerGetResponse extends TestBase{

	public String tcname="TC001";
	@BeforeMethod
	public void setup()
	{
		super.setup(tcname);
	}
	@Test
	public void getResponse() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		Flow f=new Flow();
		f.testGetResponse();
		//Assert.assertTrue(testpass);
		
	}
	
}
