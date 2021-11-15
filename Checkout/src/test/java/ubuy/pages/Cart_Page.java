package ubuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ubuy.helper.Wait;

public class Cart_Page 
{
    
	public WebDriver driver;
	
	@FindBy(xpath = "")
	WebElement proceed_to_checkout;
	
	public Cart_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void hit_proceed_to_checkout()
	{
		proceed_to_checkout.click();
		
		Wait.wait_checkout_page();
	}
}
