package com.agilecrmpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agilecrmAutomation.BaseClass;

public class ContactPage extends BaseClass {
	 
	
	
	public void addContacts(String firstname, String lastname, String company, String email)
{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		click(By.id("contactsmenu"), "click on Contact Menu");
		click(By.xpath("//i[@class='caret']"), "click on adddropdown");
		click(By.xpath("//div[text()='Contact']"), "click on contact feature");
		WebElement Firname = driver.findElement(By.id("fname"));
		Firname.sendKeys(firstname);
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys(lastname);
		WebElement com = driver.findElement(By.id("contact_company"));
		com.sendKeys(company);
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys(email);
		click(By.id("person_validate"), "");
		String name = driver.findElement(By.id("contactName")).getText();
		System.out.println("Record Saved Successfully:-" + name);

	}

	public void search(String firstname) {
		click(By.id("contactsmenu"), "click on Contact Menu");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(By.xpath("//button[contains(@class,'search material-icons')]"), "click on search");
		driver.findElement(By.xpath("//*[@id=\"advanced-search-fields-group\"]/li[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchText = driver.findElement(By.id("searchText"));
		searchText.sendKeys(firstname);
		searchText.click();
		click(By.id("search-results"), "clickon search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(By.id("search-model-list"), "");
		String name = driver.findElement(By.id("contactName")).getText();
		System.out.println("Record search successfully:-" + name);

	}

	public void Update(String city, String state) {

		click(By.xpath("//a[@data-original-title=\"Edit\"]/child::i"), "Click on Edit");
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("state")).sendKeys(state);
		click(By.xpath("//a[text()='Update']"), "click on update");
		click(By.id("close"), "click on close ");
		String name = driver.findElement(By.id("contactName")).getText();
		System.out.println("Record update successfully:-" + name);

	}

	public void delete(String Name) {
waitForVisibilityOfElement(driver.findElement(By.xpath("//div[@class='panel-middle-align-mobile m-b-sm']/preceding::div[1]/button")));
driver.findElement(By.xpath("//div[@class='panel-middle-align-mobile m-b-sm']/preceding::div[1]/button")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
waitForElementToBeClickable(driver.findElement(By.xpath("//div[@class='panel-middle-align-mobile m-b-sm']/preceding::div[1]/button/following::li[10]/a")));
fluentWait( By.xpath("//div[@class='panel-middle-align-mobile m-b-sm']/preceding::div[1]/button/following::li[10]/a"));
click(By.xpath("//div[@class='panel-middle-align-mobile m-b-sm']/preceding::div[1]/button/following::li[10]/a"),
				"click on delete");
waitForVisibilityOfElement(driver.findElement(By.id("success_callback")));
		driver.findElement(By.id("success_callback")).click();
		String name = driver.findElement(By.id("contactName")).getText();
		System.out.println("Record deleted Successfully:-" + name);


	}

}
