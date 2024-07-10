package org.case1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basee {
	public static WebDriver a;
	public static void base1(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions n=new ChromeOptions();
	n.addArguments("--disable-notifications");
	n.addArguments("--incognito");
	a=new ChromeDriver(n);
		}
		else if(browser.equalsIgnoreCase("Edge"))
			{
				WebDriverManager.edgedriver().setup();
				a=new EdgeDriver();
			}
	}
	
	public static void LaunchBrowser(String browser1) {
		if(browser1.equalsIgnoreCase("Chrome"))
		{	
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		a=new ChromeDriver(option);
		}
		else if(browser1.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			a=new EdgeDriver();
		}
		else if(browser1.equalsIgnoreCase("Safari"))
		{
			WebDriverManager.safaridriver().setup();
			a=new SafariDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			a=new FirefoxDriver();
		}
		
	}
public static String geturl(String url) {
a.get(url);
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
return url;

}	

public static String sendkey(WebElement e, String value) {
	e.sendKeys(value);
	return value;
}
	
public void clk(WebElement e) {
	e.click();
}

public static String gettxt(WebElement e) {
	String x=e.getText();
	System.out.println(x);
	return x;

}

public static String getattri(WebElement e) {
String x1=e.getAttribute("value");
System.out.println(x1);
return x1;
}

public void btnclk(WebElement e) {
	e.click();
}
//dropdown index
public void drpindex(WebElement e,int n) {
Select s=new Select(e);
s.selectByIndex(n);
}
//drpdown value
public static String drpvalue(WebElement e,String value) {
		Select s=new Select(e);
		s.selectByValue(value);
		return value;
		}

//drpdowntext
public static String drptext(WebElement e, String text) {
	Select s=new Select(e);
s.selectByVisibleText(text);
return text;
}
//select all the option on dropdown and print all
private void drpall(WebElement e, int i) {

Select s=new Select(e);
List<WebElement> option = s.getOptions();
for(i=0;i<=option.size();i++)
{
	s.selectByIndex(i);
	
	for(WebElement each:option)
	{
		System.out.println(each.getText());
	}
}


}
public static void mv2ele(WebElement e) {
	Actions a1=new Actions(a);
	a1.moveToElement(e).click().build().perform();
}

public static void dragdrop(WebElement src,WebElement drc) {
	Actions a1=new Actions(a);
	a1.dragAndDrop(src, drc).build().perform();	
}

public static void doubleclk(WebElement e) {
	Actions a1=new Actions(a);
	a1.doubleClick(e).build().perform();
}

public static void conclk(WebElement e) {
	Actions a1=new Actions(a);
	a1.contextClick(e).build().perform();
}

public static void alerrt(WebElement e) {
Alert ca=a.switchTo().alert();
ca.accept();
}
public static void navigat() {
a.navigate().forward();
}
public static void navigat1() {
a.navigate().back();
}
public static void navigat2() {
a.navigate().refresh();
}



//screenshot
public static void scsh() throws IOException {
	Date dateinfo = new Date();
	String screename = dateinfo.toString().replace(" ","-");
	System.out.println(screename);
	TakesScreenshot tk=(TakesScreenshot)a;
	File screenshot = tk.getScreenshotAs(OutputType.FILE);
	File des = new File("/Users/kumarchellappan/eclipse-workspace/SampleProject/Screenshott//"+screename+".png");
FileUtils.copyFile(screenshot, des);
}



}
	
	
	
	
	
	


