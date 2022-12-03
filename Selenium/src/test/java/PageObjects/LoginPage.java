package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	public static WebElement userName(WebDriver driver) {
		
		return driver.findElement(By.xpath("//input[@name='username']"));
	}
	
	
	public static WebElement passWord(WebDriver driver) {
		
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	
	public static WebElement loginButton(WebDriver driver) {
		
		return driver.findElement(By.xpath("//button[text()=' Login ']"));
	}

}
