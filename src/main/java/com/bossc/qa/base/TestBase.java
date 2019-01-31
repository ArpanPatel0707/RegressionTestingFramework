package com.bossc.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.bossc.qa.util.TestUtil;
import com.bossc.qa.util.WebEventListener;

public class TestBase {
	
	public  static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase(){
		
		
			try{
				prop =new Properties();
				FileInputStream ip = new FileInputStream( "/Automation/Project/BOSSCTest/src/main/java/com/bossc/"
						+ "/qa/config/config.properties");
						
						
				prop.load(ip);
				
			    }  catch(FileNotFoundException e){
				
				e.printStackTrace();
				
			                                     }         
			       catch(IOException e)          {
				  
				e.printStackTrace();
			                                     }
			
			
				
						
						}
	public static void initialization(){
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium Chrome\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "");	
			driver = new FirefoxDriver(); 
		}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));



	}
			
			
			
		
		
		
	}


