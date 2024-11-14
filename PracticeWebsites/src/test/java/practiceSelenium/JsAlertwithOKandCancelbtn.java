package practiceSelenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JsAlertwithOKandCancelbtn {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	Thread.sleep(2000);
	//al.accept();
	
	al.dismiss();
	

	}

}
