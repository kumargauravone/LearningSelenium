package com.LearningSelenium.basics;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.qameta.allure.Description;

public class SeleniumTest2 {
	
	@Test
	@Description("Verify the title of the givem website")
	public void launchBrowser() {
		
		RemoteWebDriver driver = new ChromeDriver();
		
		// Get the session ID using RemoteWebDriver method
        SessionId sessionId = driver.getSessionId();
        System.out.println("Session ID: " + sessionId.toString());
        
        driver =  new ChromeDriver();
        
        SessionId sessionId2 = driver.getSessionId();
        System.out.println("Session ID: " + sessionId2.toString());
	

		
		
	}

}
