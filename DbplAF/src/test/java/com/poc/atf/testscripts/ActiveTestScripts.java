package com.poc.atf.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.poc.atf.config.BrowserDriver;
import com.poc.atf.config.PropertyLoader;
import com.poc.atf.data.AllScreenData;
import com.poc.atf.data.CreateDOData;
//import com.poc.atf.data.ActiveScreenData;
import com.poc.atf.data.DBPLDataConfig;
import com.poc.atf.data.DeliveredData;
import com.poc.atf.data.LoginData;
import com.poc.atf.services.ActiveScreenService;
import com.poc.atf.services.AllScreenService;
import com.poc.atf.services.CreateDOService;
import com.poc.atf.services.DeliveredService;
import com.poc.atf.services.LoginService;
import com.poc.atf.validations.ActiveScreenValidations;

import util.BaseListener;

public class ActiveTestScripts extends BaseListener {
	
	LoginData loginData = null;
    ActiveScreenService activeScreenService = null;
    LoginService loginService = null;
    DeliveredData deliveredData = null;
    DeliveredService deliveredService = null;
    AllScreenData allScreenData = null;
    AllScreenService allScreenService = null;
    ActiveScreenValidations activeScreenValidations = null;
    
    @BeforeClass
    public void init() {
    	loginData = new DBPLDataConfig().getLoginData();
    	activeScreenService = new ActiveScreenService();
    	loginService = new LoginService();
    	deliveredData = new DBPLDataConfig().getDeliveredData();
    	deliveredService = new DeliveredService();
    	allScreenData = new DBPLDataConfig().getAllScreenData();
    	allScreenService = new AllScreenService();
    	activeScreenValidations = new ActiveScreenValidations();
    	
    	
        InitializeViews.init(); 
        
        logger = extent.createTest("DBPL: Active Screen");
        
        BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getDBPLUrl());
        loginService.loginToDBPLApplication(loginData.getAdminLoginUser(), loginData.getAdminPassword());
    }
    
    @Test(description="DBPL Login Test")
    public void activeScreenTest() {
    	
    	activeScreenService.fromDateActiveScreen().selectTypeFilters().inputTypeField(loginData.getTruckNo()).clickSubmitButton();
    	activeScreenValidations.validateGridData(activeScreenService);
    	activeScreenService.rsFilters();
    	activeScreenService.clickConSlab();
    	activeScreenValidations.slabcount(activeScreenService);
    	activeScreenService.clickTDSlab();
    	activeScreenValidations.tdSlabCount(activeScreenService);
    	activeScreenService.clickOsSlab();
    	activeScreenValidations.osSlabCount(activeScreenService);
    	activeScreenService.clickStoppagesSlab();;
    	activeScreenValidations.StoppageSlabCount(activeScreenService);
    	activeScreenService.clickDeviationSlab();
    	activeScreenValidations.deviSlabCount(activeScreenService);
    	
    	//Delivered screen
    	deliveredService.selectTypeFilters().inputTypeField(deliveredData.getConsignmentNo()).clickSubmitButton();
    	activeScreenValidations.validateGridData(deliveredService);
    	deliveredService.rsFilters();
    	deliveredService.deliveredButton();
    	deliveredService.clickConSlab();
    	activeScreenValidations.slabcount(deliveredService);
    	deliveredService.clickTDSlab();
    	activeScreenValidations.tdSlabCount(deliveredService);
    	deliveredService.clickOsSlab();
    	activeScreenValidations.osSlabCount(deliveredService);
    	deliveredService.clickStoppagesSlab();
    	activeScreenValidations.StoppageSlabCount(deliveredService);
    	deliveredService.clickDeviationSlab();
    	activeScreenValidations.deviSlabCount(deliveredService);
    	
    	//All
    	allScreenService.selectTypeFilters().inputTypeField(allScreenData.getConsignmentNo()).clickSubmitButton();
    	activeScreenValidations.validateGridData(allScreenService);
    	allScreenService.rsFilters();
    	allScreenService.AllScreenButton();
    	allScreenService.clickConSlab();
    	activeScreenValidations.slabcount(allScreenService);
    	allScreenService.clickTDSlab();
    	activeScreenValidations.tdSlabCount(allScreenService);
    	allScreenService.clickOsSlab();
    	activeScreenValidations.osSlabCount(allScreenService);
    	allScreenService.clickStoppagesSlab();
    	activeScreenValidations.StoppageSlabCount(allScreenService);
    	allScreenService.clickDeviationSlab();
    	activeScreenValidations.deviSlabCount(allScreenService);
    	
    	
    }
}
