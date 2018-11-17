package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class leave extends UserLibrary{

	/* public static void TC01_Leave_CancelLeave()


	 {
	 //Step 1: Login as a Team member
			Login(URL,UserName,Password);
	
	//Step 2: Navigate to My Leave Page
			NavigateMyLeave();
			
	 //Step 3: Search for leave in leave table with status pending then Select cancel		
		CancelLeave(LeaveDate);
	 	
	   //Step4: Click save and verify leave is cancelled			
		boolean retval = ClickElement("//input[@id='btnSave']");
		if(retval)
		         LogEventWithScreeshot("info","Save button clicked");
		else
			LogEventWithScreeshot("fail","Save button clicked");
		int rownumber = VerifyLeaveStatus(LeaveDate,"Cancelled");
		if(rownumber!=0)
			LogEventWithScreeshot("pass","Leave is cancelled successfully");
		else
			LogEventWithScreeshot("fail","Leave is not cancelled "); 
	 
		
		
//========================================================================================================================================== 
		public static void TC02_ApplyandVerifyMyLeave()		
		
			{
			
			 //  Step 1:  Login as a Team member
				Login(URL,UserName,Password);
			
			// step 2: Navigate to Apply Leave page
			
				NavigateApplyLeave();
			// step 3: EnterLeaveType,startDate,endDate,comment
			
				ApplyLeavetype(LeaveType,FromDate,ToDate,Coment);						
			// Navigate to My Leave Page
				NavigateMyLeave();
				
			// verify leave date range with status	
			int	rownum = verifyDaterangeStatus(FromDate,ToDate,LeaveStatus);
			if(rownum!=0)
				LogEventWithScreeshot("pass","Leave applied is verified successfully");
			else
				LogEventWithScreeshot("fail","Leave applied is not verified succesfully "); 	
			
			
			}  */

//========================================================================================
	
	public static void TC03_ShowLeaveWithStatus()
	{   
	  // Step 1: Login as a Team member
	   Login(URL,UserName,Password);
	// step 2: Navigate to MyLeave Page
	   NavigateMyLeave();
	 //  verifyselectedleaveStatus();
	   VerifyAllButton();
	//  verifyCancel button is clicked
	 //  VerifyCheckStatus();
	
	
	
}
	
}