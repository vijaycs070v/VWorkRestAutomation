package tests;

import org.testng.annotations.Test;

import base.Base;

public class TestDemo extends Base {
	@Test
	public void demo()
	{
		System.out.println(getData("mobiles[0].mob"));
	}

}
