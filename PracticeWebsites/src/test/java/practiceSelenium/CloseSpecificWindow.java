package practiceSelenium;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Set<String> windowids=driver.getWindowHandles();
		for(String win:windowids)
		{
			String title=driver.switchTo().window(win).getTitle();
			if(title.equals("Automation Testing Practice"))
			{
				driver.close();
			}
		
		}

	}

}
 