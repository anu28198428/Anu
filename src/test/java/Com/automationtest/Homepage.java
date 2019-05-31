package Com.automationtest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resources.base;

public class Homepage extends base {
	public static Logger log=LogManager.getLogger(Homepage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver=initializeDrive();	
		
	}
	
	@Test(dataProvider="getData")
	
	public void basepageNavigation(String username,String password) throws IOException 
	
	{
		driver.get(prop.getProperty("url"));
		Landingpage l=new Landingpage(driver);
        l.getlogin().click();
	/*used inheritance and by creating object to that
		class and invoking methods of that class.*/
        Loginpage lp=new Loginpage(driver);
        lp.getemail().sendKeys(username);
        lp.getpassword().sendKeys(password);
        lp.getlogin().click();
        log.info("Text");
        }


	@DataProvider
	public Object[][] getData()
	{
	Object[][] data=new Object[2][2];
	//row
	data[0][0]="nonrestricteduser@w.com";
	data[0][1]="3456";
	//1st row
	data[1][0]="restricted@q.com";
	data[1][1]="5346";
	
	return data;
	
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	}
	
	



