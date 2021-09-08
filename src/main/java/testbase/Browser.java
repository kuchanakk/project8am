package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver driver;
public static void invokebrowser(String browser) {
	
	//String browser="firefox";
	
	if(browser.equals("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		
	}else if(browser.equals("firefox")) {
		
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
				
	}else if(browser.equals("ie")) {
		
		WebDriverManager.iedriver().setup();
		 driver = new InternetExplorerDriver();
				
	}else {
		
		
		System.out.println("not such browser avilable");
	}
	
	
	driver.get("http://advantageonlineshopping.com/#/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	
	
	
}




}
