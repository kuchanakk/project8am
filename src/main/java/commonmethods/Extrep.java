package commonmethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extrep {
	
	static ExtentReports extent ;
	static ExtentSparkReporter spark ;
	static ExtentTest test;
	public static void extentsetup() {
		 extent = new ExtentReports();
		 spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		 test = extent.createTest("sampletest");
		
		
	}
	
	public static void testpass() {
		test.pass("test is pass");
		
	}
	
	public static void testfail() {
		test.fail("test is failed");
		
		
	}
	
	public static void scnh() {
		
		test.addScreenCaptureFromPath("D:\\advshop124.png");
	}
	
	public static void flush() {
		extent.flush();
		
	}
	
	
	

}
