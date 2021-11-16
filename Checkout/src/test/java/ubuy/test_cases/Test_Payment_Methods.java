package ubuy.test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;	
import ubuy.helper.Browser;
import ubuy.helper.Hit_Pages;
import ubuy.pages.Cart_Page;
import ubuy.pages.Checkout_Page;
import ubuy.pages.Detail_Page;
import ubuy.pages.Home_page;
import ubuy.pages.List_Page;

public class Test_Payment_Methods 
{
    static WebDriver driver; 

	@Test
	public void test_knet()
	{
	    
		Browser browser = new Browser(driver);
		browser.launch_chrome();
	    
		Hit_Pages hit = new Hit_Pages(driver);
		hit.hit_home_page();
	    
		Home_page home = new Home_page(driver);
		home.get_list_page("shoes");
	    
		List_Page list = new List_Page(driver);
		list.hit_detail_url();
	    
		Detail_Page detail = new Detail_Page(driver);
		detail.hit_add_to_cart();
	    
	    detail.hit_view_cart();
	    
	    Cart_Page cart = new Cart_Page(driver);
	    cart.hit_proceed_to_checkout();
	    
	    Checkout_Page checkout = new Checkout_Page(driver);
	    checkout.save_address();
	    
	    //checkout.select_shipping();
	    
	    checkout.select_payment_method();
	    
	    checkout.hit_proceed_to_pay_button();
	    
	    
	}
}
