package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Login extends BaseClass {
	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@type='email']")
	private WebElement txtEmail;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//*[@class='btn btn-primary block full-width m-b']")
	private WebElement logIn;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getlogIn() {
		return logIn;
	}


}
