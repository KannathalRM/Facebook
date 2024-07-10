package org.windowshand;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Handle {
	public static WebDriver a;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions n=new ChromeOptions();
	n.addArguments("--disable-notifications");
	n.addArguments("--incognito");
	a=new ChromeDriver(n);
	a.manage().window().maximize();
	a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	a.get("https://www.snapdeal.com/");
	WebElement txtsearch=a.findElement(By.name("keyword"));
	txtsearch.sendKeys("iphone 15");
	a.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
	a.findElement(By.xpath("//p[@title='NBOX - Plain Cases Compatible For Silicon iPhone 15 pro ( Pack of 1 )']")).click();
	
	Set<String> m = a.getWindowHandles();
	Iterator<String> b = m.iterator();
	String parent = b.next();
	String c = b.next();
	a.switchTo().window(c);
	a.findElements(By.xpath("//span[@class='intialtext'][2]"));
	

}

}
