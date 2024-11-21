package org.OxyCare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OxyCare {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//wcg112//eclipse-workspace//OxCare//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oxcarcare.com/");




	}

}
