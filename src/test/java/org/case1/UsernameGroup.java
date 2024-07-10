package org.case1;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UsernameGroup extends Basee {
	
@Parameters("browser1")
@Test
private void browser(String browser) {
	base1(browser);

}
@Test(dataProvider="login",dataProviderClass=Dataprovideras.class)
public void browserlaunch(String user, String pass) {

	geturl("https://www.facebook.com/login/");
	{
	
	FacebookloginPOM l=new FacebookloginPOM();
	sendkey(l.getUsername(),user);
	sendkey(l.getPassword(),pass);
	}

}
}
