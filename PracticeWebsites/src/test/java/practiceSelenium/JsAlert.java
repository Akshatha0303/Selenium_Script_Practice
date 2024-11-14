package practiceSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JsAlert {

	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://testautomationpractice.blogspot.com/");
	 driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
	 Alert al=driver.switchTo().alert();
	 System.out.println(al.getText());
	 al.accept();
	 //al.dismiss();
	}

}
