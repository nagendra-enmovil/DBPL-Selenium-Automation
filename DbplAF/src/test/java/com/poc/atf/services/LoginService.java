//package com.poc.atf.services;
//
//import org.openqa.selenium.support.PageFactory;
//import org.testng.log4testng.Logger;
//
//import com.poc.atf.config.BrowserDriver;
//import com.poc.atf.pageobjects.LoginObjects;
//
//public class LoginService {
//	
//	public static LoginObjects loginObjects;
//	private static Logger log = Logger.getLogger(LoginService.class);
//	
//	
//	public LoginService loginToDBPLApplication(String adminLoginUser, String adminPassword) {
//		try {
//			BrowserDriver.waitForPageToLoad();
//			loginObjects.getLoginUsername().sendKeys(adminLoginUser);
//			loginObjects.getLoginPassword().sendKeys(adminPassword);
//			BrowserDriver.wait(2);
//			loginObjects.getLoginButton().click();
//			log.info("User logged in successfully.");
//		}
//		catch(Exception ex) {
//			ex.printStackTrace();
//		}
//		return this;
//	}
//	
//	public static void init() {
//		loginObjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginObjects.class);
//	}
//
//} 
//
//

package com.poc.atf.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.LoginObjects;

public class LoginService {
    
    public static LoginObjects loginObjects;
    private static Logger log = Logger.getLogger(LoginService.class);
    
    // Initialize LoginObjects
    public static void init() {
        loginObjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginObjects.class);
    }
    
    public LoginService loginToDBPLApplication(String adminLoginUser, String adminPassword) {
        try {
            BrowserDriver.waitForPageToLoad();
            loginObjects.getLoginUsername().sendKeys(adminLoginUser);
            loginObjects.getLoginPassword().sendKeys(adminPassword);
            //BrowserDriver.wait(2);
            loginObjects.getLoginButton().click();
            
            log.info("User logged in successfully.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return this;
    }
}

