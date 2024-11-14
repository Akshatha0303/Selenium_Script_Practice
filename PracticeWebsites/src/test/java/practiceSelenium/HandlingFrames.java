package practiceSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']"));
		
		//WebElement framebox=driver.findElement(By.xpath("//div[@class=' nav nav-tabs']"));
		
		driver.switchTo().frame(0);						//switching frame by index
		//driver.switchTo().frame("singleframe");     //  switching frame by id
		//driver.switchTo().frame("SingleFrame");  	//switching frame by name
		//driver.switchTo().frame(framebox);		// switching frame by webelement
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");

		

	}

}
