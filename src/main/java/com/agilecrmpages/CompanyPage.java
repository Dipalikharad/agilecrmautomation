package com.agilecrmpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.agilecrmAutomation.BaseClass;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class CompanyPage extends BaseClass {
	

	public void addCompany(String Name) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		fluentWait(By.xpath("//li[@id='companiesmenu']"));
		WebElement CompanyMenu = driver.findElement(By.xpath("//li[@id='companiesmenu']"));
		Actions action = new Actions(driver);
		action.click(CompanyMenu).build().perform();
		//waitForElementToBeClickable(driver.findElement(By.xpath("//button[text()=' Add Company']")));
		WebElement addcompany = driver.findElement(By.xpath("//button[text()=' Add Company']"));
		action.click(addcompany).build().perform();
		// WebElement companyname=driver.findElement(By.id("company_name"));
		// action.click(companyname).sendKeys(Name).build().perform();
		driver.findElement(By.id("company_name")).sendKeys(Name);
		WebElement continueEdit = driver.findElement(By.id("continue-company"));
		action.click(continueEdit).build().perform();
		String addCompanyName = driver.findElement(By.xpath("//div[@id='company-name-text']")).getText();
		System.out.println("Add company successfully:-" + addCompanyName);
	}

	public void updateCompany(String Name, String Url, String city, String State) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// fluentWait( By.xpath("//input[@class='form-control field_length']"));
		waitForElementToBeClickable(driver.findElement(By.xpath("//input[@class='form-control  field_length']")));
		driver.findElement(By.xpath("//input[@class='form-control  field_length']")).sendKeys(Url);
		driver.findElement(By.xpath("//label[text()='Add Email ']"));
		//SelectDropdownByText(driver.findElement(By.name("email-select")));
		driver.findElement(By.xpath("//div[contains(@class,'second')]/descendant::select[@name='email-select']"));
		// select.selectByIndex(1);
		// select.selectByValue("");
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("state")).sendKeys(State);
		click(By.id("company-update"), "click on update");
		String companyName = driver.findElement(By.id("company-name-text")).getText();
		System.out.println("Record update successfully:-" + companyName);

	}
	
	private void SelectDropdownByText(WebElement findElement) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDown()
	{
		 WebElement selectdrop=driver.findElement(By.name("email-select"));
			 Select select=new Select(selectdrop);
			 waitForVisibilityOfElement( driver.findElement(By.xpath("//div[contains(@class,'second')]/descendant::select[@name='email-select']")));
			 driver.findElement(By.xpath("//div[contains(@class,'second')]/descendant::select[@name='email-select']")).click();
			            select.selectByVisibleText("Primary");
			 //elect.selectByValue("primary");
	}

	public void deleteCompany(String Name) {
		click(By.xpath("//button[@data-placement=\"bottom\"]"), "Click on 3dotes");
		click(By.xpath("//div[@class='contact-lhs-actions']/descendant::ul/li[4]"), "Click on delete");
		click(By.id("success_callback"), "Click on yes button");
		String companyName = driver.findElement(By.id("company-name-text")).getText();
		System.out.println("Record delete successfully:-" + companyName);
	}
}
