package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class Login 
{

	WebDriver driver=null;
	LoginPage login;
	
	@Before
	public void launchBrowser()
	{
		
		String strpath=System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	
	@Given("user is on the login page.")
	public void user_is_on_the_login_page() 
	{
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	}

	@When("^user enters the (.*) and (.*)$")
	public void user_enters_the_username_and_password(String username,String password)
	{
	    login=new LoginPage(driver);
	    
	    login.enterUsername(username);
	    login.enterPassword(password);
	    
	}

	@And("user click on the login button")
	public void user_click_on_the_login_button() 
	{
	    
	    login.clickLoginBtn();
	}

	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully()
	{
	   
	    login.loggedinValidation();
	}


	
}
