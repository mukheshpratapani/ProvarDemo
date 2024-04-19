package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class MyPageObject {

public WebDriver driver;
	public MyPageObject(WebDriver driver)
	{
	this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='New']")
	public WebElement new_;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@TextType()
	@FindBy(xpath = "//input[@type='search' and @placeholder='Search apps and items...']")
	public WebElement searchAppsAndItems;
	@LinkType()
	@FindBy(xpath = "//a[@id='Lead']")
	public WebElement Lead;
	@LinkType()
	@FindBy(xpath = "//a[@id='Contact']")
	public WebElement contact;
	
	@TextType()
	@FindBy(xpath = "//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']//input")
	public WebElement address;
	@TextType()
	@FindBy(xpath = "//span[@class='slds-listbox__option-text slds-listbox__option-text_entity']")
	public WebElement addressClick;
	@TextType()
	@FindBy(xpath = "//div[@class='slds-grid slds-size_1-of-1 label-stacked undo']//input[@name='lastName']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//div/input[@name='Company']")
	public WebElement companyName;
	@ButtonType()
	@FindBy(xpath = "//button[@class='slds-button slds-button_brand']")
	public WebElement leadSave;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
	public WebElement accounts;
	@LinkType()
	@FindBy(xpath = "//button[@title='Select a List View: Accounts']")
	public WebElement listViewClick;
	@LinkType()
	@FindBy(xpath = "//span[text()='All Accounts']")
	public WebElement allAccounts;
	
	
	@PageRow()
    public static class AccountLineItems {
	@TextType()
	@FindBy(xpath = ".//th[1]//a")
	public WebElement accountName;
     }
    @FindBy(xpath = "//table[@aria-label='All Accounts']//tbody/tr")
    @PageTable(firstRowContainsHeaders = false, row = AccountLineItems.class)
    public List<AccountLineItems> accountLineItems;
    
    
    @TextType()
	@FindBy(xpath = "//input[@class='slds-combobox__input slds-input slds-combobox__input-value']")
	public WebElement searchAll;
	@LinkType()
	@FindBy(xpath = "//ul[@aria-label='Suggested For You']/li[@class='slds-listbox__item']//span[text()='Accounts']")
	public WebElement accountsClick;
	@TextType()
	@FindBy(xpath = "//input[@type='search' and @class='slds-input']")
	public WebElement searchTextBox;
	@TextType()
	@FindBy(xpath = "//div[@tabindex = '-1']/div[@class='slds-truncate instant-result-item__content']/span[@class='slds-text-body--regular slds-text-color--default slds-truncate slds-show']]")
	public WebElement searchResult;
	@TextType()
	@FindBy(xpath = "//div[@class='slds-truncate instant-result-item__content']/span[@class='slds-text-body--regular slds-text-color--default slds-truncate slds-show']]")
	public WebElement searchResultClick;
	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='Resource']/div/span[@class='slds-radio--faux']")
	public WebElement RecordType;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='salutation' and @role='combobox']")
	public WebElement RecordNameField2_Salutation;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='EMS_Phone_Number__c']")
	public WebElement RecordEMS_Phone_Number_cField2;


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
	@FindBy(xpath = "//a[.=\"Performance Management\"]")
	public WebElement performanceManagement;
	@LinkType()
	@FindBy(xpath = "//li[@title='My Metrics']")
	public WebElement myMetricsTab;
	
	
	
	
	
	
	
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
			
}
