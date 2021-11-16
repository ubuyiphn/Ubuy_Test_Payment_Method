package ubuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ubuy.helper.Wait;

public class List_Page 
{
   public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='usstore-products']/div[2]/div/div[1]/a")
    WebElement detail_url;
    
    public List_Page(WebDriver driver)
    { 
    	this.driver = driver;
    }
    
    public void hit_detail_url()
    {
    	detail_url.click();
    	
    	Wait.wait_detail_page();
    }
	
}
