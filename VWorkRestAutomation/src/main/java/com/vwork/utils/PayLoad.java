package com.vwork.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vwork.base.Base;
import com.vwork.base.TestBase;
import com.vwork.pojo.CustomerDetails;
import com.vwork.pojo.Mobiles;
import com.vwork.pojo.Persionaldetails;

public class PayLoad extends TestBase{

	public  CustomerDetails getEmpDetailsPayLoad() throws IOException  {
		
		CustomerDetails e=new CustomerDetails();
		e.setId(Integer.parseInt(getValue("id")));
		e.setAccount(getValue("account"));
		e.setIsIndian(Boolean.parseBoolean(getValue("isIndian")));
		
		List<String> sk=new ArrayList<String>();
		sk.add(getValue("skils[0]"));
		sk.add(getValue("skils[1]"));
		e.setSkils(sk);
		
		Persionaldetails p=new Persionaldetails();
		p.setFirstname(getValue("persionaldetails.firstname"));
		p.setLastname(getValue("lastname.lastname"));
		e.setPersionaldetails(p); //passing Persionaldetails object
		//mapper.writeValueAsString(value);
		
		List<Mobiles> mob=new ArrayList<Mobiles>();
		
		Mobiles m1=new Mobiles();
		m1.setOperator(getValue("mobiles[0].operator"));
		m1.setMob(Long.parseLong(getValue("mobiles[0].mob")));
		mob.add(m1);
		
		Mobiles m2=new Mobiles();
		m2.setOperator(getValue("mobiles[1].operator"));
		m2.setMob(Long.parseLong(getValue("mobiles[1].mob")));
		mob.add(m2);
		
		Mobiles m3=new Mobiles();
		m3.setOperator(getValue("mobiles[2].operator"));
		m3.setMob(Long.parseLong(getValue("mobiles[2].mob")));
		mob.add(m3);
		
		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", getValue("salary"));
		props.put("age", getValue("age"));
		e.setProperties(props);
		
		
		e.setMobiles(mob);
		
		
		return e;
		
	}

}
