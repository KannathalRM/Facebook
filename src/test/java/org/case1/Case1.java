package org.case1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case1 {
	public static WebDriver a;
		
		@Test()
		private void login() throws IOException{
			
			//DataDriven
			File f=new File("/Users/kumarchellappan/eclipse-workspace/Facebook/src/test/resources/Facebook.xlsx");
			FileInputStream st=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(st);
			Sheet s=w.getSheet("Sheet1");
			Row r = s.getRow(0);
			
			{
				for(int i=1;i<=s.getPhysicalNumberOfRows();i++) {
					Row r1 = s.getRow(i);
					WebDriverManager.chromedriver().setup();
				ChromeOptions n=new ChromeOptions();
				n.addArguments("--disable-notifications");
				n.addArguments("incognito");
				a = new ChromeDriver(n);
				a.get("https://www.facebook.com/");
		
				
					Cell b = r1.getCell(0);
                    String x2 = b.toString();
                    a.findElement(By.name("email")).sendKeys(x2);
                    System.out.println(x2);
                    Cell b1 = r1.getCell(1);
                    String x3 = b1.toString();
                    System.out.println(x3);
                    a.findElement(By.name("pass")).sendKeys(x3);;
            		a.findElement(By.name("login")).click();

			
			
		}
		}}
}
	


