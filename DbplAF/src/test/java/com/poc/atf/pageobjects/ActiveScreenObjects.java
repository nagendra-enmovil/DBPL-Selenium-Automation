package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveScreenObjects {
	
	@FindBy(xpath = "//input[@name= 'startDate']")
	private WebElement Fromdate;

	@FindBy(xpath = "(//th[text()= 'May 2024'])[1]")
	private WebElement clickOnMonthandYearHeader;
	
	@FindBy(xpath = "//th[text()='2024']")
	private WebElement clickOnYearHeader;
	
	@FindBy(xpath = "//td[text()='2024']")
	private WebElement SelectOnYear;
	
	@FindBy(xpath = "//td[text()='Jan']")
	private WebElement SelectOnMonth;
	
	@FindBy(xpath = "(//td[text()='1'])[1]")
	private WebElement SelectOnDate;
	
	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	private WebElement clickonsecondsubmitbutton;
	
	@FindBy(xpath = "//label[text()=\"Select Type   \"]//following-sibling::div")
	private WebElement clickSelecttypefield;
	
	@FindBy(xpath = "//div[text()='Truck']")
	private WebElement Selecttypevalue;
	
	@FindBy(xpath = "//input[@id='inputTruckConsignment']")
	private WebElement clicktruckinputfield;
	
	@FindBy(xpath = "(//button[text()='Submit'])[1]")
	private WebElement clickonsubmitbutton;
	
	@FindBy(xpath = "//div[text()='CG10R1485']")
	private WebElement gridtext;
	
	@FindBy(xpath = "//button[text()='Reset Filters']")
	private WebElement resetfilters;
	
	@FindBy(xpath = "//span[text()='Consignments']/preceding-sibling::h4")
	private WebElement slabCountText;
	
	@FindBy(xpath = "//span[text()='Rows']/following-sibling::span[@ref='eValue']")
	private WebElement gridSlabCountText;
	
	@FindBy(xpath = "//span[text()='Transit Delays']/preceding-sibling::h4")
	private WebElement TDslabCountText;
	
	@FindBy(xpath = "//span[text()='Rows']/following-sibling::span[@ref='eValue']")
	private WebElement TDgridSlabCountText;
	
	@FindBy(xpath = "//span[text()='Overspeeding']/preceding-sibling::h4")
	private WebElement OSslabCountText;
	
	@FindBy(xpath = "//span[text()='Rows']/following-sibling::span[@ref='eValue']")
	private WebElement OSgridSlabCountText;
	
	@FindBy(xpath = "//span[text()='Stoppages']/preceding-sibling::h4")
	private WebElement StoppagesslabCountText;
	
	@FindBy(xpath = "//span[text()='Rows']/following-sibling::span[@ref='eValue']")
	private WebElement StoppagesgridSlabCountText;
	
	@FindBy(xpath = "//span[text()='Deviations']/preceding-sibling::h4")
	private WebElement DeviationslabCountText;
	
	@FindBy(xpath = "//span[text()='Rows']/following-sibling::span[@ref='eValue']")
	private WebElement DeviationgridSlabCountText;
	
	

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

	public WebElement getClickonsecondsubmitbutton() {
		return clickonsecondsubmitbutton;
	}

	public void setClickonsecondsubmitbutton(WebElement clickonsecondsubmitbutton) {
		this.clickonsecondsubmitbutton = clickonsecondsubmitbutton;
	}

	public WebElement getClickSelecttypefield() {
		return clickSelecttypefield;
	}

	public void setClickSelecttypefield(WebElement clickSelecttypefield) {
		this.clickSelecttypefield = clickSelecttypefield;
	}

	public WebElement getSelecttypevalue() {
		return Selecttypevalue;
	}

	public void setSelecttypevalue(WebElement selecttypevalue) {
		Selecttypevalue = selecttypevalue;
	}

	public WebElement getClicktruckinputfield() {
		return clicktruckinputfield;
	}

	public void setClicktruckinputfield(WebElement clicktruckinputfield) {
		this.clicktruckinputfield = clicktruckinputfield;
	}

	public WebElement getClickonsubmitbutton() {
		return clickonsubmitbutton;
	}

	public void setClickonsubmitbutton(WebElement clickonsubmitbutton) {
		this.clickonsubmitbutton = clickonsubmitbutton;
	}

	public WebElement getGridtext() {
		return gridtext;
	}

	public WebElement getResetfilters() {
		return resetfilters;
	}

	public void setResetfilters(WebElement resetfilters) {
		this.resetfilters = resetfilters;
	}

	public void setGridtext(WebElement gridtext) {
		this.gridtext = gridtext;
	}

	public WebElement getSlabCountText() {
		return slabCountText;
	}

	public void setSlabCountText(WebElement slabCountText) {
		this.slabCountText = slabCountText;
	}

	public WebElement getGridSlabCountText() {
		return gridSlabCountText;
	}

	public void setGridSlabCountText(WebElement gridSlabCountText) {
		this.gridSlabCountText = gridSlabCountText;
	}

	public WebElement getTDslabCountText() {
		return TDslabCountText;
	}

	public void setTDslabCountText(WebElement tDslabCountText) {
		TDslabCountText = tDslabCountText;
	}

	public WebElement getTDgridSlabCountText() {
		return TDgridSlabCountText;
	}

	public void setTDgridSlabCountText(WebElement tDgridSlabCountText) {
		TDgridSlabCountText = tDgridSlabCountText;
	}

	public WebElement getOSslabCountText() {
		return OSslabCountText;
	}

	public void setOSslabCountText(WebElement oSslabCountText) {
		OSslabCountText = oSslabCountText;
	}

	public WebElement getOSgridSlabCountText() {
		return OSgridSlabCountText;
	}

	public void setOSgridSlabCountText(WebElement oSgridSlabCountText) {
		OSgridSlabCountText = oSgridSlabCountText;
	}

	public WebElement getStoppagesslabCountText() {
		return StoppagesslabCountText;
	}

	public void setStoppagesslabCountText(WebElement stoppagesslabCountText) {
		StoppagesslabCountText = stoppagesslabCountText;
	}

	public WebElement getStoppagesgridSlabCountText() {
		return StoppagesgridSlabCountText;
	}

	public void setStoppagesgridSlabCountText(WebElement stoppagesgridSlabCountText) {
		StoppagesgridSlabCountText = stoppagesgridSlabCountText;
	}

	public WebElement getDeviationslabCountText() {
		return DeviationslabCountText;
	}

	public void setDeviationslabCountText(WebElement deviationslabCountText) {
		DeviationslabCountText = deviationslabCountText;
	}

	public WebElement getDeviationgridSlabCountText() {
		return DeviationgridSlabCountText;
	}

	public void setDeviationgridSlabCountText(WebElement deviationgridSlabCountText) {
		DeviationgridSlabCountText = deviationgridSlabCountText;
	}
	
	
	
}
