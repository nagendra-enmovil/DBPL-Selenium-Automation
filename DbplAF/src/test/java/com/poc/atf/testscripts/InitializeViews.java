package com.poc.atf.testscripts;


import org.openqa.selenium.WebDriver;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.CreateDOObjects;
import com.poc.atf.services.ActiveScreenService;
import com.poc.atf.services.AllScreenService;
import com.poc.atf.services.CreateDOService;
import com.poc.atf.services.DeliveredService;
import com.poc.atf.services.LoginService;
import com.poc.atf.services.MenuNamesandRespectiveScreenNamesServices;

public class InitializeViews {
	
protected static WebDriver uiDriver = null;
	
	public static void init() {
		if(uiDriver == null) {
			uiDriver = BrowserDriver.getCurrentDriver();
		}
		LoginService.init();
		ActiveScreenService.init();
		DeliveredService.init();
		AllScreenService.init();
		CreateDOService.init();
		MenuNamesandRespectiveScreenNamesServices.init();
	
	} 
}
