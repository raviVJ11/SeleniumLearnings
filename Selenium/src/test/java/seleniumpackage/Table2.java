package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int rows = driver.findElements(By.xpath("//div[@class='oxd-table-card']")).size();
		
		System.out.println(rows);
		
		int column = driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']/child::div[@role='columnheader']")).size();
		
		System.out.println(column);
		
		int totalenabledUsers=0;
		int totaldisabledUsers=0;
		
		for (int i=1; i<=rows;i++) {
			
		String status =driver.findElement(By.xpath("//div[@class='oxd-table-card']["+i+"]/child::div/child::div[5]")).getText();
		
		if(status.equals("Enabled")) {
			totalenabledUsers++;
			}
		else {
			totaldisabledUsers++;
		}
		}
		
		System.out.println("Total Number of Enabled Users: "+totalenabledUsers);
		System.out.println("Total Number of Disabled Users: "+totaldisabledUsers);
		
		
		
		//System.out.println(driver.findElement(By.xpath("//div[@class='oxd-table-card'][1]/child::div/child::div[5]")).getText());

	}

}
