package pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	// WebDriver is an interface
		public static WebDriver driver;
		
		
		public static void initDriver() {
		
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\dandu\\Selenium\\Cucumber\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 
		}
		
		public int generateRandomNum(int boundaryNum) {
			Random rnd = new Random();
			int generatedNum = rnd.nextInt(boundaryNum);
			return generatedNum;
		}
}
