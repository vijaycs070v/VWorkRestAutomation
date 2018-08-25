package base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ValidateResponse extends Base{

	HashMap<String,Boolean> responseMap=new HashMap<String,Boolean>();
	
	public String getAttributeValue(String key)
	{
		String value=response
				.getBody()
				.jsonPath()
				.getString(key);
		return value;
	}
	
	public void storeResposeToMap(String value)
	{
		if(value.equalsIgnoreCase("ABC") )
		{
			responseMap.put("Expected :"+"ABC"+"Actual :"+value, true); //read expected value from excel
		}
		else
		{
			responseMap.put("Expected :"+"ABC"+"Actual :"+value, false);
		}
	}
	
	public void printResponse()
	{
		Set set=responseMap.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Map.Entry)itr.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
	}
	public boolean validateHTTPResponse()
	{
		int passcount=0;
		int failcount=0;
		Set set=responseMap.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Map.Entry)itr.next();
			if(e.getValue().equals(true))
				passcount++;
			else
				failcount++;
		}
		if(failcount==0 && resopnsecode==Integer.parseInt("200")) //get status code from excel sheet
			return true;
		else
			return false;
	}
}
