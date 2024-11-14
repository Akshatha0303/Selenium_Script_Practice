/*open application
 * test logo presence
 * login 
 * close app
 */





package sep7;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NewTest {
	WebDriver driver;
  @Test(priority=1)
  public void openapp () {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  
  }
  
 @Test(priority=2) 
  public void logo() throws InterruptedException
  {
	 Thread.sleep(3000);
	  boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("logo display:"+ status);
  }
  
 @Test(priority=3)
  public void login()
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("abcdef");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123sd");
	  
  }
 @Test(priority=4)
  public void logout()
  {
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
  }
  
}
