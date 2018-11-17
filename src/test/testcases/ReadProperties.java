package test.testcases;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// print the current working directory
		System.out.println(System.getProperty("user.dir"));

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\testcases\\ElementProps.properties");
		Properties props = new Properties();
		props.load(fis);
		
		FirefoxDriver d = new FirefoxDriver();
		d.get("http://testingmasters.com/hrm/");
		d.findElement(By.xpath(props.getProperty("HRM_Login_UserName"))).sendKeys("user02");
		d.findElement(By.xpath(props.getProperty("HRM_Login_Password"))).sendKeys("Pass1234");
		d.findElement(By.xpath(props.getProperty("HRM_Login_Submit"))).click();
		d.quit();
		System.out.println("Clicked on Login button");
	
	}

}
