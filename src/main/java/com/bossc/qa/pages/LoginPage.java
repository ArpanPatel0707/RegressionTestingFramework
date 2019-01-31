package com.bossc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bossc.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	//Page Factory - OR:
		@FindBy(xpath="//input[@placeholder='Username']")
		WebElement username;

		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement password;

		@FindBy(xpath="//button[text()='Login']")
		WebElement loginBtn;

	
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		public DashBoard login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();

			return new DashBoard();
		}

		
	
}
