package practiceSelenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JsAlertWithPrompt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
		
		al.sendKeys("hiheloooooooo");
		System.out.println(al.getText());
		//al.accept();
		al.dismiss();
		
		//switch the control to WebPage.
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("aksuuuuuuu");

	}

}
