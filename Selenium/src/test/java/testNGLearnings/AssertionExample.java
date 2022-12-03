package testNGLearnings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String value = "NotePad";
	
	@Test
  public void condtionCheck() {
		
/*		if(value.equals("NotePad")) {
			
		}
		
		else {
			
		}*/
	
	Assert.assertEquals(value, "NotePad");
	Assert.assertFalse(false, "This is a executable statement with correct logic");
	Assert.assertTrue(true, "This is a executable statement with correct logic");
	} 

      
}
