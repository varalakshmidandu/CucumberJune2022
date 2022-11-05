package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;
     
//	@FindBy(how = How.XPATH, using = "//*[text()='Bank & Cash']")
//	WebElement BankandCash;
//	
//	@FindBy(how = How.XPATH, using = "//*[text()='New Account']")
//	WebElement NewAccount;

//	@FindBy(how = How.XPATH, using = "//*[@id='account']")
//	WebElement AccountTitle;
//	
//	@FindBy(how = How.XPATH, using = "//*[@id='description']")
//	WebElement Description;
//	
//	@FindBy(how = How.XPATH, using = "//*[@id='balance']")
//	WebElement balance;
//	
//	@FindBy(how = How.XPATH, using = "//*[@id='account_number']")
//	WebElement AccountNumber;
//	
//	@FindBy(how = How.XPATH, using = "//*[@id='contact_person']")
//	WebElement Contactperson;
//	
//	@FindBy(how = How.XPATH, using = "//*[@id='contact_phone']")
//	WebElement contactphone;
//	
//	@FindBy(how = How.XPATH, using = "//*[@id='ib_url']")
//	WebElement BankURL;
//	
//	@FindBy(how = How.XPATH, using = "//button[text()=' Submit']")
//	WebElement SubmitButton;
//	

	//Methods to interact with the elements
	public void enterUserName(String useName) {
		
		UserName.sendKeys(useName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void enterPassword(String password) {
		
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void clickSignInButton() {
		SignInButton.click();


	}
	public String getPageTitle() {
		return driver.getTitle();
	}

}
