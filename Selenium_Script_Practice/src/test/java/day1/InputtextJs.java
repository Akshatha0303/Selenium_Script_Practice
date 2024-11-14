package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;



public class InputtextJs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/");
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		//driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ASk");
		
		//Entering input text without using sendKeys by using JavaScriptExecutor
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		// Enter Firstname
		JS.executeScript("document.getElementById('FirstName').value='Abha_Rathour'");
		//JS.executeScript(document.getElementById)
		
		// Enter password
		//JS.executeScript("document.getElementById('Password').value='password123'");
		

	}

}
