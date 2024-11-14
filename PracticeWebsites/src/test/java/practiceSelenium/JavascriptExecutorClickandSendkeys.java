package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;

public class JavascriptExecutorClickandSendkeys {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement search=driver.findElement(By.className("wikipedia-search-button"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//click By using javascriptExecutor.
	//js.executeScript("arguments[0].click()", search);
	
	//sendKeys() by using JavascriptExecutor
	
WebElement	input=driver.findElement(By.className("wikipedia-search-input"));
	
	js.executeScript("arguments[0].setAttribute('value','HiHellooo')", input);
	

	}
	

}
