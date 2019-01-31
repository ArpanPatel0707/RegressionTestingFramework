package com.bossc.qa.testcases;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bossc.qa.ExtentReportListner.ExtentReportListener;
import com.bossc.qa.base.TestBase;
import com.bossc.qa.pages.DashBoard;
import com.bossc.qa.pages.LoginPage;
import com.bossc.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
		LoginPage loginPage;
		DashBoard Dashboard; 
	
	

		public LoginPageTest(){
			super();
		}
		

		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();
	
		 
}
		

		

		@Test(priority=1)
		public void loginTest() throws IOException{
			Dashboard = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
		}



		@AfterMethod
		public void tearDown(){
		driver.quit();
		}
		





	}


