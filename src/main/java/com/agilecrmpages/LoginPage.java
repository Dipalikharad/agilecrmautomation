package com.agilecrmpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.agilecrmAutomation.BaseClass;

public class LoginPage  extends BaseClass {
	By name=By.name("email");
	By password1=By.name("password");
	By submit=By.xpath("//input[@type='submit']");

	@FindBy (xpath= "//li[@id='fat-menu']/descendant::a/span/img")
		public WebElement menu;	
	@FindBy(xpath="//div[@class='row logout-row']/descendant::a[text()='Logout']")
	public WebElement logout;
	public void login(String username, String password) {
		WebElement uname = driver.findElement(this.name);
		uname.clear();
		uname.sendKeys(username);

		WebElement pwd = driver.findElement(this.password1);
		pwd.clear();
		pwd.sendKeys(password);

		WebElement signIn = driver.findElement(this.submit);
		signIn.click();
}
	public  void logOut()
	{
		//waitForElementToBeClickable(driver.findElement(By.xpath("//li[@id='fat-menu']/descendant::a/span/img\"),\"click onimage")));
		menu.click();
		 logout.click();
		 System.out.println("logout successfully");
	
	}
	
	public void forgot()
	{
		
	}
	
	
}