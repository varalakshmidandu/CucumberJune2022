package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}
//	@FindBy(how = How.XPATH, using = "//*[text()='Bank & Cash']")
//	WebElement BankandCash;
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Bank & Cash')]")WebElement BankandCash;
	@FindBy(how = How.XPATH, using = "//*[text()='New Account']")
	WebElement NewAccount;
	
	public void clickBankandCash() {
		BankandCash.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}		
		public void clickNewAccount() {
			NewAccount.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
}
