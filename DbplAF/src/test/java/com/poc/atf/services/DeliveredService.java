package com.poc.atf.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.ActiveScreenObjects;
import com.poc.atf.pageobjects.DeliveredObjects;

public class DeliveredService {
	
	public static DeliveredObjects deliveredObjects;
	private static Logger log = Logger.getLogger(DeliveredService.class);
	
	// Initialize LoginObjects
    public static void init() {
    	deliveredObjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DeliveredObjects.class);
    }
    
    public DeliveredService deliveredButton() {
    	deliveredObjects.getDeliveredButton().click();
    	BrowserDriver.wait(5);
    	return this;
    }
    
    public DeliveredService selectTypeFilters() {
    	
    	deliveredObjects.getDeliveredButton().click();
    	BrowserDriver.wait(5);
    	deliveredObjects.getClickSelecttypefield().click();
    	deliveredObjects.getSelecttypevalue().click();
		return this;
    }
    
    public DeliveredService inputTypeField(String consignmentNo) {
    	deliveredObjects.getClickconsinputfield().sendKeys(consignmentNo);
		return this;
    }
    
    public DeliveredService clickSubmitButton() {
    	deliveredObjects.getClickonsubmitbutton().click();
		BrowserDriver.scrollDown();
		BrowserDriver.wait(2);
		BrowserDriver.scrollUp();
		System.out.println("Delivered screen Validations");
		return this;
	}
    
    public String gridText() {
    	String Value = deliveredObjects.getGridtext().getText();
    	System.out.println("Filters output result: " + Value);
    	return Value;
    }
    
    public void rsFilters() {
    	deliveredObjects.getResetfilters().click();
    	BrowserDriver.wait(1);
    }
    
    public void clickConSlab() {
    	deliveredObjects.getSlabCountText().click();
        BrowserDriver.wait(2);
    }
    
    public String Slabtext() {
    	String consslab = deliveredObjects.getSlabCountText().getText();
    	System.out.println("Count of Consignments KPI: " + consslab);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(2);
    	return consslab;
    }
    
    public String gridSlabText() {
    	String congridtext = deliveredObjects.getGridSlabCountText().getText();
    	System.out.println("Count of  Grid Consignments KPI: " + congridtext);
    	congridtext = congridtext.replace(",", "");
		BrowserDriver.fUllScrollUp();
    	return congridtext;
    }
    
    public void clickTDSlab() {
    	deliveredObjects.getTDslabCountText().click();
    }
    
    public String TDSlabtext() {
    	String TDST = deliveredObjects.getTDslabCountText().getText();
    	System.out.println("Count of Transit Delays KPI: " + TDST);
    	return TDST;
    }
    
    public String TDgridSlabText() {
    	String TDGST = deliveredObjects.getTDgridSlabCountText().getText();
    	System.out.println("Count of  Grid Transit Delays KPI: " + TDGST);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return TDGST;
    }
    
    public void clickOsSlab() {
    	deliveredObjects.getOSslabCountText().click();
    }
    
    public String OSSlabtext() {
    	String OSST = deliveredObjects.getOSslabCountText().getText();
    	System.out.println("Count of  Overspeedding KPI: " + OSST);
    	return OSST;
    }
    
    public String OSgridSlabText() {
    	String OSGST = deliveredObjects.getOSgridSlabCountText().getText();
    	System.out.println("Count of  Grid overspeeding KPI: " + OSGST);
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return OSGST;
    }
    
    public void clickStoppagesSlab() {
    	deliveredObjects.getStoppagesslabCountText().click();
    }
    
    public String StoppagesSlabtext() {
    	String SST = deliveredObjects.getStoppagesslabCountText().getText();
    	System.out.println("Count of  Stoppages KPI: " + SST);
    	return SST;
    }
    
    public String StoppagesgridSlabText() {
    	String SGST = deliveredObjects.getStoppagesgridSlabCountText().getText();
    	System.out.println("Count of  Grid Stoppages KPI: " + SGST);
    	SGST = SGST.replace(",", "");
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return SGST;
    }
    
    public void clickDeviationSlab() {
    	deliveredObjects.getDeviationslabCountText().click();
    }
    
    public String DeviationSlabtext() {
    	String DST = deliveredObjects.getDeviationslabCountText().getText();
    	System.out.println("Count of  Deviation KPI: " + DST);
    	return DST;
    }
    
    public String DevigridSlabText() {
    	String DGST = deliveredObjects.getDeviationslabCountText().getText();
    	System.out.println("Count of  Grid Deviation KPI: " + DGST);
    	DGST = DGST.replace(",", "");
    	BrowserDriver.fullScrollDown();
    	BrowserDriver.wait(3);
		BrowserDriver.fUllScrollUp();
    	return DGST;
    }
}
