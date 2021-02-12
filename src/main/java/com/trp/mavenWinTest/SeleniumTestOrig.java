package com.trp.mavenWinTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestOrig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(System.getProperty("user.dir"));
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("Completed....");
		driver.quit();

	}

}
