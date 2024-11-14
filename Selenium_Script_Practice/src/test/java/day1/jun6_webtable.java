package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jun6_webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		String ele=driver.findElement(By.xpath("//td[normalize-space()='Albanian']")).getText();
		System.out.println(ele);
		

	}

}
