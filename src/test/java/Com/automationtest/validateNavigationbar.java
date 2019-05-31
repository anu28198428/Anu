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

public class validateNavigationbar extends base {
	public static Logger log=LogManager.getLogger(validateNavigationbar.class.getName());
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver=initializeDrive();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	@Test
	
	public void basepageNavigation() throws IOException 
	
	{
		
		
		Landingpage l=new Landingpage(driver);
		Assert.assertTrue(l.getnavigationbar().isDisplayed());
		   log.info("Sucess");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}


	


