package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.*;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		PageObjects.LoginPage.userName(driver).sendKeys("Admin");
		PageObjects.LoginPage.passWord(driver).sendKeys("admin123");
		PageObjects.LoginPage.loginButton(driver).click();
		
		
	}

}
