package com.agilecrmauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.agilecrmAutomation.BaseClass;
import com.agilecrmpages.CompanyPage;
import com.agilecrmpages.LoginPage;

public class CompanyTest extends BaseClass {



	@Test(priority = 1)
	//@Parameters({"browser","username","password"})
	public void login() {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		driver.navigate().to("https://cyberworld.agilecrm.com");
		// driver.manage().window().maximize();
		LoginPage login = new LoginPage();
		login.login("gauri01@yopmail.com", "Test12345");
	}

	@Test(priority = 2)
	public void addCompany() {
		CompanyPage companyPage = new CompanyPage();
		companyPage.addCompany("Capge87");

		// companyPage.selectDropDown();

	}

	@Test(priority = 3, dependsOnMethods = { "addCompany" })
	public void updateCompany() {
		CompanyPage companyPage = new CompanyPage();
		companyPage.updateCompany("Capge87", "http://capge50.com", "Mumbai", "maharstra");
	}

	@Test(priority = 4, dependsOnMethods = { "addCompany", "updateCompany" })
	public void deleteCompany() {
		CompanyPage companyPage = new CompanyPage();
		companyPage.deleteCompany("Capge87");

	}

	/*@AfterClass
	public void logout() {

		driver.quit();
	}*/

}
