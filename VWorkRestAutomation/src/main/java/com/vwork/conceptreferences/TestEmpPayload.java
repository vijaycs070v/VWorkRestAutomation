package com.vwork.conceptreferences;

import java.io.IOException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vwork.pojo.CustomerDetails;
import com.vwork.utils.PayLoad;

public class TestEmpPayload {

	@Test
	public  void testEmpPayload() throws IOException
	{
		ObjectMapper mapper=new ObjectMapper();
		
		CustomerDetails e=PayLoad.getEmpDetailsPayLoad();
		String s=mapper.writeValueAsString(e); //json string
		System.out.println(s);
		
		CustomerDetails ee=mapper.readValue(s,CustomerDetails.class);
		System.out.println(ee.getMobiles().get(0).getMob());
		System.out.println(ee.getSkils().get(1));
	}
}
