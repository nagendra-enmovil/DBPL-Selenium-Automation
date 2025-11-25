package com.poc.atf.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.AllScreenObjects;

public class AllScreenService {
	
	public static AllScreenObjects allScreenObjects;
	private static Logger log = Logger.getLogger(AllScreenService.class);
	
	// Initialize LoginObjects
    public static void init() {
    	allScreenObjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AllScreenObjects.class);
    }
    
    public AllScreenService AllScreenButton() {
    	BrowserDriver.wait(2);
    	allScreenObjects.getAllButton().click();
    	BrowserDriver.wait(5);
    	return this;
    }
    
    public AllScreenService selectTypeFilters() {
    	BrowserDriver.wait(5);
    	allScreenObjects.getAllButton().click();
    	BrowserDriver.wait(5);
    	allScreenObjects.getClickSelecttypefield().click();
    	allScreenObjects.getSelecttypevalue().click();
		return this;
    }
    
    public AllScreenService inputTypeField(String consignmentNo) {
    	allScreenObjects.getClickconsinputfield().sendKeys(consignmentNo);
		return this;
    }
    
    public AllScreenService clickSubmitButton() {
    	allScreenObjects.getClickonsubmitbutton().click();
		BrowserDriver.scrollDown();
		BrowserDriver.wait(2);
		BrowserDriver.scrollUp();
		System.out.println("All screen Validations");
		return this;
	}
    
    public String gridText() {
    	String Value = allScreenObjects.getGridtext().getText();
    	System.out.println("Filters output result: " + Value);
    	return Value;
    }
    
    public void rsFilters() {
    	allScreenObjects.getResetfilters().click();
    	BrowserDriver.wait(1);
    }
    
    public void clickConSlab() {
    	allScreenObjects.getSlabCountText().click();
        BrowserDriver.wait(2);
    }
    
    public String Slabtext() {
    	String consslab = allScreenObjects.getSlabCountText().getText();
    	System.out.println("Count of Consignments KPI: " + consslab);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(2);
    	return consslab;
    }
    
    public String gridSlabText() {
    	String congridtext = allScreenObjects.getGridSlabCountText().getText();
    	System.out.println("Count of  Grid Consignments KPI: " + congridtext);
    	congridtext = congridtext.replace(",", "");
		BrowserDriver.fUllScrollUp();
    	return congridtext;
    }
    
    public void clickTDSlab() {
    	allScreenObjects.getTDslabCountText().click();
    }
    
    public String TDSlabtext() {
    	String TDST = allScreenObjects.getTDslabCountText().getText();
    	System.out.println("Count of Transit Delays KPI: " + TDST);
    	return TDST;
    }
    
    public String TDgridSlabText() {
    	String TDGST = allScreenObjects.getTDgridSlabCountText().getText();
    	System.out.println("Count of  Grid Transit Delays KPI: " + TDGST);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return TDGST;
    }
    
    public void clickOsSlab() {
    	allScreenObjects.getOSslabCountText().click();
    }
    
    public String OSSlabtext() {
    	String OSST = allScreenObjects.getOSslabCountText().getText();
    	System.out.println("Count of  Overspeedding KPI: " + OSST);
    	return OSST;
    }
    
    public String OSgridSlabText() {
    	String OSGST = allScreenObjects.getOSgridSlabCountText().getText();
    	System.out.println("Count of  Grid overspeeding KPI: " + OSGST);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return OSGST;
    }
    
    public void clickStoppagesSlab() {
    	allScreenObjects.getStoppagesslabCountText().click();
    }
    
    public String StoppagesSlabtext() {
    	String SST = allScreenObjects.getStoppagesslabCountText().getText();
    	System.out.println("Count of  Stoppages KPI: " + SST);
    	return SST;
    }
    
    public String StoppagesgridSlabText() {
    	String SGST = allScreenObjects.getStoppagesgridSlabCountText().getText();
    	System.out.println("Count of  Grid Stoppages KPI: " + SGST);
    	SGST = SGST.replace(",", "");
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return SGST;
    }
    
    public void clickDeviationSlab() {
    	allScreenObjects.getDeviationslabCountText().click();
    }
    
    public String DeviationSlabtext() {
    	String DST = allScreenObjects.getDeviationslabCountText().getText();
    	System.out.println("Count of  Deviation KPI: " + DST);
    	return DST;
    }
    
    public String DevigridSlabText() {
    	String DGST = allScreenObjects.getDeviationslabCountText().getText();
    	System.out.println("Count of  Grid Deviation KPI: " + DGST);
    	DGST = DGST.replace(",", "");
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return DGST;
    }
}
