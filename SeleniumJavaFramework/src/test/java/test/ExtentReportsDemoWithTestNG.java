package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemoWithTestNG {

	ExtentSparkReporter htmlReporter;
	private static ExtentReports extent;
	private static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){

		htmlReporter = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@BeforeTest
	public static void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://google.com");
	}

	@Test
	public void test1() {
		
		ExtentTest test = extent.createTest("Google Search Test one","This is a test to validate google search functionality");
		
		driver.get("https://google.com");
		test.pass("Navigated to Google page & page got launched");
	   
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
	}
	
	@Test
	public void test2() {
		
		ExtentTest test = extent.createTest("Google Search Test one","This is a test to validate google search functionality");

	    // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
	}

	@AfterTest
	public static void tearDownTest() {

		driver.close();
		
		driver.quit();
		
		System.out.println("Test ran successfully");
	}
	@AfterSuite
	public void tearDown() {

		extent.flush();
	}

}
