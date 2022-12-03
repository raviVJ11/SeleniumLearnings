package testNGLearnings;

import org.testng.annotations.Test;

public class HandlingDependancies {
	
	@Test(enabled=true)
	public void highSchool() {
		
		System.out.println("Completed High School");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecSchool() {
		
		System.out.println("Completed Higher sec School");
	}
	@Test(dependsOnMethods="higherSecSchool")
	public void engineering() {
		
		System.out.println("Completed Engineering");
	}
	
	

}
