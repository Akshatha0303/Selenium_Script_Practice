package sep8_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
@Test
	public void test1()
	{
		//Assert.assertEquals("abc", "abc");//pass
		//Assert.assertEquals("abc", "abce");//fail
		//Assert.assertEquals(123, "abc"); // fail cant compare diff data types
		//Assert.assertTrue(true);//pass
		//Assert.assertTrue(1==1);//pass
	//Assert.assertTrue(false);//fail
	//Assert.assertTrue(1==0);//fails
	//Assert.assertFalse(false);//pass
	//Assert.assertFalse(1==0);//pass
		//Assert.assertNotEquals(12, 1, 0);//pass
	//Assert.assertNotEquals(1,1);//fail
		//Assert.fail();//it fails the test
	}


}

