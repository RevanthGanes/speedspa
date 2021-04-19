package com.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Schedule extends BaseClass{
	public Schedule() {
		PageFactory.initElements(driver, this);
	}
    //public static final By DropDown = By.xpath("//*[@id=\"select2-chosen-4\"]");
    
	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[4]/a/span")
	private WebElement ClickSchedule;
	
	@FindBy(xpath = "//a[@data-ng-repeat='button in vm.buttons']")
	private WebElement ClickAddAppointment;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[3]/div/select")
	private WebElement ServiceCategory;
	
	@FindBy(xpath = "//*[@id=\"s2id_serciceSelect\"]/a")
	private WebElement ClickMainService;
	
	@FindBy(xpath = "//*[@id=\"s2id_autogen4_search\"]")
	private WebElement SelectMainService;
	
	@FindBy(xpath = "//*[@id=\"s2id_staffSelect\"]/a")
	private WebElement ClickStaff;
	
	@FindBy(xpath = "//input[@id='s2id_autogen2_search']")
	private WebElement SelectStaff;
	
	@FindBy(xpath = "//*[@id=\"s2id_clientSelect\"]/a")
	private WebElement ClickClient;
	
	@FindBy(xpath = "//input[@aria-owns='select2-results-3']")
	private WebElement SelectClient;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[10]/div/div[1]/span/button")
	private WebElement AddAppointmentTime;
	
	@FindBy(xpath = "//button[@ng-click=\"select('today', $event)\"]")
	private WebElement SelectDate;
	
	@FindBy(xpath = "//input[@ng-change='updateHours()']")
	private WebElement AddHours;
	
	@FindBy(xpath = "//input[@ng-change='updateMinutes()']")
	private WebElement AddMinutes;
	
	@FindBy(xpath = "//button[@data-ng-click='vm.save()']")
	private WebElement ClickSaveChanges;

	public WebElement getClickSchedule() {
		return ClickSchedule;
	}

	public WebElement getClickAddAppointment() {
		return ClickAddAppointment;
	}

	public WebElement getServiceCategory() {
		return ServiceCategory;
	}

	public WebElement getClickMainService() {
		return ClickMainService;
	}

	public WebElement getSelectMainService() {
		return SelectMainService;
	}

	public WebElement getClickStaff() {
		return ClickStaff;
	}

	public WebElement getSelectStaff() {
		return SelectStaff;
	}

	public WebElement getClickClient() {
		return ClickClient;
	}

	public WebElement getSelectClient() {
		return SelectClient;
	}

	public WebElement getAddAppointmentTime() {
		return AddAppointmentTime;
	}
	
	public WebElement getSelectDate() {
		return SelectDate;
	}
	public WebElement getAddHours() {
		return AddHours;
	}

	public WebElement getAddMinutes() {
		return AddMinutes;
	}

	public WebElement getClickSaveChanges() {
		return ClickSaveChanges;
	}
	
	
	
	

}
