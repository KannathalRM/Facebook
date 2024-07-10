package org.case1;

import org.testng.annotations.DataProvider;

public class Dataprovideras {
@DataProvider(name="login")
public Object[][] login() {
	Object[][] b = new Object[][]
	{
		{"kaanathalkumar@gmail.com","Kumar@1984"},
		{"rm_kanna@yahoo.co.in","Meena@1988"},
		{"lakshmi@gmail.com","Thenu@1988"}
		
	};
	return b;
	}
	
}

