package base;

import com.vwork.datahandler.DataReader;

public class Base {

	DataReader reader;

	public Base() {
		 reader=new DataReader("./src/main/java/data/TestData.csv","TC001");
	}
}
