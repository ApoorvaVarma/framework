package com.qa.phpTravels.pageTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.phpTravels.Base.BasePage;
import com.qa.phpTravels.pages.Home;

public class HomeTest {
	
BasePage bpObj;
Home hpObj;
WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		bpObj=new BasePage();
		driver=bpObj.init_driver("chrome");
		hpObj=new Home(driver);
		driver.get("https://www.phptravels.net/");
		Thread.sleep(5000);
		
		
			
	}
	
	@Test
	public void is_presentTEST() {
		hpObj.is_present();
		
	}
	
	@Test
	public void countLinksTEST() {
		hpObj.countLinks();
	}
	
	
	@AfterTest
	public void closure() {
		System.out.println("execution complete");
	}
	

}
