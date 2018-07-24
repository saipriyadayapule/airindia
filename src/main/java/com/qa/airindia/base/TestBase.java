package com.qa.airindia.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.qa.airindia.Utill.TestUtill;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase()  {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\Vivek Chennupati\\eclipse-workspace\\AirIndiaTest\\src\\main\\java\\com\\qa\\airindia\\config\\configure.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void intialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","c:\\Test\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
		
			
		
}
}
	
	
	