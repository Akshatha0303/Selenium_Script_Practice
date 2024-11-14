package sep8_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	@Test
	public void testTitle()
	{
		String exp_title="Openshop";
		String act_title="Opencart";
		
		
		if(exp_title.equals(act_title))
		{
			Assert.assertTrue(true);
			System.out.println("title eqaul");
		}
			
		else
			Assert.assertTrue(false);
			System.out.println("title failed");
			
		//Assert.assertEquals(exp_title, act_title);
	}
}
