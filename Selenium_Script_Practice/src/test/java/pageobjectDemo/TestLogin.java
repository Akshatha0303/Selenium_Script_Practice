package pageobjectDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {
WebDriver driver;

@BeforeClass
void setup()
{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window();
}


@Test
void login()
{
	PageFLogin p=new PageFLogin(driver);
	p.setUserName("Akshu");
	p.setPassword("123$");
	p.clickLogin();
	
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	
}

void teardown()
{
	driver.quit();
}
}
