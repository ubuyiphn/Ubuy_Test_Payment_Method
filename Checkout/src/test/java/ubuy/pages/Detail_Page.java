package ubuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ubuy.helper.Wait;

public class Detail_Page 
{
	public WebDriver driver;
	
	@FindBy(xpath = "//button[@id='add-to-cart-btn']")
	WebElement add_to_cart;
	
	@FindBy(xpath = "//a[@id='add-to-cart-view-cart']")
	WebElement view_cart;
	
	public Detail_Page(WebDriver driver)
	{
		this.driver = driver;
	}

	public void hit_add_to_cart()
	{
		add_to_cart.click();
		
		Wait.wait_cart_page_popup();
	}
	
	public void hit_view_cart()
	{
		view_cart.click();
		
		Wait.wait_cart_page();
	}
	
	
	
	
	
}
