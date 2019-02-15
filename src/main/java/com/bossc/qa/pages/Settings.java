package com.bossc.qa.pages;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
	
	// Copied
	
	@FindBy(xpath="//button[@title='Create New Employee']")
	WebElement AddEmployee;

	@FindBy(xpath="//input[@id='mat-input-0']")//div[@class='row people-container pb-4 mb-5']/div[2]/mat-table/mat-row/mat-cell[2])[2]
	WebElement EmployeeFirstName;

	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement EmployeeLastName;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement EmployeeJobTitle;

	@FindBy(xpath="//input[@id='mat-input-3']")
	WebElement EmployeeManagerName;

	@FindBy(xpath="//input[@id='mat-input-4']")
	WebElement EmployeeHiredDate;
	
	@FindBy(xpath="//input[@id='mat-input-5']")
	WebElement EmployeeAnnualPay;

	@FindBy(xpath="//button[text()='Save']")
	WebElement EmployeeSave;

	@FindBy(xpath="//button[@title='Workflows']")
	WebElement ButtonWorkFlow;
	
	@FindBy(xpath="//mat-cell[text()=' Emergency Days ']")
	WebElement VerifyAssignTask_WorkFlow;
	
	
	
// Settings
	
	
	@FindBy(xpath="//div[@class='d-flex flex-row']/ul/li[6]")
    WebElement SettingsSection;
	
	@FindBy(xpath="//h5[text()='Email Status']")
    WebElement EmailSection;
	
	@FindBy(xpath="//button[@title='Services']")
	WebElement Employee_Service;
	
	@FindBy(xpath="//div[@class='mb-3 ng-star-inserted']/li")
	WebElement Employee_CreateObject_MakeSure;
	
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
	

	@FindBy(xpath="//button[text()=' CREATE REPORT ']")
	WebElement CreateReport;

	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement ReportTypeSelect;

	@FindBy(xpath="//span[text()=' Comma Separated Values (CSV)']")
	WebElement ReportTypeCSVOption;

	@FindBy(xpath="//span[text()=' Field Delimited (DEL)']")
	WebElement ReportTypeDELOption;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement ReportName;
	
	@FindBy(xpath="//mat-select[@id='mat-select-1']")
	WebElement ReportServiceSelect;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='Payroll']")
	WebElement ReportServiceOption;
	
     @FindBy(xpath="//mat-select[@id='mat-select-2']")
	WebElement ReportCategorySelect;

	@FindBy(xpath="//span[text()='Carrier Reports']")
	WebElement ReportCategoryOption;
	
	@FindBy(xpath="//input[@id='mat-input-4']")
	WebElement CSVReportDelimiter;
	
	@FindBy(xpath="//mat-select[@id='mat-select-3']")
	WebElement Include_Exclude_Column_Header_Select;

	@FindBy(xpath="//span[text()=' Include Column Headers ']")
	WebElement Include_Column_Header_Option;
	

	@FindBy(xpath="//input[@id='mat-input-3']")
	WebElement ReportDescription;

	@FindBy(xpath="//button[@class='btn bossc-btn']")
	WebElement ReportSave;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement ReportSaveId;
	
	@FindBy(xpath="//mat-select[@id='selField']")
	WebElement Add_Fields_TO_Report_Select;
	
	@FindBy(xpath="//span[text()='First Name (PeopleFirstName)']")
	WebElement Add_First_Name_To_Report_Option;
	
	@FindBy(xpath="//span[text()='Last Name (PeopleLastName)']")
	WebElement Add_Last_Name_To_Report_Option;
	
	@FindBy(xpath="//span[text()='Date of Birth (PeopleDOB)']")
	WebElement Add__DateOfBirth_To_Report_Option;
	
	@FindBy(xpath="//span[text()='Age (PeopleAge)']")
	WebElement Add_Age_To_Report_Option;
	
	@FindBy(xpath="//span[text()='ConstantTest08 (ConstantTest08)']")
	WebElement Add_ConstantTest08_Option;
	
	@FindBy(xpath="(//input[@placeholder='start'])[1]")
	WebElement FirstStart;
	
	@FindBy(xpath="(//input[@placeholder='start'])[2]")
	WebElement SecondStart;
	
	@FindBy(xpath="(//input[@placeholder='start'])[3]")
	WebElement ThirdStart;
	
	@FindBy(xpath="(//input[@placeholder='start'])[4]")
	WebElement FourthStart;
	
	@FindBy(xpath="(//input[@placeholder='start'])[5]")
	WebElement FifthStart;
	
	@FindBy(xpath="(//input[@placeholder='end'])[1]")
	WebElement FirstEnd;
	
	@FindBy(xpath="(//input[@placeholder='end'])[2]")
	WebElement SecondEnd;
	
	@FindBy(xpath="(//input[@placeholder='end'])[3]")
	WebElement ThirdEnd;
	
	@FindBy(xpath="(//input[@placeholder='end'])[4]")
	WebElement FourthEnd;
	
	@FindBy(xpath="(//input[@placeholder='end'])[5]")
	WebElement FifthEnd;
	
	
	@FindBy(xpath="//button[@mattooltip='Save Report']")
	WebElement Save_After_Add_Field;
	
	@FindBy(xpath="//div[text()='Back']")
	WebElement Back;
	
// Documents
	
	@FindBy(xpath="//h5[@class='mt-3' and text()='Documents']")
	WebElement Document;

	@FindBy(xpath="//button[@class='btn bossc-btn right-panel-btn']")
	WebElement CreateDocument;
	

	@FindBy(xpath="//small[text()='add category']")
	WebElement AddCategory;

	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement CategoryName;

	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement CategoryDescription;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement CreateCategory;

	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement DocumentName;

	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement DocumentCategorySelect;

	@FindBy(xpath="//span[text()='Automation']")
	WebElement DocumentCategoryOption;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	WebElement DocumentDescription;

	@FindBy(xpath="//button[text()='Save']")
	WebElement DocumentSave;
	
	@FindBy(xpath="//div[@class='fr-element fr-view']")
	WebElement DocumentContent;
	
	@FindBy(xpath="//button[@mattooltip='Save Document']")
	WebElement DocumentSave2;
	
	@FindBy(xpath="//div[text()='Back']")
	WebElement DocumentBack;
	
	
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
	WebElement EmailActionName;
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement ActionName;
	
	@FindBy(xpath="//input[@id='mat-input-9']")
	WebElement EmailActionDescription;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement ActionDescription;
	
	@FindBy(xpath="//mat-select[@id='mat-select-3']")
	WebElement EmailActionTypeSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement ActionTypeSelect;
	
	
	@FindBy(xpath="//span[text()=' Send Email ']")
	WebElement ActionTypeSendEmailOption;
	
	@FindBy(xpath="//span[text()=' Enable Account ']")
	WebElement ActionTypeEnableAccountOption;

	
	@FindBy(xpath="//span[text()=' Disable Account ']")
	WebElement ActionTypeDisableAccountOption;
	
	
	@FindBy(xpath="//span[text()=' Grant Mobile Access ']")
	WebElement ActionTypeGrantMobileOption;
	
	@FindBy(xpath="//span[text()=' Revoke Mobile Access ']")
	WebElement ActionTypeRevokeMobileOption;
	
	@FindBy(xpath="//span[text()=' Create Object ']")
	WebElement ActionTypeCreateObjectOption;
	
	@FindBy(xpath="//span[text()=' Assign Workflow ']")
	WebElement ActionTypeAssignWorkFlowOption;
	
	@FindBy(xpath="//span[text()=' Field Update ']")
	WebElement ActionTypeFieldUpdateOption;
	
	@FindBy(xpath="//span[text()=' Dependent Field Update ']")
	WebElement ActionTypeDependentFieldUpdateOption;
	
	@FindBy(xpath="//span[text()=' Terminate Object ']")
	WebElement ActionTypeTerminateObjectOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-1']")
	WebElement ObjectTypeSelect;
	
	@FindBy(xpath="//span[text()=' Extended Health Care ']")
	WebElement ObjectTypeOption;
	
	@FindBy(xpath="//span[text()=' Emergency Days ']")
	WebElement TypeOfWorkFlowOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-1']")
	WebElement FieldUpdateTargetSelect;
	
	@FindBy(xpath="//span[text()=' PeopleLastName ']")
	WebElement FieldUpdateTargetOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-2']")
	WebElement FieldUpdateSourceSelect;
	
	@FindBy(xpath="//span[text()=' PeopleFirstName ']")
	WebElement FieldUpdateSourceOption;
	
	
	@FindBy(xpath="//mat-select[@id='mat-select-2']")
	WebElement ObjectCategorySelect;
	
	@FindBy(xpath="//span[text()=' Single ']")
	WebElement ObjectCategoryOption;
	
	@FindBy(xpath="//span[text()=' Hired Date ']")
	WebElement StartDateOption;
	
	@FindBy(xpath="//span[text()=' System Date ']")
	WebElement EndDateOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-3']")
	WebElement ObjectStatusSelect;
	
	@FindBy(xpath="//span[text()=' Active ']")
	WebElement ObjectStatusOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-4']")
	WebElement EmailActionDocumentSelect;
	
	@FindBy(xpath="//span[text()=' TestEmailService ']")
	WebElement EmailActionDocumentOption;
	
	
	@FindBy(xpath="//button[text()=' Save Action ']")
	WebElement ActionSave;
	
	@FindBy(xpath="//span[text()='events']")
	WebElement EventClick ;
	
	@FindBy(xpath="//button[text()='YES']")
	WebElement ActionConfirmBox;
	
	
	@FindBy(xpath="//button[text()=' CREATE NEW EVENT ']")
	WebElement CreateNewEvent;
	
	@FindBy(xpath="//input[@id='mat-input-10']")
	WebElement EmailEventName;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement EventName;
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement EventNameC;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	WebElement FieldUpdateEventName;
	
	
	@FindBy(xpath="//label[@class='custom-checkbox']")
	WebElement EventStatus;
	
	@FindBy(xpath="//mat-select[@id='mat-select-6']")
	WebElement EmailTriggerIntiatorsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-1']")
	WebElement TriggerIntiatorsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement TriggerIntiatorsSelectC;

	@FindBy(xpath="//mat-select[@id='mat-select-4']")
	WebElement CreateObjectTriggerIntiatorsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-5']")
	WebElement AssignWorkFlowTriggerIntiatorsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-2']")
	WebElement TerminateObjectTriggerIntiatorsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-3']")
	WebElement FieldUpdateTriggerIntiatorsSelect;
	
	@FindBy(xpath="//span[text()=' Field Update ']")
	WebElement TriggerIntiatorsOption;
	
	@FindBy(xpath="//span[text()=' Create Record ']")
	WebElement TriggerIntiatorsOptionC;
	
    @FindBy(xpath="//mat-select[@id='mat-select-7']")
	WebElement EmailTriggerPersonTypeSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-2']")
	WebElement TriggerPersonTypeSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-1']")
	WebElement TriggerPersonTypeSelectC;
	
	@FindBy(xpath="//mat-select[@id='mat-select-5']")
	WebElement CreateObjectTriggerPersonTypeSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-6']")
	WebElement AssignWorkFlowTriggerPersonTypeSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-3']")
	WebElement TerminateObjectTriggerPersonTypeSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-4']")
	WebElement FieldUpdateTriggerPersonTypeSelect;
	
	
	@FindBy(xpath="//span[text()=' Primary ']")
	WebElement TriggerPersonTypeOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-9']")
	WebElement EmailTriggerFieldsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-4']")
	WebElement TriggerFieldsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-7']")
	WebElement CreateObjectTriggerFieldsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-8']")
	WebElement AssignWorkFlowTriggerFieldsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-5']")
	WebElement TerminateObjectTriggerFieldsSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-6']")
	WebElement FieldUpdateTriggerFieldsSelect;
	
	@FindBy(xpath="//span[text()=' PeopleLastName ']")
	WebElement TriggerFieldsOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-8']")
	WebElement EmailPerformActionSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-3']")
	WebElement PerformActionSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-2']")
	WebElement PerformActionSelectC;
	

	@FindBy(xpath="//mat-select[@id='mat-select-6']")
	WebElement CreateObjectPerformActionSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-7']")
	WebElement AssignWorkFlowPerformActionSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-4']")
	WebElement TerminateObjectPerformActionSelect;
	
	@FindBy(xpath="//mat-select[@id='mat-select-5']")
	WebElement FieldUpdatePerformActionSelect;
	
	
	@FindBy(xpath="//span[text()=' AutomationSendEmailAction ']")
	WebElement PerformActionSendEmailOption;
	
	@FindBy(xpath="//span[text()=' AutomationEnableAccountAction ']")
	WebElement PerformActionEnableAccountOption;
	
	@FindBy(xpath="//span[text()=' AutomationDisableAccountAction ']")
	WebElement PerformActionDisableAccountOption;
	
	@FindBy(xpath="//span[text()=' AutomationGrantMobileAction ']")
	WebElement PerformActionGrantMobileOption;
	
	@FindBy(xpath="//span[text()=' AutomationRevokeMobileAction ']")
	WebElement PerformActionRevokeMobileOption;
	
	@FindBy(xpath="//span[text()=' AutomationCreateObjectAction ']")
	WebElement PerformActionCreateObjectOption;
	
	@FindBy(xpath="//span[text()=' AutomationAssignWorkFlowAction ']")
	WebElement PerformActionAssignWorkFlowOption;
	
	@FindBy(xpath="//span[text()=' AutomationTerminateObjectAction ']")
	WebElement PerformActionTerminateObjectOption;
	
	@FindBy(xpath="//span[text()=' AutomationFieldUpdateAction ']")
	WebElement PerformActionFieldUpdateOption;
	
	@FindBy(xpath="//span[text()=' AutomationDependentFieldUpdateAction ']")
	WebElement PerformActionDependentFieldUpdateOption;
	
	@FindBy(xpath="//button[@class='btn bossc-btn']")
	WebElement SaveAsNewEvent;
	
	@FindBy(xpath="//textarea[starts-with(@id,'mat-input')]")
	WebElement AddDescription;
	
	@FindBy(xpath="//input[@placeholder='Quick Search']")
	WebElement QuickSearchEnter;
	

	@FindBy(xpath="(//mat-table/mat-row/mat-cell)[2]")
	WebElement ResultSearchClick;
	
	
	@FindBy(xpath="//button[@title='Profile']")
	WebElement EmployeeProfile;
	
	@FindBy(xpath="//button[@title='Edit Profile']")
	WebElement EmployeeEdit;
	
	@FindBy(xpath="//button[@title='Family']")
	WebElement Employee_Family ;
	
	@FindBy(xpath="//a[text()='VIEW PROFILE']")
	WebElement DependentViewProfile ;
	
	@FindBy(xpath="//input[@id='mat-input-38']")
	WebElement DependentEditedValueATEJ ;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	WebElement EmployeeEditEnterEmail;
	
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement EmployeeEditEnterLastName;
	
	@FindBy(xpath="//button[@title='Save Profile']")
	WebElement EmployeeEditSave;
	
	@FindBy(xpath="//input[@id='mat-input-20']")
	WebElement EmployeeEditedValue;
	
	@FindBy(xpath="//input[@id='mat-input-8']")
	WebElement EmployeeEditedValueF;
	
	@FindBy(xpath="(//div[text()=' Employee Profile '])[2]")
	WebElement EmployeeEditedMakeSure;
	
    @FindBy(xpath="//mat-cell[text()=' TestEmailService ']")
	WebElement EmailAction;
	
	@FindBy(xpath="//div[text()='Automation']")
	WebElement EmailActionMessage;

	

	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement QuickSearchClick;
	
	@FindBy(xpath="(//button[@mattooltip='Delete Event'])[1]")
	WebElement DeleteEvent;
	
	@FindBy(xpath="//button[text()='YES']")
	WebElement DeleteEventForSure;
	
	//ATE ACCOUNT, MOBILE
	
	@FindBy(xpath="//button[@class='btn small-icon-btn']")
	WebElement AccountAuditClick;
	
	@FindBy(xpath="//button[text()='Account']")
	WebElement AccountClick;
	
	@FindBy(xpath="//button[text()='Audit']")
	WebElement AuditClick;
	
	@FindBy(xpath="//mat-checkbox[@id='mat-checkbox-1']")
	WebElement EnableAccountClick;
	
	@FindBy(xpath="//mat-checkbox[@id='mat-checkbox-2']")
	WebElement EnableMobileClick;
	
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
	
	@FindBy(xpath="//span[text()=' Primary ']")
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
		Thread.sleep(5000);
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
	Thread.sleep(2000);
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










public void CreateNewCSVReport() throws InterruptedException{
	
	Report.click();
	CreateReport.click();
	Thread.sleep(2000);
	ReportTypeSelect.click();
	Thread.sleep(2000);
	ReportTypeCSVOption.click();
	ReportName.sendKeys("fff");
	Thread.sleep(1000);
	//ReportServiceSelect.click();
	//Thread.sleep(1000);
	//ReportServiceOption.click();
	//Thread.sleep(2000);
	ReportCategorySelect.click();
	Thread.sleep(1000);
	ReportCategoryOption.click();
	CSVReportDelimiter.sendKeys("|");
	Include_Exclude_Column_Header_Select.click();
	Include_Column_Header_Option.click();
	ReportDescription.sendKeys("Testing Purpose");
	Thread.sleep(1000);
	ReportSave.click();
	Thread.sleep(2000);
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add_First_Name_To_Report_Option.click();
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add_Last_Name_To_Report_Option.click();
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add__DateOfBirth_To_Report_Option.click();
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add_Age_To_Report_Option.click();
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add_ConstantTest08_Option.click();
	Thread.sleep(1000);
	Save_After_Add_Field.click();
	Thread.sleep(4000);
	Back.click();
	QuickSearchEnter.sendKeys("fff");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	
	
	
	
	
	
		
}


public void CreateNewDELReport() throws InterruptedException{
	
	Report.click();
	CreateReport.click();
	Thread.sleep(2000);
	ReportTypeSelect.click();
	Thread.sleep(2000);
	ReportTypeDELOption.click();
	ReportName.sendKeys("AutomatedDELRe");
	Thread.sleep(1000);
	//ReportServiceSelect.click();
	//Thread.sleep(1000);
	//ReportServiceOption.click();
	//Thread.sleep(2000);
	ReportCategorySelect.click();
	Thread.sleep(1000);
	ReportCategoryOption.click();

	ReportDescription.sendKeys("Testing Purpose");
	Thread.sleep(1000);
	ReportSave.click();
	Thread.sleep(2000);
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add_First_Name_To_Report_Option.click();
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add_Last_Name_To_Report_Option.click();
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add__DateOfBirth_To_Report_Option.click();
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add_Age_To_Report_Option.click();
	Add_Fields_TO_Report_Select.click();
	Thread.sleep(1000);
	Add_ConstantTest08_Option.click();
	Thread.sleep(1000);
	FirstStart.sendKeys("0");
	SecondStart.sendKeys("2");
	ThirdStart.sendKeys("4");
	FourthStart.sendKeys("6");
	FifthStart.sendKeys("8");
	FirstEnd.sendKeys("1");
	SecondEnd.sendKeys("3");
	ThirdEnd.sendKeys("5");
	FourthEnd.sendKeys("7");
	FifthEnd.sendKeys("9");
	
	
	
	Save_After_Add_Field.click();
	Thread.sleep(4000);
	Back.click();
	QuickSearchEnter.sendKeys("AutomatedDELRe");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	
	
	
	
	
	
		
}








public void CretaeNewDocument() throws InterruptedException{
	
	Document.click();
	CreateDocument.click();
	Thread.sleep(2000);
	AddCategory.click();
	CategoryName.sendKeys("Automation");
	CategoryDescription.sendKeys("Automation");
	CreateCategory.click();
	DocumentName.sendKeys("TestEmailService");
	Thread.sleep(2000);
	//DocumentCategorySelect.click();
	//Thread.sleep(2000);
	//DocumentCategoryOption.click();
    DocumentDescription.sendKeys("Testing Purpose");
	DocumentSave.click();
	Thread.sleep(2000);
	DocumentContent.sendKeys("Automation");
	DocumentSave2.click();
	DocumentBack.click();
	QuickSearchEnter.sendKeys("TestEmailService");
	Thread.sleep(2000);
	QuickSearchClick.click();
	
	Thread.sleep(2000);
	
	ResultSearchClick.click();
	
	
	
	

		
}

public void EmailService1() throws InterruptedException{
	
	Fields.click();
	FieldManager.click();
	FieldFindTab.sendKeys("PeopleEmail");
	Thread.sleep(1000);
	FieldsFindPeopleEmailResult.click();
	Thread.sleep(2000);
	WebElement e = driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-4']"));
   if (e.getAttribute("ng-reflect-model").equals("false")) {
	   DedicatedEmail.click();
	   }
   else{
		System.out.println("Dedicated Email is already checked!");
	}
	FieldSave.click();
	Thread.sleep(3000);
	SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	EmailActionName.sendKeys("AutomationSendEmailAction");
	EmailActionDescription.sendKeys("AutomationActionEmailPurpose");
	EmailActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeSendEmailOption.click();
	EmailActionDocumentSelect.click();
	Thread.sleep(1000);
	EmailActionDocumentOption.click();
	ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
    CreateNewEvent.click();
	EmailEventName.sendKeys("AutomationTriggerEvent");
	EventStatus.click();
	EmailTriggerIntiatorsSelect.click();
	TriggerIntiatorsOption.click();
	EmailTriggerPersonTypeSelect.click();
	TriggerPersonTypeOption.click();
	EmailTriggerFieldsSelect.click();
	Thread.sleep(1000);
	TriggerFieldsOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",EmailPerformActionSelect);
	EmailPerformActionSelect.click();
	PerformActionSendEmailOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",EmailPerformActionSelect);
	AddDescription.sendKeys("AutomationEmailService");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}

public String EmailService2() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterEmail.clear();
	EmployeeEditEnterEmail.sendKeys("arpan.patel@bossc.ca");
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("EMail");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(1000);
	SettingsSection.click();
	Thread.sleep(5000);
	je.executeScript("arguments[0].scrollIntoView(true);",EmailSection);
	
	EmailSection.click();
	EmailAction.click();
	return EmailActionMessage.getText();
	
	
	
}
public void EnableAccount1F() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationEnableAccountAction");
	ActionDescription.sendKeys("AutomationEnableAccount");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeEnableAccountOption.click();
    ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventName.sendKeys("AutomationTrigeerEvent");
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
	Thread.sleep(1000);
	PerformActionEnableAccountOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelect);
	AddDescription.sendKeys("AutomationEnableAccount");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public String EnableAccount2F() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("EnableAccount");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(1000);
	AccountAuditClick.click();
	AccountClick.click();
	
	
	return EnableAccountClick.getAttribute("ng-reflect-model");
	
	
	

}

public void DisableAccount1F() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationDisableAccountAction");
	ActionDescription.sendKeys("AutomationDisableAccount");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeDisableAccountOption.click();
    ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventName.sendKeys("AutomationTrigeerEvent");
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
	Thread.sleep(1000);
	PerformActionDisableAccountOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelect);
	AddDescription.sendKeys("AutomationDisableAccount");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public String DisableAccount2F() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("DisableAccount");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(1000);
	AccountAuditClick.click();
	AccountClick.click();
	
	
	return EnableAccountClick.getAttribute("ng-reflect-model");
	
	
}

public void GrantMobile1F() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationGrantMobileAction");
	ActionDescription.sendKeys("AutomationGrantMobileAction");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeGrantMobileOption.click();
    ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventName.sendKeys("AutomationTrigeerEvent");
	EventStatus.click();
	TriggerIntiatorsSelect.click();
	Thread.sleep(1000);
	TriggerIntiatorsOption.click();
	TriggerPersonTypeSelect.click();
	Thread.sleep(1000);
	TriggerPersonTypeOption.click();
	TriggerFieldsSelect.click();
	Thread.sleep(1000);
	TriggerFieldsOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelect);
	PerformActionSelect.click();
	Thread.sleep(1000);
	PerformActionGrantMobileOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelect);
	AddDescription.sendKeys("AutomationGrantMobile");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public String GrantMobile2F() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("GrantMobile");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(1000);
	AccountAuditClick.click();
	AccountClick.click();
	
	
	return EnableMobileClick.getAttribute("ng-reflect-model");
	
	
	

}
public void RevokeMobile1F() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationRevokeMobileAction");
	ActionDescription.sendKeys("AutomationRevokeMobileAction");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeRevokeMobileOption.click();
    ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventName.sendKeys("AutomationTrigeerEvent");
	EventStatus.click();
	TriggerIntiatorsSelect.click();
	Thread.sleep(1000);
	TriggerIntiatorsOption.click();
	TriggerPersonTypeSelect.click();
	Thread.sleep(1000);
	TriggerPersonTypeOption.click();
	TriggerFieldsSelect.click();
	Thread.sleep(1000);
	TriggerFieldsOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelect);
	PerformActionSelect.click();
	Thread.sleep(1000);
	PerformActionRevokeMobileOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelect);
	AddDescription.sendKeys("AutomationRevokeMobile");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public String RevokeMobile2F() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("RevokeMobile");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(1000);
	AccountAuditClick.click();
	AccountClick.click();
	
	
	return EnableMobileClick.getAttribute("ng-reflect-model");
	
	
	

}
public void CreateHealthObject1F() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationCreateObjectAction");
	ActionDescription.sendKeys("AutomationCreateObjectAction");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeCreateObjectOption.click();
	Thread.sleep(1000);
	ObjectTypeSelect.click();
	Thread.sleep(1000);
	ObjectTypeOption.click();
	ObjectCategorySelect.click();
	ObjectCategoryOption.click();
	ObjectStatusSelect.click();
	ObjectStatusOption.click();
    ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	Thread.sleep(1000);
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventName.sendKeys("AutomationTrigeerEvent");
	EventStatus.click();
	CreateObjectTriggerIntiatorsSelect.click();
	Thread.sleep(1000);
	TriggerIntiatorsOption.click();
	CreateObjectTriggerPersonTypeSelect.click();
	Thread.sleep(1000);
	TriggerPersonTypeOption.click();
	CreateObjectTriggerFieldsSelect.click();
	Thread.sleep(1000);
	TriggerFieldsOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",CreateObjectPerformActionSelect);
	CreateObjectPerformActionSelect.click();
	Thread.sleep(1000);
	PerformActionCreateObjectOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",CreateObjectPerformActionSelect);
	AddDescription.sendKeys("AutomationCreateObject");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public void CreateHealthObject2F() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("CreateObject");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(1000);
	Employee_Service.click();
	Employee_CreateObject_MakeSure.click();
	
	

	
	

}

public void TerminateHealthObject1F() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationTerminateObjectAction");
	ActionDescription.sendKeys("AutomationTerminateObjectAction");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeTerminateObjectOption.click();
	Thread.sleep(1000);
	ObjectTypeSelect.click();
	Thread.sleep(1000);
	ObjectTypeOption.click();
    ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	Thread.sleep(1000);
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventName.sendKeys("AutomationTrigeerEvent");
	EventStatus.click();
	TerminateObjectTriggerIntiatorsSelect.click();
	Thread.sleep(1000);
	TriggerIntiatorsOption.click();
	TerminateObjectTriggerPersonTypeSelect.click();
	Thread.sleep(1000);
	TriggerPersonTypeOption.click();
	TerminateObjectTriggerFieldsSelect.click();
	Thread.sleep(1000);
	TriggerFieldsOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",TerminateObjectPerformActionSelect);
	TerminateObjectPerformActionSelect.click();
	Thread.sleep(1000);
	PerformActionTerminateObjectOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",TerminateObjectPerformActionSelect);
	AddDescription.sendKeys("TerminateObject");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public void TerminateHealthObject2F() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("TerminateObject");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(1000);
	Employee_Service.click();
	Dimension arpan = Employee_CreateObject_MakeSure.getSize();
	System.out.println(arpan);
	

	
	

}

public void FieldUpdate1F() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationFieldUpdateAction");
	ActionDescription.sendKeys("AutomationFieldUpdateAction");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeFieldUpdateOption.click();
	FieldUpdateTargetSelect.click();
	Thread.sleep(1000);
	FieldUpdateTargetOption.click();
	FieldUpdateSourceSelect.click();
	Thread.sleep(1000);
	FieldUpdateSourceOption.click();
	
	
    ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	Thread.sleep(1000);
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	FieldUpdateEventName.sendKeys("AutomationTrigeerEvent");
	EventStatus.click();
	FieldUpdateTriggerIntiatorsSelect.click();
	Thread.sleep(1000);
	TriggerIntiatorsOption.click();
	FieldUpdateTriggerPersonTypeSelect.click();
	Thread.sleep(1000);
	TriggerPersonTypeOption.click();
	FieldUpdateTriggerFieldsSelect.click();
	Thread.sleep(1000);
	TriggerFieldsOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",FieldUpdatePerformActionSelect);
	FieldUpdatePerformActionSelect.click();
	Thread.sleep(1000);
	PerformActionFieldUpdateOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",FieldUpdatePerformActionSelect);
	AddDescription.sendKeys("AutomationFieldUpdate");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public String FieldUpdate2F() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("FieldUpdate");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(1000);
	return EmployeeEditedValue.getAttribute("ng-reflect-model");

	

	
	

}

public void DependentFieldUpdate1() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationDependentFieldUpdateAction");
	ActionDescription.sendKeys("AutomationDependentFieldUpdateAction");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeDependentFieldUpdateOption.click();
	FieldUpdateTargetSelect.click();
	FieldUpdateTargetOption.click();
	FieldUpdateSourceSelect.click();
	Thread.sleep(1000);
	FieldUpdateSourceOption.click();
	
	
    ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	Thread.sleep(1000);
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	FieldUpdateEventName.sendKeys("AutomationTrigeerEvent");
	EventStatus.click();
	FieldUpdateTriggerIntiatorsSelect.click();
	Thread.sleep(1000);
	TriggerIntiatorsOption.click();
	FieldUpdateTriggerPersonTypeSelect.click();
	Thread.sleep(1000);
	TriggerPersonTypeOption.click();
	FieldUpdateTriggerFieldsSelect.click();
	Thread.sleep(1000);
	TriggerFieldsOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",FieldUpdatePerformActionSelect);
	FieldUpdatePerformActionSelect.click();
	Thread.sleep(1000);
	PerformActionDependentFieldUpdateOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",FieldUpdatePerformActionSelect);
	AddDescription.sendKeys("AutomationDependentFieldUpdate");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public String DependentFieldUpdate2() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("DependentFieldUpdate");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(1000);
	Employee_Family.click();
	DependentViewProfile.click();
	Thread.sleep(1000);
	return DependentEditedValueATEJ.getAttribute("ng-reflect-model");

	

	
	

}

public void AssignWorkFlow1F() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	CreateNewAction.click();
	ActionName.sendKeys("AutomationAssignWorkFlowAction");
	ActionDescription.sendKeys("AutomationAssignWorkFlowAction");
	ActionTypeSelect.click();
	Thread.sleep(1000);
	ActionTypeAssignWorkFlowOption.click();
	Thread.sleep(1000);
	ObjectTypeSelect.click();
	Thread.sleep(1000);
	TypeOfWorkFlowOption.click();
	
	ObjectCategorySelect.click();
	Thread.sleep(1000);
	StartDateOption.click();
	ObjectStatusSelect.click();
	Thread.sleep(1000);
	EndDateOption.click();
    ActionSave.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	Thread.sleep(1000);
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventName.sendKeys("AutomationTrigeerEvent");
	EventStatus.click();
	AssignWorkFlowTriggerIntiatorsSelect.click();
	Thread.sleep(1000);
	TriggerIntiatorsOption.click();
	AssignWorkFlowTriggerPersonTypeSelect.click();
	Thread.sleep(1000);
	TriggerPersonTypeOption.click();
	AssignWorkFlowTriggerFieldsSelect.click();
	Thread.sleep(1000);
	TriggerFieldsOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",AssignWorkFlowPerformActionSelect);
	AssignWorkFlowPerformActionSelect.click();
	Thread.sleep(1000);
	PerformActionAssignWorkFlowOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",AssignWorkFlowPerformActionSelect);
	AddDescription.sendKeys("AutomationAssignWorkFlow");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public void AssignWorkFlow2F() throws InterruptedException{
	
	EmployeesSection1.click();
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnterLastName.clear();
	EmployeeEditEnterLastName.sendKeys("AssignWorkFlow");
	EmployeeEditedMakeSure.click();
	Thread.sleep(1000);
	EmployeeEditSave.click();
	Thread.sleep(5000);
	ButtonWorkFlow.click();
	VerifyAssignTask_WorkFlow.click();
	
	
	

	
	

}
public void EnableAccount1C() throws InterruptedException{
	
    SettingsSection.click();
	Automation.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventNameC.sendKeys("AutomationCreateRecordEvent");
	EventStatus.click();
	TriggerIntiatorsSelectC.click();
	TriggerIntiatorsOptionC.click();
	TriggerPersonTypeSelectC.click();
	TriggerPersonTypeOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
	PerformActionSelectC.click();
	Thread.sleep(1000);
	PerformActionEnableAccountOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
	AddDescription.sendKeys("AutomationEnableAccount");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public String EnableAccount2C() throws InterruptedException{
	
	EmployeesSection1.click();
	AddEmployee.click();
	EmployeeFirstName.sendKeys("EnableAccount");
	Thread.sleep(1000);
	EmployeeLastName.sendKeys("Test");
	Thread.sleep(1000);
	EmployeeJobTitle.sendKeys("JobTitle");
	EmployeeManagerName.sendKeys("ManagerName");
	EmployeeHiredDate.sendKeys("08/02/2018");
	EmployeeAnnualPay.sendKeys("12345");

	EmployeeSave.click();
	Thread.sleep(1000);
	QuickSearchEnter.sendKeys("EnableAccount");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	AccountAuditClick.click();
	AccountClick.click();
	
	
	return EnableAccountClick.getAttribute("ng-reflect-model");
	
	
	

}
public void DisableAccount1C() throws InterruptedException{
	
	SettingsSection.click();
	Automation.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventNameC.sendKeys("AutomationCreateRecordEvent");
	EventStatus.click();
	TriggerIntiatorsSelectC.click();
	TriggerIntiatorsOptionC.click();
	TriggerPersonTypeSelectC.click();
	TriggerPersonTypeOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
	PerformActionSelectC.click();
	Thread.sleep(1000);
	PerformActionDisableAccountOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
	AddDescription.sendKeys("AutomationDisableAccount");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
	
}
public String DisableAccount2C() throws InterruptedException{
	
	EmployeesSection1.click();
	Thread.sleep(2000);
	AddEmployee.click();

	EmployeeFirstName.sendKeys("DisableAccount");
	Thread.sleep(1000);
	EmployeeLastName.sendKeys("Test");
	Thread.sleep(1000);
	EmployeeJobTitle.sendKeys("JobTitle");
	EmployeeManagerName.sendKeys("ManagerName");
	EmployeeHiredDate.sendKeys("08/02/2018");
	EmployeeAnnualPay.sendKeys("12345");

	EmployeeSave.click();
	Thread.sleep(1000);
	QuickSearchEnter.sendKeys("DisableAccount");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	AccountAuditClick.click();
	AccountClick.click();
	
	
	return EnableAccountClick.getAttribute("ng-reflect-model");
	
	
	
	
}
public void GrantMobile1C() throws InterruptedException{
	
	    SettingsSection.click();
		Automation.click();
		Thread.sleep(2000);
		EventClick.click();
		QuickSearchEnter.sendKeys("Automation");
		Thread.sleep(2000);
		QuickSearchClick.click();
		DeleteEvent.click();
		DeleteEventForSure.click();
		Thread.sleep(1000);

	    CreateNewEvent.click();
		EventNameC.sendKeys("AutomationCreateRecordEvent");
		EventStatus.click();
		TriggerIntiatorsSelectC.click();
		TriggerIntiatorsOptionC.click();
		TriggerPersonTypeSelectC.click();
		TriggerPersonTypeOption.click();
		je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
		PerformActionSelectC.click();
		Thread.sleep(1000);
		PerformActionGrantMobileOption.click();
		Thread.sleep(5000);
		je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
		AddDescription.sendKeys("AutomationGrantMobile");
		Thread.sleep(2000);
		SaveAsNewEvent.click();

		
	
	
}
public String GrantMobile2C() throws InterruptedException{
	
	EmployeesSection1.click();
	Thread.sleep(2000);
	AddEmployee.click();
	EmployeeFirstName.sendKeys("GrantMobile");
	Thread.sleep(1000);
	EmployeeLastName.sendKeys("Test");
	Thread.sleep(1000);
	EmployeeJobTitle.sendKeys("JobTitle");
	EmployeeManagerName.sendKeys("ManagerName");
	EmployeeHiredDate.sendKeys("08/02/2018");
	EmployeeAnnualPay.sendKeys("12345");

	EmployeeSave.click();
	Thread.sleep(1000);
	QuickSearchEnter.sendKeys("GrantMobile");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	AccountAuditClick.click();
	AccountClick.click();
	
	
	return EnableMobileClick.getAttribute("ng-reflect-model");
	
	
	

}

     public void RevokeMobile1C() throws InterruptedException{
	
	    SettingsSection.click();
		Automation.click();
		Thread.sleep(2000);
		EventClick.click();
		QuickSearchEnter.sendKeys("Automation");
		Thread.sleep(2000);
		QuickSearchClick.click();
		DeleteEvent.click();
		DeleteEventForSure.click();
		Thread.sleep(1000);

	    CreateNewEvent.click();
		EventNameC.sendKeys("AutomationCreateRecordEvent");
		EventStatus.click();
		TriggerIntiatorsSelectC.click();
		TriggerIntiatorsOptionC.click();
		TriggerPersonTypeSelectC.click();
		TriggerPersonTypeOption.click();
		je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
		PerformActionSelectC.click();
		Thread.sleep(1000);
		PerformActionRevokeMobileOption.click();
		Thread.sleep(5000);
		je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
		AddDescription.sendKeys("AutomationRevokeMobile");
		Thread.sleep(2000);
		SaveAsNewEvent.click();

		
	

	
	
}
public String RevokeMobile2C() throws InterruptedException{
	
	EmployeesSection1.click();
	Thread.sleep(3000);
	AddEmployee.click();
	EmployeeFirstName.sendKeys("RevokeMobile");
	Thread.sleep(1000);
	EmployeeLastName.sendKeys("Test");
	Thread.sleep(1000);
	EmployeeJobTitle.sendKeys("JobTitle");
	EmployeeManagerName.sendKeys("ManagerName");
	EmployeeHiredDate.sendKeys("08/02/2018");
	EmployeeAnnualPay.sendKeys("12345");

	EmployeeSave.click();
	Thread.sleep(1000);
	QuickSearchEnter.sendKeys("RevokeMobile");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	AccountAuditClick.click();
	AccountClick.click();
	
	
	return EnableMobileClick.getAttribute("ng-reflect-model");
	
	
	

}
public void CreateHealthObject1C() throws InterruptedException{
	
	 SettingsSection.click();
		Automation.click();
		Thread.sleep(2000);
		EventClick.click();
		QuickSearchEnter.sendKeys("Automation");
		Thread.sleep(2000);
		QuickSearchClick.click();
		DeleteEvent.click();
		DeleteEventForSure.click();
		Thread.sleep(1000);

	    CreateNewEvent.click();
		EventNameC.sendKeys("AutomationCreateRecordEvent");
		EventStatus.click();
		TriggerIntiatorsSelectC.click();
		TriggerIntiatorsOptionC.click();
		TriggerPersonTypeSelectC.click();
		TriggerPersonTypeOption.click();
		je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
		PerformActionSelectC.click();
		Thread.sleep(1000);
		PerformActionCreateObjectOption.click();
		Thread.sleep(5000);
		je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
		AddDescription.sendKeys("AutomationCreateObject");
		Thread.sleep(2000);
		SaveAsNewEvent.click();

		
	
	
}
public void CreateHealthObject2C() throws InterruptedException{
	


	EmployeesSection1.click();
	Thread.sleep(2000);
	AddEmployee.click();
	EmployeeFirstName.sendKeys("CreateObject");
	Thread.sleep(1000);
	EmployeeLastName.sendKeys("Test");
	Thread.sleep(1000);
	EmployeeJobTitle.sendKeys("JobTitle");
	EmployeeManagerName.sendKeys("ManagerName");
	EmployeeHiredDate.sendKeys("08/02/2018");
	EmployeeAnnualPay.sendKeys("12345");

	EmployeeSave.click();
	Thread.sleep(1000);
	QuickSearchEnter.sendKeys("CreateObject");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	Employee_Service.click();
	Employee_CreateObject_MakeSure.click();
	

	
	

}




public void FieldUpdate1C() throws InterruptedException{
	
	SettingsSection.click();
	Automation.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventNameC.sendKeys("AutomationCreateRecordEvent");
	EventStatus.click();
	TriggerIntiatorsSelectC.click();
	TriggerIntiatorsOptionC.click();
	TriggerPersonTypeSelectC.click();
	TriggerPersonTypeOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
	PerformActionSelectC.click();
	Thread.sleep(1000);
	PerformActionFieldUpdateOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
	AddDescription.sendKeys("AutomationFieldUpdate");
	Thread.sleep(2000);
	SaveAsNewEvent.click();

	
	
}
public String FieldUpdate2C() throws InterruptedException{
	
	EmployeesSection1.click();
	Thread.sleep(2000);
	AddEmployee.click();
	Thread.sleep(1000);
	EmployeeFirstName.sendKeys("FieldUpdate");
	Thread.sleep(1000);
	EmployeeLastName.sendKeys("Test");
	Thread.sleep(1000);
	EmployeeJobTitle.sendKeys("JobTitle");
	EmployeeManagerName.sendKeys("ManagerName");
	EmployeeHiredDate.sendKeys("08/02/2018");
	EmployeeAnnualPay.sendKeys("12345");

	EmployeeSave.click();
	Thread.sleep(1000);
	QuickSearchEnter.sendKeys("FieldUpdate");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
    Thread.sleep(1000);
	return EmployeeEditedValueF.getAttribute("ng-reflect-model");

	

	
	

}


public void AssignWorkFlow1C() throws InterruptedException{
	
	SettingsSection.click();
	Automation.click();
	Thread.sleep(2000);
	EventClick.click();
	QuickSearchEnter.sendKeys("Automation");
	Thread.sleep(2000);
	QuickSearchClick.click();
	DeleteEvent.click();
	DeleteEventForSure.click();
	Thread.sleep(1000);

    CreateNewEvent.click();
	EventNameC.sendKeys("AutomationCreateRecordEvent");
	EventStatus.click();
	TriggerIntiatorsSelectC.click();
	TriggerIntiatorsOptionC.click();
	TriggerPersonTypeSelectC.click();
	TriggerPersonTypeOption.click();
	je.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
	PerformActionSelectC.click();
	Thread.sleep(1000);
	PerformActionAssignWorkFlowOption.click();
	Thread.sleep(5000);
	je1.executeScript("arguments[0].scrollIntoView(true);",PerformActionSelectC);
	AddDescription.sendKeys("AutomationAssignWorkFlow");
	Thread.sleep(2000);
	SaveAsNewEvent.click();


	
	
}

public void AssignWorkFlow2C() throws InterruptedException{
	
	EmployeesSection1.click();
	Thread.sleep(2000);
	AddEmployee.click();
	Thread.sleep(1000);
	EmployeeFirstName.sendKeys("AssignWorkFlow");
	Thread.sleep(1000);
	EmployeeLastName.sendKeys("Test");
	Thread.sleep(1000);
	EmployeeJobTitle.sendKeys("JobTitle");
	EmployeeManagerName.sendKeys("ManagerName");
	EmployeeHiredDate.sendKeys("08/02/2018");
	EmployeeAnnualPay.sendKeys("12345");

	EmployeeSave.click();
	Thread.sleep(1000);
	QuickSearchEnter.sendKeys("AssignWorkFlow");
	Thread.sleep(5000);
	QuickSearchClick.click();
	ResultSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
    Thread.sleep(1000);
	ButtonWorkFlow.click();
	VerifyAssignTask_WorkFlow.click();
	
	
	

	
	

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
