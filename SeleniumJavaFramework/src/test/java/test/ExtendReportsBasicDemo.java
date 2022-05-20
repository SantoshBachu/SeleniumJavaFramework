package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtendReportsBasicDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google Search Test one","This is a test to validate google search functionality");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://google.com");
		test1.pass("Naviagted to Google Page");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test1.pass("Entered text in google search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test1.pass("Clicked on Enter key from keyboard");
		
		driver.close();
		
		driver.quit();
		test1.pass("Closed Browser");
		
		extent.flush();
		
		System.out.println("Test Completed");
	}

}
