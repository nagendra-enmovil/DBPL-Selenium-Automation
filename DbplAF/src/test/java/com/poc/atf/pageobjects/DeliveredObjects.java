package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveredObjects {
	
	@FindBy(xpath = "//button[text()='Delivered']")
	private WebElement deliveredButton;
	
	@FindBy(xpath = "//label[text()=\"Select Type   \"]//following-sibling::div")
	private WebElement clickSelecttypefield;
	
	@FindBy(xpath = "//div[text()='Consignment No']")
	private WebElement Selecttypevalue;
	
	@FindBy(xpath = "//input[@id='inputTruckConsignment']")
	private WebElement clickconsinputfield;
	
	@FindBy(xpath = "(//button[text()='Submit'])[1]")
	private WebElement clickonsubmitbutton;
	
	@FindBy(xpath = "//div[text()='171101007994281']")
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
	
	
	public WebElement getGridtext() {
		return gridtext;
	}

	public void setGridtext(WebElement gridtext) {
		this.gridtext = gridtext;
	}

	public WebElement getResetfilters() {
		return resetfilters;
	}

	public void setResetfilters(WebElement resetfilters) {
		this.resetfilters = resetfilters;
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

	public WebElement getDeliveredButton() {
		return deliveredButton;
	}

	public void setDeliveredButton(WebElement deliveredButton) {
		this.deliveredButton = deliveredButton;
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

	public WebElement getClickconsinputfield() {
		return clickconsinputfield;
	}

	public void setClickconsinputfield(WebElement clickconsinputfield) {
		this.clickconsinputfield = clickconsinputfield;
	}

	public WebElement getClickonsubmitbutton() {
		return clickonsubmitbutton;
	}

	public void setClickonsubmitbutton(WebElement clickonsubmitbutton) {
		this.clickonsubmitbutton = clickonsubmitbutton;
	}

}
