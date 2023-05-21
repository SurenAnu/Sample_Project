package org.irctc_runner_class;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import Base_Class.Base_Class_Methods;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.types.Feature;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\irctc_feature\\irctc.feature", glue = "org.irctc_step_definition" ,
monochrome = true,
plugin = { "pretty", "html:target/cucumber-reports" },
publish = true//,plugin = {"html:rep/rep.html", "pretty"}
)
public class Runner_Class extends Base_Class_Methods {

	public static WebDriver driver;
	@BeforeClass
	public  static void start() {
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("Private Browsing");
		
		driver = new FirefoxDriver(opt);
	}
	private static void a() {
		// TODO Auto-generated method stub
		
	}
//	
//	@AfterClass
//	public static  void end() {
//		driver.quit();
//
//	}
	
	
	
	
	
	
	
	
	
}
