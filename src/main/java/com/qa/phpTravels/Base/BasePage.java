package com.qa.phpTravels.Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	WebDriver driver;
	Properties prop;
	public WebDriver init_driver(String browser) {
	String browsername=browser;
	if(browsername.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
		
	
	if(browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
	
	if(browsername.equalsIgnoreCase("IE")) {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
	
	return driver;
	}

	public Properties init_prop() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Personal\\FrameWork\\DemoSite\\src\\main\\java\\com\\qa\\phpTravels\\config\\config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		}
	
	
}
