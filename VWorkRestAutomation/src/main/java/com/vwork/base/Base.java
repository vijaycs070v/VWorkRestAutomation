package com.vwork.base;

import java.util.HashMap;

import com.vwork.datahandler.DataReader;
import com.vwork.datahandler.IDataReader;
import com.vwork.utils.Utility;

import io.restassured.response.Response;

public class Base {

	public static DataReader reader;
	public static IDataReader configReader;
	public String datafilepath;
	public static String pathPropertyFile="./src/com/initg/configuration/path.property";
	public String testcasename;

	public static Response response;
	public static int resopnsecode;
	public static HashMap<String,Boolean> responseMap=new HashMap<String,Boolean>();
	public static boolean testpass;





	public Base() {
		reader=new DataReader(Utility.getPath("testdata"),"TC001");
	}

	public static String getData(String key)
	{
		return reader.readData(key);
	}


}

