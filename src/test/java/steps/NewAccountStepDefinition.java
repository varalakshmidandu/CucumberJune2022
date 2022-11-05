package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AccountPage;
import pages.BankandCashNewAccount;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestBase;

public class NewAccountStepDefinition extends TestBase {

	LoginPage loginpage;
	DashboardPage dashboardpage;
	BankandCashNewAccount bankcashpage;
	AccountPage accountpage;
	
	@Before
	public void setUp() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		dashboardpage=PageFactory.initElements(driver,DashboardPage.class);
		bankcashpage=PageFactory.initElements(driver,BankandCashNewAccount.class);
		accountpage=PageFactory.initElements(driver,AccountPage.class);
	}

	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=login/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginpage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginpage.enterPassword(password);
	}

	@When("^User click on signin button$")
	public void user_click_on_signin_button() {
		loginpage.clickSignInButton();
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals("page not found!", expectedTitle, actualTitle);

	}

	@Then("^User click on bank and cash button$")
	public void user_click_on_bank_and_cash_button() {
		
		dashboardpage.clickBankandCash();
	}

	@Then("^User click on new account button$")
	public void user_click_on_new_account_button() {
		dashboardpage.clickNewAccount();
	}

	@Then("^User enters account title \"([^\"]*)\"$")
	public void user_enters_account_title(String accountTitle) {
		bankcashpage.enterAccountTitle(accountTitle + generateRandomNum(9999));
	}

	@Then("^User enters description \"([^\"]*)\"$")
	public void user_enters_description(String description) {
		bankcashpage.enterDescription(description);
	}

	@Then("^User enters initialBalance \"([^\"]*)\"$")
	public void user_enters_initialBalance(String initialBalance) {
		bankcashpage.enterBalance(initialBalance);
	}

	@Then("^User enters accountNumber \"([^\"]*)\"$")
	public void user_enters_accountNumber(String accountNumber) {
		bankcashpage.enterAccountNumber(accountNumber + generateRandomNum(9999));
	}

	@Then("^User enters contactPerson \"([^\"]*)\"$")
	public void user_enters_contactPerson(String contactPerson) {
		bankcashpage.enterContactPerson(contactPerson);
	}

	@Then("^User enters phone \"([^\"]*)\"$")
	public void user_enters_phone(String phone) {
		bankcashpage.enterPhone(phone);
	}

	@Then("^User enters internetBankingURL \"([^\"]*)\"$")
	public void user_enters_internetBankingURL(String bankURL) {
		bankcashpage.enterBankURL(bankURL);
	}

	@Then("^User click on submit button$")
	public void user_click_on_submit_button() {
		bankcashpage.clickSubmitButton();
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() {
		accountpage.getAccountHeader();
	}
//	 @After
//	 public void tearDown() {
//	 driver.close();
//	 //driver.quit();
//}

}
