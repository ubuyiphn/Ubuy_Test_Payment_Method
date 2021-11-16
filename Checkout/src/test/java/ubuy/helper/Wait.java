package ubuy.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait 
{
	   
    static WebDriver driver;
    
    static WebDriverWait wait = new WebDriverWait(driver,20);
    
    static By search_bar_xpath = By.xpath("//input[@title='Search']");
    
    static By product_url_xpath = By.xpath("//div[@id='usstore-products']/div[2]/div/div[1]/a");
    
    static By add_to_cart_xpath = By.xpath("//button[@id='add-to-cart-btn']");
    
    static By view_cart_xpath = By.xpath("//a[@id='add-to-cart-view-cart']");
    
    static By proceed_to_checkout_xpath = By.xpath("//ul[@class='mb-3 pt-2 pl-0']/li[5]/button");
    
    static By proceed_to_pay_xpath = By.xpath("//button[@class='overview-btn btn btn-primary btn-lg']");
    
    static By otp_xpath = By.xpath("//input[@title='Search']");
    
    public Wait(WebDriver driver)
    {    	
    	Wait.driver = driver;
    }
	
	public static void wait_home_page()
    {
		wait.until(ExpectedConditions.visibilityOfElementLocated(search_bar_xpath));
    }
    
    public static void wait_list_page()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(product_url_xpath));
    }
    
    public static void wait_detail_page()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(add_to_cart_xpath));
    }
    
    public static void wait_cart_page_popup()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(view_cart_xpath));
    }
    
    public static void wait_cart_page()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(proceed_to_checkout_xpath));
    }
    
    public static void wait_checkout_page()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(proceed_to_pay_xpath));
    }
    
    public static void wait_payment_page()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(otp_xpath));
    }
}
