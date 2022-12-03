package testNGLearnings;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
	@Parameters("Name")
	public void printname(String name) {
		
		System.out.println("The Name is: "+ name);
	}

}
