package grouping_Demo;

import org.testng.annotations.Test;

public class Payments {
	@Test(priority=1, groups= {"Regression"})
	public void paymentInRupees()
	{
		System.out.println("payment done in rupees");
	}
	@Test(priority=1,groups= {"Regression"})
	public void paymentInDollar()
	{
		System.out.println("payment done in dollar");
	}

}
