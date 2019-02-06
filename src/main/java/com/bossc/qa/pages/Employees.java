package com.bossc.qa.pages;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bossc.qa.base.TestBase;
import com.bossc.qa.util.TestUtil;

public class Employees extends TestBase{
	// Add new Employee
	
	@FindBy(xpath="//li[text()='EMPLOYEES']")
	WebElement EmployeeSection;

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
	
	@FindBy(xpath="//input[@placeholder='Quick Search']")
	WebElement QuickSearchEnter;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement QuickSearchClick;
	
	@FindBy(xpath="(//mat-table/mat-row/mat-cell)[2]")
	WebElement EmployeeSearchClick;
	
	
	@FindBy(xpath="//mat-cell[text()=' sam ']")
	WebElement EmployeeSaveId;
	

	@FindBy(xpath="(//div[@class='row people-container pb-4 mb-5']/div[2]/mat-table/mat-row/mat-cell[2])[1]")
	
	WebElement ClickOnEmployee;
	
	// Add new dependent
	@FindBy(xpath="//button[@title='Family']")
	WebElement Employee_Family ;

	@FindBy(xpath="//button[text()=' ADD NEW PERSON ']")
	WebElement AddNewPerson ;

	@FindBy(xpath="(//label[@class='mat-checkbox-layout'])[1]")
	WebElement Dependent;
	
	@FindBy(xpath="(//label[@class='mat-checkbox-layout'])[2]")
	WebElement Beneficiary;
	
	

	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement DepFirstName;

	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement DepLastName;
	
	@FindBy(xpath="//input[@placeholder='Date of Birth']")
	WebElement DepDOB;
	
	

	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement DepGenderSelect;
	
	@FindBy(xpath="//mat-option[@id='mat-option-1']")
	WebElement DepGenderOption;

	@FindBy(xpath="//mat-select[@id='mat-select-1']")
	WebElement DepRelationToEmployeeSelect;
	
	@FindBy(xpath="//mat-option[@id='mat-option-4']")
	WebElement DepRelationToEmployeeOption;
	
	@FindBy(xpath="//mat-select[@id='mat-select-2']")
	WebElement DepLanguageSelect;

	@FindBy(xpath="//mat-option[@id='mat-option-10']")
	WebElement DepLanguageOption;
	
	@FindBy(xpath="//button[@class='btn bossc-btn']")
	WebElement DepSave;

	@FindBy(xpath="//a[text()='VIEW PROFILE']")
	WebElement DepSaveId;

	
// Assign workflow
	@FindBy(xpath="//button[@title='Workflows']")
	WebElement ButtonWorkFlow;
	
	@FindBy(xpath="//button[@title='Tasks']")
	WebElement ButtonTask;
	
	@FindBy(xpath="//button[@title='Assign Workflow']")
	WebElement ButtonAssignWorkFlow;
	
	@FindBy(xpath="//button[@title='Assign Task']")
	WebElement ButtonAssignTask;
	
	@FindBy(xpath="//span[text()='Select a Workflow']")
	WebElement AssignWorkFlowSelect;

	@FindBy(xpath="//span[text()=' Sick Days ']")
	WebElement AssignWorkFlowOption;
	
	@FindBy(xpath="//span[text()='Select a Task']")
	WebElement AssignTaskSelect;

	@FindBy(xpath="//span[text()=' Upload Your Photo ID ']")
	WebElement AssignTaskOption;
	
	

	@FindBy(xpath="//input[@placeholder='Please select a start date']")
	WebElement WorkFlowStartDate;
	
	@FindBy(xpath="//input[@placeholder='Please select an end date']")
	WebElement WorkFlowEndDate;
	
	@FindBy(xpath="//input[@placeholder='Please select a due date']")
	WebElement TaskDueDate;
	
	@FindBy(xpath="//h4[text()='Assign New Workflow']")
	WebElement WorkFlowAssignMakeSure;
	
	@FindBy(xpath="//h4[text()='Assign New Task']")
	WebElement TaskAssignMakeSure;
	
	@FindBy(xpath="//button[text()=' Assign ']")
	WebElement ClickAssignTask_WorkFlow;
	
	@FindBy(xpath="//mat-table/mat-row/mat-cell[1]")
	WebElement VerifyAssignTask_WorkFlow;
	
	
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement RunTask_WorkFlow;
	
	@FindBy(xpath="//input[@placeholder='Upload file']")
	WebElement Task_UploadID;
	
	@FindBy(xpath="//input[@ng-reflect-placeholder='Request End Date']")
	WebElement WorkFlowRequestEndDate;
	
	@FindBy(xpath="//input[@ng-reflect-placeholder='Request Start Date']")
	WebElement WorkFlowRequestStartDate;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement WorkFlowRunNext;
	
	@FindBy(xpath="//button[text()='Done']")
	WebElement RunDone;
	
	@FindBy(xpath="//div[text()='Sick Days Request']")
	WebElement WorkFlowRunMakeSure;
	

	@FindBy(xpath="//button[@title='Dashboard']")
	WebElement EmployeeDashBoard;
	
	@FindBy(xpath="//div[@class='simplified-table']/mat-table/mat-row/mat-cell")
	WebElement EmployeeManageApproval;
	
	@FindBy(xpath="//div[@class='modal-close test']")
	WebElement ManageApprovalClose;
	
	@FindBy(xpath="//li[text()='DASHBOARD']")
	WebElement DashBoardSection;
	
	@FindBy(xpath="(//div[text()='Sick Days'])[1]")
	WebElement DashBoardManageApproval_WorkFlow;
	
	@FindBy(xpath="(//div[text()='Upload Your Photo ID'])[1]")
	WebElement DashBoardManageApproval_Task;
	
	
	@FindBy(xpath="//button[text()='Approve']")
	WebElement DashBoard_Approve_Task_WorkFlow;
	
	// Employee edit
	@FindBy(xpath="//button[@title='Profile']")
	WebElement EmployeeProfile;
	
	@FindBy(xpath="//button[@title='Edit Profile']")
	WebElement EmployeeEdit;
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement EmployeeEditEnter;
	
	@FindBy(xpath="//button[@title='Save Profile']")
	WebElement EmployeeEditSave;
	
	@FindBy(xpath="//input[@id='mat-input-18']")
	WebElement EmployeeEditedValue;
	
	@FindBy(xpath="(//div[text()=' Employee Profile '])[2]")
	WebElement EmployeeEditedMakeSure;
	
	// Workflow Edit
	
	@FindBy(xpath="//a[text()='VIEW PROFILE']")
	WebElement DependentProfile;
	
	@FindBy(xpath="//button[@title='Edit Profile']")
	WebElement DependentEdit;
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement DependentEditEnter;
	
	@FindBy(xpath="//button[@title='Save Profile']")
	WebElement DependentEditSave;
	
	@FindBy(xpath="//input[@id='mat-input-5']")
	WebElement DependentEditedValue;
	
	@FindBy(xpath="(//div[text()=' Personal Details '])[2]")
	WebElement DependentEditedMakeSure;
	
	
// Add Service
	
	@FindBy(xpath="//button[@title='Services']")
	WebElement Employee_Service;
	
	@FindBy(xpath="//button[text()=' ADD SERVICE ']")
	WebElement Employee_Add_Service;
	
	@FindBy(xpath="//span[text()='Dental']")
	WebElement Employee_Dental;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement Employee_Service_Next;
	
	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement Employee_Category_Select;
	
	@FindBy(xpath="//mat-option[@id='mat-option-2']")
	WebElement Employee_Category_Option;
	

	
	@FindBy(xpath="//button[text()='Save']")
	WebElement Employee_Service_Save;
	
	@FindBy(xpath="//li[text()='Dental']")
	WebElement Employee_Service_MakeSure;
	
	//Generate Documents
	
	

	@FindBy(xpath="//button[@title='Documents']")
	WebElement Employee_Documents;
	
	@FindBy(xpath="//button[@title='GENERATE Documents']")
	WebElement Employee_GenerateDocument;
	
	@FindBy(xpath="//div[text()='AutomatedDocument']")
	WebElement Employee_DocumentSelect;
	
	@FindBy(xpath="//button[text()='Create Documents']")
	WebElement Employee_GenerateDocumentsFinal;
	
	@FindBy(xpath="//h5[text()='Success']")
	WebElement Employee_GenerateDocumentsMakeSure;
	
// Edit Service
	
	@FindBy(xpath="//button[@title='Edit services']")
	WebElement Employee_Service_Edit;
	
	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement Employee_Service_Category_Select;
	
	@FindBy(xpath="//span[text()=' No Coverage ']")
	WebElement Employee_Service_Category_NoCoverage;
	
	@FindBy(xpath="//button[@title='ADD TO CART']")
	WebElement Employee_Service_AddtoCart;
	
	@FindBy(xpath="//button[@title='CONFIRM']")
	WebElement Employee_Service_Confirm;
	
	@FindBy(xpath="//div[text()=' No Coverage ']")
	WebElement Employee_Service_Edit_MakeSure;
	
	
	// Add note
	@FindBy(xpath="//button[@title='Notes']")
	WebElement Employee_Notes;
	
	@FindBy(xpath="//button[@title='Add New Note']")
	WebElement Employee_Add_Note;
	
	@FindBy(xpath="//input[@placeholder='Subject']")
	WebElement Employee_Subject;
	
	@FindBy(xpath="//div[@class='mat-select-value']")
	WebElement Employee_Note_Category_Select;
	
	@FindBy(xpath="//span[@class='mat-option-text' and contains(text(),'HR')]")
	WebElement Employee_Note_Category_Option;
	
	@FindBy(xpath="//textarea[@placeholder='Note (Up to 2000 Characters)']")
	WebElement Employee_Note_Add;
	
	@FindBy(xpath="//button[@mattooltip='SAVE']")
	WebElement Employee_Note_Save;
	
	@FindBy(xpath="//mat-cell[text()=' hi ']")
	WebElement AddNote_Subject;
	
	//Edit Column
	
	@FindBy(xpath="//button[@title='Edit Column']")
	WebElement EditColumn;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement EditColumnSearch;
	
    @FindBy(xpath="//button[@type='button']")
	WebElement EditColumnSave;
    
    @FindBy(xpath="//mat-cell[text()=' January 1, 2019 ']")
   	WebElement EmployeeHiredDateDirectory;
       
	//Upload Document
    
    @FindBy(xpath="//button[text()=' UPLOAD FILE ']")
	WebElement Employee_UploadDocument;
	
	@FindBy(xpath="//div[@class='dnd-area']")
	WebElement Employee_DocumentLocation;
	
    @FindBy(xpath="//input[@id='mat-input-0']")
	WebElement Employee_DocumentFileName;
    
    @FindBy(xpath="//input[@id='mat-input-1']")
   	WebElement Employee_DocumentDescription;
    
    @FindBy(xpath="//mat-select[@id='mat-select-1']")
	WebElement Employee_DocumentCategorySelect;
	
	@FindBy(xpath="//span[text()=' Automation ']")
	WebElement Employee_DocumentCategoryOption;
	
    @FindBy(xpath="//button[text()='Upload & Quit']")
	WebElement Employee_Upload_Quit;
   
    
    

	//Initializing the Page Objects:
	public Employees(){
		PageFactory.initElements(driver, this);
	}
	
	public Employees ComeToEmployeeSection() {
		EmployeeSection.click();
		return new Employees();
	}
	
	public void AddNewEmployee(String FirstName,String LastName,String JobTitle, String ManagerName,String HiredDate,String AnnualPay) throws InterruptedException, IOException{
		Thread.sleep(3000);
		AddEmployee.click();
		EmployeeFirstName.sendKeys(FirstName);
		Thread.sleep(1000);
		EmployeeLastName.sendKeys(LastName);
		Thread.sleep(1000);
		EmployeeJobTitle.sendKeys(JobTitle);
		EmployeeManagerName.sendKeys(ManagerName);
		EmployeeHiredDate.sendKeys(HiredDate);
		EmployeeAnnualPay.sendKeys(AnnualPay);
	
		EmployeeSave.click();
		Thread.sleep(2000);
		QuickSearchEnter.sendKeys("Lord");
		Thread.sleep(2000);
		QuickSearchClick.click();
		
		Thread.sleep(2000);
		
		EmployeeSearchClick.click();
		
		//return EmployeeSearchClick1.isSelected();
			
	}
	
	 
	
	     public void selectQuery() throws SQLException, ClassNotFoundException { 
	 String dbURL = "jdbc:sqlserver://WSFCNode2.ads.bossc.ca,4433/POCV3_22";
	 String username = "Arpan";
	        String password = "123";
	        //Load MS SQL JDBC Driver
	        Class.forName("net.sourceforge.jtds.jdbc.Driver");
	        //Creating connection to the database
	        Connection con = DriverManager.getConnection(dbURL,username,password);
	        //Creating statement object
	     Statement st = con.createStatement();
	     String selectquery = "select * from config.Formula";
	        //Executing the SQL Query and store the results in ResultSet
	     ResultSet rs = st.executeQuery(selectquery);
	     //While loop to iterate through all data and print results
	     while (rs.next()) {
	     System.out.println(rs.getString("FormulaName"));
	     }
	        //Closing DB Connection
	     con.close();
	 }

	  
	 
	
	
	
	
	
 public void AddNewDependent() throws InterruptedException{
		
	    QuickSearchEnter.sendKeys("Lord");
	    Thread.sleep(5000);
	    QuickSearchClick.click();
	    EmployeeSearchClick.click();
	    Thread.sleep(2000);
		Employee_Family.click();
		Thread.sleep(4000);
		AddNewPerson.click();
	    Thread.sleep(2000);
		Dependent.click();
	
		DepFirstName.sendKeys("CristianoDep");
		DepLastName.sendKeys("RonaldoJr");
		DepDOB.sendKeys("01/01/1990");
        DepGenderSelect.click();
		DepGenderOption.click();
		DepRelationToEmployeeSelect.click();
		DepRelationToEmployeeOption.click();
		DepLanguageSelect.click();
		DepLanguageOption.click();
		DepSave.click();
		Thread.sleep(2000);
		DepSaveId.click();
		
		
			
	}

  public void AddNewBeneficiary() throws InterruptedException{
	
    QuickSearchEnter.sendKeys("Lord");
    Thread.sleep(5000);
    QuickSearchClick.click();
    EmployeeSearchClick.click();
    Thread.sleep(2000);
	Employee_Family.click();
	Thread.sleep(4000);
	AddNewPerson.click();
    Thread.sleep(2000);
	Beneficiary.click();

	DepFirstName.sendKeys("CristianoBen");
	DepLastName.sendKeys("RonaldoJr");
	DepDOB.sendKeys("01/01/1990");
    DepGenderSelect.click();
	DepGenderOption.click();
	DepRelationToEmployeeSelect.click();
	DepRelationToEmployeeOption.click();
	DepLanguageSelect.click();
	DepLanguageOption.click();
	DepSave.click();
	
	
	
		
}




public void AssignWorkFlow() throws InterruptedException{
	
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(3000);
	ButtonWorkFlow.click();
	ButtonAssignWorkFlow.click();
	Thread.sleep(1000);
	AssignWorkFlowSelect.click();
	Thread.sleep(2000);
	AssignWorkFlowOption.click();
	WorkFlowEndDate.sendKeys("01/12/2019");
	WorkFlowStartDate.sendKeys("01/01/2019");
    WorkFlowAssignMakeSure.click();
	ClickAssignTask_WorkFlow.click();
	Thread.sleep(2000);
	VerifyAssignTask_WorkFlow.click();
	
	
	
	

		
}


	 public void Run_Approve_WorkFlow() throws InterruptedException{
	
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(2000);
	ButtonWorkFlow.click();
	RunTask_WorkFlow.click();
	WorkFlowRequestStartDate.sendKeys("07/02/2019");
	WorkFlowRequestEndDate.sendKeys("06/03/2019");
	WorkFlowRunMakeSure.click();
	WorkFlowRunNext.click();
	RunDone.click();
	Thread.sleep(2000);
	EmployeeDashBoard.click();
	EmployeeManageApproval.click();
	Thread.sleep(2000);
	ManageApprovalClose.click();
	DashBoardSection.click();
	DashBoardManageApproval_WorkFlow.click();
	Thread.sleep(2000);
	DashBoard_Approve_Task_WorkFlow.click();
	Thread.sleep(2000);
	DashBoardSection.click();
	
	
	}



	 
public void AssignTask() throws InterruptedException{
	
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(3000);
	ButtonTask.click();
	Thread.sleep(2000);
	ButtonAssignTask.click();
	Thread.sleep(1000);
	AssignTaskSelect.click();
	Thread.sleep(2000);
	AssignTaskOption.click();
	TaskDueDate.sendKeys("01/12/2019");
	TaskAssignMakeSure.click();
	ClickAssignTask_WorkFlow.click();
	Thread.sleep(2000);
	VerifyAssignTask_WorkFlow.click();
	
	
	}

	

public void Run_Approve_Task() throws InterruptedException{
	
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(3000);
	ButtonTask.click();

	RunTask_WorkFlow.click();
	Task_UploadID.sendKeys("C:\\Users\\apatel\\Pictures\\Saved Pictures\\download.jpg");
	RunDone.click();
	RunDone.click();
	Thread.sleep(2000);
	EmployeeDashBoard.click();
	EmployeeManageApproval.click();
	Thread.sleep(2000);
	ManageApprovalClose.click();
	DashBoardSection.click();
	DashBoardManageApproval_Task.click();
	Thread.sleep(2000);
	DashBoard_Approve_Task_WorkFlow.click();
	Thread.sleep(2000);
	DashBoardSection.click();
	
	
	}



public String Employee_Edit() throws InterruptedException{

	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(2000);
	EmployeeProfile.click();
	EmployeeEdit.click();
	EmployeeEditEnter.clear();
	EmployeeEditEnter.sendKeys("LordPrabhu");
	EmployeeEditedMakeSure.click();
	
	EmployeeEditSave.click();
    Thread.sleep(2000);
	return EmployeeEditedValue.getAttribute("ng-reflect-model");
	
	
}


	

public String Dependent_Edit() throws InterruptedException{

	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(2000);
	Employee_Family.click();
	DependentProfile.click();
    DependentEdit.click();
    DependentEditEnter.clear();
	DependentEditEnter.sendKeys("Edited");
	DependentEditedMakeSure.click();
	DependentEditSave.click();
    Thread.sleep(2000);
	return DependentEditedValue.getAttribute("ng-reflect-model");
	
	
}



public void Add_Service() throws InterruptedException{
	
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(2000);
	Employee_Service.click();
	Employee_Add_Service.click();
	Employee_Dental.click();
	Employee_Service_Next.click();
	Employee_Category_Select.click();
	Employee_Category_Option.click();
	Employee_Service_Next.click();
	Employee_Service_Save.click();
	Thread.sleep(1000);
	Employee_Service_MakeSure.click();
	
	
	
	
}


public boolean Upload_Document() throws InterruptedException{
	
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(2000);
	Employee_Documents.click();
	Employee_UploadDocument.click();
	Employee_DocumentLocation.click();//sendKeys("C:\\Users\\apatel\\Pictures\\Saved Pictures\\download.jpg");
	Employee_DocumentFileName.sendKeys("Automation");
	Employee_DocumentDescription.sendKeys("Automation");
	Employee_DocumentCategorySelect.click();
	Employee_DocumentCategoryOption.click();
	Employee_Upload_Quit.click();
	Thread.sleep(5000);
	return Employee_GenerateDocumentsMakeSure.isDisplayed();


}


public boolean Generate_Document() throws InterruptedException{
	
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(2000);
	Employee_Documents.click();
	Employee_GenerateDocument.click();
	Employee_DocumentSelect.click();
	Employee_GenerateDocumentsFinal.click();
	Thread.sleep(5000);
	return Employee_GenerateDocumentsMakeSure.isDisplayed();


}



public boolean Edit_Service() throws InterruptedException{

QuickSearchEnter.sendKeys("Lord");
Thread.sleep(5000);
QuickSearchClick.click();
EmployeeSearchClick.click();
Thread.sleep(2000);
Employee_Service.click();
Employee_Service_MakeSure.click();
Employee_Service_Edit.click();
Employee_Service_Category_Select.click();
Employee_Service_Category_NoCoverage.click();
Thread.sleep(2000);
Employee_Service_AddtoCart.click();
Employee_Service_Confirm.click();
return Employee_Service_Edit_MakeSure.isDisplayed();






}





public String Add_Note() throws InterruptedException{
	
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();
	EmployeeSearchClick.click();
	Thread.sleep(3000);
	Employee_Notes.click();
	Employee_Add_Note.click();
	Employee_Subject.sendKeys("hi");
	Thread.sleep(2000);
	Employee_Note_Category_Select.click();
	Employee_Note_Category_Option.click();
	Thread.sleep(2000);
    Employee_Note_Add.sendKeys("Hello");
	Employee_Note_Save.click();
	Thread.sleep(1000);
	return AddNote_Subject.getText();

	
	
}




public String Edit_Column()throws InterruptedException{
	QuickSearchEnter.sendKeys("Lord");
	Thread.sleep(5000);
	QuickSearchClick.click();

	Thread.sleep(2000);
	EditColumn.click();
	EditColumnSearch.sendKeys("Hired Date");
	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//span[text()='Hired Date']"))).moveToElement(driver.findElement(By.xpath("//div[@class='columns-container']"))).release().build().perform();
	EditColumnSave.click();
	return EmployeeHiredDateDirectory.getText();
	
	
	
	
	
	
	
	
}



}


