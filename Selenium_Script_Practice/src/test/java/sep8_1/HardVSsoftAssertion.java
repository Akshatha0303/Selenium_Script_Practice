package sep8_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVSsoftAssertion {

	@Test
	public void HardAssertion()
	{
		System.out.println("testing.");
		System.out.println("testing..");
		Assert.assertEquals(1, 2);
		System.out.println("testing....");
	}
	@Test
	public void SoftAssertion()
	{
		System.out.println("testing.");
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(1, 2);
		System.out.println("testing.........");
		sa.assertAll();//mandatory
	}
}
