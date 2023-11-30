package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_addtocart 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")  //Sauce Labs Backpack
	WebElement addcart1;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")  //Sauce Labs Bike Light
	WebElement addcart2;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")  //Sauce Labs Bolt T-Shirt
	WebElement addcart3;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")  //Sauce Labs Bolt Fleece Jacket
	WebElement addcart4;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")  //Sauce Labs Onesie
	WebElement addcart5;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")  //Sauce Labs T-shirt(Red)
	WebElement addcart6;
	
	public Sauce_addtocart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addtocart_click()
	{
		addcart1.click();
		addcart2.click();
		addcart3.click();
		addcart4.click();
		addcart5.click();
		addcart6.click();
	}
	
	

}
