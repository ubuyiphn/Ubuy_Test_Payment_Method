package ubuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import ubuy.helper.Wait;

public class Checkout_Page 
{
    WebDriver driver;
    
    @FindBy(xpath = "")
    WebElement full_name;
    
    @FindBy(xpath = "")
    WebElement contact_no;
    
    @FindBy(xpath = "")
    WebElement email;
   
    @FindBy(xpath = "")
    Select city;
    
    @FindBy(xpath = "")
    WebElement house_no;
    
    @FindBy(xpath = "")
    WebElement street;
    
    @FindBy(xpath = "")
    WebElement block;
    
    @FindBy(xpath = "")
    WebElement save_address_button;
    
    @FindBy(xpath = "")
    WebElement shipping_method;
    
    @FindBy(xpath = "")
    WebElement payment_method;
    
    @FindBy(xpath = "")
    WebElement proceed_to_pay_button;
    
    public Checkout_Page(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void save_address()
    {
    	full_name.sendKeys("");
    	
    	contact_no.sendKeys("");
    	
    	email.sendKeys("");
    	
    	city.selectByIndex(0);
    	
    	house_no.sendKeys("");
    	
    	block.sendKeys("");
    	
    	save_address_button.click();
    	
    	Wait.wait_checkout_page();
    }
    
    
    public void select_shipping()
    {
    	shipping_method.click();
    	
    	Wait.wait_checkout_page();
    }
    
    public void select_payment_method()
    {
    	payment_method.click();
    	
    	Wait.wait_checkout_page();
    }
    
    public void hit_proceed_to_pay_button()
    {
    	proceed_to_pay_button.click();
    	
    	Wait.wait_payment_page();
    }
    
    
    
    
    
    
    
    
    
    
}
