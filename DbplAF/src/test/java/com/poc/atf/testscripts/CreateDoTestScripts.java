package com.poc.atf.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.config.PropertyLoader;
import com.poc.atf.data.CreateDOData;
import com.poc.atf.data.DBPLDataConfig;
import com.poc.atf.data.LoginData;
import com.poc.atf.services.CreateDOService;
import com.poc.atf.services.LoginService;
import com.poc.atf.validations.ActiveScreenValidations;

import util.BaseListener;

public class CreateDoTestScripts extends BaseListener {
	
//	LoginData loginData = null;
//	LoginService loginService = null;
	CreateDOData createDOData = null;
    CreateDOService createDoService = null;
    ActiveScreenValidations activeScreenValidations = null;
    
    
    @BeforeClass
    public void init() {
//    	loginData = new DBPLDataConfig().getLoginData();
//    	loginService = new LoginService();
    	createDOData = new DBPLDataConfig().getCreateDOData();
    	createDoService = new CreateDOService();
    	activeScreenValidations = new ActiveScreenValidations();
    	
        InitializeViews.init(); 
        
        logger = extent.createTest("DBPL: Create DO Screen");
        
//        BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getDBPLUrl());
//        loginService.loginToDBPLApplication(loginData.getAdminLoginUser(), loginData.getAdminPassword());
    }
    
    
    @Test(description="Create DO Script")
    
    public void CreateDOScreenTest() {
    	createDoService.Threedots().CreateDOname().AddDoButton().Coalmine().SelectCoalMine().
    	addDoNumber(createDOData.getDoNumber()).fromDateCreateDo().toDateCreateDo().quantity(createDOData.getQuantity()).submitButton().gridCellData();
    	activeScreenValidations.createDODataValidation(createDoService);
    }
}
