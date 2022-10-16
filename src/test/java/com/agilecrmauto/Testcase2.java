package com.agilecrmauto;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.agilecrmAutomation.BaseClass;

public class Testcase2 extends BaseClass {

	
	@BeforeTest
	public void beforeTest(){
		System.out.println("This is before Test method");
		launchBrowser("chrome");
		driver.get("https://www.google.com");

	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is before  method");

	}

	
	
	@Test
	public void test1() {
		System.out.println("This is test1 method");
	}
	@Test
	public void test2()
	{System.out.println("This is test2 method");
	
	System.out.println(driver.getTitle());
	Assert.fail("Test2 failed");
	}
	
	@Test
	public void test3()
	{
		System.out.println("This is test3 method");
	}
}
