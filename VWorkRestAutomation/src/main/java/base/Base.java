package base;

import com.jayway.restassured.response.Response;
import com.vwork.datahandler.DataReader;

public class Base {

	static DataReader reader;
	public static Response response;
    public static int resopnsecode;

	public Base() {
		 reader=new DataReader("./src/main/java/data/TestData.csv","TC001");
	}
	
	public static String getData(String key)
	{
		return reader.readData(key);
	}
}
