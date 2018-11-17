package test.testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closeandquit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver= new FirefoxDriver();
  driver.get("https://www.talentzing.com/discounttraining/trainerregistration.aspx");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  driver.findElement(By.linkText("FAQ")).click();
driver.findElement(By.linkText("FeedBack")).click();
Thread.sleep(3000);

//Get Homepage window Handle

String HomepageHandle = driver.getWindowHandle();

// Get Sub browsers handles

Set<String> allhandles = driver.getWindowHandles();


for(String wnhandle:allhandles)
{
	//Movw focus to sub browser
	driver.switchTo().window(wnhandle);
	String pageURL = driver.getCurrentUrl();
	
	if(pageURL.contains("Feedback"))
	
	{
		System.out.println("Switched to FeedBack page");
		driver.findElement(By.id("txtfullName")).sendKeys("Testing Masters");
		driver.findElement(By.id("txtemail")).sendKeys("TMtm100@gmail.com");
		driver.findElement(By.id("txtmsg")).sendKeys("Test");
		driver.findElement(By.id("chkrate_0")).click();
		driver.findElement(By.id("btnSubmit")).click();
		
		
		Thread.sleep(3000);
		
		driver.close();//close Feedback page
		break; //Exit from for loop
		
		
	}
	
}

//	Switch to Home Page brouser
   driver.switchTo().window(HomepageHandle);
   driver.quit(); // Close all browsers opened through webdriver
   
	}

}		
		
		
		
		
		
		
		
		
		
		
	


