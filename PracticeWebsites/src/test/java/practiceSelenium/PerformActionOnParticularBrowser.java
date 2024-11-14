package practiceSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformActionOnParticularBrowser {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Set<String> windowid =driver.getWindowHandles();
		for(String win:windowid)
		{
			String title=driver.switchTo().window(win).getTitle();
			
			if(title.equals("Your Store"))
			{
				driver.findElement(By.xpath("//span[normalize-space()='Shopping Cart']")).click();
			}
		}

	}

}
