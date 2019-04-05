package com.vwork.base;

import com.vwork.datahandler.DataReader;
import com.vwork.datahandler.IDataReader;
import com.vwork.enums.GlobalConstants;

public class TestBase extends Base  {

	public  IDataReader datareader;
	
	public TestBase()
	{
		
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
	}
}
