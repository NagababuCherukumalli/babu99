package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Search extends BaseClass {
	private static WebElement element;
	public Search(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static WebElement Fly_from() throws Exception{
   	 element = null;
      	try{
      		element= driver.findElement(By.id("Flyingfrom1"));
      		Log.info("Flying From Text box is found");
      	}catch (Exception e){
      		Log.error("Flying From Text box is not found");
      		throw(e);
      		}
      	return element;
       }
	public static WebElement Fly_To() throws Exception{
	   	 element = null;
	      	try{
	      		element= driver.findElement(By.id("Flyingto1"));
	      		Log.info("Flying To Text box is found");
	      	}catch (Exception e){
	      		Log.error("Flying To Text box is not found");
	      		throw(e);
	      		}
	      	return element;
	       }
	public static  WebElement Auto_sug_Flyfrom(String path) throws Exception{
	   	 element = null;
	      	try{
	      		WebElement e1= driver.findElement(By.id("Flyingfrom1"));
	      		e1.sendKeys(path);
	      		List<WebElement> we=e1.findElements(By.xpath("//li[starts-with(@id,'ui-id-')]"));
	      		//List<WebElement> we=driver.findElements((By) path);
	      		Log.info("Values are stored in to List");
	      		System.out.println(we.size());
	    		System.out.println("***** Suggestions are ****** ");
	    		for(WebElement e:we)
	    		{
	    			
	    			System.out.println(e.getText());
	    		}
	    		for(int i=0;i<2;i++)
	    		{
	    			driver.findElement(By.id("Flyingfrom1")).sendKeys(Keys.ARROW_DOWN);
	    			//driver.findElement(By.id(id1)).sendKeys(Keys.ARROW_DOWN);
	    			Thread.sleep(1000);
	    		}
	      		Log.info("Flying From Text box is found");
	      	}catch (Exception e){
	      		Log.error("Flying From Text box is not found");
	      		throw(e);
	      		}
	      	return element;
	       }
	public static WebElement Auto_sug_FlyTo(String path1) throws Exception{
	   	 element = null;
	      	try{
	      		WebElement e2= driver.findElement(By.id("Flyingto1"));
	      		e2.sendKeys(path1);
	      		List<WebElement> we=driver.findElements(By.xpath("//li[starts-with(@id,'ui-id-')]"));
	      		//List<WebElement> we=driver.findElements((By) path);
	      		Log.info("Values are stored in to List");
	      		System.out.println(we.size());
	    		System.out.println("***** Suggestions are ****** ");
	    		for(WebElement e:we)
	    		{
	    			
	    			System.out.println(e.getText());
	    		}
	    		for(int i=0;i<2;i++)
	    		{
	    			driver.findElement(By.id("Flyingto1")).sendKeys(Keys.ARROW_DOWN);
	    			//driver.findElement(By.id(id1)).sendKeys(Keys.ARROW_DOWN);
	    			Thread.sleep(1000);
	    		}
	      		Log.info("Flying To Text box is found");
	      	}catch (Exception e){
	      		Log.error("Flying To Text box is not found");
	      		throw(e);
	      		}
	      	return element;
	       }
}
