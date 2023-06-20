package test;


import org.testng.annotations.Test;

import Page.Expediasearch;
import baseclass.common;

public class expaedistest extends common {
	@Test
	public void roundtrip()
	
	{
		Expediasearch ob =new Expediasearch(driver);
		ob.flightclick();
		ob.setvalues("brussels", "newyork");
		ob.travler();
		ob.adultsearch();
		ob.childsearch();
		ob.childage("2");
		ob.economyselect();
		ob.datepick("june 2023", "10");
		ob.date("august 2023", "23");
		
	}


}
