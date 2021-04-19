package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AddStaff extends BaseClass{
	public AddStaff() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[3]/a")
	private WebElement ClickStaff;
	
	@FindBy(xpath = "//a[normalize-space()='Add Staff']")
	private WebElement ClickAddStaff;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.firstName']")
	private WebElement StaffFirstName;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.lastName']")
	private WebElement StaffLastName;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.displayName']")
	private WebElement StaffDisplayName;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.phoneNumber']")
	private WebElement StaffPhonenumber;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.email']")
	private WebElement StaffEmail;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.password']")
	private WebElement StaffPassword;
	
	@FindBy(xpath = "//select[@data-ng-model='vm.staff.gender']")
	private WebElement Staffgender;
	
	@FindBy(xpath = "//option[@value='string:5928230bd52ade0019e6ee53']")
	private WebElement StaffRole;
	
	@FindBy(xpath = "//button[@ng-click='vm.selectAllItems()']")
	private WebElement ClickSelectAll;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.address.line1']")
	private WebElement StaffAddress;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.address.city']")
	private WebElement StaffCity;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[4]/div/div[4]/div/select")
	private WebElement StaffState;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.address.postal_code']")
	private WebElement StaffZipcode;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div/div/form/div[4]/div/div[6]/div/select")
	private WebElement Color;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.staff.order']")
	private WebElement EnterOrder;
	
	@FindBy(xpath = "//select[@data-ng-model='vm.staff.status']")
	private WebElement StaffStatus;
	
	@FindBy(xpath = "//button[@ng-click='vm.save()']")
	private WebElement ClickSaveChanges;

	public WebElement getClickStaff() {
		return ClickStaff;
	}

	public WebElement getClickAddStaff() {
		return ClickAddStaff;
	}

	public WebElement getStaffFirstName() {
		return StaffFirstName;
	}

	public WebElement getStaffLastName() {
		return StaffLastName;
	}

	public WebElement getStaffDisplayName() {
		return StaffDisplayName;
	}

	public WebElement getStaffPhonenumber() {
		return StaffPhonenumber;
	}

	public WebElement getStaffEmail() {
		return StaffEmail;
	}

	public WebElement getStaffPassword() {
		return StaffPassword;
	}

	public WebElement getStaffgender() {
		return Staffgender;
	}

	public WebElement getStaffRole() {
		return StaffRole;
	}

	public WebElement getClickSelectAll() {
		return ClickSelectAll;
	}

	public WebElement getStaffAddress() {
		return StaffAddress;
	}

	public WebElement getStaffCity() {
		return StaffCity;
	}

	public WebElement getStaffState() {
		return StaffState;
	}

	public WebElement getStaffZipcode() {
		return StaffZipcode;
	}

	public WebElement getColor() {
		return Color;
	}

	public WebElement getEnterOrder() {
		return EnterOrder;
	}

	public WebElement getStaffStatus() {
		return StaffStatus;
	}

	public WebElement getClickSaveChanges() {
		return ClickSaveChanges;
	}
	
	
}
