package com.qa.phpTravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.phpTravels.Base.BasePage;
import com.qa.phpTravels.utils.ElementUtility;



public class Home extends BasePage{
	
	WebDriver driver;
	ElementUtility EU_Obj;
	
	public Home(WebDriver driver) {
		this.driver=driver;		
		EU_Obj=new ElementUtility(driver);
	}
	
	
	
	//Writing all locators:
	By flights=By.partialLinkText("Flights");
	By boats=By.partialLinkText("Boats");
	By rentals=By.partialLinkText("Rentals");
	By tours=By.partialLinkText("Tours");	
	By cars=By.partialLinkText("Cars");
	By visa=By.partialLinkText("Visa");
	
	
	
	public void is_present() 
	{
		System.out.println("flights " + EU_Obj.isDisplayedOnPage(flights));
		System.out.println("boats "+EU_Obj.isDisplayedOnPage(boats));
		System.out.println("rentals "+EU_Obj.isDisplayedOnPage(rentals));
		System.out.println("tours "+EU_Obj.isDisplayedOnPage(tours));
		System.out.println("cars "+EU_Obj.isDisplayedOnPage(cars));
		System.out.println("visa "+EU_Obj.isDisplayedOnPage(visa));
	}
	
	
	public void countLinks() {
		EU_Obj.countAllLinks();
		 
	}

}
