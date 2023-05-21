package org.Home_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;

public class Home_page  {
	
	public static WebDriver driver;
	public Home_page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	
	
//	@FindBy(xpath = "//img[@id='disha-banner-close']")
//	private WebElement pop;
//	
//	public WebElement getPop() {
//		return pop;
//	}
	@FindBy(xpath = "//button[.='Later']")
	private WebElement notif;
	public WebElement getNotif() {
		return notif;
	}
	
	@FindBy(xpath = "// a[.=' REGISTER ']")
	public WebElement reg;
	public WebElement getReg() {
		return reg;
	}
}
