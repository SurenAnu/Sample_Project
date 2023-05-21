package org.Home_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Details {
	
	public Personal_Details(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstname;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getMiddlename() {
		return middlename;
	}

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(xpath ="//input[@id='middleName']" )
	private WebElement middlename;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastname;
	
	
	
	@FindBy(xpath = "//span[.='Select Occupation']")
	private WebElement occupation;
	
	public WebElement getOccupation() {
		return occupation;
	}

	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement dob;
	
	public WebElement getDob() {
		return dob;
	}
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month ng-tns-c58-17 ng-star-inserted']")
	private WebElement month;

	public WebElement getMonth() {
		return month;
	}
	@FindBy(xpath = "//select[@class='ui-datepicker-year ng-tns-c58-17 ng-star-inserted']")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}
	@FindBy(xpath = "//input[@placeholder='Date Of Birth']")
	private WebElement dob1;

	public WebElement getDob1() {
		return dob1;
	}
	
	
	
	
}
