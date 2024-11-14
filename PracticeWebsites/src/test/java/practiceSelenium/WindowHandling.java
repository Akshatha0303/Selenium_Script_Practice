package practiceSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	    Set<String> windowid =driver.getWindowHandles();
	    List<String>  win=new ArrayList(windowid);
	    String parent=win.get(0);
	    String child=win.get(1);
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(child);
	    System.out.println("Child window title:"+driver.getTitle());
	   // driver.close();
	    driver.switchTo().window(parent);
	    System.out.println("Parent window title:"+driver.getTitle());
	    driver.close();
	    
	 
	   
	}

}
