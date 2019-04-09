package com.vwork.base;

import java.util.HashMap;

import org.testng.asserts.SoftAssert;

import com.vwork.datahandler.DataReader;
import com.vwork.datahandler.IDataReader;
import com.vwork.enums.GlobalConstants;

import io.restassured.RestAssured;

public class TestBase extends Base  {

	public static IDataReader datareader;
	public SoftAssert softassert;
	public HashMap<String, String> headerMap;
	public TestBase()
	{
		softassert=new SoftAssert();
		RestAssured.baseURI=getPropValue("BaseURI");
	}
	
	public  String getValue(String key)
	{
		return datareader.getData(key);
	}
	
	public void setup(String tcname)
	{
		if(tcname==null)
		{
			tcname=this.getClass().getSimpleName();
		}
	
		datareader=DataReader.csvReader(GlobalConstants.DATAFILE_PATH.getValue(),tcname);
		headerMap=new HashMap<String, String>();
		
	}
	
	public static String getAttributeValue(String key)
	{
		String value=response
				.getBody()
				.jsonPath()
				.getString(key);
		return value;
	}
	
	public String getAuthTocken()
	
	
	{
		return null;
	}
}
