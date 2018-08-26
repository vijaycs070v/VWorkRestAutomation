package Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import base.Base;
import pages.EmpDetails;
import pages.Mobiles;
import pages.Persionaldetails;

public class PayLoad extends Base{

	public static EmpDetails getEmpDetailsPayLoad() throws IOException  {
		
		EmpDetails e=new EmpDetails();
		e.setId(Integer.parseInt(getData("id")));
		e.setAccount(getData("account"));
		e.setIndian(Boolean.parseBoolean(getData("isIndian")));
		
		List<String> sk=new ArrayList<String>();
		sk.add(getData("skils[0]"));
		sk.add(getData("skils[1]"));
		e.setSkils(sk);
		
		Persionaldetails p=new Persionaldetails();
		p.setFirstname(getData("persionaldetails.firstname"));
		p.setLastname(getData("lastname.lastname"));
		e.setPersionaldetails(p); //passing Persionaldetails object
		//mapper.writeValueAsString(value);
		
		List<Mobiles> mob=new ArrayList<Mobiles>();
		
		Mobiles m1=new Mobiles();
		m1.setOperator(getData("mobiles[0].operator"));
		m1.setMob(Long.parseLong(getData("mobiles[0].mob")));
		mob.add(m1);
		
		Mobiles m2=new Mobiles();
		m2.setOperator(getData("mobiles[1].operator"));
		m2.setMob(Long.parseLong(getData("mobiles[1].mob")));
		mob.add(m2);
		
		Mobiles m3=new Mobiles();
		m3.setOperator(getData("mobiles[2].operator"));
		m3.setMob(Long.parseLong(getData("mobiles[2].mob")));
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
