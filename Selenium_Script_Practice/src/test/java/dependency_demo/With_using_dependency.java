package dependency_demo;
import org.testng.Assert;
import org.testng.annotations.Test;
public class With_using_dependency {

	@Test(priority=1)
		public void openapp()
		{
			Assert.assertTrue(true);
		}
	@Test(priority=2, dependsOnMethods= {"openapp"})
	public void login()
	{
		Assert.assertTrue(false);
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	public void search()
	{
		
	}
	@Test(priority=4,dependsOnMethods= {"login","search"})
	public void advancedsearch()
	{
		
	}
	@Test(priority=5,dependsOnMethods= {"login"})
	public void logout()
	{
		
	}
	}
