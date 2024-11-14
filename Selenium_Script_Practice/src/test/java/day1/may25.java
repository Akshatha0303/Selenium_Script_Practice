package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class may25 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	//driver.get("http://demo.nopcommerce.com");
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Thread.sleep(3000);
	//WebElement computers =driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
	//WebElement software=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']"));
	Actions a=new Actions(driver);
	
	//mouse hover action
	//a.moveToElement(computers).moveToElement(software).click().build().perform();
	//a.moveToElement(computers).moveToElement(software).click().perform();
	
	//Right click action(contextClick)
	WebElement menu =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	a.contextClick(menu).perform();

	WebElement paste=driver.findElement(By.xpath("//span[normalize-space()='Paste']"));
	//a.moveToElement(paste).click().perform();
	paste.click();
	Thread.sleep(3000);
	
	//to close alert window
	driver.switchTo().alert().accept();
	//driver.quit();
	

	}

}
