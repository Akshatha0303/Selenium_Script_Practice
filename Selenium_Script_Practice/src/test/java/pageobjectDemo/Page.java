package pageobjectDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
	WebDriver driver;
	//constructor
	Page(WebDriver driver)
	{
		this.driver=driver;
	}
	//locators
	By UserName_loc=By.xpath("//input[@placeholder='Username']");
	By Pwd_loc=By.xpath("//input[@placeholder='Password']");
	By btn_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action methods
	public void setUserName(String user)
	{
		driver.findElement(UserName_loc).sendKeys(user);
	}
	public void setPassword(String pwd)
	{
		driver.findElement(Pwd_loc).sendKeys(pwd);
	}
	public void clickLogin()
	{
		driver.findElement(btn_loc).click();
	}

}
