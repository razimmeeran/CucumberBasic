package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LoginStepDefinition {

	WebDriver driver;
	
@Given("^user is already on Login Page$")
public void user_is_already_on_Login_Page()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home PC\\eclipse-Myworkspace\\CucumberBDD_FreeCRMTest1\\src\\main\\java\\resources\\chromedriver.exe");	
	driver = new ChromeDriver(); 
	driver.get("https://classic.freecrm.com/index.html?e=1");    

		
}

@When("^title of the login page is Free CRM$")
public void title_of_the_login_page_is_Free_CRM() 
{

	String loginPageTitle=driver.getTitle();
	Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", loginPageTitle);
	
}


@Then("^user enters username and password$")
public void user_enters_username_and_password() 
{
	
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("razspicyguy@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
	

}


@Then("^user clicks on login button$")
public void user_clicks_on_login_button() 
{
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	

}

@And("^user is on home page$")
public void user_is_on_home_page() 
{
	String HomePageTitl= driver.getTitle();
	
	Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.****", HomePageTitl);
	

}


}
