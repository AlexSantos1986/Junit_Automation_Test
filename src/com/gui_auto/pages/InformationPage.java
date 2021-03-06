/**
 * Framework - Hybrid Automation Selenium Testing
 * Version - 1.0
 * Creation Date - Feb, 2018
 * Author - Kaeshiker Jayasingh
 **/
package com.gui_auto.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class InformationPage extends BasePage{

	static Logger log = Logger.getLogger(InformationPage.class.getName());

	public InformationPage(WebDriver driver) {  
		super();  
		PropertyConfigurator.configure("config/log4j.properties");
		this._driver = driver;  
	}  

}
