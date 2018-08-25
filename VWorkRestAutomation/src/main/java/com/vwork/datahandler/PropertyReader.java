package com.vwork.datahandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader implements IDataReader {

	Properties prop=null;
	public PropertyReader(File file)
	{
		try {
			FileInputStream fis=new FileInputStream(file);
		    prop=new Properties();
			prop.load(fis);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String readData(String propertyname) {
		
		return prop.getProperty(propertyname);
	}

}
