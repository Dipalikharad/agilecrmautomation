package com.agilecrmauto;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.agilecrmAutomation.BaseClass;
import com.agilecrmpages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAgileCrmTestCase extends BaseClass {

	
		// TODO Auto-generated method stub
	@Test
		
	//@Parameters({"browser","username","password"})
	public void login() {
			// TODO Auto-generated method stub
			
			launchBrowser("chrome");
			WebDriverManager.chromiumdriver().setup();
		driver.navigate().to("https://cyberworld.agilecrm.com/");
//			driver.manage().window().maximize();
			LoginPage login=new LoginPage();
			login.login("gauri01@yopmail.com", "Test12345");

		}

		@Test
		
		
		
		public void Test1()
		{
			System.out.println("This is Test1 method");
		}
	


	}


