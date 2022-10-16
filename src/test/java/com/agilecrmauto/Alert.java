package com.agilecrmauto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.agilecrmAutomation.BaseClass;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert  extends BaseClass{

	
	@Test
	@Parameters({"browser","username","password"})
	public void alertScroll(String browser,String username,String password) {
		// TODO Auto-generated method stub
		
		launchBrowser(browser);
		WebDriverManager.chromiumdriver().setup();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scroll vertically
		//Thread.sleep(5000);
		js.executeScript("scroll(0,900)");
		js.executeScript("scroll(0,-700)");

	}

}
