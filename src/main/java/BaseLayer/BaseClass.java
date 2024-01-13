package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void intitialization() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		driver.get("https://www.indiapost.gov.in/VAS/pages/userregistration.aspx");
	}

}
