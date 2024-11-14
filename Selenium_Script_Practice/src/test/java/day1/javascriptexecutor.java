package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium. JavascriptExecutor;
public class javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Hi')");
		
		

	}

}
