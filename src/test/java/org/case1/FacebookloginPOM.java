package org.case1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginPOM extends Basee{
public FacebookloginPOM() {
	PageFactory.initElements(a, this);
}
@FindBy(id="email")
private WebElement username;
@FindBy(id="pass")
private WebElement password;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}



}
