package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/table.xhtml");
		
		driver.manage().window().maximize();

		List<WebElement> header = driver.findElements(By.xpath("//thead[@id='form:j_idt89_head']/child::tr/child::th"));
		
		int totalheader = header.size();
		
		System.out.println(totalheader);
		
		for (WebElement printheader : header) {
			
			System.out.print(printheader.getText()+" ");
		}
		
		System.out.println();
		
		List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/child::tr"));
		
		int rowcount = rows.size();
		
		//System.out.println(rowcount);
		
		for(int i=1;i<=rowcount;i++) {
			
			for (int j=1;j<=totalheader;j++) {
				
				System.out.print(driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']/child::tr["+i+"]/child::td["+j+"]")).getText()+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
