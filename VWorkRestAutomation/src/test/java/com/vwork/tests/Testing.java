package com.vwork.tests;

import com.vwork.datahandler.DataReader;
import com.vwork.datahandler.IDataReader;
import com.vwork.enums.GlobalConstants;

public class Testing {

	public static void main(String[] args) {

IDataReader id=DataReader.csvReader(GlobalConstants.DATAFILE_PATH.getValue(), "TC001");
System.out.println(id.getData("id"));
		
	}

}
