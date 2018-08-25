package base;

import java.util.HashMap;
import java.util.Map;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;


public class HTTPClient extends Base {

	 
	 Map<String, String> headerMap=new HashMap<String, String>();
	 HashMap<String,Boolean> responseMap=new HashMap<String,Boolean>();
	 String uri;
	 
	 public  HTTPClient()
	 {
		 headerMap.put("usaa-gateway-proof", "sdllkgdjgq239593242ikk4ktkerjtiejreutu");
		 headerMap.put("usaa-activity","kdgjskfjalfowiedfgdf");
	 }
	 
	 public static void getRequest(String url)
		{
			
			response=RestAssured.given()
					.contentType(ContentType.JSON)
					//.headers(headerMap)
					//.pathParam("userid", pathparam)
					.when()
					.get(url)
					.then()
					.extract()
					.response();
			resopnsecode=response.getStatusCode();
			
			
		}
	public  static void getPathParam(String url, String pathparam)
	{
		
		response=RestAssured.given()
				.contentType(ContentType.JSON)
				//.headers(headerMap)
				.pathParam("userid", pathparam)
				.when()
				.get(url)
				.then()
				.extract()
				.response();
		resopnsecode=response.getStatusCode();
		
		
	}
	
	public static void getQueryParam(String uri, String stringJSON)
	{
		
		
		response= RestAssured.given()
				.contentType(ContentType.JSON)
			//	.headers(headerMap)
				.queryParam("id", 4)
				.when()
				.get("url")
				.then()
				.extract()
				.response();
		resopnsecode=response.getStatusCode();
		
		
	}
	
	public static  void getFormParam(String uri, String stringJSON)
	{
		
	}
	public static void post(String url, String JsonString )
	{
		 response=RestAssured.given()
				//.headers(headerMap)
				.when()
				.contentType(ContentType.JSON)
				.body(JsonString)
				.post(url);
		resopnsecode=response.getStatusCode();
				
	}

	
}
