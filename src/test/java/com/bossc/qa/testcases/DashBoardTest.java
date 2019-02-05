package com.bossc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bossc.qa.base.TestBase;
import com.bossc.qa.pages.DashBoard;
import com.bossc.qa.pages.LoginPage;

public class DashBoardTest extends TestBase {
	
	LoginPage loginPage;
	DashBoard Dashboard;

	public DashBoardTest(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		Dashboard = new DashBoard();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	

	

	@Test(priority=1)
	public void VerifyCreateReminderTest() throws InterruptedException {
	
		boolean flag = Dashboard.CreateReminder();
       Assert.assertTrue(flag);
		
	}



	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	
	
	

}
