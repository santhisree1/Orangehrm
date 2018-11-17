package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demo.nopcommerce.com/register");
		  
		  driver.findElement(By.cssSelector("input#FirstName")).sendKeys("TestingMasters");
		  driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("TestingMasters");
				
		  driver.findElement(By.cssSelector("input[id='FirstName']'[name=FirstName']")).sendKeys("TestingMasters");	
		  driver.findElement(By.cssSelector("input.text[id='FirstName']")).sendKeys("TestingMasters");
				
		  driver.findElement(By.cssSelector("input.text[id='FirstName']")).sendKeys("TestingMasters");	
		  driver.findElement(By.cssSelector("input.text[id='FirstName']")).sendKeys("TestingMasters");		
		  driver.findElement(By.cssSelector("input.text[id='FirstName']")).sendKeys("TestingMasters");	
				
			/* if (Exist("//div[@class='message success fadable']"))
			 	LogEvenwithScreeshot("pass","Leave is applied successfully");
			 	else
			 	LogEvenwithScreeshot("fail","Leave is not applied successfully");
			 */
				
			
	}

}
