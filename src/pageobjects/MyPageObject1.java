package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "MyPageObject1", summary = "", relativeUrl = "", connection = "GRID_QA")
public class MyPageObject1 {

	public static WebDriver driver;

	public MyPageObject1(WebDriver driver) {
		this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Search apps and items...']/following-sibling::div//input")
	public WebElement searchAppsAndItems;

	@LinkType()
	@FindBy(xpath = "//a[@id='Contact']")
	public WebElement contacts;

	@TextType()
	@FindBy(xpath = "//div[@class='slds-form-element__row']//div[normalize-space(text())='Complete this field.']")
	public WebElement lastNameValidation;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Help Work Experience']")
	public WebElement helpWorkExperience;

	@ButtonType()
	@FindBy(xpath = "//button[@title='Select a List View: Contacts']")
	public WebElement contactsAllListView;

	@LinkType()
	@FindBy(xpath = "(//span[text()='Active Resources'])[1]")
	public WebElement activeResources;

	@LinkType()
	@FindBy(xpath = "//a[@id='Resource_Role__c']")
	public WebElement resourceRoles;

	public String getRows() {
		List<WebElement> list = driver.findElements(By.xpath("//table[@aria-label='Recordtype']//tr"));
		return "" + list.size();
	}

	@PageRow()
	public static class Items {
		@TextType()
		@FindBy(xpath = ".//td[3]//span[@class='slds-truncate uiOutputText']")
		public WebElement Contact_RecordType;

		@TextType()
		@FindBy(xpath = ".//td[4]//span[@class='slds-truncate']")
		public WebElement Contact_Status;

		@BooleanType()
		@FindBy(xpath = ".//td[2]//input")
		public WebElement Contact_CheckBox;

	}

	@FindBy(xpath = "//table[@aria-label='Recordtype']//tr")
	@PageTable(firstRowContainsHeaders = true, row = Items.class)
	public List<Items> items;

	@PageRow()
	public static class Goals {
		@TextType()
		@FindBy(xpath = "//div[@class='slds-modal__content slds-p-around_medium']//td[1]//div")
		public WebElement Goal_Name;

		@TextType()
		@FindBy(xpath = "//div[@class='slds-modal__content slds-p-around_medium']//td[6]/div")
		public WebElement Goal_Status;

		@TextType()
		@FindBy(xpath = "//div[@class='slds-modal__content slds-p-around_medium']//td[8]//button[@title='Edit Goal']")
		public WebElement Goal_Edit;

	}

	@FindBy(xpath = "//div[@class='slds-modal__content slds-p-around_medium']//table[@class='slds-table_cell-buffer slds-no-row-hover slds-table_bordered fixed_header']//tr")
	@PageTable(firstRowContainsHeaders = true, row = Goals.class)
	public List<Goals> goals;

	@PageRow()
	public static class KRAs {
		@TextType()
		@FindBy(xpath = "//div[@class='contacttableFixHead']//td[1]//a")
		public WebElement KRA_Name;

		@TextType()
		@FindBy(xpath = "//div[@class='contacttableFixHead']//td[4]//div")
		public WebElement KRA_Status;

		@TextType()
		@FindBy(xpath = " //div[@class='contacttableFixHead']//td[8]//button[@title='Edit KRA']")
		public WebElement KRA_Edit;

	}

	@FindBy(xpath = "//div[@class='contacttableFixHead']//table[@class='slds-table_cell-buffer slds-no-row-hover slds-table_bordered fixed_header']//tr")
	@PageTable(firstRowContainsHeaders = true, row = KRAs.class)
	public List<KRAs> kRAs;

	// Method to scrolldown
	public void scrolltogodown() throws InterruptedException {

		// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
		// Thread.sleep(5000);
		// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
		// Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//table[@aria-label='Recordtype']/tbody//tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(5000);
	}

	// Community_Performance Management Module

	@LinkType()
	@FindBy(xpath = "(//div[@class='slds-form-element__control']/label/span[@class='slds-checkbox_faux_container'])[3]")
	public WebElement showAllKRA;

	@LinkType()
	@FindBy(xpath = "//a[@class='slds-container_fluid slds-truncate']/span[text()='Performance Management']")
	public WebElement performanceManagement;

	@ButtonType()
	@FindBy(xpath = "//button[@title='Create Goal']")
	public WebElement createGoal;

	@FindBy(xpath = "//input[@name='goalname']")
	public WebElement goalName;

	@TextType()
	@FindBy(xpath = "//input[@name='startdate']")
	public WebElement goalStartDate;

	@TextType()
	@FindBy(xpath = "//input[@name='enddate']")
	public WebElement goalEndDate;

	@ButtonType()
	@FindBy(xpath = "//button[@title='Create']")
	public WebElement btnCreateGoal;

	@TextType()
	@FindBy(xpath = "//div[@class='slds-rich-text-area__content slds-grow slds-text-color-weak standin']")
	public WebElement txtGoalDesc;
	
	@TextType()
	@FindBy(xpath = "(//div[@class='slds-rich-text-area__content slds-grow slds-text-color-weak standin'])[2]")
	public WebElement txtGoalFinalDesc;
	
	
	@ButtonType()
	@FindBy(xpath = "//button[@title='Cancel']")
	public WebElement goalCancel;
	

	@ButtonType()
	@FindBy(xpath = "//button[@title='View Goals']")
	public WebElement btnViewGoals;

	@TextType()
	@FindBy(xpath = "//span[text()='TECHNICAL ACUMEN']")
	public WebElement technicalAcumen;

	@TextType()
	@FindBy(xpath = "//input[@name='Documentation_Rating__c']")
	public WebElement doc_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Documentation_Example__c']")
	public WebElement doc_example;

	@TextType()
	@FindBy(xpath = "//input[@name='Estimations_Rating__c']")
	public WebElement esti_Rating;

	@TextType()
	@FindBy(xpath = "//input[@name='Defect_Management_Rating__c']")
	public WebElement defect_ating;

	@TextType()
	@FindBy(xpath = "//input[@name='Learning_and_Skill_Development_Rating__c']")
	public WebElement clsd_Rating;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Development_Rating__c']")
	public WebElement dev_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Development_Example__c']")
	public WebElement dev_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Testing_Rating__c']")
	public WebElement test_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Testing_Example__c']")
	public WebElement test_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Understanding_Code_Rating__c']")
	public WebElement uc_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Understanding_Code_Example__c']")
	public WebElement uc_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Platform_Knowledge_Rating__c']")
	public WebElement pk_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Platform_Knowledge_Example__c']")
	public WebElement pk_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Design_and_Architecture_Rating__c']")
	public WebElement da_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Design_and_Architecture_Example__c']")
	public WebElement da_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Continuous_Improvement_Rating__c']")
	public WebElement ci_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Continuous_Improvement_Example__c']")
	public WebElement ci_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Delivery_Accountability_Rating__c']")
	public WebElement delAcc_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Delivery_Accountability_Example__c']")
	public WebElement delAcc_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Effective_Communication_Rating__c']")
	public WebElement ec_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Effective_Communication_Example__c']")
	public WebElement ec_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Knowledge_Sharing_Rating__c']")
	public WebElement ks_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Knowledge_Sharing_Example__c']")
	public WebElement ks_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Teamwork_Rating__c']")
	public WebElement tw_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Teamwork_Example__c']")
	public WebElement tw_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Attitude_and_Behavior_Rating__c']")
	public WebElement ab_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Attitude_and_Behavior_Example__c']")
	public WebElement ab_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Business_Development_Rating__c']")
	public WebElement bd_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Business_Development_Example__c']")
	public WebElement bd_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Strategic_Work_Rating__c']")
	public WebElement sw_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Strategic_Work_Example__c']")
	public WebElement sw_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Company_Growth_Rating__c']")
	public WebElement cg_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Company_Growth_Example__c']")
	public WebElement cg_example;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Goal_Achievement_Rating__c']")
	public WebElement ga_Rating;
	
	@TextType()
	@FindBy(xpath = "//textarea[@name='Goal_Achievement_Example__c']")
	public WebElement ga_example;
	
	@ButtonType()
	@FindBy(xpath = "//button[text()='Next']")
	public WebElement nextBtn_Rating;
	
	@ButtonType()
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement saveBtn_Rating;
	
	@ButtonType()
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitBtn_Rating;
	
	
	

	@TextType()
	@FindBy(xpath = "//div[@role='textbox']")
	public WebElement Description_field;
	
	@ButtonType()
	@FindBy(xpath = "//button[@title='Save and Complete']")
	public WebElement goal_saveAndCompleteBtn;
	
	@ButtonType()
	@FindBy(xpath = "//button[@title='Close']")
	public WebElement goal_modalClose;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='User Detail']")
	public WebElement userDetail;
	
	@TextType()
	@FindBy(xpath = "//span[@class=' profileName']")
	public WebElement profilename;
	
	
	@PageFrame()
	public static class Frame {

		@ChoiceListType()
		@FindBy(xpath = "//select[@id='Profile']")
		public WebElement profile;
		@TextType()
		@FindBy(xpath = "//input[@id='Username']")
		public WebElement username;
		@TextType()
		@FindBy(xpath = "//input[@id='CommunityNickname']")
		public WebElement nickname;
		@ButtonType()
		@FindBy(xpath = "//td[@id='topButtonRow']/input[@name='save']")
		public WebElement save;
		@ButtonType()
		@FindBy(xpath = "//input[@id='simpleDialog0button0']")
		public WebElement oK;
		@TextType()
		@FindBy(xpath = "//td[text()='Username']//following-sibling::td[1]")
		public WebElement userNameValue;
		@LinkType()
		@FindBy(xpath = "//td[text()='Contact']//following-sibling::td/a")
		public WebElement contactLink;
		@TextType()
		@FindBy(xpath = "//td[text()='Nickname']//following-sibling::td[1]")
		public WebElement alias;
	}
	@FindBy(xpath = "//iframe")
	public Frame frame;
	
	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='Work Experience']/following-sibling::lightning-helptext//button")
	public WebElement workExperienceHelpInfo;

	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='New Resource Relationship']")
	public WebElement NRR;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Reviewer_Title__c']")
	public WebElement reviewerName;
	
	@LinkType()
	@FindBy(xpath = "//li[@title='My Metrics']")
	public WebElement myMetricsTab;
	
	@TextType()
	@FindBy(xpath = "//td[@data-label='Technical Acumen']/div")
	public WebElement technicalAcumen_AvgRating;
	
	@TextType()
	@FindBy(xpath = "//td[@data-label='Professional Skills']/div")
	public WebElement professionalSkills_AvgRating;
	
	@TextType()
	@FindBy(xpath = "//td[@data-label='Strategic Impact']/div")
	public WebElement strategicImpact_AvgRating;
	
	@TextType()
	@FindBy(xpath = "//td[@data-label='Goals & Results']/div")
	public WebElement goalResults_AvgRating;
	
	@TextType()
	@FindBy(xpath = "//td[@data-label='Overall Average Rating']/div")
	public WebElement overall_Rating;
	
	

}
