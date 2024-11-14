package day1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class jun5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804929%7Cb%7Cfacebook%7C&placement=&creative=550525804929&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D9062072%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=CjwKCAjwmYCzBhA6EiwAxFwfgHVYJ01FVjcVho3gCGOV5KNf159TKywlP_6-7EQ8ZB2tT8qcBQ4W6xoCe1oQAvD_BwE");
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("asdgl");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("pikjh");
		driver.findElement(By.name("reg_email__")).sendKeys("9654323457");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("@123ABCabc$");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='day']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.name("birthday_day"));
		//ele.click();
		Thread.sleep(3000);
		Select s=new Select(ele);
		List <WebElement> op=s.getOptions();
		op.size();
		/*for(WebElement options:op)
		{
			
		System.out.println("option are:"+options.getText());
		}
		//System.out.println(s.getOptions());*/
		for(int i=0;i<=op.size()-1;i++)
		{
		//System.out.println(op.get(i).getAttribute("value"));
			System.out.println(op.get(i).getText());
		}
		s.selectByIndex(3);
		//s.selectByVisibleText("9");
		//s.selectByValue("10");
		
		WebElement ele2=driver.findElement(By.xpath("//select[@id='month']"));
		Select s2= new Select(ele2);
		s2.selectByVisibleText("Aug");
		List<WebElement> op2=s2.getOptions();
		for(WebElement option2:op2)
		{
			System.out.println(option2.getText());
		}
		
		WebElement ele3=driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(ele3);
		s3.selectByValue("2013");
		List<WebElement> op3=s3.getOptions();
		for(WebElement options3:op3)
		{
			System.out.println("year:"+options3.getText());
		}
		Thread.sleep(3000);
		//s3.deselectByVisibleText("2013");
		boolean b=s3.isMultiple();
		System.out.println(b);
		Thread.sleep(2000);
		driver.findElement(By.name("sex")).click();
		
		driver.findElement(By.name("websubmit")).click();
	}
		

}
