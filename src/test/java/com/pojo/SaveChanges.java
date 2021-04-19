package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SaveChanges extends BaseClass{
	public SaveChanges() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div[2]/div/div/div/div/div/button[2]")
	private WebElement ClickSaveChanges;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div[1]/div/form/div/div[1]/div/input")
	private WebElement SearchClientName;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div[1]/div/form/div/div[3]/div/button[2]")
	private WebElement ClickSearch;

	public WebElement getClickSaveChanges() {
		return ClickSaveChanges;
	}

	public WebElement getSearchClientName() {
		return SearchClientName;
	}

	public WebElement getClickSearch() {
		return ClickSearch;
	}
}
