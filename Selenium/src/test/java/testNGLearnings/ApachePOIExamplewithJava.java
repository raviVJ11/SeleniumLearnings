package testNGLearnings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApachePOIExamplewithJava {
	
	List<String> username = new ArrayList<String>();
	List<String> password = new ArrayList<String>();
	
	public void Login(String username,String password) throws InterruptedException {
   	 
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   	 
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		
 		Thread.sleep(2000);
 		
 		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
 		
 		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
 		
 		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    	  }
	
	public void readExcel() throws IOException {
		
		FileInputStream excel = new FileInputStream("C:\\Users\\raviv\\Documents\\LoginData1.xlsx");
		 
		Workbook workbook = new XSSFWorkbook(excel);
		
		Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.iterator();
		
		while(rowIterator.hasNext()) {
			
		Row rowValue =	rowIterator.next();
		
		Iterator<Cell> columnValue = rowValue.iterator();
		
		int i =2;
		
		while(columnValue.hasNext()) {
			
			if(i%2==0) {
			username.add(columnValue.next().getStringCellValue());
		               }
			else {
			password.add(columnValue.next().getStringCellValue());	
			     }
			i++;
		}
	}
}
	
	public void execute() throws InterruptedException {
		
		for(int i =0;i<password.size();i++) {
			
			Login(username.get(i),password.get(i));
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ApachePOIExamplewithJava obj = new ApachePOIExamplewithJava();
		
		obj.readExcel();
		
		System.out.println(obj.username.size());
		System.out.println(obj.password.size());

		obj.execute();
	}

}
