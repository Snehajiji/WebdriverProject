package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_checkoutdetails 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first-name\"]") //First name
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]") //Last name
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]") //Zip/Postal code
	WebElement zipcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]") //Continue button
	WebElement continuebutton;
	
	@FindBy(xpath="//*[@id=\"finish\"]") //Finish button
	WebElement finish;
	
	public Sauce_checkoutdetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void details(String fname,String lname,int zip)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		zipcode.sendKeys(String.valueOf(zip));
		
	}
	public void finishbutton()
	{
		continuebutton.click();
		finish.click();
	}


}
