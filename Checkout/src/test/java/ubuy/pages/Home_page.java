package ubuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ubuy.helper.Wait;

public class Home_page 
{
   public WebDriver driver;
   
   public String keyword;
	
	@FindBy(xpath="")
    WebElement search_bar;
    
    @FindBy(xpath="")
    WebElement search_icon;
    
    public Home_page(WebDriver driver)
    {
	    this.driver = driver;
    }
    
    public void get_list_page(String keyword)
    {
    	this.keyword = keyword;
    	
    	search_bar.sendKeys(this.keyword);
    	
    	search_icon.click();
    	
    	Wait.wait_list_page();
    }
	
}
