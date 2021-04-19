package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FileUpload extends BaseClass{
	
	public FileUpload() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@data-ng-disabled='vm.uploading']")
	private WebElement clkChooseFile;


    public WebElement getClkChooseFile() {
	return clkChooseFile;
  }
}