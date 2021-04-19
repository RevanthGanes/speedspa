package com.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;
import com.pojo.AddClient;
import com.pojo.AddStaff;
import com.pojo.FileUpload;
import com.pojo.HomePage;
import com.pojo.Login;
import com.pojo.SaveChanges;
import com.pojo.Schedule;
import com.pojo.StaffSchedule;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass{
	Login login;
	HomePage homePage;
	AddClient addClient;
	Schedule schedule;
	SaveChanges saveChanges;
	AddStaff addStaff;
	StaffSchedule staffSchedule;
	
	@Given("User is in login SpeedsSPA portal")
	public void user_is_in_login_SpeedsSPA_portal() {
	   
	}

	@When("User enters valid Email and password")
	public void user_enters_valid_Email_and_password() {
		login = new Login();
		insert(login.getTxtEmail(), "admin@speedspa.io");
		insert(login.getTxtPassword(), "12345");   
	    
	}

	@When("Click on Login button")
	public void click_on_Login_button() throws InterruptedException  {
		btnClick(login.getlogIn());
		Thread.sleep(4000);	
    }

	@When("User Click on clients button present in homepage")
	public void user_Click_on_clients_button_present_in_homepage() throws InterruptedException{
		
	/*	homePage = new HomePage();
		btnClick(homePage.getclickClients());
		Thread.sleep(3000);
		*/
	}

	@When("User Click Addclient and add clientinfo")
	public void user_Click_Addclient_and_add_clientinfo() throws InterruptedException   {
		/*addClient = new AddClient();
		btnClick(addClient.getClickAddclient());
		insert(addClient.getClientFirstname(), "Tom");
		insert(addClient.getClientLastname(), "Jerry");
		insert(addClient.getClientCountrycode(), "USA (+1)");
		insert(addClient.getClientPhonenumber(), "(725) 342-0696");
		insert(addClient.getClientEmail(), "tom@gmail.com");
		insert(addClient.getClientPassword(), "koch@123");
		insert(addClient.getClientStatus(), "active");
		insert(addClient.getClientGender(), "Male");
		insert(addClient.getClientAddress(), "P.O. Box 569 9561 Lacus. Road");
		insert(addClient.getClientCity(), "Laughlin");
		insert(addClient.getClientState(), "Hawaii");
		insert(addClient.getClientZipcode(), "99602");
		Thread.sleep(2000);*/
     }
	

	@Then("User Click on Savechanges")
	public void user_Click_on_Savechanges() throws InterruptedException {
		/*saveChanges = new SaveChanges();
		btnClick(saveChanges.getClickSaveChanges());
		Thread.sleep(3000);
		insert(saveChanges.getSearchClientName(), "Cecilia Chapman");
		btnClick(saveChanges.getClickSearch());
		*/
	}
	
	@Then("User Click on staff button and Add Staff")
	public void user_Click_on_staff_button_and_Add_Staff() throws InterruptedException {
		
		/*addStaff = new AddStaff();
		btnClick(addStaff.getClickStaff());
		btnClick(addStaff.getClickAddStaff());
		insert(addStaff.getStaffFirstName(), "Hedley");
		insert(addStaff.getStaffLastName(), "Ingram");
		insert(addStaff.getStaffDisplayName(), "Ingram");
		insert(addStaff.getStaffPhonenumber(), "(993) 554-0563");
		insert(addStaff.getStaffEmail(), "ingram@gmail.com");
		insert(addStaff.getStaffPassword(), "ingram122");
		insert(addStaff.getStaffgender(), "Male");
		btnClick(addStaff.getStaffRole());
		btnClick(addStaff.getClickSelectAll());
		FileUpload fileUpload = new FileUpload();
		WebElement clkChooseFile = fileUpload.getClkChooseFile();
		clkChooseFile.sendKeys(System.getProperty("user.dir") + "\\File\\tom&jerry.jpg");
		Thread.sleep(5000);
		insert(addStaff.getStaffAddress(), "737-2580 At Street");
		insert(addStaff.getStaffCity(), "Independence");
		insert(addStaff.getStaffState(), "Texas");
		insert(addStaff.getStaffZipcode(), "87535");
		insert(addStaff.getColor(), "#483d8b");
		insert(addStaff.getEnterOrder(), "6");
		insert(addStaff.getStaffStatus(), "Active");
	*/	//btnClick(addStaff.getClickSaveChanges());
		
	
		/*driver.findElement(By.xpath("//button[@ng-click='vm.save()']")).click();
		Thread.sleep(3000);*/
	}
	@Then("User Click schedule button and Add Appointment")
	public void user_Click_schedule_button_and_Add_Appointment() throws Throwable{
		
		/*schedule = new Schedule();
		Actions actions = new Actions(driver);
		btnClick(schedule.getClickSchedule());
		btnClick(schedule.getClickAddAppointment());
		insert(schedule.getServiceCategory(), "HAIR");
		btnClick(schedule.getClickMainService());
		insert(schedule.getSelectMainService(), "Foil");
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		btnClick(schedule.getClickStaff());
		insert(schedule.getSelectStaff(), "Ron Gierchak");
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		btnClick(schedule.getClickClient());
		insert(schedule.getSelectClient(), "Bryn Anna");
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		btnClick(schedule.getAddAppointmentTime());
	    btnClick(schedule.getSelectDate());
		//insert(schedule.getAddAppointmentTime(), "Wednesday, April 8, 2021");
		insert(schedule.getAddHours(), "3");
		Thread.sleep(2000);
		actions.sendKeys(Keys.TAB).build().perform();
		insert(schedule.getAddMinutes(), "30");
		btnClick(schedule.getClickSaveChanges());
		Thread.sleep(3000);
	*/		
	}
	@Then("User Click staff schedule button and Add New StaffSchedule")
	public void user_Click_staff_schedule_button_and_Add_New_StaffSchedule() throws InterruptedException {
		
		staffSchedule = new StaffSchedule();
		Actions actions = new Actions(driver);
		btnClick(staffSchedule.getClickStaffSchedule());
		Thread.sleep(3000);
		btnClick(staffSchedule.getClickAddNewStaffSchedule());
		Thread.sleep(3000);
		insert(staffSchedule.getSelectStaff(), "Kelly Yokel");
		insert(staffSchedule.getSelectOccurence(), "Weekly");
		btnClick(staffSchedule.getClickFirstDay());
		btnClick(staffSchedule.getClickSecondDay());
		btnClick(staffSchedule.getClickThirdDay());
		btnClick(staffSchedule.getClickFourthDat());
		btnClick(staffSchedule.getClickFivthDay());
		btnClick(staffSchedule.getClickSisthDay());
		btnClick(staffSchedule.getClickSeventhDay());
		btnClick(staffSchedule.getClickDateIcon());
		Thread.sleep(2000);
		btnClick(staffSchedule.getSelectDate());
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		insert(staffSchedule.getSelectEndDate(), "Monday, April 19, 2021");
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.TAB).build().perform();
		insert(staffSchedule.getStartTimeHour(), "11");
		actions.sendKeys(Keys.TAB).build().perform();
		insert(staffSchedule.getStartTimeMins(), "30");
		actions.sendKeys(Keys.TAB).build().perform();
		insert(staffSchedule.getEndTimeHour(), "18");
		actions.sendKeys(Keys.TAB).build().perform();
		insert(staffSchedule.getEndTimeMins(), "30");
		btnClick(staffSchedule.getClickSaveChanges());
	
	}
}
