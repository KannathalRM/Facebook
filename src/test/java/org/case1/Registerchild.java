package org.case1;
import org.pom.registerpage;
import org.testng.Assert;
import org.testng.annotations.*;
public class Registerchild extends Basee{
	
		
		@BeforeClass
		public String geturl() {
			base1("Chrome");
			return geturl("https://adactinhotelapp.com/Register.php");	
		}

		@Parameters({"user"})
		@Test()
		public void username(String username) {
			registerpage l=new registerpage();
			sendkey(l.getUsername(), username);
			String n=getattri(l.getUsername());
		
		}
		@Parameters({"pass"})
		@Test()
		public void password(String password) {
			registerpage l=new registerpage();
			sendkey(l.getPassword(), password);
			String n=getattri(l.getPassword());
		}
		@Parameters({"pass1"})
		@Test(priority=-1, invocationCount=5)
		public void confirmpassword(@Optional("45677")String repass) {
			registerpage l=new registerpage();
			sendkey(l.getRepassword(), repass);
		}
		
		
	}


