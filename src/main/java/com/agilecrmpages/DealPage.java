package com.agilecrmpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.agilecrmAutomation.BaseClass;

public class DealPage  extends BaseClass{
	
	
public void addDeal(String name,String owner,String value,String probvalue)
	{driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
waitForElementToBeClickable(driver.findElement(By.xpath("//ul[@class='nav']/li[@id='dealsmenu']")));
		click(By.xpath("//ul[@class='nav']/li[@id='dealsmenu']"),"click on deal menu");
		
		waitForVisibilityOfElement(driver.findElement(By.xpath("//li[@id='dealsmenu']")));
		//fluentWait(By.xpath("//div[@id='deals-action']/button"));
		click(By.xpath("//div[@id='deals-action']/button"), "click on add deal");
		driver.findElement(By.xpath("//form[@id='opportunityForm']/descendant::input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//form[@id='opportunityForm']/descendant::select[@id='owners-list']")).sendKeys(owner);    //form[@id='opportunityForm']/descendant::input[@name='currency_conversion_value']
		driver.findElement(By.xpath("//form[@id='opportunityForm']/descendant::input[@name='currency_conversion_value']")).sendKeys(value);
		WebElement prob=driver.findElement(By.xpath("//form[@id='opportunityForm']/descendant::input[@id='probability']"));
		prob.clear();
		driver.findElement(By.xpath("//form[@id='opportunityForm']/descendant::input[@id='probability']")).sendKeys(probvalue);
		driver.findElement(By.xpath("//form[@id='opportunityForm']/descendant::select[@id='pipeline_milestone']"));
		
	selectDropdownByText(driver.findElement(By.xpath("//form[@id='opportunityForm']/descendant::select[@id='pipeline_milestone']")),
				"Lost");
	//return name;
	click(By.xpath("//div[@id='deals-new-footer']/descendant::a[@id='opportunity_validate']"),"click on save");
		
	}

	public void archiveDeal(String dealArchive) {
		click (By.xpath(dealArchive),"click on dealname");
		//click(By.xpath(""))
	}
	
	
	public void updateDeal()
	{
		click(By.xpath("//ul[contains(@class,'dropdown-menu ')]/descendant::a[@id='deal_details']"),"click on edit");
	}
	public void delete() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		waitForVisibilityOfElement(driver.findElement(By.xpath("// div[@class='contact-lhs-actions']/descendant::div/button")));
		click(By.xpath("// div[@class='contact-lhs-actions']/descendant::div/button"),"click on 3 dotes");
		click(By.xpath("//div[@class='dropdown ibm open']/descendant::li[10]/a/span[text()='Delete']"),"Click on Delete button");
		driver.findElement(By.id("success_callback")).click();
		String name1 = driver.findElement(By.id("contactName")).getText();
		System.out.println("Record deleted Successfully:-" + name1);

	}

	
	

}
