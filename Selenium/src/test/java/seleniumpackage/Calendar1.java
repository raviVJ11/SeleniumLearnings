package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.expedia.ca/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		
		//String text = driver.findElement(By.xpath("//div[@class='uitk-date-picker-month']/child::h2[1]")).getText();
		
		while(true) {
			
			String text = driver.findElement(By.xpath("//div[@class='uitk-date-picker-month']/child::h2[1]")).getText();
			
			if(text.equals("February 2024")) {
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='uitk-date-picker-day' and @data-day='4']")).click();
				break;
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@data-stid='date-picker-paging'][2]")).click();
			}
		}

	}

}
