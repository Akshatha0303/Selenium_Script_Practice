package pageobjectDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFLogin {
	WebDriver driver;

	//constructor
	PageFLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement UserName_loc;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Pwd_loc;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_loc;
	
	@FindBy(tagName="a")
	List<WebElement> links; 
	
	//Action methods
	public void setUserName(String user)
	{
		UserName_loc.sendKeys(user);
	}
	public void setPassword(String pwd)
	{
		Pwd_loc.sendKeys(pwd);
	}
	public void clickLogin()
	{
		btn_loc.click();
	}
}
