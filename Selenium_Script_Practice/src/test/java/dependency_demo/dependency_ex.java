
//without using dependency
package dependency_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency_ex {
@Test(priority=1)
	public void openapp()
	{
		Assert.assertTrue(false);
	}
@Test(priority=2)
public void login()
{
	
}
@Test(priority=3)
public void search()
{
	
}
@Test(priority=4)
public void advancedsearch()
{
	
}
@Test(priority=5)
public void logout()
{
	
}
}
