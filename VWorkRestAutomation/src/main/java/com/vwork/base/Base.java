package com.vwork.base;

import java.util.HashMap;

import com.vwork.datahandler.DataReader;
import com.vwork.datahandler.IDataReader;
import com.vwork.enums.GlobalConstants;
import com.vwork.utils.Utility;

import io.restassured.response.Response;

public class Base {

	
	public static IDataReader configReader;
	public String datafilepath;
	public static String pathPropertyFile="./src/com/initg/configuration/path.property";
	public String testcasename;

	public static Response response;
	public static int resopnsecode;
	public static HashMap<String,Boolean> responseMap=new HashMap<String,Boolean>();
	public static boolean testpass;





	public Base() {
				
		configReader=DataReader.propertyReader(GlobalConstants.PROPERTYFILE_PATH.getValue());
	}

	
	public String getPropValue(String prop)
	{
		return configReader.getData(prop);
	}

}

