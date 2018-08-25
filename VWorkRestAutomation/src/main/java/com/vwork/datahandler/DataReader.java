package com.vwork.datahandler;
import java.io.File;
public class DataReader implements IDataReader{

	String path;
	String scenario;
	IDataReader reader;

	public DataReader(String path) {
		super();
		this.path = path;
		File file=new File(path);

		if(file.getName().endsWith(".prop")||file.getName().endsWith(".property"))
		{
			reader= new PropertyReader(file);
		}

	}

	public DataReader(String path, String scenario) {
		super();
		this.path = path;
		this.scenario = scenario;

		File file=new File(path);
		if(file.getName().endsWith(".csv"))
		{
			reader=new CSVReader(file, scenario);
		}
		else if(file.getName().endsWith(".xlsx"))
		{
			reader=new ExcelReader(file, scenario);
		}
	}

	@Override
	public String readData(String key) {

		return reader.readData(key);
	}

}
