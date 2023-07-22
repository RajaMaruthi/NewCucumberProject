package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	
	WebDriver driver;
	
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	
	@FindBy(id="loginbutton")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//span[text()='Maruthi BN']")
	WebElement usernameExist;
	
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUsername(String Username)
	{
	    highlightWebelement(username);	
		username.sendKeys(Username);
	}
	
	
	public void enterPassword(String Password)
	{
		highlightWebelement(password);
		password.sendKeys(Password);
	}
	
	
	public void clickLoginBtn()
	{
		highlightWebelement(loginBtn);
		loginBtn.click();
	}
	
	
	public void loggedinValidation()
	{
		if(usernameExist.isDisplayed())
		{
			highlightWebelement(usernameExist);
			System.out.println("Logged in successfully");
		}
		else
		{
			System.out.println("Login failed");
		}
		
	}
	
	
	public void loginValidation(String Username,String Password)
	{
		
		username.sendKeys(Username);
		password.sendKeys(Password);
		loginBtn.click();
		if(usernameExist.isDisplayed())
		{
			System.out.println("Logged in successfully");
		}
		else
		{
			System.out.println("Login failed");
		}
		
		
	}
	
	
	public void highlightWebelement(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		
	}
	
	
	
	
}
