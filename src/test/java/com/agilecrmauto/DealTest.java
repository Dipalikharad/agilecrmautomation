package com.agilecrmauto;

import java.util.ArrayList;

import org.openqa.selenium.By;

import com.agilecrmAutomation.BaseClass;
import com.agilecrmpages.ContactPage;
import com.agilecrmpages.DealPage;
import com.agilecrmpages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DealTest extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		//WebDriverManager.chromiumdriver().setup();
		driver.navigate().to("https://cyberworld.agilecrm.com");
		//driver.manage().window().maximize();
		LoginPage login=new LoginPage();
		login.login("gauri01@yopmail.com","Test12345");
		
			DealPage dealpage=new DealPage();
			/*ArrayList<String>dealname=new ArrayList<>();
			
			for(int i=1;i<=10;i++) {
				Object deal;
				String name=deal.addDeal("deal_"+i);
				ArrayList<String> dealNames;
				dealNames.add(name);
			}
			for(String name:dealname) {
				
			}*/
			dealpage.addDeal("wipp1","30","10","80");
			dealpage.delete();
	}
	
}

	
