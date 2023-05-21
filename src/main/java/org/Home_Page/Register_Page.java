package org.Home_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neilalexander.jnacl.crypto.xsalsa20;

public class Register_Page {
	

	public static WebDriver driver;
	
	public Register_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="// input[@id='userName']")
	private WebElement username;
	
	@FindBy(xpath = "// input[@id='usrPwd']")
	private WebElement password;
	
	@FindBy(xpath = "// input[@id='cnfUsrPwd']")
	private WebElement repassword;
	
	@FindBy(xpath = "//span[.='Preferred Language']")
	private WebElement language;
	@FindBy(xpath = "//span[.='English']")
	private WebElement english;
	
	public WebElement getEnglish() {
		return english;
	}
	
	@FindBy(xpath = "(//div[@role='button'])[2]")
	private WebElement question;
	

	@FindBy(xpath = "//input[@placeholder='Security Answer']")
	private WebElement Answer;
	
	@FindBy(xpath = "//button[@label='Continue']")
	private WebElement contin;
	
	
	
	@FindBy(xpath = "//span[.='What is your all time favorite sports team?']")
	private WebElement drop;
	
	public WebElement getDrop() {
		return drop;
	}
	
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRepassword() {
		return repassword;
	}

	public WebElement getLanguage() {
		return language;
	}

	public WebElement getQuestion() {
		return question;
	}

	public WebElement getAnswer() {
		return Answer;
	}

	public WebElement getContin() {
		return contin;
	}
	
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[5]/td[5]/a")
private WebElement body;
	

	public WebElement getBody() {
		return body;
	}	
	@FindBy(xpath = "//*[@id='married']")
	private WebElement married;

	public WebElement getMarried() {
		return married;
	}
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-1\"]/div/div[8]/select")
	private WebElement nationality;

	public WebElement getNationality() {
		return nationality;
	}
	
	
	
	@FindBy(xpath = "(//*[@role='button'])[5]")
	private WebElement gender;

	public WebElement getGender() {
		return gender;
	}



	public void setGender(WebElement gender) {
		this.gender = gender;
	}
	
 @FindBy(xpath = "//*[@id='email']")	
	private WebElement email;
		
 public WebElement getEmail() {
	 return email;
 }
 
 @FindBy(xpath = "//*[@id='mobile']")
 private WebElement mobil;
 
 public WebElement getMobil() {
	 return mobil;
 }
 
 public static WebDriver getDriver() {
	return driver;
}



public WebElement getNationality1() {
	return nationality1;
}

@FindBy(xpath = "//*[@formcontrolname='nationality']")
 private WebElement nationality1;
 
 
@FindBy(xpath = "//*[@label='Continue']")
private WebElement continu;

public WebElement getContinu() {
	return continu;
}
 
 
 
	
}
