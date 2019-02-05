package com.bossc.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bossc.qa.base.TestBase;
import com.bossc.qa.pages.Employees;
import com.bossc.qa.pages.LoginPage;
import com.bossc.qa.pages.Settings;
import com.bossc.qa.util.TestUtil;



public class SettingsPageTest extends TestBase{
		LoginPage loginPage;
	  Settings settings;
	  TestUtil testutil;
		
		
		
		public SettingsPageTest(){
			super();
		                         }

		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();
			settings = new Settings();
			testutil = new TestUtil();
			
			loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		    settings.ComeToSettingSection();
			
		}
		
///*
		 @Test(priority=1)
		public void VerifyNewStaticField() throws InterruptedException{
		
			settings.CreateNewStaticField();
			
			
		}//*/
	///*
		@Test(priority=2)
		public void VerifyNewListField() throws InterruptedException{
		
			settings.CreateNewListField();
			
			
		}//*/
		///*
		@DataProvider(name="ConstantData")
		String [][] getData() throws IOException
		{
			String path=System.getProperty("user.dir")+"/src/main/java/com/bossc/qa/testdata/DataDriven.xlsx";
			
			int rownum=TestUtil.getRowCount(path, "Sheet2");
			int colcount=TestUtil.getCellCount(path,"Sheet2",1);
			
			String logindata[][]=new String[rownum][colcount];
			
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					logindata[i-1][j]=TestUtil.getCellData(path,"Sheet2", i,j);//1 0
				}
					
			}
		return logindata;
		}
		
		
		@Test(priority=3,dataProvider="ConstantData")
		public void VerifyNewConstantField(String ConstantName, String ConstantDisplayName, String Value) throws InterruptedException{
			
			settings.CreateNewConstantField(ConstantName,ConstantDisplayName,Value);
			
			
		}//*/
		///*
		@Test(priority=4)
		public void VerifyNewCalculationField() throws InterruptedException{
			
			settings.CreateNewCalculationField();
			
			
		}//*/
		
		
		// ar
		
		//@Test(priority=5)
		//public void VerifyNewReport() throws InterruptedException{
		
		 //settings.CreateNewReport();
			
			
		//}
		
	//	@Test(priority=6)
		//public void VerifyNewDocument() throws InterruptedException{
		
		// settings.CretaeNewDocument();
	
			
		//}
		

		
	/*@Test(priority=7)
		public void VerifyEmailService1() throws InterruptedException{
		
		 settings.EmailService1();
	
			
		}
		
	

		@Test(priority=8)
		public void VerifyEmailService2() throws InterruptedException, IOException{
		
		 settings.EmailService2();
		 
		
	
			
		}
		
		*/
		
		
		
		
	///*
	 @Test(priority=9)
	 
		public void VerifyNewObjectCalculationFields() throws InterruptedException{
		
		 settings.Object_CalculationField();
	
			
		}
	 
		//*/
	
    /*  @AfterMethod
		public void tearDown(){
			driver.quit();
		}


		*/
		

	
}	
	
	
	

