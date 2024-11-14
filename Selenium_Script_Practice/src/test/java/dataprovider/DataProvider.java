package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void login(String email,String pwd) throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(status==true)
		{
			Assert.assertTrue(true);
		}
		else
			Assert.fail();
		}


@AfterTest
void logout()
{
	driver.close();
}

@org.testng.annotations.DataProvider(name="dp", indices= {1,2})

Object [][] Logindata(){
	Object data[][]= {
			{"abc@gmai.com", "123ab"},
			{"aksh@gmail.com", "qw#6"},
			{"gvui@gmail.com","98y4"}
};
	return data;
		
	
}
}