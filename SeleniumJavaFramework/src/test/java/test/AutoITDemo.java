package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		test1();
	}


	public static void test1() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.filemail.com/share/upload-file");
		driver.findElement(By.id("addBtn")).click();
		Thread.sleep(5000);

		Runtime.getRuntime().exec("C:\\Users\\santo\\OneDrive\\Desktop\\AutoIt\\FileUploadAutoITScript.exe");
		Thread.sleep(3000);
		System.out.println("File Upload Successfully");
		driver.close();
		System.out.println("Test Completed");
	}

}
