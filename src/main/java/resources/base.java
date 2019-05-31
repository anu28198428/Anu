package resources;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	
    public static WebDriver driver;//acess of this object will be for entire testcase
    public Properties prop;
	private Object outputType;
	public WebDriver initializeDrive() throws IOException
	{
	 prop= new Properties();
		//filepath to find where  datadriven file is located
		
		FileInputStream fis= new FileInputStream("C:\\Users\\srihari\\project\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\srihari\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\srihari\\geckodriver.exe");
			 driver = new FirefoxDriver();
         }
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		}
	public void getscreenshot(String result) throws IOException {
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile( src, new File( "C://test//"+result+"screenshot.png"));  
	}

   
	
}