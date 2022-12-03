package testNGLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	String [][] data = { {"Admin1","admin1234"},
	{"Admin","admin1234"},
	{"Admin1","admin123"},
	{"Admin","admin123"}
	};
	
    @DataProvider(name="LoginData")
	public String[][] dataProvider() {
		return data;
	}
	
	@Test(dataProvider="LoginData")
	public void login(String username,String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		}

}
