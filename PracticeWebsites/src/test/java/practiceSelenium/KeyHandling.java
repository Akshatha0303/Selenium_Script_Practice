package practiceSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=713930224968&hvpos=&hvnetw=g&hvrand=16548850658780647121&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062072&hvtargid=kwd-10573980&hydadcr=14453_2402227&gad_source=1");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("CeraVe moisturizer");
		
		//Actions a=new Actions(driver);
		//a.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		//driver.findElement(By.xpath("//img[alt='CeraVe Moisturizing Cream For Dry To Very Dry Skin (50ml) - Formulated with 3 Essential Ceramides And Hyaluronic Acid | No...\']")).click();
	
		
		
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.xpath("//input[@id='input1']")).sendKeys("Hi I am here");
	//driver.findElement(By.xpath("//input[@id='input2']")).click();
	
	
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();	
	}


}
