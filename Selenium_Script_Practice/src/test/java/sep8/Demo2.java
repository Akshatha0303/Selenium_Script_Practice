
/*login
 * search
 * advanced search
 * logout
 */

package sep8;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
@BeforeTest
	public void login()
	{
		System.out.println("logged in");
	}
	@Test(priority=1)
	public void search()
	{
		System.out.println(" search item");
	}
	@Test(priority=2)
	public void advancedsearch() {
		System.out.println("advanced searching");
		
	}
	@AfterTest
	public void logout()
	{
		System.out.println("loged out from app");
	}
	
}

