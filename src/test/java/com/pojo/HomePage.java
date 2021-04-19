package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomePage extends BaseClass{
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[2]/a")
	private WebElement ClickClients;


    public WebElement getclickClients() {
	return ClickClients;
	
    }
}