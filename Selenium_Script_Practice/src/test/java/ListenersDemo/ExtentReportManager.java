package ListenersDemo;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	 public ExtentSparkReporter sparkReporter; //UI of the report
	 public ExtentReports extent; //populate common info on the report
	 public ExtentTest test; //creating test case entries in the report and update status of the test methods.
	 
	 public void onStart(ITestContext testContext)
	 {
	  sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReport.html");//specify location of the report
	  
	  sparkReporter.config().setDocumentTitle("Automation Report"); // Tile of report
	  sparkReporter.config().setReportName("Functional Testing"); // name of the report
	  sparkReporter.config().setTheme(Theme.DARK); //
	  
	  extent=new ExtentReports();
	  extent.attachReporter(sparkReporter);
	  
	  extent.setSystemInfo("Host name","localhost");
	  extent.setSystemInfo("Environemnt","QA");
	  extent.setSystemInfo("user","aksh");
	  extent.setSystemInfo("Browser","chrome");
	  extent.setSystemInfo("OS","windows10");

}
	 public void onTestSuccess(ITestResult result)
	 {
	  test=extent.createTest(result.getName()); // create new entry in e report
	  test.log(Status.PASS, "Test case passed is ;" +(result.getName())); // update the status p/f/s
	 }
	 
	 
	 public void onTestFailure(ITestResult result)
	 {
	  test=extent.createTest(result.getName()); // create new entry in e report
	  test.log(Status.FAIL, "Test case failed is ;" +(result.getName()));
	  test.log(Status.FAIL, "Test case failed cause is ;" +(result.getThrowable()));
	 }
	 
	 
	 public void onTestSkipped(ITestResult result)
	 {
	  test=extent.createTest(result.getName()); // create new entry in e report
	  test.log(Status.SKIP, "Test case skipped is ;" +(result.getName())); 
	 }
	 
	 public void onFinish(ITestContext testContext)
	 {
	  extent.flush();
	 }
}