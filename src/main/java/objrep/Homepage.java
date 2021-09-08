package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	static WebDriver driver;
	public Homepage(WebDriver driver) {
		
		
		this.driver = driver;
		
	}
	
	static By pitem=By.linkText("POPULAR ITEMS");	
	static By tlink=By.id("details_16");
	static By llink=By.id("details_10");
	static By slink=By.id("details_21");
	static By etext=By.xpath("//*[@id=\"Description\"]/h1"); 
	
	
	public static WebElement popularitems() {
		
		return driver.findElement(pitem);
		
	}
	
public static WebElement tabletlink() {
		
		return driver.findElement(tlink);
		
	}
public static WebElement laptoplink() {
	
	return driver.findElement(llink);
	
}
public static WebElement spklink() {
	
	return driver.findElement(slink);
	
}
public static WebElement elementtext() {
	
	return driver.findElement(etext);
	
}
	
	
	public static WebElement popularblock() {
		
		return driver.findElement(By.xpath("//*[@id=\"popular_items\"]/div"));
		
	}
	
	
	
	

}
