package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.initg.base.TestBase;
import com.initg.data.PayLoadPosts;
import com.initg.utils.JsonUtils;

import base.Base;

public class TestPostResponse extends Base{

	@Test
	public void getResponse() throws JsonGenerationException, JsonMappingException, IOException
	{
		PayLoadPosts o=new PayLoadPosts();//16, "test6", "Author6"
		o.setId(5);
		o.setTitle("test5");
		o.setAuthor("vijay");
		
		String jsonstring=JsonUtils.marshling(o);
	
		post("http://localhost:3000/posts/", jsonstring);
		
		String respString=response.asString();
		
		PayLoadPosts resObject= JsonUtils.unMarshling(respString,PayLoadPosts.class);
		
		System.out.println(resObject.getId()+" "+resObject.getTitle()+"  "+resObject.getAuthor());
		
		
		
	}
	
}
