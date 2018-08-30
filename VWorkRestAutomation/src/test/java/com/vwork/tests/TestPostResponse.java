package com.vwork.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.vwork.base.Base;
import com.vwork.flow.Flow;
import com.vwork.pojo.EmpDetails;
import com.vwork.utils.JsonUtils;
import com.vwork.utils.PayLoad;
import com.vwork.utils.RestClient;

public class TestPostResponse extends Base{

	@Test
	public void getResponse() throws JsonGenerationException, JsonMappingException, IOException
	{
		Flow f=new Flow();
		f.testPostResponse();
	}
	
}
