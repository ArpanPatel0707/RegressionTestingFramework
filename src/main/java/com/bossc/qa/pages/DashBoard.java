package com.bossc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bossc.qa.base.TestBase;

public class DashBoard extends TestBase{
	
	
	
	//Page Factory - OR:
		@FindBy(xpath="//button[text()='CREATE REMINDER']")
		WebElement CreateReminder;

		@FindBy(xpath="//input[@id='mat-input-0']")
		WebElement ReminderTitle;

		@FindBy(xpath="//h5[text()='One-Time']")
		WebElement OneTime;
		
		@FindBy(xpath="//button[@aria-label='Open calendar']")
		WebElement SelectDate;
		
		@FindBy(xpath="//div[@class='mat-calendar-body-cell-content' and text()='18']")
		WebElement SelectSpecificDate;
		
		@FindBy(xpath="//button[@class='btn bossc-btn ng-star-inserted']")
		WebElement Next;
		
		@FindBy(xpath="//i[@class='fal fa-times']")
		WebElement Finish;
		
		@FindBy(xpath="//h5[@class='ng-star-inserted' and text()='Success']")
		WebElement success;
		
		
		
		

	
		//Initializing the Page Objects:
		public DashBoard(){
			PageFactory.initElements(driver, this);
		}
		
		public boolean CreateReminder() throws InterruptedException {
			
			CreateReminder.click();
			ReminderTitle.sendKeys("Automation");
			OneTime.click();
			Thread.sleep(2000);
			SelectDate.click();
			Thread.sleep(2000);

			SelectSpecificDate.click();
			Next.click();
			return success.isDisplayed();
				
		}
	
		

}
