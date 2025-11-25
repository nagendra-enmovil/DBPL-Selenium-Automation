package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuNamesandRepectiveScreenNamesObjects {
	
	@FindBy(xpath = "//img[@id='sidebar-toggle']")
	private WebElement threedots;
	
	@FindBy(xpath = "//a[text()='Consignments']")
	private WebElement menuConsignmentText;
	
	@FindBy(xpath = "//span[text()='Consignments ']")
	private WebElement screenConsignmentText;
	
	@FindBy(xpath = "//a[text()='Create DO']")
	private WebElement menuCreateDOText;
	
	@FindBy(xpath = "//h5[text()='Create DO']")
	private WebElement screenCreateDOText;
  
	@FindBy(xpath = "//a[text()='Utilities']")
	private WebElement clickOnUtilitiesName;
	
	@FindBy(xpath = "//a[text()='Trucks Within Geofence']")
	private WebElement menuTruckWithinGeofText;
	
	@FindBy(xpath = "//span[text()='Trucks Within Geofence']")
	private WebElement screenTruckWithinGeofText;
	
	@FindBy(xpath = "//a[text()='View Carrier Route']")
	private WebElement menuViewCarrierText;
	
	@FindBy(xpath = "//span[text()='View Carrier Route']")
	private WebElement screenViewCarrierText;
	
	@FindBy(xpath = "//a[text()='Trucks Location (Map)']")
	private WebElement menuTruckLocationText;
	
	@FindBy(xpath = "//span[text()='Trucks Location']")
	private WebElement screenTruckLocationText;
	
	@FindBy(xpath = "//a[text()='Manage']")
	private WebElement clickOnManage;
	
	@FindBy(xpath = "//a[text()='Trucks']")
	private WebElement menuTruckText;
	
	@FindBy(xpath = "//span[text()='Manage Trucks']")
	private WebElement screenTruckText;
	
	@FindBy(xpath = "//a[text()='Create Base Route']")
	private WebElement menuCBR;
	
	@FindBy(xpath = "//span[text()='Create Base Routes ']")
	private WebElement screenCBR;
	
	@FindBy(xpath = "//a[text()='Transporters']")
	private WebElement menuTransporters;
	
	@FindBy(xpath = "//span[text()='Manage Transporters  ']")
	private WebElement screenTransporters;
	
	@FindBy(xpath = "//a[text()='Geo Fences']")
	private WebElement menuGeoFences;
	
	@FindBy(xpath = "//span[text()='Geo Fences']")
	private WebElement screenGeoFences;
	
	@FindBy(xpath = "//a[text()='Coal Mine']")
	private WebElement menuCoalMine;
	
	@FindBy(xpath = "//span[text()='Add Coal Mine  ']")
	private WebElement screenCoalMine;
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement clickOnDashboard;
	
	@FindBy(xpath = "//a[text()='GPS Wire Disconnection Dashboard']")
	private WebElement menuGWDD;
	
	@FindBy(xpath = "//span[text()='GPS Wire Disconnection Dashboard - Transporter Vehicles']")
	private WebElement screenGWDD;
	
	@FindBy(xpath = "//span[text()='Ticket Management System']")
	private WebElement clickOnTMS;
	
	@FindBy(xpath = "//a[text()='Ticket Management']")
	private WebElement menuTMS;
	
	@FindBy(xpath = "(//span[text()='Ticket Management System'])[2]")
	private WebElement screenTMS;
	
	@FindBy(xpath = "//span[text()='Reports']")
	private WebElement clickOnReports;
	
	@FindBy(xpath = "//a[text()='Overspeeding Report']")
	private WebElement menuOSR;
	
	@FindBy(xpath = "//span[text()='Overspeeding Report']")
	private WebElement screenOSR;
	
	@FindBy(xpath = "//a[text()='Stoppages Report']")
	private WebElement menuSR;
	
	@FindBy(xpath = "//span[text()='Stoppages Report']")
	private WebElement screenSR;
	
	@FindBy(xpath = "//a[text()='Frequent Stoppages Report']")
	private WebElement menuFSR;
	
	@FindBy(xpath = "//span[text()='Frequent Stoppages Report']")
	private WebElement screenFSR;
	
	@FindBy(xpath = "//a[text()='Frequent Wire Disconnection Report']")
	private WebElement menuFWDR;
	
	@FindBy(xpath = "//span[text()='Frequent GPS Wire Disconnection Report']")
	private WebElement screenFWDR;
	
	@FindBy(xpath = "//a[text()='GPS Wire Disconnection Report']")
	private WebElement menuGWDR;
	
	@FindBy(xpath = "//span[text()='GPS Wire Disconnection Report']")
	private WebElement screenGWDR;
	
	public WebElement getThreedots() {
		return threedots;
	}

	public void setThreedots(WebElement threedots) {
		this.threedots = threedots;
	}

	public WebElement getMenuConsignmentText() {
		return menuConsignmentText;
	}

	public void setMenuConsignmentText(WebElement menuConsignmentText) {
		this.menuConsignmentText = menuConsignmentText;
	}

	public WebElement getScreenConsignmentText() {
		return screenConsignmentText;
	}

	public void setScreenConsignmentText(WebElement screenConsignmentText) {
		this.screenConsignmentText = screenConsignmentText;
	}

	public WebElement getMenuCreateDOText() {
		return menuCreateDOText;
	}

	public void setMenuCreateDOText(WebElement menuCreateDOText) {
		this.menuCreateDOText = menuCreateDOText;
	}

	public WebElement getScreenCreateDOText() {
		return screenCreateDOText;
	}

	public void setScreenCreateDOText(WebElement screenCreateDOText) {
		this.screenCreateDOText = screenCreateDOText;
	}

	public WebElement getClickOnUtilitiesName() {
		return clickOnUtilitiesName;
	}

	public void setClickOnUtilitiesName(WebElement clickOnUtilitiesName) {
		this.clickOnUtilitiesName = clickOnUtilitiesName;
	}

	public WebElement getMenuTruckWithinGeofText() {
		return menuTruckWithinGeofText;
	}

	public void setMenuTruckWithinGeofText(WebElement menuTruckWithinGeofText) {
		this.menuTruckWithinGeofText = menuTruckWithinGeofText;
	}

	public WebElement getScreenTruckWithinGeofText() {
		return screenTruckWithinGeofText;
	}

	public void setScreenTruckWithinGeofText(WebElement screenTruckWithinGeofText) {
		this.screenTruckWithinGeofText = screenTruckWithinGeofText;
	}

	public WebElement getMenuViewCarrierText() {
		return menuViewCarrierText;
	}

	public void setMenuViewCarrierText(WebElement menuViewCarrierText) {
		this.menuViewCarrierText = menuViewCarrierText;
	}

	public WebElement getScreenViewCarrierText() {
		return screenViewCarrierText;
	}

	public void setScreenViewCarrierText(WebElement screenViewCarrierText) {
		this.screenViewCarrierText = screenViewCarrierText;
	}

	public WebElement getMenuTruckLocationText() {
		return menuTruckLocationText;
	}

	public void setMenuTruckLocationText(WebElement menuTruckLocationText) {
		this.menuTruckLocationText = menuTruckLocationText;
	}

	public WebElement getScreenTruckLocationText() {
		return screenTruckLocationText;
	}

	public void setScreenTruckLocationText(WebElement screenTruckLocationText) {
		this.screenTruckLocationText = screenTruckLocationText;
	}

	public WebElement getClickOnManage() {
		return clickOnManage;
	}

	public void setClickOnManage(WebElement clickOnManage) {
		this.clickOnManage = clickOnManage;
	}

	public WebElement getMenuTruckText() {
		return menuTruckText;
	}

	public void setMenuTruckText(WebElement menuTruckText) {
		this.menuTruckText = menuTruckText;
	}

	public WebElement getScreenTruckText() {
		return screenTruckText;
	}

	public void setScreenTruckText(WebElement screenTruckText) {
		this.screenTruckText = screenTruckText;
	}

	public WebElement getMenuCBR() {
		return menuCBR;
	}

	public void setMenuCBR(WebElement menuCBR) {
		this.menuCBR = menuCBR;
	}

	public WebElement getScreenCBR() {
		return screenCBR;
	}

	public void setScreenCBR(WebElement screenCBR) {
		this.screenCBR = screenCBR;
	}

	public WebElement getMenuTransporters() {
		return menuTransporters;
	}

	public void setMenuTransporters(WebElement menuTransporters) {
		this.menuTransporters = menuTransporters;
	}

	public WebElement getScreenTransporters() {
		return screenTransporters;
	}

	public void setScreenTransporters(WebElement screenTransporters) {
		this.screenTransporters = screenTransporters;
	}

	public WebElement getMenuGeoFences() {
		return menuGeoFences;
	}

	public void setMenuGeoFences(WebElement menuGeoFences) {
		this.menuGeoFences = menuGeoFences;
	}

	public WebElement getScreenGeoFences() {
		return screenGeoFences;
	}

	public void setScreenGeoFences(WebElement screenGeoFences) {
		this.screenGeoFences = screenGeoFences;
	}

	public WebElement getMenuCoalMine() {
		return menuCoalMine;
	}

	public void setMenuCoalMine(WebElement menuCoalMine) {
		this.menuCoalMine = menuCoalMine;
	}

	public WebElement getScreenCoalMine() {
		return screenCoalMine;
	}

	public void setScreenCoalMine(WebElement screenCoalMine) {
		this.screenCoalMine = screenCoalMine;
	}

	public WebElement getClickOnDashboard() {
		return clickOnDashboard;
	}

	public void setClickOnDashboard(WebElement clickOnDashboard) {
		this.clickOnDashboard = clickOnDashboard;
	}

	public WebElement getMenuGWDD() {
		return menuGWDD;
	}

	public void setMenuGWDD(WebElement menuGWDD) {
		this.menuGWDD = menuGWDD;
	}

	public WebElement getScreenGWDD() {
		return screenGWDD;
	}

	public void setScreenGWDD(WebElement screenGWDD) {
		this.screenGWDD = screenGWDD;
	}

	public WebElement getClickOnTMS() {
		return clickOnTMS;
	}

	public void setClickOnTMS(WebElement clickOnTMS) {
		this.clickOnTMS = clickOnTMS;
	}

	public WebElement getMenuTMS() {
		return menuTMS;
	}

	public void setMenuTMS(WebElement menuTMS) {
		this.menuTMS = menuTMS;
	}

	public WebElement getScreenTMS() {
		return screenTMS;
	}

	public void setScreenTMS(WebElement screenTMS) {
		this.screenTMS = screenTMS;
	}

	public WebElement getClickOnReports() {
		return clickOnReports;
	}

	public void setClickOnReports(WebElement clickOnReports) {
		this.clickOnReports = clickOnReports;
	}

	public WebElement getMenuOSR() {
		return menuOSR;
	}

	public void setMenuOSR(WebElement menuOSR) {
		this.menuOSR = menuOSR;
	}

	public WebElement getScreenOSR() {
		return screenOSR;
	}

	public void setScreenOSR(WebElement screenOSR) {
		this.screenOSR = screenOSR;
	}

	public WebElement getMenuSR() {
		return menuSR;
	}

	public void setMenuSR(WebElement menuSR) {
		this.menuSR = menuSR;
	}

	public WebElement getScreenSR() {
		return screenSR;
	}

	public void setScreenSR(WebElement screenSR) {
		this.screenSR = screenSR;
	}

	public WebElement getMenuFSR() {
		return menuFSR;
	}

	public void setMenuFSR(WebElement menuFSR) {
		this.menuFSR = menuFSR;
	}

	public WebElement getScreenFSR() {
		return screenFSR;
	}

	public void setScreenFSR(WebElement screenFSR) {
		this.screenFSR = screenFSR;
	}

	public WebElement getMenuFWDR() {
		return menuFWDR;
	}

	public void setMenuFWDR(WebElement menuFWDR) {
		this.menuFWDR = menuFWDR;
	}

	public WebElement getScreenFWDR() {
		return screenFWDR;
	}

	public void setScreenFWDR(WebElement screenFWDR) {
		this.screenFWDR = screenFWDR;
	}

	public WebElement getMenuGWDR() {
		return menuGWDR;
	}

	public void setMenuGWDR(WebElement menuGWDR) {
		this.menuGWDR = menuGWDR;
	}

	public WebElement getScreenGWDR() {
		return screenGWDR;
	}

	public void setScreenGWDR(WebElement screenGWDR) {
		this.screenGWDR = screenGWDR;
	}
	
	
	
}
