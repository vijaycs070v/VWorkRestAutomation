package com.vwork.utils;

import java.util.HashMap;
import java.util.Map;

import com.vwork.base.Base;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;


public class RestClient extends Base {

	 
	 Map<String, String> headerMap=new HashMap<String, String>();
	 HashMap<String,Boolean> responseMap=new HashMap<String,Boolean>();
	 String uri;
	 
	 public  RestClient()
	 {
		 headerMap.put("usaa-gateway-proof", "sdllkgdjgq239593242ikk4ktkerjtiejreutu");
		 headerMap.put("usaa-activity","kdgjskfjalfowiedfgdf");
	 }
	 
	 public static void getRequest(String url)
		{
			
			response=given()
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
		
		response=given()
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
		
		
		response= given()
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
		 response=given()
				//.headers(headerMap)
				.when()
				.contentType(ContentType.JSON)
				.body(JsonString)
				.post(url);
		resopnsecode=response.getStatusCode();
				
	}

	public static String getAuthTocken(String url, String userid, String pwd)
	{
		return given().auth().form(userid, pwd).get(url).jsonPath().getString("Auth_Tocken");
	}
}
