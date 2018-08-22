package Json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PayLoad {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {


		ObjectMapper mapper=new ObjectMapper();
		EmpDetails e=new EmpDetails();
		e.setId(123);
		e.setAccount("ABC123");
		e.setIndian(true);
		//Object[] arr={"java",1234,"C#"};
		e.setSkils(new Object[]{"java",1234,"C#"}); //passing object array
		Persionaldetails p=new Persionaldetails();
		p.setFirstname("FName");
		p.setLastname("LName");
		e.setPersionaldetails(p); //passing Persionaldetails object
		//mapper.writeValueAsString(value);
		
		
		Mobiles m1=new Mobiles();
		m1.setOperator("Airtel");
		m1.setMob(8888888888l);
		
		Mobiles m2=new Mobiles();
		m2.setOperator("Jio");
		m2.setMob(7777777777l);
		
		Mobiles m3=new Mobiles();
		m3.setOperator("Airtel");
		m3.setMob(6666666666l);
		
		
		Mobiles[] mob={m1,m2,m3};
		e.setMobiles(mob);
		
		String s=mapper.writeValueAsString(e);
		//System.out.println(s);
		
		EmpDetails ee=mapper.readValue(s,EmpDetails.class);
		System.out.println(ee.getMobiles(0).getOperator());
		
	}

}
