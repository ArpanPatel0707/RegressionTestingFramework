package com.bossc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bossc.qa.base.TestBase;

import com.bossc.qa.pages.LoginPage;
import com.bossc.qa.pages.Reports;

public class ReportPageTest extends TestBase {
	
	LoginPage loginPage;
	Reports reports;
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		reports = new Reports();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		reports.ComeToSettingSection();
		
	}
	
	/*
	 
	@Test(priority=60)
	public void VerifyRunCSVReport() throws InterruptedException {
	
		 reports.RunCSVReport();
		
      
		
	}
	
	*/
	
	///*
	 
	@Test(priority=61)
	public void VerifyRunDELReport() throws InterruptedException {
	
		 reports.RunDELReport();
		
      
		
	}
	
	//*/
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	
	
	
	

}
