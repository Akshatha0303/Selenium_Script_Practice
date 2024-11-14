package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	
	 public void onStart(ITestContext context) {
		 System.out.println("Test execution is started....");
		   
		  }
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test started....");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success....");
	  }
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed....");
	  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped....");
	  }
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test ....");
		  }
	public void onFinish(ITestContext context) {
		System.out.println("Test execution Finished....");
	  }
	

}
