package tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import Utils.JsonUtils;
import Utils.PayLoad;
import Utils.RestClient;
import base.Base;
import pages.EmpDetails;

public class TestPostResponse extends Base{

	@Test
	public void getResponse() throws JsonGenerationException, JsonMappingException, IOException
	{
		EmpDetails o=PayLoad.getEmpDetailsPayLoad();//16, "test6", "Author6"
		
		
		String jsonstring=JsonUtils.marshling(o); //converted POJO object to json string
	   // System.out.println(jsonstring); 
	    
		RestClient.post("http://localhost:3000/customers",jsonstring); //send json string as payload
		
		String respString=response.asString();
		System.out.println(respString);
				
		
	}
	
}
