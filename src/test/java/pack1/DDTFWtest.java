package pack1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.Excelmethods;
import commonmethods.Extrep;
import commonmethods.Screenshot;
import objrep.Homepage;
import testbase.Browser;

public class DDTFWtest extends Browser {
	static Homepage hp;
	static Excelmethods excel;
	static Extrep extreport;
	static Screenshot sh;
	@BeforeTest
	public static void extentsetup() {
		 extreport = new Extrep();
		extreport.extentsetup();
		
	}
	
	@BeforeMethod
	public static void Ddtest() throws InterruptedException {
		
		Browser b = new Browser();
		b.invokebrowser("firefox");
		 hp = new Homepage(driver);
		Thread.sleep(10000);
		hp.popularitems().click();
		Thread.sleep(5000);
	}
	
	@Test
	public static void tabtest() throws IOException {
		
		hp.tabletlink().click();
		String actualtabtext=hp.elementtext().getText();
		
		 excel= new Excelmethods();
		String expcted=excel.readdata(3, 0);
		
		if(actualtabtext.contains(expcted)) {
			
		extreport.testpass();
		excel.writedata(3, 1, "test passed");
			
		}else {
			
			extreport.testfail();
			excel.writedata(3, 1, "test fail");
			 sh = new Screenshot();
			sh.schot();
			extreport.scnh();
		}
		
		
	}
	
	@Test
	public static void laptest() throws IOException {
		hp.laptoplink().click();
		String actuallaptext=hp.elementtext().getText();
		
		String expcetedlaptest=excel.readdata(1, 0);
		
		if(actuallaptext.contains(expcetedlaptest)) {
			
			extreport.testpass();
			excel.writedata(1, 1, "test passed");
				
			}else {
				
				extreport.testfail();
				excel.writedata(1, 1, "test fail");
				 sh = new Screenshot();
				sh.schot();
				extreport.scnh();
			}
		
	}
	
	
	@Test
	public static void spktest() throws IOException {
		hp.spklink().click();
		String actualspktext=hp.elementtext().getText();
		
		String expcetedspktest=excel.readdata(2, 0);
		
		if(actualspktext.contains(expcetedspktest)) {
			
			extreport.testpass();
			excel.writedata(2, 1, "test passed");
				
			}else {
				
				extreport.testfail();
				excel.writedata(2, 1, "test fail");
				 sh = new Screenshot();
				sh.schot();
				extreport.scnh();
			}
		
		
		
	}
	
	@AfterMethod
	public static void closebrowser() {
		driver.close();
		extreport.flush();
		
		
	}
	
	@AfterTest
	public static void testend() {
		System.out.println("*********Test Ended********");
		
	}

}
