package practiceSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class CloseAllWindowWithoutQuit {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Set<String> windowid=driver.getWindowHandles();
		
		for(String win:windowid)
		{
			System.out.println(win);
			Thread.sleep(3000);
			driver.switchTo().window(win).close();
		}

	}

}
