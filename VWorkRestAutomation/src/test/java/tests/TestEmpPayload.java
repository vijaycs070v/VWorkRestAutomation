package tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import Json.EmpDetails;
import Json.PayLoad;

public class TestEmpPayload {

	@Test
	public  void testEmpPayload() throws IOException
	{
		ObjectMapper mapper=new ObjectMapper();
		
		EmpDetails e=PayLoad.getEmpDetailsPayLoad();
		String s=mapper.writeValueAsString(e); //json string
		System.out.println(s);
		
		EmpDetails ee=mapper.readValue(s,EmpDetails.class);
		System.out.println(ee.getMobiles().get(0).getMob());
		System.out.println(ee.getSkils().get(1));
	}
}
