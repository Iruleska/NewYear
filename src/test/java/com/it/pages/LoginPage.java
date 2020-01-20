package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends basePage{
	@FindBy(name = "login")
    private WebElement inputLogin;

	@FindBy(name = "pass")
    private WebElement inputPassword;

	@FindBy(xpath = "//input[@tabindex='5']")
    private WebElement btnLogin;

	protected void login (String userName, String password) {
	    inputLogin.sendKeys(userName);
	    inputPassword.sendKeys(password);
	    btnLogin.click();
    }
	}

