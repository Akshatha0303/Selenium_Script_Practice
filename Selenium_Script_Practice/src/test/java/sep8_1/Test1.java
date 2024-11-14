package sep8_1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeTest
	public void abc()
	{
		System.out.println("abc before test");
		}
	
	@Test
	public void efg()
	{
		System.out.println("");
	}
}
