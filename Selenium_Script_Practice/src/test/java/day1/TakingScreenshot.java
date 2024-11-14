package day1;

import java.io.File;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TakingScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //ChromeDriver driver=new ChromeDriver();
 WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.manage().window().maximize();
 driver.get("https://www.google.com");
 
 TakesScreenshot ts=(TakesScreenshot)driver;
 File sourcefile = ts.getScreenshotAs(OutputType.FILE);
 File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
sourcefile.renameTo(targetfile); 
	}


}
