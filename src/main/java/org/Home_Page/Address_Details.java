package org.Home_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Details {
	public static WebDriver driver;
	
	public Address_Details(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath = "//*[@id='resAddress1']")
		private WebElement dno;

		public WebElement getDno() {
			return dno;
		}
		@FindBy(xpath = "//*[@id='resAddress2']")
		private WebElement street;
		
		public WebElement getStreet() {
			return street;
		}
		@FindBy(xpath = "//*[@id='resAddress3']")
		private WebElement locality;
		
		public WebElement getLocality() {
			return locality;
		}
		@FindBy(xpath = "//*[@formcontrolname='resPinCode']")
		private WebElement pincode;
		public WebElement getPincode() {
			return pincode;
		}
		
		@FindBy(xpath = "//*[@formcontrolname='resState']")
		private WebElement state;
		public WebElement getState() {
			return state;
		}
		
		@FindBy(xpath = "//*[@formcontrolname='resCity']")
		private WebElement city;
		public WebElement getCity() {
			return city;
		}
		@FindBy(xpath = "//*[@formcontrolname='resPostOff']")
		private WebElement post;
		public WebElement getPost() {
			return post;
		}
		@FindBy(xpath = "//*[@formcontrolname='resPhone']")
		private WebElement phone;
		public WebElement getPhone() {
			return phone;
		}
		@FindBy(xpath = "(//*[@formcontrolname='officeSameAsRes'])[1]")
		private WebElement yes;
		public WebElement getYes() {
			return yes;
		}
		
	

}
