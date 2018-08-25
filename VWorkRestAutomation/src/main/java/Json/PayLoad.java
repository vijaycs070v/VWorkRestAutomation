package Json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PayLoad {

	public static EmpDetails getEmpDetailsPayLoad() throws IOException  {


		
		EmpDetails e=new EmpDetails();
		e.setId(123);
		e.setAccount("ABC123");
		e.setIndian(true);
		
		List<String> sk=new ArrayList<String>();
		sk.add("Java");
		sk.add("Python");
		e.setSkils(sk);
		
		Persionaldetails p=new Persionaldetails();
		p.setFirstname("FName");
		p.setLastname("LName");
		e.setPersionaldetails(p); //passing Persionaldetails object
		//mapper.writeValueAsString(value);
		
		List<Mobiles> mob=new ArrayList<Mobiles>();
		
		Mobiles m1=new Mobiles();
		m1.setOperator("Airtel");
		m1.setMob(8888888888l);
		mob.add(m1);
		
		Mobiles m2=new Mobiles();
		m2.setOperator("Jio");
		m2.setMob(7777777777l);
		mob.add(m2);
		
		Mobiles m3=new Mobiles();
		m3.setOperator("Airtel");
		m3.setMob(6666666666l);
		mob.add(m3);
		
		e.setMobiles(mob);
		
		/*String s=mapper.writeValueAsString(e); //json string
		System.out.println(s);
		
		EmpDetails ee=mapper.readValue(s,EmpDetails.class);
		System.out.println(ee.getMobiles().get(0).getMob());
		System.out.println(ee.getSkils().get(0));*/
		
		return e;
		
	}

}
