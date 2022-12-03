package testNGLearnings;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"Bikes"})
	public void yamaha() {
		
		System.out.println("Yamaha");
	}
	@Test(groups= {"Bikes"})
	public void enfield() {
		
		System.out.println("Enfield");
	}
	@Test(groups= {"Cars"})
	public void benz() {
		
		System.out.println("Benz");
	}
	@Test(groups= {"Cars"})
	public void kia() {
		
		System.out.println("Kia");
	}
	@Test(groups= {"Bicycle"})
	public void hero() {
		
		System.out.println("Hero");
	}
}
