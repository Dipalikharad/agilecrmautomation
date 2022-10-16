package com.agilecrmauto;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.agilecrmAutomation.BaseClass;
import com.agilecrmpages.ContactPage;
import com.agilecrmpages.LoginPage;

public class ContactTest extends BaseClass {


	/*@BeforeTest
	public void beforeTest()
	{
	System.out.println("This is before Test method");	
	}*/
//	@BeforeClass
//	public void login()
//	{
//		
//		}
	
	@Test(priority=1,groups="Regression")
	@Parameters({"browser","username","password"})
	public void login(String browser,String username,String password) {
		launchBrowser("chrome");
		driver.navigate().to("https://cyberworld.agilecrm.com");
		driver.manage().window().maximize();
		LoginPage login=new LoginPage();
		login.login("gauri01@yopmail.com","Test12345");
	}
	
	@Test(priority=2)
		public void addcontact()
		{
		ContactPage contactpage=new ContactPage();
		contactpage.addContacts("de64", "yadii", "yita", "yita@gmail.com");
		//contactpage.search("de132");
		//contactpage.Update("pali", "maharastra");
		//contactpage.delete("denesh12s");
		}
	
	
	@Test(priority=3,dependsOnMethods= {"addcontact"})
	public void search()
	{
		ContactPage contactpage=new ContactPage();
		contactpage.search("de64");
		}
	
	@Test
	public void Update()
	{ContactPage contactpage=new ContactPage();
		contactpage.Update("pune", "maharastra");
	}
	@Test
	public void delete()
	{
		ContactPage contactpage=new ContactPage();
		contactpage.delete("de64");
	}
//	@AfterTest
//	public void AfterTest()
//	{
//	System.out.println("This after test");	
//	}
	
	
	
	
	
	}


