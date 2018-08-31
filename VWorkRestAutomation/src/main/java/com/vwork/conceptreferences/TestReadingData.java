package com.vwork.conceptreferences;

import com.vwork.datahandler.DataReader;

public class TestReadingData {
	public static void main(String[] args) {
		
		DataReader reader=new DataReader("./src/main/java/data/TestData.csv","TC001");
		System.out.println(reader.readData("mobiles[1].operator"));
	}

}
