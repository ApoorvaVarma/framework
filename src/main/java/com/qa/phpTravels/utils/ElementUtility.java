package com.qa.phpTravels.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {
	WebDriver driver;
	
	public ElementUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public boolean isDisplayedOnPage(By locator) {
		WebElement element=driver.findElement(locator);
		return element.isDisplayed();
	}

	public void countAllLinks() {
		List<WebElement> All_links=driver.findElements(By.tagName("a"));
		All_links.forEach(i->System.out.println(i.getText()));
		
	}
	
	
}
