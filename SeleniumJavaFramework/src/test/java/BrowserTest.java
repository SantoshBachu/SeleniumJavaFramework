import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\santo\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\iedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://selenium.dev");
		
		driver.quit();
	}
}
