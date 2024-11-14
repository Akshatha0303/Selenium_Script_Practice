package practiceSelenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropdown {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select  dp=new Select(drop);
		//dp.selectByIndex(1);
		//dp.selectByValue("germany");
		//dp.selectByVisibleText("France");
		System.out.println(dp.isMultiple());
	
		List<WebElement> dplist =dp.getOptions();
		System.out.println(dplist.size());
		
		
		for(WebElement dropdown:dplist)
		{
			System.out.println(dropdown.getText());
		
		}
		
	
	}

}
