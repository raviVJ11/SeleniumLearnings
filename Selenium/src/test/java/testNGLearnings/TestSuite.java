package testNGLearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {
	
	
	Long startTime;
	Long endTime;
	Long totalTime;
	WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
		
		startTime = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	@Test
	public void openGoogle() {
		
		driver.get("https://www.google.co.in/webhp");
	}
	@Test
	public void openYahoo() {
		
		driver.get("https://in.search.yahoo.com/;_ylt=AwrPpQ_BXGdjcNIiWl67HAx.;_ylu=Y29sbwNzZzMEcG9zAzEEdnRpZAMEc2VjA3Ny?fr=mcafee");
	}
	@Test
	public void openBing() {
		
		driver.get("https://www.bing.com/?cc=in");
	}
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
		
		endTime = System.currentTimeMillis();
		totalTime = endTime-startTime;
		System.out.println(endTime);
	}

}
