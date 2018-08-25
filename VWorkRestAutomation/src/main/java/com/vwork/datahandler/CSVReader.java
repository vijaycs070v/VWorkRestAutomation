package com.vwork.datahandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CSVReader implements IDataReader{

	String[] column=null;
	String[] data=null;
	Map<String,Integer> index=new HashMap<String, Integer>();
	public CSVReader(File file, String scenario) {
		try(BufferedReader br=new BufferedReader(new FileReader(file)))
		{
			while(br.ready())
			{
				String line=br.readLine();
				if(line.startsWith("#column"))
				{
					column=line.split(",");
					for(int i=1;i<column.length;i++)
						index.put(column[i], i);
				}
			  if(line.startsWith(scenario))
				{
					data=line.split(",");
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public String readData(String key) {
		return data[index.get(key)];
	}

}
