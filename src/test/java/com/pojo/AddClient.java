package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AddClient extends BaseClass{
	public AddClient() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div[1]/div/form/div/div[1]/div/input")
	private WebElement TxtSearch;
	
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//a[normalize-space()='Add Client']")
	private WebElement ClickAddclient;

	@FindBy(xpath = "//input[@data-ng-model='vm.client.firstName']")
	private WebElement ClientFirstname;

	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement ClientLastname;
	
	@FindBy(xpath = "//*[@id=\"countryCode\"]")
	private WebElement ClientCountrycode;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement ClientPhonenumber;
	
	@FindBy(xpath = "//input[@type='email'][@data-ng-model='vm.client.email']")
	private WebElement ClientEmail;
	
	@FindBy(xpath = "//input[@type='password'][@data-ng-model='vm.client.password']")
	private WebElement ClientPassword;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div/div/form/div[2]/div[1]/div[7]/div/select")
	private WebElement ClientStatus;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div/div/form/div[2]/div[1]/div[8]/div/select")
	private WebElement ClientGender;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.client.address.line1']")
	private WebElement ClientAddress;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.client.address.city']")
	private WebElement ClientCity;
	
	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div/div/form/div[2]/div[2]/div[4]/div/select")
	private WebElement ClientState;
	
	@FindBy(xpath = "//input[@data-ng-model='vm.client.address.postal_code']")
	private WebElement ClientZipcode;

	public WebElement getTxtSearch() {
		return TxtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getClickAddclient() {
		return ClickAddclient;
	}

	public WebElement getClientFirstname() {
		return ClientFirstname;
	}

	public WebElement getClientLastname() {
		return ClientLastname;
	}

	public WebElement getClientCountrycode() {
		return ClientCountrycode;
	}

	public WebElement getClientPhonenumber() {
		return ClientPhonenumber;
	}

	public WebElement getClientEmail() {
		return ClientEmail;
	}

	public WebElement getClientPassword() {
		return ClientPassword;
	}

	public WebElement getClientStatus() {
		return ClientStatus;
	}

	public WebElement getClientGender() {
		return ClientGender;
	}

	public WebElement getClientAddress() {
		return ClientAddress;
	}

	public WebElement getClientCity() {
		return ClientCity;
	}

	public WebElement getClientState() {
		return ClientState;
	}

	public WebElement getClientZipcode() {
		return ClientZipcode;
	}
	
}
