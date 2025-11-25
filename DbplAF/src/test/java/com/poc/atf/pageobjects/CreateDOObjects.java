package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateDOObjects {
	
	@FindBy(xpath = "//img[@id='sidebar-toggle']")
	private WebElement threedots;
	
	@FindBy(xpath = "//a[text()='Create DO']")
	private WebElement createDOname;
	
	@FindBy(xpath = "//button[text()='Add DO']")
	private WebElement AddDO;
	
	@FindBy(xpath = "//label[text()='Coal Mine ']//following-sibling::div")
	private WebElement Coalmine;
	
	@FindBy(xpath = "//div[text()='Bijari Mine - IBLCR04']")
	private WebElement selectCoalmine;
	
	@FindBy(xpath = "//input[@name='do_number']")
	private WebElement enterDoNumber;
	
	@FindBy(xpath = "//input[@name= 'startDate']")
	private WebElement Fromdate;

	@FindBy(xpath = "(//th[text()= 'May 2024'])[2]")
	private WebElement clickOnMonthandYearHeader;
	
	@FindBy(xpath = "//th[text()='2024']")
	private WebElement clickOnYearHeader;
	
	@FindBy(xpath = "//td[text()='2024']")
	private WebElement SelectOnYear;
	
	@FindBy(xpath = "//td[text()='Mar']")
	private WebElement SelectOnMonth;
	
	@FindBy(xpath = "(//td[text()='1'])[5]")
	private WebElement SelectOnDate;
	
	@FindBy(xpath = "//input[@name='endDate']")
	private WebElement ToDate;

	@FindBy(xpath = "(//th[text()='May 2024'])[2]")
	private WebElement ClickOnToDateMonthandYear;
	
	@FindBy(xpath = "//th[text()='2024']")
	private WebElement ClickOnToDateYear;
	
	@FindBy(xpath = "//td[text()='2024']")
	private WebElement SelectOnToDateYear;
	
	@FindBy(xpath = "//td[text()='Apr']")
	private WebElement SelectOnToDateMonth;
	
	@FindBy(xpath = "(//td[text()='1'])[7]")
	private WebElement SelectOnToDate;
	
	@FindBy(xpath = "//input[@name='do_quantity']")
	private WebElement ClcikQuantity;
	
	@FindBy(xpath = "(//div[@class='theme-form col-xl-12 col-lg-12']//following-sibling::div/button[text()='Submit'])[1]")
	private WebElement submitButton;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okButton;
	
	@FindBy(xpath = "//div[@row-index = '0' and @row-id = '0']//following-sibling::div[@aria-colindex = '3']")
	private WebElement gridCell;
	
	public WebElement getThreedots() {
		return threedots;
	}

	public void setThreedots(WebElement threedots) {
		this.threedots = threedots;
	}

	public WebElement getCreateDOname() {
		return createDOname;
	}

	public void setCreateDOname(WebElement createDOname) {
		this.createDOname = createDOname;
	}

	public WebElement getAddDO() {
		return AddDO;
	}

	public void setAddDO(WebElement addDO) {
		AddDO = addDO;
	}

	public WebElement getCoalmine() {
		return Coalmine;
	}

	public void setCoalmine(WebElement coalmine) {
		Coalmine = coalmine;
	}

	public WebElement getSelectCoalmine() {
		return selectCoalmine;
	}

	public void setSelectCoalmine(WebElement selectCoalmine) {
		this.selectCoalmine = selectCoalmine;
	}

	public WebElement getEnterDoNumber() {
		return enterDoNumber;
	}

	public void setEnterDoNumber(WebElement enterDoNumber) {
		this.enterDoNumber = enterDoNumber;
	}

	public WebElement getFromdate() {
		return Fromdate;
	}

	public void setFromdate(WebElement fromdate) {
		Fromdate = fromdate;
	}

	public WebElement getClickOnMonthandYearHeader() {
		return clickOnMonthandYearHeader;
	}

	public void setClickOnMonthandYearHeader(WebElement clickOnMonthandYearHeader) {
		this.clickOnMonthandYearHeader = clickOnMonthandYearHeader;
	}

	public WebElement getClickOnYearHeader() {
		return clickOnYearHeader;
	}

	public void setClickOnYearHeader(WebElement clickOnYearHeader) {
		this.clickOnYearHeader = clickOnYearHeader;
	}

	public WebElement getSelectOnYear() {
		return SelectOnYear;
	}

	public void setSelectOnYear(WebElement selectOnYear) {
		SelectOnYear = selectOnYear;
	}

	public WebElement getSelectOnMonth() {
		return SelectOnMonth;
	}

	public void setSelectOnMonth(WebElement selectOnMonth) {
		SelectOnMonth = selectOnMonth;
	}

	public WebElement getSelectOnDate() {
		return SelectOnDate;
	}

	public void setSelectOnDate(WebElement selectOnDate) {
		SelectOnDate = selectOnDate;
	}

	public WebElement getToDate() {
		return ToDate;
	}

	public void setToDate(WebElement toDate) {
		ToDate = toDate;
	}

	public WebElement getClickOnToDateMonthandYear() {
		return ClickOnToDateMonthandYear;
	}

	public void setClickOnToDateMonthandYear(WebElement clickOnToDateMonthandYear) {
		ClickOnToDateMonthandYear = clickOnToDateMonthandYear;
	}

	public WebElement getClickOnToDateYear() {
		return ClickOnToDateYear;
	}

	public void setClickOnToDateYear(WebElement clickOnToDateYear) {
		ClickOnToDateYear = clickOnToDateYear;
	}

	public WebElement getSelectOnToDateYear() {
		return SelectOnToDateYear;
	}

	public void setSelectOnToDateYear(WebElement selectOnToDateYear) {
		SelectOnToDateYear = selectOnToDateYear;
	}

	public WebElement getSelectOnToDateMonth() {
		return SelectOnToDateMonth;
	}

	public void setSelectOnToDateMonth(WebElement selectOnToDateMonth) {
		SelectOnToDateMonth = selectOnToDateMonth;
	}

	public WebElement getSelectOnToDate() {
		return SelectOnToDate;
	}

	public void setSelectOnToDate(WebElement selectOnToDate) {
		SelectOnToDate = selectOnToDate;
	}

	public WebElement getClcikQuantity() {
		return ClcikQuantity;
	}

	public void setClcikQuantity(WebElement clcikQuantity) {
		ClcikQuantity = clcikQuantity;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}

	public WebElement getOkButton() {
		return okButton;
	}

	public void setOkButton(WebElement okButton) {
		this.okButton = okButton;
	}

	public WebElement getGridCell() {
		return gridCell;
	}

	public void setGridCell(WebElement gridCell) {
		this.gridCell = gridCell;
	}
	
	

}
