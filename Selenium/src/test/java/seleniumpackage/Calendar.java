package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']")).click();
		
		//String text = driver.findElement(By.xpath("//th[@class='datepicker-switch'][1]")).getText();
		
		//System.out.println(text);
		
		while(true) {
			
			String text = driver.findElement(By.xpath("//th[@class='datepicker-switch'][1]")).getText();
			if(text.equals("March 2022")) {
				
				driver.findElement(By.xpath("//td[text()='1']")).click();
			}
			else {
				
				driver.findElement(By.xpath("//th[@class='prev'][1]")).click();	
			}
		}
		

		
		

	}

}
