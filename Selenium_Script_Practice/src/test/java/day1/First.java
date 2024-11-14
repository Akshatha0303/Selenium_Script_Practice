package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String title =driver.getTitle();
		System.out.println("Title is:" +title);
		if(title.equals("Google"))
			System.out.println("correct");
		else
			System.out.println("wrong");
		driver.close();
			
	}

	}

