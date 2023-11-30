package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_cart 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a") //Cart icon
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"checkout\"]") //Checkout button
	WebElement checkoutbutton;
	
	public Sauce_cart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void cart_checkoutclick()
	{
		cart.click();
		checkoutbutton.click();
	}

}
