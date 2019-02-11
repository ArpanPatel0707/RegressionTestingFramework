package com.bossc.qa.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
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
		
/*
		 @Test(priority=18)
		public void VerifyNewStaticField() throws InterruptedException{
		
			settings.CreateNewStaticField();
			
			
		}
		*/
	/*
		@Test(priority=19)
		public void VerifyNewListField() throws InterruptedException{
		
			settings.CreateNewListField();
			
			
		}
		*/
		/*
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
		
		
		@Test(priority=20,dataProvider="ConstantData")
		public void VerifyNewConstantField(String ConstantName, String ConstantDisplayName, String Value) throws InterruptedException{
			
			settings.CreateNewConstantField(ConstantName,ConstantDisplayName,Value);
			
			
		}
		*/
		/*
		@Test(priority=21)
		public void VerifyNewCalculationField() throws InterruptedException{
			
			settings.CreateNewCalculationField();
			
			
		}
		*/
		
		
		// ar
		///*
	@Test(priority=5)
		public void VerifyNewReport() throws InterruptedException{
		
		 settings.CreateNewReport();
			
			
	}
	//*/	
/*	
		@Test(priority=22)
		public void VerifyNewDocument() throws InterruptedException{
		
		settings.CretaeNewDocument();
	
			
		}
		
*/
		
	/*
		@Test(priority=23)
		public void VerifyEmailService1() throws InterruptedException{
		
		 settings.EmailService1();
	
			
		}
		
	*/
/*
		@Test(priority=24)
		public void VerifyEmailService2() throws InterruptedException, IOException{
		
		String EmailMessage = settings.EmailService2();
		assertEquals(EmailMessage,"Automation");
		
	
			
		}
		
		*/
/*
		@Test(priority=25)
		public void VerifyEventCreationEnableAccountF() throws InterruptedException, IOException{
		
		 settings.EnableAccount1F();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=26,dependsOnMethods={ "VerifyEventCreationEnableAccountF" })
		public void VerifyEventPerformanceEnableAccountF() throws InterruptedException, IOException{
		
		String EnableAccountResult = settings.EnableAccount2F();
		assertEquals(EnableAccountResult,"true");
		
		
	
			
		}
	*/	
		/*
				@Test(priority=27)
				public void VerifyEventCreationDisableAccountF() throws InterruptedException, IOException{
				
				 settings.DisableAccount1F();
				
				
			
					
				}
				
			*/
				
		/*
				@Test(priority=28,dependsOnMethods={ "VerifyEventCreationDisableAccountF" })
				public void VerifyEventPerformanceDisableAccountF() throws InterruptedException, IOException{
				
				String EnableDisableResult = settings.DisableAccount2F();
				assertEquals(EnableDisableResult,"false");
				
				
			
					
				}
			*/
		
				/*
				@Test(priority=29)
				public void VerifyEventCreationGrantMobileF() throws InterruptedException, IOException{
				
				 settings.GrantMobile1F();
				
				
			
					
				}
				
			*/
				
		/*
				@Test(priority=30,dependsOnMethods={ "VerifyEventCreationGrantMobileF" })
				public void VerifyEventPerformanceGrantMobileF() throws InterruptedException, IOException{
				
				String GrantMobileResult = settings.GrantMobile2F();
				assertEquals(GrantMobileResult,"true");
				
				
			
					
				}
			*/
				/*
				@Test(priority=31)
				public void VerifyEventCreationRevokeMobileF() throws InterruptedException, IOException{
				
				 settings.RevokeMobile1F();
				
				
			
					
				}
				
			*/
				
		/*
				@Test(priority=32,dependsOnMethods={ "VerifyEventCreationRevokeMobileF" })
				public void VerifyEventPerformanceRevokeMobileF() throws InterruptedException, IOException{
				
				String GrantMobileResult = settings.RevokeMobile2F();
				assertEquals(GrantMobileResult,"false");
				
				
			
					
				}
			*/
				/*
				@Test(priority=33)
				public void VerifyEventCreationHealthObjectF() throws InterruptedException, IOException{
				
				 settings.CreateHealthObject1F();
				
				
			
					
				}
			
			*/
				
		/*
				@Test(priority=34,dependsOnMethods={ "VerifyEventCreationHealthObjectF" })
				public void VerifyEventPerformanceCreateHealthObjectF() throws InterruptedException, IOException{
				
				 settings.CreateHealthObject2F();
			
				
				
			
					
			}
			*/
		/*
		@Test(priority=35)
		public void VerifyEventTerminateHealthObjectF() throws InterruptedException, IOException{
		
		 settings.TerminateHealthObject1F();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=36,dependsOnMethods={ "VerifyEventTerminateHealthObjectF" })
		public void VerifyEventPerformanceTerminateHealthObjectF() throws InterruptedException, IOException{
		
		 settings.TerminateHealthObject2F();
	
		
		
	
			
		}
	*/
		/*
		@Test(priority=37)
		public void VerifyEventCreationFieldUpdateF() throws InterruptedException, IOException{
		
		 settings.FieldUpdate1F();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=38,dependsOnMethods={ "VerifyEventCreationFieldUpdateF" })
		public void VerifyEventPerformanceFieldUpdateF() throws InterruptedException, IOException{
		
		String resultFieldUpdate =  settings.FieldUpdate2F();
	    assertEquals(resultFieldUpdate,"LordPrabhu");
		
		
	
			
		}
	*/
		/*
				@Test(priority=39)
				public void VerifyEventCreationDependentFieldUpdate() throws InterruptedException, IOException{
				
				 settings.DependentFieldUpdate1();
				
				
			
				}
				
			*/
		
		
		
		
				
		/*
				@Test(priority=40,dependsOnMethods={ "VerifyEventCreationDependentFieldUpdate" })
				public void VerifyEventPerformanceDependentFieldUpdate() throws InterruptedException, IOException{
				
				String resultDependentFieldUpdate =  settings.DependentFieldUpdate2();
			    assertEquals(resultDependentFieldUpdate,"Edited");
				
				
			
					
				}
			*/
	/*
		@Test(priority=41)
		public void VerifyEventAssignWorkFlowF() throws InterruptedException, IOException{
		
		 settings.AssignWorkFlow1F();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=42,dependsOnMethods={ "VerifyEventAssignWorkFlowF" })
		public void VerifyEventPerformanceAssignWorkFlowF() throws InterruptedException, IOException{
		
		 settings.AssignWorkFlow2F();
	
		
		
	
			
		}
	*/
		
		
		
		/*
		@Test(priority=43)
		public void VerifyEventCreationEnableAccountC() throws InterruptedException, IOException{
		
		 settings.EnableAccount1C();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=44,dependsOnMethods={ "VerifyEventCreationEnableAccountC" })
		public void VerifyEventPerformanceEnableAccountC() throws InterruptedException, IOException{
		
		String EnableAccountResult = settings.EnableAccount2C();
		assertEquals(EnableAccountResult,"true");
		
		
	
			
		}
	*/	
		/*
		@Test(priority=45)
		public void VerifyEventCreationDisableAccountC() throws InterruptedException, IOException{
		
		 settings.DisableAccount1C();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=46,dependsOnMethods={ "VerifyEventCreationDisableAccountC" })
		public void VerifyEventPerformanceDisableAccountC() throws InterruptedException, IOException{
		
		String EnableDisableResult = settings.DisableAccount2C();
		assertEquals(EnableDisableResult,"false");
		
		
	
			
		}
	*/
		/*
		@Test(priority=47)
		public void VerifyEventCreationGrantMobileC() throws InterruptedException, IOException{
		
		 settings.GrantMobile1C();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=48,dependsOnMethods={ "VerifyEventCreationGrantMobileC" })
		public void VerifyEventPerformanceGrantMobileC() throws InterruptedException, IOException{
		
		String GrantMobileResult = settings.GrantMobile2C();
		assertEquals(GrantMobileResult,"true");
		
		
	
			
		}
*/
		
		/*
		@Test(priority=49)
		public void VerifyEventCreationRevokeMobileC() throws InterruptedException, IOException{
		
		 settings.RevokeMobile1C();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=50,dependsOnMethods={ "VerifyEventCreationRevokeMobileC" })
		public void VerifyEventPerformanceRevokeMobileC() throws InterruptedException, IOException{
		
		String GrantMobileResult = settings.RevokeMobile2C();
		assertEquals(GrantMobileResult,"false");
		
		
	
			
		}
	*/
		/*
		@Test(priority=51)
		public void VerifyEventCreationHealthObjectC() throws InterruptedException, IOException{
		
		 settings.CreateHealthObject1C();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=52,dependsOnMethods={ "VerifyEventCreationHealthObjectC" })
		public void VerifyEventPerformanceCreateHealthObjectC() throws InterruptedException, IOException{
		
		 settings.CreateHealthObject2C();
	
		
		
	
			
		}

		/*
		@Test(priority=55)
		public void VerifyEventCreationFieldUpdateC() throws InterruptedException, IOException{
		
		 settings.FieldUpdate1C();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=56,dependsOnMethods={ "VerifyEventCreationFieldUpdateC" })
		public void VerifyEventPerformanceFieldUpdateC() throws InterruptedException, IOException{
		
		String resultFieldUpdate =  settings.FieldUpdate2C();
	    assertEquals(resultFieldUpdate,"FieldUpdate");
		
		
	
			
		}
	*/
		
		/*
		@Test(priority=57)
		public void VerifyEventAssignWorkFlowC() throws InterruptedException, IOException{
		
		 settings.AssignWorkFlow1C();
		
		
	
			
		}
		
	*/
		
/*
		@Test(priority=58,dependsOnMethods={ "VerifyEventAssignWorkFlowC" })
		public void VerifyEventPerformanceAssignWorkFlowC() throws InterruptedException, IOException{
		
		 settings.AssignWorkFlow2C();
	
		
		
	
			
		}
	*/
		
	
		
		
		
		
		
		
		
		
	/*
	 @Test(priority=59)
	 
		public void VerifyNewObjectCalculationFields() throws InterruptedException{
		
		 settings.Object_CalculationField();
	
			
		}
	 
		*/
	
	  /* 
	 @AfterMethod
		public void tearDown(){
			driver.quit();
		}


		*/
		

	
}	
	
	
	

