package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class FlightDetails extends BaseClass  {
	
	private static WebElement element;
	public static String Flight1;
	

	public FlightDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 public static WebElement Flight_tab() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.id("tabFlight"));
       		Log.info("Flight tab is found on the Check Out Page");
       	}catch (Exception e){
       		Log.error("Flight tab on Check Out page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
     
     public static WebElement Oneway_link() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.linkText("ONE WAY"));
       		Log.info("ONE WAY link is found on the Page");
       	}catch (Exception e){
       		Log.error("ONE WAY link on Check Out page is not found");
       		throw(e);
       		}
       	return element;
        }

     public static WebElement RoundTrip_link() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.linkText("ROUND TRIP"));
       		Log.info("ROUND TRIP link is found on the Page");
       	}catch (Exception e){
       		Log.error("ROUND TRIP link on Check Out page is not found");
       		throw(e);
       		}
       	return element;
        }
     
     
     public static WebElement MULTICITY_link() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.id("radio-1-3"));
       		Log.info("MULTICITY link is found on the Page");
       	}catch (Exception e){
       		Log.error("MULTICITY link on Check Out page is not found");
       		throw(e);
       		}
       	return element;
        }
}
