package grouping_Demo;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1, groups= {"sanity"})
	public void loginByEmail()
	{
		System.out.println("this is login by email");
	}

	@Test(priority=2, groups= {"sanity"})
	public void loginByFacebook()
	{
		System.out.println("this is login by Facebook");
	}

	@Test(priority=3, groups= {"sanity"})
	public void loginByTwitter()
	{
		System.out.println("this is login by twitter");
		
	}

}
