package com.poc.atf.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.ActiveScreenObjects;
import com.poc.atf.pageobjects.LoginObjects;

public class ActiveScreenService {
	
	public static ActiveScreenObjects activeScreenObjects;
	private static Logger log = Logger.getLogger(ActiveScreenService.class);
	
	// Initialize LoginObjects
    public static void init() {
    	activeScreenObjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ActiveScreenObjects.class);
    }
    
    public ActiveScreenService fromDateActiveScreen() {
    	activeScreenObjects.getFromdate().click();
    	activeScreenObjects.getClickOnMonthandYearHeader().click();
    	activeScreenObjects.getClickOnYearHeader().click();
    	activeScreenObjects.getSelectOnYear().click();
    	activeScreenObjects.getSelectOnMonth().click();
    	activeScreenObjects.getSelectOnDate().click();
    	activeScreenObjects.getClickonsecondsubmitbutton().click();
    	return this;
    }
    
    public ActiveScreenService selectTypeFilters() {
    	BrowserDriver.wait(5);
    	activeScreenObjects.getClickSelecttypefield().click();
    	activeScreenObjects.getSelecttypevalue().click();
		return this;
    }
    
    public ActiveScreenService inputTypeField(String truckNo) {
    	activeScreenObjects.getClicktruckinputfield().sendKeys(truckNo);
		return this;
    }
    
    public ActiveScreenService clickSubmitButton() {
		activeScreenObjects.getClickonsubmitbutton().click();
		BrowserDriver.scrollDown();
		BrowserDriver.wait(2);
		BrowserDriver.scrollUp();
		System.out.println("Active screen Validations");
		return this;
	}
    
    public String gridText() {
    	String Value = activeScreenObjects.getGridtext().getText();
    	System.out.println("Filters output result: " + Value);
    	return Value;
    }
    
    public void rsFilters() {
    	activeScreenObjects.getResetfilters().click();
    	BrowserDriver.wait(1);
    }
    
    public void clickConSlab() {
        activeScreenObjects.getSlabCountText().click();
        BrowserDriver.wait(2);
    }
    
    public String Slabtext() {
    	String consslab = activeScreenObjects.getSlabCountText().getText();
    	System.out.println("Count of Consignments KPI: " + consslab);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(2);
    	return consslab;
    }
    
    public String gridSlabText() {
    	String congridtext = activeScreenObjects.getGridSlabCountText().getText();
    	System.out.println("Count of  Grid Consignments KPI: " + congridtext);
		BrowserDriver.fUllScrollUp();
    	return congridtext;
    }
    
    public void clickTDSlab() {
        activeScreenObjects.getTDslabCountText().click();
    }
    
    public String TDSlabtext() {
    	String TDST = activeScreenObjects.getTDslabCountText().getText();
    	System.out.println("Count of Transit Delays KPI: " + TDST);
    	return TDST;
    }
    
    public String TDgridSlabText() {
    	String TDGST = activeScreenObjects.getTDgridSlabCountText().getText();
    	System.out.println("Count of  Grid Transit Delays KPI: " + TDGST);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return TDGST;
    }
    
    public void clickOsSlab() {
        activeScreenObjects.getOSslabCountText().click();
    }
    
    public String OSSlabtext() {
    	String OSST = activeScreenObjects.getOSslabCountText().getText();
    	System.out.println("Count of  Overspeedding KPI: " + OSST);
    	return OSST;
    }
    
    public String OSgridSlabText() {
    	String OSGST = activeScreenObjects.getOSgridSlabCountText().getText();
    	System.out.println("Count of  Grid overspeeding KPI: " + OSGST);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return OSGST;
    }
    
    public void clickStoppagesSlab() {
        activeScreenObjects.getStoppagesslabCountText().click();
    }
    
    public String StoppagesSlabtext() {
    	String SST = activeScreenObjects.getStoppagesslabCountText().getText();
    	System.out.println("Count of  Stoppages KPI: " + SST);
    	return SST;
    }
    
    public String StoppagesgridSlabText() {
    	String SGST = activeScreenObjects.getStoppagesgridSlabCountText().getText();
    	System.out.println("Count of  Grid Stoppages KPI: " + SGST);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return SGST;
    }
    
    public void clickDeviationSlab() {
        activeScreenObjects.getDeviationslabCountText().click();
    }
    
    public String DeviationSlabtext() {
    	String DST = activeScreenObjects.getDeviationslabCountText().getText();
    	System.out.println("Count of  Deviation KPI: " + DST);
    	return DST;
    }
    
    public String DevigridSlabText() {
    	String DGST = activeScreenObjects.getDeviationslabCountText().getText();
    	System.out.println("Count of  Grid Deviation KPI: " + DGST);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return DGST;
    }
  
}
