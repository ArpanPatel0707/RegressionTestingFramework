package com.bossc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bossc.qa.base.TestBase;

public class Reports extends TestBase{
	
	
	@FindBy(xpath="//input[@placeholder='Quick Search']")
	WebElement QuickSearchEnter;
	

	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement QuickSearchClick;
	
	@FindBy(xpath="//button[@mattooltip='Run Report']")
	WebElement Run_Report;
	
	@FindBy(xpath="//h5[text()='Download Report']")
	WebElement Download_Report;
	
	@FindBy(xpath="//div[@class='d-flex flex-row']/ul/li[4]")
    WebElement ReportsSection;
	
	
	
	public Reports(){
		PageFactory.initElements(driver, this);
	}
	
	public Reports ComeToSettingSection() {
		ReportsSection.click();
		return new Reports();
	}
	
	
	public void RunCSVReport() throws InterruptedException {
		
		QuickSearchEnter.sendKeys("eee");
		Thread.sleep(5000);
		QuickSearchClick.click();
		Run_Report.click();
		Thread.sleep(3000);
		Download_Report.click();
		Thread.sleep(3000);
		
		
	
			
	}
public void RunDELReport() throws InterruptedException {
		
		QuickSearchEnter.sendKeys("AUTOMATEDDELRE");
		Thread.sleep(5000);
		QuickSearchClick.click();
		Run_Report.click();
		Thread.sleep(3000);
		Download_Report.click();
		Thread.sleep(3000);
		
		
	
			
	}
	
	
	
	

}
