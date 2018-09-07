package com.vwork.flow;

import java.io.IOException;

import com.vwork.base.Base;
import com.vwork.pages.CustomerDetailsPage;
import com.vwork.pojo.EmpDetails;
import com.vwork.utils.Utility;
import com.vwork.utils.PayLoad;
import com.vwork.utils.RestClient;

public class Flow extends Base{

	public void testGetResponse()
	{
		CustomerDetailsPage customerDetailsPage=new CustomerDetailsPage();
		customerDetailsPage.getResponse()
		.validateCustomerGetRequest();
		//testpass=customerDetailsPage.isValidResponse();
		
	}
	
	public void testPostResponse() throws IOException
	{
		CustomerDetailsPage customerDetailsPage=new CustomerDetailsPage();
		customerDetailsPage.postResponse();
				
		
	}
}
