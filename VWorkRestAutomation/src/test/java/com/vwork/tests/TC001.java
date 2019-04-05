package com.vwork.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vwork.base.TestBase;

public class TC001 extends TestBase {

	public String tcname;
	
	@BeforeMethod
	public void setup()
	{	
		super.setup(tcname);		
	}
	
	@Test
	public void testing()
	{
	//	P p=new P();
		System.out.println(getValue("id"));
	}
}
