package ubuy.helper;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

public class Hit_Pages 
{	
	public static List<String> home_page_urls = new ArrayList<String>();
	
	WebDriver driver;
	
	public Hit_Pages(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void hit_home_page()
	{
		add_urls();
		this.driver.get(home_page_urls.get(0));
	}
	
	public void add_urls()
	{
		home_page_urls.add("https://www.a.ubuy.com.kw/en/");
		
		home_page_urls.add("https://www.a.ubuy.com.kw/ar/");
	}
}
