package AppModules;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pageobjects.BaseClass;
import pageobjects.FlightDetails;
import pageobjects.Search;;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/ 
public class Flight {
	 // I could have created a Function for it but I keep calculations in Functions and test steps in Module Actions
	 // It could have been avoided and simply put these steps in Test Case, it depends totally on you, everybody has their own choice
	 //public static void Execute(int iTestCaseRow) throws Exception{
	 public static void Execute() throws Exception{ 
		// This is to get the Product name on the Check Out page with using getText() method 
		// CheckOut_Page.sProductName is a static variable and can be used anywhere with its class name
		// Once some text is stored in this variable can be used later in any other class 
		// FlightDetails.Flight1=FlightDetails.Flight_tab().getText();
		 FlightDetails.Flight1=FlightDetails.Flight_tab().getText();
     	
     	// This is all about Verification checks, these does not stop your execution but simply report fail at the end
     	// This is to check that if the value in the variable sProductName is not null, then do this
     	if(!"".equals(FlightDetails.Flight1)){
     		// Here I have put a verification check on the Product Name, if it is displayed my verification will pass
     		Reporter.log("Verification Passed for FlightTab on Check Out page.");
     	}else{
     		// If it not displayed then the verification check is failed
     		Reporter.log("Verification Failed for FlightTab on Check Out page.");
     		// If the above verification gets failed then I have to report this to my test and fail the test accordingly
     		// To achieve this, I have initialized this variable of Base class at the start of my test with value true in it
     		// At the end of my test, i will match the value, if it will be false then I will fail the test, else the test will be pass
     		BaseClass.bResult=false;
     	}
     	
     	
     	
     	// Clicking on the Continue button on the Check Out page
     	 FlightDetails.Flight_tab().click();
     	FlightDetails.Oneway_link().click();
     	 /*FlightDetails.RoundTrip_link().click();
     	 FlightDetails.MULTICITY_link().click();*/
     	 
	 }

	

}
