package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import test.resources.generic.WebLibrary;

public class UserLibraryformercury extends WebLibrary{

	public static void Login(String URL){
		
		boolean loginstatus= true;
		boolean status;
		status= OpenUrl(URL); 
		if(status)
			LogEventWithScreeshot("info","Application is Up and Running");
		else
			LogEventWithScreeshot("fail","Unable to Launch Mercury Application");
	}
		
		public static void NavigatetoSignOn()
		{ 
			
		/*	Actions obj= new Actions(driver);
		  obj.moveToElement(driver.findElement(By.tagName("//a[text()='mercurysignon.php']"))).build().perform();
		  driver.findElement(By.tagName("")).click(); */
		
		
		 boolean status;
		 status= ClickElement("//input[@name='login']");
		  
		 if(status)
			  LogEventWithScreeshot("info","SignOn Element is clicked");
		  else
			  LogEventWithScreeshot("fail","SignOn Element is not clicked");

	
	
		
		
    // enter username
		status= SetText("//input[@name='userName']",UserName);
		if(status)
			LogEventWithScreeshot("info","Username is entered");
		else
			LogEventWithScreeshot("info","Usernmae is not entered");
		
		// enter password
		status=SetText("//input[@name='password']",Password);
		if(status)
			LogEventWithScreeshot("info","Passeord is entered");
		else
			LogEventWithScreeshot("info","Password is not entered");
	
		// Click on SubmitButton
		
		status= ClickElement("//input[@name='login']");
		  
		 if(status)
			  LogEventWithScreeshot("info","SignOn Element is clicked");
		  else
			  LogEventWithScreeshot("fail","SignOn Element is not clicked");

		
		}

}







