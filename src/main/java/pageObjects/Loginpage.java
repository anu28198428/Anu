package pageObjects;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public WebDriver driver;
	
	By email=By.xpath("//input[@type='email']");
	By password=By.xpath("//input[@type='password']");
	By login=By.xpath("//input[@name='commit']");
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getlogin()
	{
	
		return driver.findElement(login);
		
	}
	
}

