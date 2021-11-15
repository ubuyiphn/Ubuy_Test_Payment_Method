package ubuy.test_cases;

import org.openqa.selenium.WebDriver;

import ubuy.helper.Browser;
import ubuy.helper.Hit_Pages;
import ubuy.pages.Cart_Page;
import ubuy.pages.Checkout_Page;
import ubuy.pages.Detail_Page;
import ubuy.pages.Home_page;
import ubuy.pages.List_Page;

public class Test_Payment_Methods 
{
    WebDriver driver; 
	
	Browser browser = new Browser(this.driver);
	
	Hit_Pages hit = new Hit_Pages(this.driver);
	
	Home_page home = new Home_page(this.driver);
	
	List_Page list = new List_Page(this.driver);
	
	Detail_Page detail = new Detail_Page(this.driver);
	
	Cart_Page cart = new Cart_Page(this.driver);
	
	Checkout_Page checkout = new Checkout_Page(this.driver);
	
	public void test_knet()
	{
	    browser.launch_chrome();
	    
	    hit.hit_home_page();
	    
	    home.get_list_page("shoes");
	    
	    list.hit_detail_url();
	    
	    detail.hit_add_to_cart();
	    
	    detail.hit_view_cart();
	    
	    cart.hit_proceed_to_checkout();
	    
	    checkout.save_address();
	    
	    checkout.select_shipping();
	    
	    checkout.select_payment_method();
	    
	    checkout.hit_proceed_to_pay_button();
	    
	    
	}
}
