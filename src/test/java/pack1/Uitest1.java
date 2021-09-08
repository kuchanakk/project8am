package pack1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objrep.Homepage;
import testbase.Browser;

public class Uitest1  extends Browser{

	@Test
	public static void test1() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Browser b=  new Browser();
		b.invokebrowser("firefox");
		Homepage hp = new Homepage(driver);
		Thread.sleep(10000);
		hp.popularitems().click();
		int psize=hp.popularblock().findElements(By.tagName("div")).size();
		
		System.out.println(psize);
		
		//Assert.assertEquals(4, psize);
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("sampletest123");
		
		  if(psize==4) {
		  
		  
		  System.out.println("total number of popuar item = 3"); 
		  test.pass("total number of popuar item = 4");
		  
		  }else {
		  
		  
		  System.out.println("totla number of popular items = "+psize); 
		  test.fail("totla number of popular items = "+psize);
		  
		  }
		 
		  
		  extent.flush();
		  

	}

}
