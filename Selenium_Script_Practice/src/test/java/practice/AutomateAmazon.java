package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateAmazon {
	
public static WebDriver driver;

public static void main(String args[])
{

driver=new ChromeDriver();
driver.get("https://www.amazon.in");
WebElement Account=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
Actions a=new Actions(driver);
a.moveToElement(Account).perform();

WebElement signin=driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
signin.click();

}
}
