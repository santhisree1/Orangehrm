package test.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import test.resources.generic.WebLibrary;

public class UserLibrary extends WebLibrary {

	 
		private static Object cellvalue;


		//private static final String iRow = null;


		/*
		 * ######################################################################################################
		 * Method Name: Login
		 * Description: To clear contents and enter text in a Web Edit box
		 * Input Parameters:URL,UID,Password
		 * Output: True/False
		 * Author: Testing Master
		 * Organization: Testing Master Technologies
		 * Date Created: 03-oct-2018
		 * ######################################################################################################
		 */
	public static boolean Login(String URL,String UserName,String Password)
			{
			boolean loginstatus = true;
			boolean status;
			
			status = OpenUrl(URL);
			if (status)
				LogEventWithScreeshot("info","Application is Up and Running");
				else
					LogEventWithScreeshot("fail","Unable Launch HRM Application");
				
			status = SetText("//input[@id='txtUsername']",UserName);
			if(status)
				LogEventWithScreeshot("info","Entered UserName");
			else
				LogEventWithScreeshot("fail","Unable to Enter Username");
			status = SetText("//input[@id='txtPassword']",Password);
			if(status)
				LogEventWithScreeshot("info", "Entered Password");
			else
				LogEventWithScreeshot("fail","Unable to Enter Password");
		  
			status = ClickElement("//input[@name='Submit']");
			if (status)
				LogEventWithScreeshot("info","Clicked on Login");
			else
				LogEvent("fail","Unable to Click on login");
			
		      wait(2);
		      status = Exist("//a[contains(text(),'Welcome')]");
		      if(status)
		
		    	  LogEventWithScreeshot("pass","Login is successful");
				else
					{
					LogEvent("fail","Login is not successful");
				    loginstatus = false;
			      }
		        return loginstatus;
		
			}
	public static void NavigateMyLeave()
	{  
		boolean stepstatus = SelectMenuOption("//*[@id='menu_leave_viewLeaveModule']","//*[@id='menu_leave_viewMyLeaveList']");
		  if(stepstatus)
		     
			  LogEventWithScreeshot("pass", "MyLeave page displayed");
		      
			  else
			  {
             LogEventWithScreeshot("fail","MyLeave page not displayed");
			  }
	}
	public static void VerifyAllButton()
	{  
		boolean retval;
		driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
		
        if( retval=true)
		{  LogEventWithScreeshot("Pass","checkbox is Selected");}
		else
			LogEventWithScreeshot("Fail","checkbox is not Selected");
		
	}
	
	  
	/*  public static void checkStatus(String objxpath)
	{  int count=0;
		driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
		driver.findElement(By.xpath(objxpath)).click();
		driver.findElement(By.id("btnSearch")).click();
		int rowcount=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		{   
			for(int iRow= 0;iRow <=rowcount;iRow ++)
		       
				String cellvalue = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[6]")).getText();
		    if(cellvalue.contains(LeaveStatus))
				   { count++;
		
				   }
		}
		System.out.println("No.of"+LeaveStatus+"status is:"+count);
		
	} */
		
/*	 if (Exist("//div[@class='message success fadable']")) // to get the message as successful
			 LogEventWithScreeshot("pass","Leave is applied successfully");
		 	else
		 		LogEventWithScreeshot("fail","Leave is not applied successfully"); */
		 
	//	GetCss value is used to get css attributes value like font size,colour,width, height etc.
	
	   
	   // 	actual_Font_Size=driver.findElement(By.xpath("//h1[text()='Apply Leave']")).getValue("font size"); 
	
	
	
	
//======================================================================================================================
/*	public static void NavigateApplyLeave()	
	
		{  
			boolean stepstatus = SelectMenuOption("//a[@id='menu_leave_viewLeaveModule']","//a[@id='menu_leave_applyLeave']");
			  if(stepstatus)
			     
	
				  LogEventWithScreeshot("pass", "Apply page displayed");
			       
				  else
				  {
              LogEventWithScreeshot("fail","Apply page not displayed");

				  }
	
		}
	
  public static void ApplyLeavetype(String LeaveType, String FromDate, String ToDate,String Coment)
		 
	  {  boolean retval;
	  // Select leave type
	  retval = SelectOPtionByText("//select[@id='applyleave_txtLeaveType']", LeaveType);
	  if (retval)
		  LogEventWithScreeshot("info","Leave type Selected");
	  else 
		  LogEventWithScreeshot("fail","Leave type not selected");
	  
	   
		  // Enter from date
		  retval = SetTextAndEscape("//input[@id='applyleave_txtFromDate']", FromDate);
		  if(retval)
			  LogEventWithScreeshot("info","From date is entered");
		  else
			  LogEventWithScreeshot("fail","From date is not entered");
	 
	  // Enter To date 
	  retval = SetTextAndEscape("//input[@id='applyleave_txtToDate']", ToDate);
	 if (retval)
		 LogEventWithScreeshot("info","To date is entered");
	 else
		 LogEventWithScreeshot("fail","To date is not  entered"); 
	 
	// Enter comment
	 retval = SelectOPtionByText("//textarea[@id='applyleave_txtComment']",Comment);
	 if (retval)
		 LogEventWithScreeshot("info","comment is entered");
	 else
		 LogEventWithScreeshot("fail","comment is not  entered"); 
	// click Apply
	 retval = ClickElement("//input[@id= 'applyBtn']");
	 if (retval)
	 { LogEventWithScreeshot("info","Apply Button is clicked");}
	  
	 else
	  LogEventWithScreeshot("fail","Apply Button is not clicked");  
	 }
	

 public static void NavigateMyLeaveandverifyselectedleaveStatus()
			{  
				boolean stepstatus = SelectMenuOption("//*[@id='menu_leave_viewLeaveModule']","//*[@id='menu_leave_viewMyLeaveList']");
				  if(stepstatus)
				     
					  LogEventWithScreeshot("pass", "MyLeave page displayed");
				      
					  else
					  {
                     LogEventWithScreeshot("fail","MyLeave page not displayed");
					  }
				  driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click(); */
					
					  
					  
					  
					
/* public static int verifyDaterangeStatus(String FromDate,String ToDate,String LeaveStatus){
	 
	 int rownum = 1;
		
			int rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		    for(int iRow=1;iRow<=rowCount;iRow++)
		    {    
		    	String ActDateRange;
		    	ActDateRange=FromDate+" to "+ToDate;
		          	
		      	String appDate = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[1]")).getText();
		    	String appStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[6]")).getText();
		    	if((appDate.equals(ActDateRange))&&(appStatus.contains(LeaveStatus)))
		    	{
		    		rownum = iRow;
		    		break;
                }
		    }
		    
		    return rownum;
 }  */
		
//===========================================================================================================================		
 
			  /*   public static void CancelLeave(String inp_leaveDate)
        {
        	
		    boolean bTag= false;	 
        
               try
			    {
			       int rowcount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
			       for(int iRow=1; iRow<=rowcount;iRow++)
			       {
			  
			         String appDate = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[1]")).getText();
			         String appStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[6]")).getText();
			         if((appDate.equals(inp_leaveDate)) && (appStatus.contains("Pending Approval")))
				     {
				       WebElement dropdown = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[8]/select"));
				       Select obj = new Select(dropdown);
				       obj.selectByVisibleText("Cancel"); 
				       bTag= true ;
			            break;
			            } 	
			          
			        }
			    }
		      catch(Exception e)
			   {
			     bTag = false;
			   }
		         if(bTag)       
		          LogEventWithScreeshot("pass", "Appdate equals to status");
		         else
		    	 LogEventWithScreeshot("fail", "Appdate not equals to status");  
		         
        }*/


	//=============================================================================	         
       
//===============================================================================================================================================================================
			
	/*	public static void CancelLeave(String inp_leaveDate)
		{
			boolean rval;
			int rownumber= VerifyLeaveStatus(inp_leaveDate,"Pending Approval");
			if(rownumber!=0)
			{    
				
				rval = SelectOPtionByText("//table[@id='resultTable']/tbody/tr["+rownumber+"]/td[8]/select","Cancel");
				if(rval)
					LogEventWithScreeshot("info","Cancel selected in dropdown");
				else
					LogEventWithScreeshot("fail","Cancel not selected in dropdown");
				
			}
			else
				LogEventWithScreeshot("fail","Leave date with status Pending Approval");
		}			
		
	//===========================================================================================	
	
	public static int VerifyLeaveStatus(String LeaveDate, String LeaveStatus)
			
	{
		
		int rownum = 1;
		try{ 
			int rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		    for(int iRow=1;iRow<=rowCount;iRow++)
		    {    
		    	String appDate = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[1]")).getText();
		    	String appStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[6]")).getText();
		    	if((appDate.equals(LeaveDate))&&(appStatus.contains(LeaveStatus)))
		    	{
		    		rownum = iRow;
		    		break;
		    		
		    	}
		    }
		
		}
			 
		catch(Exception e)	
		{	
               rownum = 0;	
               
	     }	
		
			
		return rownum;
		
	}  */
			
}		 
			

				
			
		
			
			
			
			
			


