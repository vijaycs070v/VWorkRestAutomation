package com.vwork.datahandler;
import java.io.File;
public class DataReader {

	public static CSVReader csvReader(String path, String scenario)
	{
		return new CSVReader(path,scenario);
	}
	
	public static PropertyReader propertyReader(String path)
	{
		return new PropertyReader(path);
	}
}
