package nov4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseover {
	public static  WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver=new ChromeDriver();
		 driver.get("https://tutorialsninja.com/demo/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	     WebElement desktops =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	     Actions act=new Actions(driver);
	     act.moveToElement(desktops).perform();
	     WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	     
	     Action ai=act.contextClick(mac).build();
	    // ai.perform();
	     
	    act.doubleClick(mac).perform();
	    
	
	    
	    

	}

}
