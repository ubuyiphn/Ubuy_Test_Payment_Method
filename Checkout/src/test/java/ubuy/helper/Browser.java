package ubuy.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser 
{
    public WebDriver driver;
    
    public Browser(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void launch_chrome()
    {
    	WebDriverManager.chromedriver().setup();
    	
    	this.driver = new ChromeDriver();
    }
}
