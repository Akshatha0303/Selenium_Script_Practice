package sep7;

import org.testng.annotations.Test;

public class sepFirst {
@Test(priority=1)
	void openapp()
	{
		System.out.println("application opened");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout");
	}
	
	
}
