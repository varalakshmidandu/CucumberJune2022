package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankandCashNewAccount {

WebDriver driver;
	
	public  BankandCashNewAccount(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//ELEMENT LIBRARY
	@FindBy(how = How.XPATH, using = "//*[@id='account']")
	WebElement AccountTitle;
	
	@FindBy(how = How.XPATH, using = "//*[@id='description']")
	WebElement Description;
	
	@FindBy(how = How.XPATH, using = "//*[@id='balance']")
	WebElement balance;
	
	@FindBy(how = How.XPATH, using = "//*[@id='account_number']")
	WebElement AccountNumber;
	
	@FindBy(how = How.XPATH, using = "//*[@id='contact_person']")
	WebElement Contactperson;
	
	@FindBy(how = How.XPATH, using = "//*[@id='contact_phone']")
	WebElement contactphone;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ib_url']")
	WebElement BankURL;
	
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit']")
	WebElement SubmitButton;
	//CORRESPONDING METHODS
	public void enterAccountTitle(String accountTitle) {
		
		AccountTitle.sendKeys(accountTitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void enterDescription(String description) {
		
		Description.sendKeys(description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void enterBalance(String initialBalance) {
		
		balance.sendKeys(initialBalance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void enterAccountNumber(String accountNumber) {	
		AccountNumber.sendKeys(accountNumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void enterContactPerson(String contactPerson) {
		
		Contactperson.sendKeys(contactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void enterPhone(String phone) {
		
		contactphone.sendKeys(phone);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void enterBankURL(String bankURL) {
		
		BankURL.sendKeys(bankURL);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void clickSubmitButton() {
		SubmitButton.click();


	}
	
}
