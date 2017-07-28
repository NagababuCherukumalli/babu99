package AppModules;



import pageobjects.Search;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class Bookingflight_oneway {
	
	
		
		 public static void Execute1(int iTestCaseRow) throws Exception{
			 
			 String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
	        	// Here we are sending the UserName string to the UserName Textbox on the LogIN Page
	        	// This is call Page Object Model (POM)
	        	// For use of POM, please see http://www.toolsqa.com/page-object-model/
			 Search.Auto_sug_Flyfrom(sUserName);
	            // Printing the logs for what we have just performed
	            Log.info(sUserName+" is entered in Auto suggesition  text box" );
	            
	            String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
	            Search.Auto_sug_FlyTo(sPassword);
	            Log.info(sPassword+" is entered in Auto suggesition text box" );
	            
	            
	
	
	}

}
