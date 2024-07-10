package org.pom;

import org.case1.Basee;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class registerpage extends Basee{
	
	public registerpage() {
PageFactory.initElements(a, this);
	}
	
			@FindBy(xpath="//a[text()='New User Register Here']")
			private WebElement registerbutton;
@FindBy(id="username")
private WebElement username;

@FindBy(name="password")
private WebElement password;


@FindBy(name="re_password")
private WebElement repassword;

@FindBy(name="full-name")
private WebElement fullname;


@FindBy(name="email-add")
private WebElement email;


public WebElement getRegisterbutton() {
	return registerbutton;
}


public WebElement getUsername() {
	return username;
}


public WebElement getPassword() {
	return password;
}


public WebElement getRepassword() {
	return repassword;
}


public WebElement getFullname() {
	return fullname;
}


public WebElement getEmail() {
	return email;
}



}



