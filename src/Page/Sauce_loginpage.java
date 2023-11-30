package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_loginpage 
{
	WebDriver driver;
	
//FileInputStream f=new FileInputStream("D:\\A Software Testing\\Apache_Excel\\Sauce_Logindetails");
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement sauce_username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement sauce_password;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement sauce_loginbutton;
	
	
	public Sauce_loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValues1(String username, String pswd)
	{
		sauce_username.sendKeys(username);
		sauce_password.sendKeys(pswd);
	}
	public void loginClick()
	{
		sauce_loginbutton.click();
	}

}
