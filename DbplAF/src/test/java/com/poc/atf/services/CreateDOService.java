package com.poc.atf.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.log4testng.Logger;

import com.poc.atf.config.BrowserDriver;
import com.poc.atf.pageobjects.AllScreenObjects;
import com.poc.atf.pageobjects.CreateDOObjects;

public class CreateDOService {
	
	public static CreateDOObjects createDOObjects;
	private static Logger log = Logger.getLogger(CreateDOService.class);
	
	// Initialize LoginObjects
    public static void init() {
    	createDOObjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), CreateDOObjects.class);
    }
    
    public CreateDOService Threedots(){
    	createDOObjects.getThreedots().click();
    	return this;
    }
    
    public CreateDOService CreateDOname() {
    	createDOObjects.getCreateDOname().click();
    	return this;
    }
    
    public CreateDOService AddDoButton() {
    	createDOObjects.getAddDO().click();
    	BrowserDriver.wait(2);
    	return this;
    }
    
    public CreateDOService Coalmine() {
    	createDOObjects.getCoalmine().click();
    	BrowserDriver.wait(3);
    	return this;
    }
    
    public CreateDOService SelectCoalMine() {
    	createDOObjects.getSelectCoalmine().click();
    	return this;
    }
    
    public CreateDOService addDoNumber(String doNumber) {
//    	BrowserDriver.waitForPageElementLoad(ExpectedConditions.visibilityOf(createDOObjects.getEnterDoNumber()));
//    	BrowserDriver.waitForPageElement(createDOObjects.getEnterDoNumber(), null);
    	createDOObjects.getEnterDoNumber().sendKeys(doNumber);
    	return this;
    }
    
    public CreateDOService fromDateCreateDo() {
    	createDOObjects.getFromdate().click();
    	createDOObjects.getClickOnMonthandYearHeader().click();
    	createDOObjects.getClickOnYearHeader().click();
    	createDOObjects.getSelectOnYear().click();
    	createDOObjects.getSelectOnMonth().click();
    	createDOObjects.getSelectOnDate().click();
    	return this;
    }
    
    public CreateDOService toDateCreateDo() {
    	createDOObjects.getToDate().click();
    	createDOObjects.getClickOnToDateMonthandYear().click();
    	createDOObjects.getClickOnToDateYear().click();
    	createDOObjects.getSelectOnToDateYear().click();
    	createDOObjects.getSelectOnToDateMonth().click();
    	createDOObjects.getSelectOnToDate().click();
    	return this;
    }
    
    public CreateDOService quantity(String quantity) {
    	createDOObjects.getClcikQuantity().sendKeys(quantity);
    	return this;
    }
    
//    public CreateDOService chooseFile(){
//        WebElement uploadDO =  BrowserDriver.getCurrentDriver().findElement(By.xpath("//input[@id='uploadFile']"));
//        String filepath = "C:\\Users\\Nagendra\\Desktop\\Sample-jpg-image-5mb.jpg";
//        uploadDO.sendKeys(filepath);
//        return this;
//      }
    
    public CreateDOService submitButton() {
    	createDOObjects.getSubmitButton().click();
    	BrowserDriver.wait(2);
    	createDOObjects.getOkButton().click();
    	BrowserDriver.wait(2);
    	return this;
    }
    
    public String gridCellData() {
    	String celldata = createDOObjects.getGridCell().getText();
    	System.out.println(celldata);
		return celldata;
    }
}

