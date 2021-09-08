package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import testbase.Browser;

public class Scrshot extends Browser {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		Browser b=  new Browser();
		b.invokebrowser("firefox");
		Thread.sleep(15000);
		File scrsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrsht, new File("D:\\advshop123.png"));
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("sampletest");
	
		test.pass("test pass");
		test.addScreenCaptureFromPath("D:\\advshop123.png");
		extent.flush();
	}

}
