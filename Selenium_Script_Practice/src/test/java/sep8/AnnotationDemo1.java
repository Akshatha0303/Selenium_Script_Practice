

/*login
 * search
 * logout
 * advanced search
 * logout
 */




package sep8;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo1 {

	@BeforeMethod
	public void login()
	{
		System.out.println("login to app");
		}
	
	@Test(priority=-1)
	public void search()
	{
		System.out.println("searching");
	}
	
	@Test(priority=0)
	public void advancedsearch() {
		System.out.println("Advanced searching");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout from app");
	}
}
