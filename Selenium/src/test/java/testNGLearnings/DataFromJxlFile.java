package testNGLearnings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataFromJxlFile {
	
	String [][] data = null;
	
	WebDriver driver;
	@DataProvider(name="Login")
	public String[][] dataprovider() throws BiffException, IOException{
		
		data=(String[][]) getJxlData();
		return data;
		
	}
	
	public Object[][] getJxlData() throws BiffException, IOException{
		
		FileInputStream excel = new FileInputStream("C:\\Users\\raviv\\Documents\\LoginData.xls");
		
		Workbook workbook = Workbook.getWorkbook(excel);
		
		Sheet sheet = workbook.getSheet(0);
		
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		
		String [][] storedData = new String[rowCount-1][columnCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				storedData[i-1][j]= sheet.getCell(j, i).getContents();
			}}
		return storedData;
		}
         @BeforeTest
        public void beforeTest() {
        	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    		driver = new ChromeDriver();
 }
         @Test(dataProvider="Login")
         public void Login(String username,String password) throws InterruptedException {
        	 
        	 
        	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     		
     		Thread.sleep(2000);
     		
     		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
     		
     		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
     		
     		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        	  }
}
