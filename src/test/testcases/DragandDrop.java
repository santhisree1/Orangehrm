package test.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		boolean bval;
		WebDriver driver= new FirefoxDriver();
     driver.get("http://www.jqueryui.com");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.partialLinkText("Droppable")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
	// Explicit wait for draggable element
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
	
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	Actions obj = new Actions(driver);  // for mouse actions
	
	obj.dragAndDrop(source,target).build().perform();
	
	if(bval= true)
	{System.out.println("Drag and drop is successful");}
	else
	System.out.println("Drag and drop is unsuccessful");	
	
	
	// OR
	// obj.ClickAndHold(source).moveToElement(target).release().build().perform();
	} 

}
