package sep8_1;

import org.testng.annotations.*;

public class AllAnnotations {
@BeforeSuite
	public void bs()
	{
		System.out.println("This is Before suite");
	}
@AfterSuite
public void as()
{
	System.out.println("This is After suite");
}
@BeforeTest
public void bt()
{
	System.out.println("This is Before Test");
}
@AfterTest
public void at()
{
	System.out.println("This is AfterTest");
}
@BeforeClass
public void bc()
{
	System.out.println("This is Before class");
}
@AfterClass
public void ac()
{
	System.out.println("This is After class");
}
@BeforeMethod
public void bm()
{
	System.out.println("This is Before method");
}
@AfterMethod
public void am()
{
	System.out.println("This is after method");
}
@Test(priority=1)
public void test1()
{
	System.out.println("Test1");
}
@Test(priority=2)
public void test2()
{
	System.out.println("Test2");
}
}
