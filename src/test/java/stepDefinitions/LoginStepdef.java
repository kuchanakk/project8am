package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepdef {
	static WebDriver driver;
	
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
           WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
	
	
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	driver.get("http://advantageonlineshopping.com/#/");
	
	}

	@When("^Click on Login icon$")
	public void click_on_Login_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
Thread.sleep(10000);
	driver.findElement(By.id("menuUser")).click();
	
	}

	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable {
	    
		driver.findElement(By.name("username")).sendKeys("kirank");
		driver.findElement(By.name("password")).sendKeys("0123456kK");
		
		
		
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		Thread.sleep(5000);

		driver.findElement(By.id("sign_in_btnundefined")).click();
		
	}

	@Then("^User must successfully login to the web page$")
	public void user_must_successfully_login_to_the_web_page() throws Throwable {
		Thread.sleep(5000);
	   String actualtext= driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span")).getText();
		if(actualtext.equals("kirank")) {
			
			System.out.println("test is pass");
		}else {
			
			System.out.println("test is fail");
		}
		
		
	}

}
