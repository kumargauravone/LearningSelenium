package com.LearningSelenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class SeleniumTest1 {
	
	@Test
	@Description("Verify the title of the givem website")
	public void launchBrowser() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");	
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
