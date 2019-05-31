package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.xpath("//*[@id=\"content\"]/div/div/h2");
	By navbar=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav");
	
	public Landingpage(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement getlogin()
	{
		return driver.findElement(signin);
	}
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}
	public WebElement getnavigationbar()
	{
		return driver.findElement(navbar);
	}
	
	
}




