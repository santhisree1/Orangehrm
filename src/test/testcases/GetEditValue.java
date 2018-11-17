package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetEditValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	WebDriver driver= new FirefoxDriver();
	driver.get("https://testingmasters.com/hrm");
	driver.findElement(By.id("txtUsername")).sendKeys("user02");
	driver.findElement(By.id("txtUsername")).sendKeys("pass1234");	
	//Get Textbox value
	String un = driver.findElement(By.id("txtUsername")).getAttribute("value");
	System.out.println("Textbox value is:"+ un);
		
	//Get page URL
	  String URL = driver.getCurrentUrl();
	  System.out.println("URL is:"+URL);
	//Get page source
	  String Pagesrc = driver.getPageSource();
	  System.out.println("Pagesource:"+Pagesrc);
	
	}

}
