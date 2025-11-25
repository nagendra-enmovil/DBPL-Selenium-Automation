package com.poc.atf.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.AllScreenObjects;
import com.poc.atf.pageobjects.CreateDOObjects;
import com.poc.atf.pageobjects.MenuNamesandRepectiveScreenNamesObjects;

public class MenuNamesandRespectiveScreenNamesServices {
	
	public static MenuNamesandRepectiveScreenNamesObjects menuNamesandRepectiveScreenNamesObjects;
	private static Logger log = Logger.getLogger(MenuNamesandRespectiveScreenNamesServices.class);
	
	// Initialize LoginObjects
    public static void init() {
    	menuNamesandRepectiveScreenNamesObjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MenuNamesandRepectiveScreenNamesObjects.class);
    }
    
    public MenuNamesandRespectiveScreenNamesServices Threedots(){
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	BrowserDriver.wait(2);
    	return this;
    }
    
    public void consignmentscreennames() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuConsignmentText().click();
    	
    }
    
    public String menuconsignmnettext() {
    	String menuconstext = menuNamesandRepectiveScreenNamesObjects.getMenuConsignmentText().getText();
    	System.out.println("Cosignment text in menu: " + menuconstext);
    	return menuconstext;
    }
    
    
    public String screenconsignmnettext() {
    	String screenconstext = menuNamesandRepectiveScreenNamesObjects.getScreenConsignmentText().getText();
    	System.out.println("Consignment text in screen: " + screenconstext);
    	return screenconstext;
    }
    
    public void createDONameValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getMenuCreateDOText().click();
    }
    
    public String menuCreateDOtext() {
    	String menucreatedotext = menuNamesandRepectiveScreenNamesObjects.getMenuCreateDOText().getText();
    	System.out.println("CreateDO text in menu: " + menucreatedotext);
    	return menucreatedotext;
    }
    
    public String screenCreateDOtext() {
    	String screencreatedotext = menuNamesandRepectiveScreenNamesObjects.getScreenCreateDOText().getText();
    	System.out.println("CreateDO text in screen: " + screencreatedotext);
    	return screencreatedotext;
    }
    
    public void utilitiesnameclick() {
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnUtilitiesName().click();
    	BrowserDriver.wait(2);
    }
    
    public void truckWithGeoValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuTruckWithinGeofText().click();
    }
    
    public String screenTruckWithGeotext() {
    	String screentwgtext = menuNamesandRepectiveScreenNamesObjects.getScreenTruckWithinGeofText().getText();
    	System.out.println("Trucks Within Geofence text in screen: " + screentwgtext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnUtilitiesName().click();
    	BrowserDriver.wait(2);
    	return screentwgtext;
    }
    
    public String menuTruckWithGeotext() {
    	String menutwgtext = menuNamesandRepectiveScreenNamesObjects.getMenuTruckWithinGeofText().getText();
    	System.out.println("Trucks Within Geofence text in menu: " + menutwgtext);
    	return menutwgtext;
    }
    
    public void viewCarrierValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuViewCarrierText().click();
    }
    
    public String screenViewCarrierText() {
    	String screenVCRtext = menuNamesandRepectiveScreenNamesObjects.getScreenViewCarrierText().getText();
    	System.out.println("View Carrier text in screen: " + screenVCRtext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnUtilitiesName().click();
    	BrowserDriver.wait(2);
    	return screenVCRtext;
    }
    
    public String menuViewCarriertext() {
    	String menuVCRtext = menuNamesandRepectiveScreenNamesObjects.getMenuViewCarrierText().getText();
    	System.out.println("View Carrier text in menu: " + menuVCRtext);
    	return menuVCRtext;
    }
    
    public void truckLocationValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuTruckLocationText().click();
    }
    
    public String screenTruckLocationText() {
    	String screenTLtext = menuNamesandRepectiveScreenNamesObjects.getScreenTruckLocationText().getText();
    	System.out.println("Truck Location text in screen: " + screenTLtext);
    	BrowserDriver.wait(20);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnUtilitiesName().click();
    	BrowserDriver.wait(2);
    	return screenTLtext;
    }
    
    public String menutruckLocationtext() {
    	String menuTLtext = menuNamesandRepectiveScreenNamesObjects.getMenuTruckLocationText().getText();
    	System.out.println("Truck Location text in menu: " + menuTLtext);
    	return menuTLtext;
    }
    
    public void manageNameClick() {
    	menuNamesandRepectiveScreenNamesObjects.getClickOnManage().click();
    }
    
    public void manageTruckValidation() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuTruckText().click();
    }
    
    public String screenTruckText() {
    	String screenTrutext = menuNamesandRepectiveScreenNamesObjects.getScreenTruckText().getText();
    	System.out.println("Truck text in screen: " + screenTrutext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnManage().click();
    	BrowserDriver.wait(2);
    	return screenTrutext;
    }
    
    public String menuTrucktext() {
    	String menuTrutext = menuNamesandRepectiveScreenNamesObjects.getMenuTruckText().getText();
    	System.out.println("Truck text in menu: " + menuTrutext);
    	return menuTrutext;
    }
    
    public void manageCBR() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuCBR().click();
    }
    
    public String screenCBRText() {
    	String screenCbrtext = menuNamesandRepectiveScreenNamesObjects.getScreenCBR().getText();
    	System.out.println("CBR text in screen: " + screenCbrtext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnManage().click();
    	BrowserDriver.wait(2);
    	return screenCbrtext;
    }
    
    public String menuCBRtext() {
    	String menuCbrtext = menuNamesandRepectiveScreenNamesObjects.getMenuCBR().getText();
    	System.out.println("CBR text in menu: " + menuCbrtext);
    	return menuCbrtext;
    }
    
    public void manageTransporter() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuTransporters().click();
    }
    
    public String screenTransText() {
    	String screenTranstext = menuNamesandRepectiveScreenNamesObjects.getScreenTransporters().getText();
    	System.out.println("Transporter text in screen: " + screenTranstext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnManage().click();
    	BrowserDriver.wait(2);
    	return screenTranstext;
    }
    
    public String menuTranstext() {
    	String menuTranstext = menuNamesandRepectiveScreenNamesObjects.getMenuTransporters().getText();
    	System.out.println("Transporter text in menu: " + menuTranstext);
    	return menuTranstext;
    }
    
    public void manageGeoFence() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuGeoFences().click();
    }
    
    public String screenGFText() {
    	String screenGFtext = menuNamesandRepectiveScreenNamesObjects.getScreenGeoFences().getText();
    	System.out.println("Geofence text in screen: " + screenGFtext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnManage().click();
    	BrowserDriver.wait(2);
    	return screenGFtext;
    }
    
    public String menuGFtext() {
    	String menuGFtext = menuNamesandRepectiveScreenNamesObjects.getMenuGeoFences().getText();
    	System.out.println("Geofence text in menu: " + menuGFtext);
    	return menuGFtext;
    }
    
    public void manageCoalMine() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuCoalMine().click();
    }
    
    public String screenCMText() {
    	String screenCmtext = menuNamesandRepectiveScreenNamesObjects.getScreenCoalMine().getText();
    	System.out.println("Coalmine text in screen: " + screenCmtext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	menuNamesandRepectiveScreenNamesObjects.getClickOnManage().click();
    	BrowserDriver.wait(2);
    	return screenCmtext;
    }
    
    public String menuCMtext() {
    	String menuCmtext = menuNamesandRepectiveScreenNamesObjects.getMenuCoalMine().getText();
    	System.out.println("Geofence text in menu: " + menuCmtext);
    	return menuCmtext;
    }
    
    public void clickOnDashboard() {
    	menuNamesandRepectiveScreenNamesObjects.getClickOnDashboard().click();
    }
    
    public void gpsWireDisDash() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuGWDD().click();
    }
    
    public String screenGWDText() {
    	String screenGpswiretext = menuNamesandRepectiveScreenNamesObjects.getScreenGWDD().getText();
    	System.out.println("GPS Wire Dis. text in screen: " + screenGpswiretext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	//menuNamesandRepectiveScreenNamesObjects.getClickOnDashboard().click();
    	BrowserDriver.wait(2);
    	return screenGpswiretext;
    }
    
    public String menuGWDtext() {
    	String menuGpswiretext = menuNamesandRepectiveScreenNamesObjects.getMenuGWDD().getText();
    	System.out.println("GPS Wire Dis. text in menu: " + menuGpswiretext);
    	return menuGpswiretext;
    }
    
    public void clickOnTMS() {
    	menuNamesandRepectiveScreenNamesObjects.getClickOnTMS().click();
    }
    
    public void menuTMS() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuTMS().click();
    }
    
    public String screenTMSText() {
    	String screenTicketMStext = menuNamesandRepectiveScreenNamesObjects.getScreenTMS().getText();
    	System.out.println("GPS Wire Dis. text in screen: " + screenTicketMStext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	//menuNamesandRepectiveScreenNamesObjects.getClickOnTMS().click();
    	BrowserDriver.wait(2);
    	return screenTicketMStext;
    }
    
    public String menuTMStext() {
    	String menuTicketMStext = menuNamesandRepectiveScreenNamesObjects.getMenuTMS().getText();
    	System.out.println("GPS Wire Dis. text in menu: " + menuTicketMStext);
    	return menuTicketMStext;
    }
    
    public void clickOnreportsname() {
    	menuNamesandRepectiveScreenNamesObjects.getClickOnReports().click();
    }
    
    public void menuOSR() {
    	menuNamesandRepectiveScreenNamesObjects.getMenuOSR().click();
    }
    
    public String screenOSRText() {
    	String screenOverspeedingtext = menuNamesandRepectiveScreenNamesObjects.getScreenOSR().getText();
    	System.out.println("Overspeeting text in screen: " + screenOverspeedingtext);
    	BrowserDriver.wait(2);
    	menuNamesandRepectiveScreenNamesObjects.getThreedots().click();
    	//menuNamesandRepectiveScreenNamesObjects.getClickOnTMS().click();
    	BrowserDriver.wait(2);
    	return screenOverspeedingtext;
    }
}
