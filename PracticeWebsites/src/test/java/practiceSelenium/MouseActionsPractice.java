package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsPractice {
	static WebDriver driver;

	public static void main(String[] args) {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("https://testautomationpractice.blogspot.com/");
	 WebElement point=driver.findElement(By.xpath("//button[@class='dropbtn']"));
	 WebElement drag=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
	 WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	 WebElement copytxt=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	 
	 Actions a=new Actions(driver);
	 a.moveToElement(point).perform();
	 a.dragAndDrop(drag, drop).perform();	 
	 
	 a.doubleClick(copytxt).build().perform(); 
	}

}
