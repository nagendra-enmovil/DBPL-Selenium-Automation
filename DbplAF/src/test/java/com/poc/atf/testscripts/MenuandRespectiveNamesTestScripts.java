package com.poc.atf.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.config.PropertyLoader;
import com.poc.atf.data.DBPLDataConfig;
import com.poc.atf.data.LoginData;
import com.poc.atf.services.CreateDOService;
import com.poc.atf.services.LoginService;
import com.poc.atf.services.MenuNamesandRespectiveScreenNamesServices;
import com.poc.atf.validations.ActiveScreenValidations;

import util.BaseListener;

public class MenuandRespectiveNamesTestScripts extends BaseListener {
	
//	LoginData loginData = null;
//	LoginService loginService = null;
	MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices = null;
	ActiveScreenValidations activeScreenValidations = null;
	SoftAssert softAssert = null;
	
	
	@BeforeClass
    public void init() {
//    	loginData = new DBPLDataConfig().getLoginData();
//    	loginService = new LoginService();
    	menuNamesandRespectiveScreenNamesServices = new MenuNamesandRespectiveScreenNamesServices();
    	activeScreenValidations = new ActiveScreenValidations();
    	softAssert = new SoftAssert();
    	
        InitializeViews.init(); 
        
        logger = extent.createTest("DBPL: Consignment names validation");
        
        
//        BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getDBPLUrl());
//        loginService.loginToDBPLApplication(loginData.getAdminLoginUser(), loginData.getAdminPassword());
	}
	
	@Test(description="Consignment names validation Test")
    public void activeScreenTest() {
		menuNamesandRespectiveScreenNamesServices.Threedots().consignmentscreennames();
		activeScreenValidations.validatemenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.createDONameValidation();
		activeScreenValidations.validatecreatedomenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.utilitiesnameclick();
		menuNamesandRespectiveScreenNamesServices.truckWithGeoValidation();
		activeScreenValidations.validateTWGmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.viewCarrierValidation();
		activeScreenValidations.validateVCRmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.truckLocationValidation();
		activeScreenValidations.validateTLmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.manageNameClick();
		menuNamesandRespectiveScreenNamesServices.manageTruckValidation();
		activeScreenValidations.validateManageTruckmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.manageCBR();
		activeScreenValidations.validateManageCbrmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
       
		menuNamesandRespectiveScreenNamesServices.manageTransporter();
		activeScreenValidations.validateManageTransmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.manageGeoFence();
		activeScreenValidations.validateManageGFmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.manageCoalMine();
		activeScreenValidations.validateManageCMmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.clickOnDashboard();
		menuNamesandRespectiveScreenNamesServices.gpsWireDisDash();
		activeScreenValidations.validateDashboardmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
		
		menuNamesandRespectiveScreenNamesServices.clickOnTMS();
		menuNamesandRespectiveScreenNamesServices.menuTMS();
		activeScreenValidations.validateTicketMSmenuandscreennames(menuNamesandRespectiveScreenNamesServices);
	}
	

	
	@AfterMethod
    public void tearDown() {
        // Call assertAll() at the end of each test method to collect all assertion failures
        softAssert.assertAll();
    }
}
