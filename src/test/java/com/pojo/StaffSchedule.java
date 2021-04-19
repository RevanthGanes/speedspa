package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class StaffSchedule extends BaseClass{
	public StaffSchedule() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[5]/a/span") 
	private WebElement ClickStaffSchedule;
	
	@FindBy(xpath = "//a[@data-ng-click='button.callback()']")
	private WebElement ClickAddNewStaffSchedule;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[2]/div/select")
	private WebElement SelectStaff;
	
	@FindBy(xpath = "//select[@data-ng-model='vm.event.period']")
	private WebElement SelectOccurence;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[5]/div/span[1]/input")
	private WebElement ClickFirstDay;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[5]/div/span[2]/input")
	private WebElement ClickSecondDay;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[5]/div/span[3]/input")
	private WebElement ClickThirdDay;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[5]/div/span[4]/input")
	private WebElement ClickFourthDat;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[5]/div/span[5]/input")
	private WebElement ClickFivthDay;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[5]/div/span[6]/input")
	private WebElement ClickSisthDay;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[5]/div/span[7]/input")
	private WebElement ClickSeventhDay;
	
	@FindBy(xpath = "//button[@ng-click='vm.openDate(vm.popupDateTimeStart)']")
	private WebElement ClickDateIcon;
	
	@FindBy(xpath = "//button[@ng-click=\"select('today', $event)\"]")
	private WebElement SelectDate;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[7]/div[2]/div/input")
	private WebElement SelectEndDate;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[8]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	private WebElement StartTimeHour;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[8]/div[1]/div/table/tbody/tr[2]/td[3]/input")
	private WebElement StartTimeMins;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[8]/div[2]/div/table/tbody/tr[2]/td[1]/input")
	private WebElement EndTimeHour;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[8]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	private WebElement EndTimeMins;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[9]/div/button[2]")
	private WebElement ClickSaveChanges;

	public WebElement getClickStaffSchedule() {
		return ClickStaffSchedule;
	}

	public WebElement getClickAddNewStaffSchedule() {
		return ClickAddNewStaffSchedule;
	}

	public WebElement getSelectStaff() {
		return SelectStaff;
	}

	public WebElement getSelectOccurence() {
		return SelectOccurence;
	}

	public WebElement getClickFirstDay() {
		return ClickFirstDay;
	}

	public WebElement getClickSecondDay() {
		return ClickSecondDay;
	}

	public WebElement getClickThirdDay() {
		return ClickThirdDay;
	}

	public WebElement getClickFourthDat() {
		return ClickFourthDat;
	}

	public WebElement getClickFivthDay() {
		return ClickFivthDay;
	}

	public WebElement getClickSisthDay() {
		return ClickSisthDay;
	}

	public WebElement getClickSeventhDay() {
		return ClickSeventhDay;
	}

	public WebElement getClickDateIcon() {
		return ClickDateIcon;
	}

	public WebElement getSelectDate() {
		return SelectDate;
	}

	public WebElement getSelectEndDate() {
		return SelectEndDate;
	}

	public WebElement getStartTimeHour() {
		return StartTimeHour;
	}

	public WebElement getStartTimeMins() {
		return StartTimeMins;
	}

	public WebElement getEndTimeHour() {
		return EndTimeHour;
	}

	public WebElement getEndTimeMins() {
		return EndTimeMins;
	}

	public WebElement getClickSaveChanges() {
		return ClickSaveChanges;
	}
	

}
