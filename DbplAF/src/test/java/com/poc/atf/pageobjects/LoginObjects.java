package com.poc.atf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjects {
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement loginUsername;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement loginPassword;
	
	@FindBy(xpath = "//button[@id='loginButton']")
	private WebElement loginButton;
	

	public WebElement getLoginUsername() {
		return loginUsername;
	}

	public void setLoginUsername(WebElement loginUsername) {
		this.loginUsername = loginUsername;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(WebElement loginPassword) {
		this.loginPassword = loginPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
}
	
	


