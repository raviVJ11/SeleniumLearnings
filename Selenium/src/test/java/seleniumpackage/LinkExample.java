package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/link.xhtml");
		
		driver.manage().window().maximize();
		
		//List<WebElement> links = driver.findElements(By.xpath(xpathExpression))
		
		driver.findElement(By.linkText("Broken?")).click();
		
	    String ttl =driver.getTitle();
	    
	    if(ttl.contains("404")) {
	    	
	    	System.out.println("Page is broken");
	    }
	    
	    driver.navigate().back();
		

	}

}
