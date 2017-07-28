package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Booking_Onewaypage extends BaseClass {
	private static WebElement element;
	public Booking_Onewaypage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static WebElement Search_from() throws Exception{
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

}
