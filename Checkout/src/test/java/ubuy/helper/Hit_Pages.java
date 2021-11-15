package ubuy.helper;

import org.openqa.selenium.WebDriver;

public class Hit_Pages 
{
	public String home_page_url = "";
	
	WebDriver driver;
	
	public Hit_Pages(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void hit_home_page()
	{
		this.driver.get(home_page_url);
	}
}
