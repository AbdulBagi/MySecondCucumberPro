package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	
	
	 static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver != null) {
			return driver;
			
		}
		String browser = Config.getProperty("browserType").toLowerCase();
		
			switch ("browser") {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
				default:
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			}
			
			
			driver.manage().window().fullscreen();
			String time = Config.getProperty("implicitWait");
			driver.manage().timeouts().implicitlyWait(Integer.valueOf(time), TimeUnit.SECONDS);
			return driver;
	}
	
	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
