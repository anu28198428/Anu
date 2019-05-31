package Com.automationtest;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Landingpage;
import resources.base;

public class validateTitle extends base {
	public static Logger log=LogManager.getLogger(validateTitle.class.getName());
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver=initializeDrive();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Homepage");
		}
	
	@Test
	
	public void basepageNavigation() throws IOException 
	
	{
		Landingpage l=new Landingpage(driver);
		Assert.assertEquals(l.gettitle().getText(),"FEATURED COURSES123");
        log.info("Sucessfully validated Text message");
	
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
	
	


