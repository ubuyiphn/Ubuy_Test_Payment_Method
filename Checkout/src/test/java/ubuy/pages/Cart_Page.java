package ubuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ubuy.helper.Wait;

public class Cart_Page 
{
    
	public WebDriver driver;
	
	@FindBy(xpath = "//ul[@class='mb-3 pt-2 pl-0']/li[5]/button")
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
