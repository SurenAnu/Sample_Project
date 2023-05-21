package org.irctc_step_definition;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.Home_Page.Address_Details;
import org.Home_Page.Home_page;
import org.Home_Page.Personal_Details;
import org.Home_Page.Register_Page;
import org.irctc_runner_class.Runner_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base_Class.Base_Class_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;

public class Irctc_Step_Definition extends Base_Class_Methods {
	public static WebDriver driver = Runner_Class.driver;
	public Home_page home = new Home_page(driver);
	public Register_Page register = new Register_Page(driver);
    public Personal_Details personal = new Personal_Details(driver);
    public Address_Details add = new Address_Details(driver);
	
	
	@Given("user lanch the irctc web application")
	public void user_lanch_the_irctc_web_application() {
		max(driver);
		url(driver, "https://www.irctc.co.in/nget/train-search");	
	}
	@When("user click dismiss alert pop in alert field")
	public void user_click_dismiss_alert_pop_in_alert_field() throws InterruptedException {
		impwait(driver);
		Thread.sleep(1000);
//		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
//		   LocalDateTime now = LocalDateTime.now();
//		   String format = dtf.format(now);
//		   System.out.println(dtf.format(now));	
//		   if(format >= "09:30:00" && format <= "12:30:00")
//		    {
//		       firstTime = true;
//		    }
	}
	@Then("user click Register button it is redireacts to creat account page")
	public void user_click_register_button_it_is_redireacts_to_creat_account_page() {
		clk(home.reg);
	}
	@When("user enter name in user name field")
	public void user_enter_name_in_user_name_field() {
		sendkey(register.getUsername(), "SuReNdHaR");
	}
	@When("user enter password in password field")
	public void user_enter_password_in_password_field() {
		sendkey(register.getPassword(), "SuReN12@12");
	}
	@When("user again enter re_password in confirm password field")
	public void user_again_enter_re_password_in_confirm_password_field() {
		sendkey(register.getRepassword(), "SuReN12@12");
	}
	@When("user select language in preferred language field")
	public void user_select_language_in_preferred_language_field() {
		clk(register.getLanguage());
		clk(register.getEnglish());	
	}
	@When("user Select the security question in  security question field")
	public void user_select_the_security_question_in_security_question_field() {
		clk(register.getQuestion());
		clk(register.getDrop());
	}
	@When("user enter the Security Answer in Answer field")
	public void user_enter_the_security_answer_in_answer_field() {
		sendkey(register.getAnswer(), "Don Boscho");
	}
	@When("user click the continue button it is redireacts to Personal Details")
	public void user_click_the_continue_button_it_is_redireacts_to_personal_details() {
		clk(register.getContin());	
	}
	@When("user enter the First name in firstname field")
	public void user_enter_the_first_name_in_firstname_field() {
		sendkey(personal.getFirstname(), "Suren");	
	}
	@When("user enter the middle name in middle name optionl field")
	public void user_enter_the_middle_name_in_middle_name_optionl_field() {
		sendkey(personal.getMiddlename(), "A");}
	@When("user enter the last name in last name optionl field")
	public void user_enter_the_last_name_in_last_name_optionl_field() {
		sendkey(personal.getLastname(), "APS");}
	@When("user select the occupation in the occpation field")
	public void user_select_the_occupation_in_the_occpation_field() {
		clk(personal.getOccupation());
		WebElement oc = driver.findElement(By.xpath("//li[@aria-label='PROFESSIONAL']"));
		oc.click();}
	@When("user enter DOB in date of birth field")
	public void user_enter_dob_in_date_of_birth_field() {
		clk(personal.getDob());}
	@When("user Select the month in month field")
	public void user_select_the_month_in_month_field() {}
	@When("user Select the year in year field")
	public void user_select_the_year_in_year_field() throws InterruptedException {
	}
	@When("user enter the day on the calender field")
	public void user_enter_the_day_on_the_calender_field() throws InterruptedException {
		sendkey(personal.getDob1(), "25-05-2023");
		Thread.sleep(5000);}	
	@When("user click the married field")
	public void user_click_the_married_field() {
	  
clk(register.getMarried());		
	}
@When("user click nationality field")
    public void user_click_nationality_field() throws InterruptedException {
	clk(register.getNationality());
	Thread.sleep(3000);
	selint(register.getNationality(), 10);
}	
@When("user click gender field")
    public void user_click_gender_field() {
	clk(register.getGender());
}
@When("user enter email id in email field")
    public void user_enter_email_id_in_email_field() {
	sendkey(register.getEmail(), "kuttisurendhar@gmail.com");
}
@When("user enter india mobil number in mobil field")
    public void user_enter_india_mobil_number_in_mobil_field() {
	sendkey(register.getMobil(), "9500234881");
}
@When("user click select nationality field")
    public void user_click_select_nationality_field() {
	clk(register.getNationality1());
}
@When("user select nationality in the field")
    public void user_select_nationality_in_the_field() {
	selint(register.getNationality1(), 15);
}
@Then("user click continue button it is redirects to address page")
    public void user_click_continue_button_it_is_redirects_to_address_page() {
	clk(register.getContinu());
}
@When("user enter Dno in Dno field")
    public void user_enter_dno_in_dno_field() {
	sendkey(add.getDno(), "2/23");
}
@When("user enter the street name in street field")
    public void user_enter_the_street_name_in_street_field() {
	sendkey(add.getStreet(), "elagiri village");
}
@When("user enter the locality name in locality field")
    public void user_enter_the_locality_name_in_locality_field() {
	sendkey(add.getLocality(), "jolarpet");
}
@When("user enter the pincode name in pincode field")
    public void user_enter_the_pincode_name_in_pincode_field() {
	sendkey(add.getPincode(), "635853");
}
@When("user enter the state name in state field")
    public void user_enter_the_state_name_in_state_field() {
	sendkey(add.getState(), "Tamil Nadu");}
@When("user select city in city field")
    public void user_select_city_in_city_field() {
	sendkey(add.getCity(), "jolarpet");
    }
@When("user click post office in the field")
    public void user_click_post_office_in_the_field()  {
	sendkey(add.getPost(), "elagiri");
}
@When("user enter the mobil number in phone field")
    public void user_enter_the_mobil_number_in_phone_field() {
sendkey(add.getPhone(), "9500234881");
}
@When("user click office address in the field")
    public void user_click_office_address_in_the_field() {
	clk(add.getYes());
}
	
	
	
	
	
	
	
}
