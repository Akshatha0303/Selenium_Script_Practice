package grouping_Demo;

import org.testng.annotations.Test;

public class SignUp {

	@Test(priority=1,groups= {"sanity"})
	public void signUpByEmail()
	{
		System.out.println("this is signup by email");
	}

	@Test(priority=2,groups= {"sanity","regression"})
	public void signUpByFacebook()
	{
		System.out.println("this is signup by Facebook");
	}

	@Test(priority=3,groups={"sanity","regression"})
	public void SignUpByTwitter()
	{
		System.out.println("this is signup by twitter");
		
	}
}
