package com.vwork.flow;

import java.io.IOException;

import com.vwork.Services.CustomerDetailsPage;
import com.vwork.base.Base;
import com.vwork.base.TestBase;
import com.vwork.pojo.CustomerDetails;
import com.vwork.utils.Utility;
import com.vwork.utils.PayLoad;
import com.vwork.utils.RestClient;

public class Flow extends TestBase{

	public void testGetResponse()
	{
		CustomerDetailsPage customerDetailsPage=new CustomerDetailsPage();
		customerDetailsPage.getResponse();
		
	}
	
	public void testPostResponse() throws IOException
	{
		CustomerDetailsPage customerDetailsPage=new CustomerDetailsPage();
		customerDetailsPage.postResponse();
				
		
	}
}
