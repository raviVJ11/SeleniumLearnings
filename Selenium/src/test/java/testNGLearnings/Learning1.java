package testNGLearnings;

import org.testng.annotations.Test;

public class Learning1 {
	
	//@Test used to make a method testcase
	//priority attribute used to set order in execution
	//enabled attribute used to skip the test
	
	@Test(priority=0)
	void firstMethod() {
		
		System.out.println("First method to be executed");
	}
	@Test(priority=1)
	void secondMethod() {
		
		System.out.println("Second method to be executed");
	}
	@Test(priority=2)
	void thirdMethod() {
		
		System.out.println("Third method to be executed");
	}
	@Test(priority=3,enabled=false)
	void fourthMethod() {
		
		System.out.println("Fourth method to be executed");
	}

}
