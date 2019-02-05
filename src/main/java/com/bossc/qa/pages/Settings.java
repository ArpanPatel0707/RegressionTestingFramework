package com.bossc.qa.pages;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bossc.qa.base.TestBase;

public class Settings extends TestBase{
	
	JavascriptExecutor je = (JavascriptExecutor)driver;
	
	JavascriptExecutor je1 = (JavascriptExecutor)driver;
	
// Settings
	@FindBy(xpath="//div[@class='d-flex flex-row']/ul/li[6]")
    WebElement SettingsSection;
	
	@FindBy(xpath="//h5[text()='Email Status']")
    WebElement EmailSection;
	
	@FindBy(xpath="//div[@class='d-flex flex-row']/ul/li[2]")
    WebElement EmployeesSection1;

	@FindBy(xpath="//i[@class='far fa-4x fa-draw-square mt-2']")
	WebElement Fields;

	@FindBy(xpath="(//li[@class='nav-item ng-star-inserted'])[2]")
	WebElement FieldManager;

	@FindBy(xpath="//button[@class='add-mat-mini-fab mat-mini-fab mat-accent']")
	WebElement Add;
	
	@FindBy(xpath="(//div[@class='mat-form-field-infix']/input)[2]")
	WebElement FieldName;

	@FindBy(xpath="(//div[@class='mat-form-field-infix']/input)[3]")
	WebElement FieldDisplayName;
	
	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement FieldTypeSelect;

	@FindBy(xpath="//mat-option[@id='mat-option-7']")
	WebElement FieldTypeStatic;
	
	@FindBy(xpath="//mat-option[@id='mat-option-3']")
	WebElement FieldTypeList;
	
    @FindBy(xpath="//mat-option[@id='mat-option-1']")
	WebElement FieldTypeConstant;
	
    @FindBy(xpath="//mat-option[@id='mat-option-0']")
	WebElement FieldTypeCalculation;
    
	@FindBy(xpath="//mat-select[@id='mat-select-1']")
	WebElement FieldDataTypeSelect;

	@FindBy(xpath="//mat-option[@id='mat-option-13']")
	WebElement FieldStaticDataTypeText;
	
	@FindBy(xpath="//mat-option[@id='mat-option-11']")
	WebElement FieldListDataTypeText;
	

	@FindBy(xpath="//mat-option[@id='mat-option-13']")
	WebElement FieldConstantDataTypeText;
	
	@FindBy(xpath="//mat-option[@id='mat-option-9']")
	WebElement FieldCalculationTargetSelf;
	
	@FindBy(xpath="//mat-radio-button[@id='mat-radio-2']")
	WebElement FieldCalculationAggregationNone;
	
	
	

	@FindBy(xpath="//input[@ng-reflect-placeholder='Length']")
	WebElement FieldLength;
	
	@FindBy(xpath="(//div[@class='elementwrapper100 ng-star-inserted'])[1]")
	WebElement FieldListAllowedValues;
	
	@FindBy(xpath="//a[@class='btn']")
	WebElement FieldListAllowedValuesAdd;

	@FindBy(xpath="(//input[@ng-reflect-placeholder='Value'])[1]")
	WebElement FieldListAllowedValuesEnter1;
	
	@FindBy(xpath="(//input[@ng-reflect-placeholder='Description'])[1]")
	WebElement FieldListAllowedDescription1;
	
	@FindBy(xpath="(//input[@ng-reflect-placeholder='Value'])[2]")
	WebElement FieldListAllowedValuesEnter2;
	
	@FindBy(xpath="(//input[@ng-reflect-placeholder='Description'])[2]")
	WebElement FieldListAllowedDescription2;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	WebElement FieldConstantValue;
	
	@FindBy(xpath="//div[@class='formula-name']")
	WebElement FieldCalculationFormulaSelect;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	WebElement FieldCalculationFormulaOption;
	
	@FindBy(xpath="//span[@class='formula-name']")
	WebElement FieldCalculationFormulaOptionClick;
	



	@FindBy(xpath="//button[@class='add-mat-mini-fab mat-mini-fab mat-accent ng-star-inserted']")
	WebElement FieldSave;
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement FieldFindTab;
	
	@FindBy(xpath="//div[@class='mat-list-item-content' and text()=' StaticTest08 ']")
	WebElement FieldFindStaticResult;
	
	@FindBy(xpath="//div[@class='mat-list-item-content' and text()=' ListTest08 ']")
	WebElement FieldFindListResult;
	
	@FindBy(xpath="//div[@class='mat-list-item-content' and text()=' ConstantTest08 ']")
	WebElement FieldFindConstantResult;
	
	@FindBy(xpath="//div[@class='mat-list-item-content' and text()=' CalculationTest08 ']")
	WebElement FieldFindCalculationResult;
	
	
	
	// Reports

	@FindBy(xpath="//h5[@class='mt-3' and text()='Reports']")
	WebElement Report;
	

	@FindBy(xpath="//button[@class='btn bossc-btn right-panel-btn']")
	WebElement CreateReport;

	@FindBy(xpath="//mat-select[@id='mat-select-2']")
	WebElement ReportTypeSelect;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='Field Delimited (DEL)']")
	WebElement ReportTypeOption;

	@FindBy(xpath="//input[@placeholder='enter report name...']")
	WebElement ReportName;
	
	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement ReportServiceSelect;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='Payroll']")
	WebElement ReportServiceOption;
	
     @FindBy(xpath="//mat-select[@id='mat-select-1']")
	WebElement ReportCategorySelect;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='Carrier Reports']")
	WebElement ReportCategoryOption;

	@FindBy(xpath="//textarea[@placeholder='enter report description...']")
	WebElement ReportDescription;

	@FindBy(xpath="//button[@class='btn bossc-btn']")
	WebElement ReportSave;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement ReportSaveId;
	
// Documents
	
	@FindBy(xpath="//h5[@class='mt-3' and text()='Documents']")
	WebElement Document;

	@FindBy(xpath="//button[@class='btn bossc-btn right-panel-btn']")
	WebElement CreateDocument;

	@FindBy(xpath="//input[@placeholder='enter document name...']")
	WebElement DocumentName;

	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement DocumentCategorySelect;

	@FindBy(xpath="//mat-option[@id='mat-option-2']")
	WebElement DocumentCategoryOption;
	
	@FindBy(xpath="//textarea[@placeholder='enter document description...']")
	WebElement DocumentDescription;

	@FindBy(xpath="//button[@class='btn bossc-btn']")
	WebElement DocumentSave;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	WebElement DocumentSaveId;
	
	//Email Service
	
	@FindBy(xpath="(//div[@class='mat-checkbox-inner-container'])[4]")
	WebElement DedicatedEmail;
	
	@FindBy(xpath="//div[ text()=' PeopleEmail ']")
	WebElement FieldsFindPeopleEmailResult ;
	
	
	@FindBy(xpath="//h5[text()='Automation']")
	WebElement Automation;
	
	@FindBy(xpath="//button[text()=' CREATE NEW ACTION ']")
	WebElement CreateNewAction;
	
	@FindBy(xpath="//input[@id='mat-input-8']")
	WebElement ActionName;
	
	@FindBy(xpath="//input[@id='mat-input-9']")
	WebElement ActionDescription;
	
	@FindBy(xpath="//mat-select[@id='mat-select-3']")
	WebElement ActionTypeSelect;
	
	@FindBy(xpath="//span[text()=' Send Email ']")
	WebElement ActionTypeOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-4']")
	WebElement ActionDocumentSelect;
	
	@FindBy(xpath="//span[text()=' TestEmailService ']")
	WebElement ActionDocumentOption;
	
	@FindBy(xpath="//button[text()=' Save Action ']")
	WebElement ActionSave;
	
	@FindBy(xpath="//span[text()='events']")
	WebElement EventClick ;
	
	@FindBy(xpath="//button[text()='YES']")
	WebElement ActionConfirmBox;
	
	
	@FindBy(xpath="//button[text()=' CREATE NEW EVENT ']")
	WebElement CreateNewEvent;
	
	@FindBy(xpath="//input[@id='mat-input-10']")
	WebElement EventName;
	
	@FindBy(xpath="//label[@class='custom-checkbox']")
	WebElement EventStatus;
	
	@FindBy(xpath="//mat-select[@id='mat-select-6']")
	WebElement TriggerIntiatorsSelect;
	
	@FindBy(xpath="//span[text()=' Field Update ']")
	WebElement TriggerIntiatorsOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-7']")
	WebElement TriggerPersonTypeSelect;
	
	@FindBy(xpath="//span[text()=' Primary ']")
	WebElement TriggerPersonTypeOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-9']")
	WebElement TriggerFieldsSelect;
	
	@FindBy(xpath="//span[text()=' PeopleLastName ']")
	WebElement TriggerFieldsOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-8']")
	WebElement PerformActionSelect;
	
	@FindBy(xpath="//span[text()=' AutomationAction ']")
	WebElement PerformActionOption;
	
	@FindBy(xpath="//button[@class='btn bossc-btn']")
	WebElement SaveAsNewEvent;
	
	@FindBy(xpath="//textarea[starts-with(@id,'mat-input')]")
	WebElement AddDescription;
	
	@FindBy(xpath="//input[@placeholder='Quick Search']")
	WebElement QuickSearchEnter;
	

	@FindBy(xpath="(//mat-table/mat-row/mat-cell)[2]")
	WebElement EmployeeSearchClick;
	
	
	@FindBy(xpath="//button[@title='Profile']")
	WebElement EmployeeProfile;
	
	@FindBy(xpath="//button[@title='Edit Profile']")
	WebElement EmployeeEdit;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	WebElement EmployeeEditEnterEmail;
	
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement EmployeeEditEnterLastName;
	
	@FindBy(xpath="//button[@title='Save Profile']")
	WebElement EmployeeEditSave;
	
	@FindBy(xpath="//input[@id='mat-input-20']")
	WebElement EmployeeEditedValue;
	
	@FindBy(xpath="(//div[text()=' Employee Profile '])[2]")
	WebElement EmployeeEditedMakeSure;
	

	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement QuickSearchClick;
	
	//Create new object calculation fields
	
	
	@FindBy(xpath="//h5[text()='Services']")
	WebElement services;
	
	@FindBy(xpath="//span[text()='services']")
	WebElement services1;
	
	
	@FindBy(xpath="(//div[@class='ui-treetable-row ui-treetable-row-selectable']/td)[1]")
	WebElement Objects_Benefitts;
	
	@FindBy(xpath="(//div[@class='ui-treetable-row ui-treetable-row-selectable']/td)[1]")
	WebElement Objects_Dental;
	
	@FindBy(xpath="//span[text()=' fields ']")
	WebElement Objects_Fields ;
	
	@FindBy(xpath="//button[@class='add-mat-mini-fab mat-mini-fab mat-accent ng-star-inserted']")
	WebElement Objects_Fields_Add;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement Objects_Fields_Name ;
	
	@FindBy(xpath="//input[@placeholder='Display Name']")
	WebElement Objects_Fields_DisplayName;
	
	@FindBy(xpath="//mat-select[@id='mat-select-2']")
	WebElement Objects_Fields_Type_Select;
	
	@FindBy(xpath="//span[text()=' CALCULATION ']")
	WebElement Objects_Fields_Type_Option;
	
	@FindBy(xpath="//mat-select[@id='mat-select-3']")
	WebElement Objects_Fields_Target_Select;
	
	@FindBy(xpath="//span[text()=' SELF ']")
	WebElement Objects_Fields_Target_Option;
	
	@FindBy(xpath="//mat-radio-button[@id='mat-radio-2']")
	WebElement Objects_Fields_Aggregate;
	
	@FindBy(xpath="//input[@id='mat-input-18']")
	WebElement Objects_FieldCalculationFormulaOption;
	
	@FindBy(xpath="(//button[@class='add-mat-mini-fab mat-mini-fab mat-accent ng-star-inserted'])[2]")
	WebElement Objects_FieldSave;
	
	@FindBy(xpath="//input[@id='mat-input-9']")
	WebElement Objects_FieldFindTab;
	
	@FindBy(xpath="//div[@class='mat-list-item-content' and text()=' AutomationObjectCalc... ']")
	WebElement Objects_FieldFindCalculationResult;
	
	// Action create object
	
	
	
	public Settings(){
		PageFactory.initElements(driver, this);
	}
	
	
	public Settings ComeToSettingSection() {
		SettingsSection.click();
		return new Settings();
	}
	
	
public void CreateNewStaticField() throws InterruptedException{
		
		Fields.click();
		FieldManager.click();
		Add.click();
		FieldName.sendKeys("StaticTest08");
		FieldDisplayName.sendKeys("StaticTest08");
		Thread.sleep(4000);
		FieldTypeSelect.click();
		Thread.sleep(2000);
		FieldTypeStatic.click();
		FieldDataTypeSelect.click();
		Thread.sleep(2000);
		FieldStaticDataTypeText.click();
		FieldLength.sendKeys("12");
		FieldSave.click();
		Thread.sleep(5000);
		FieldFindTab.sendKeys("StaticTest08");
		Thread.sleep(2000);
		FieldFindStaticResult.click();
		
		
		}

public void CreateNewListField() throws InterruptedException{
	
	Fields.click();
	FieldManager.click();
	Add.click();
	FieldName.sendKeys("ListTest08");
	FieldDisplayName.sendKeys("ListTest08");
	Thread.sleep(2000);
	FieldTypeSelect.click();
	Thread.sleep(2000);
	FieldTypeList.click();
	FieldDataTypeSelect.click();
	Thread.sleep(2000);
	FieldListDataTypeText.click();
	FieldLength.sendKeys("12");
	FieldListAllowedValues.click();
	Thread.sleep(2000);
	FieldListAllowedValuesAdd.click();
	FieldListAllowedValuesEnter1.sendKeys("USA");
	FieldListAllowedDescription1.sendKeys("NewYork");
	FieldListAllowedValuesAdd.click();
	FieldListAllowedValuesEnter2.sendKeys("CANADA");
	FieldListAllowedDescription2.sendKeys("Toronto");
	FieldSave.click();
	Thread.sleep(3000);
	FieldFindTab.sendKeys("ListTest08");
	Thread.sleep(2000);
	FieldFindListResult.click();
}


public void CreateNewConstantField(String ConstantName, String ConstantDisplayName, String Value) throws InterruptedException{
	
	Fields.click();
	FieldManager.click();
	Add.click();
	FieldName.sendKeys(ConstantName);
	FieldDisplayName.sendKeys(ConstantDisplayName);
	//Thread.sleep(4000);
	FieldTypeSelect.click();
	//Thread.sleep(2000);
	FieldTypeConstant.click();
	FieldDataTypeSelect.click();
	Thread.sleep(1000);
	FieldConstantDataTypeText.click();
	//Thread.sleep(2000);
	FieldConstantValue.sendKeys(Value);
	FieldSave.click();
	Thread.sleep(3000);
	FieldFindTab.sendKeys("ConstantTest08");
	Thread.sleep(2000);
	FieldFindConstantResult.click();
	
}

public void CreateNewCalculationField() throws InterruptedException{
	
	Fields.click();
	FieldManager.click();
	Add.click();
	FieldName.sendKeys("CalculationTest08");
	FieldDisplayName.sendKeys("CalculationTest08");
	Thread.sleep(2000);
	FieldTypeSelect.click();
	FieldTypeCalculation.click();
	FieldDataTypeSelect.click();
	FieldCalculationTargetSelf.click();
	FieldCalculationAggregationNone.click();
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//div[text()='Formula']"))).moveToElement(driver.findElement(By.xpath("//div[@id='destination']"))).release().build().perform();
	FieldCalculationFormulaSelect.click();
	FieldCalculationFormulaOption.sendKeys("BankAccountNo");
	Thread.sleep(2000);
	FieldCalculationFormulaOptionClick.click();
	Thread.sleep(1000);
	
	FieldSave.click();
	Thread.sleep(3000);
	FieldFindTab.sendKeys("CalculationTest08");
	Thread.sleep(2000);
	FieldFindCalculationResult.click();
	
}










public void CreateNewReport() throws InterruptedException{
	
	Report.click();
	CreateReport.click();
	Thread.sleep(2000);
	ReportTypeSelect.click();
	Thread.sleep(2000);
	ReportTypeOption.click();
	ReportName.sendKeys("AutomatedReport");
	Thread.sleep(2000);
	ReportServiceSelect.click();
	ReportServiceOption.click();
	Thread.sleep(2000);
	ReportCategorySelect.click();
	ReportCategoryOption.click();
	ReportDescription.sendKeys("Testing Purpose");
	Thread.sleep(2000);
	ReportSave.click();
	
	
	
	
	
		
}







public void CretaeNewDocument() throws InterruptedException{
	
	Document.click();
	CreateDocument.click();
	DocumentName.sendKeys("AutomatedDocument");
	Thread.sleep(2000);
	DocumentCategorySelect.click();
	DocumentCategoryOption.click();
    DocumentDescription.sendKeys("Testing Purpose");
	DocumentSave.click();
	Thread.sleep(2000);
	
	

		
}

public void EmailService1() throws InterruptedException{
	
	Fields.click();
	FieldManager.click();
	FieldFindTab.sendKeys("PeopleEmail");
	Thread.sleep(1000);
	FieldsFindPeopleEmailResult.click();
	Thread.sleep(2000);

	DedicatedEmail.click();
	FieldSave.click();
	Thread.sleep(3000);
	SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationAction");
	ActionDescription.sendKeys("AutomationActionEmailPurpose");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeOption.click();
	ActionDocumentSelect.click();
	ActionDocumentOption.click();
	ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
    CreateNewEvent.click();
	EventName.sendKeys("AutomationEvent");
	EventStatus.click();
	TriggerIntiatorsSelect.click();
	TriggerIntiatorsOption.click();
	TriggerPersonTypeSelect.click();
	TriggerPersonTypeOption.click();
	TriggerFieldsSelect.click();
	Thread.sleep(1000);
	TriggerFieldsOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelect);
	PerformActionSelect.click();
	PerformActionOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelect);
	AddDescription.sendKeys("Hello");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}

public void EmailService2() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterEmail.clear();
	EmployeeEditEnterEmail.sendKeys("arpan.patel@bossc.ca");
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("EMail");
	EmployeeEditedMakeSure.click();
	EmployeeEditSave.click();
	Thread.sleep(1000);
	SettingsSection.click();
	Thread.sleep(1000);
	je.executeScript("arguments[0].scrollIntoView(true);",EmailSection);
	EmailSection.click();
	
	
}


public void Object_CalculationField() throws InterruptedException{
	
	SettingsSection.click();
	services.click();
	services1.click();
	Objects_Benefitts.click();
	Thread.sleep(2000);
	Objects_Dental.click();
	Objects_Fields.click();
	Thread.sleep(2000);
	Objects_Fields_Add.click();
	//Thread.sleep(3000);
	Objects_Fields_Name.sendKeys("AutomationObjectCalculationFields");
	Objects_Fields_DisplayName.sendKeys("AutomationObjectCalculationFields");
	Objects_Fields_Type_Select.click();
	Objects_Fields_Type_Option.click();
	Objects_Fields_Target_Select.click();
	Objects_Fields_Target_Option.click();
	Objects_Fields_Aggregate.click();
	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//div[text()='Formula']"))).moveToElement(driver.findElement(By.xpath("//div[@id='destination']"))).release().build().perform();
	FieldCalculationFormulaSelect.click();
	Objects_FieldCalculationFormulaOption.sendKeys("BankAccountNo");
	Thread.sleep(2000);
	FieldCalculationFormulaOptionClick.click();
	Thread.sleep(2000);
	Objects_FieldSave.click();
	Thread.sleep(2000);
	Objects_FieldFindTab.sendKeys("AutomationObjectCalculationFields");
	Thread.sleep(2000);
	Objects_FieldFindCalculationResult.click();


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
