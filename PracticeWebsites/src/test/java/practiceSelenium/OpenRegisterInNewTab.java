package practiceSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class OpenRegisterInNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/registerresult/1");
		WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		String win=driver.getWindowHandle();
		driver.switchTo().window(win);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computers");
		Thread.sleep(2000);
		a.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		

	}

}
