package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_backhome_logout 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"back-to-products\"]") // Back home
	WebElement backhome;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]") 
	WebElement threeline;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]") //Logout
	WebElement logout;
	
	public Sauce_backhome_logout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void backhome()
	{
		backhome.click();
	}
	public void logout()
	{
		threeline.click();
		logout.click();
	}

}
