package testNGLearnings;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test is going to be executed");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test is passed");
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test is Failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test is skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test pass %");
		
	}

	public void onStart(ITestContext context) {
		
		System.out.println("Starting notes");
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("Ending notes");
		
	}



}
