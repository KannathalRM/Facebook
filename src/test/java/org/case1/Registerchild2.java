package org.case1;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.pom.registerpage;
import org.testng.Assert;
import org.testng.annotations.*;

public class Registerchild2 {

	

	public class Registerchild extends Basee{
		
			
			@BeforeClass
			public String geturl() {
				base1("Chrome");
				return geturl("https://adactinhotelapp.com/Register.php");	
			}

			@Test
			private void username() {
				registerpage l=new registerpage();
				String m = sendkey(l.getUsername(),"Magic");
				System.out.println(m);
			    SoftAssert s=new SoftAssert();
			    s.assertEquals(m,"Kannathal","verify username");
				s.assertAll();
				
				
			}
			
			
		}

}
