/**
 * 
 */
package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

/**
 * @author Lenovo
 *
 */
public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver getBrowsers(String browser, String url) {

		if (browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

			Reporter.log("The following script is running on >>>" + browser, true);

		}else if (browser.equalsIgnoreCase("Firefox")) {
			
			driver = new FirefoxDriver();
			
			Reporter.log("The following script is running on >>>" + browser, true);
			
		}else if (browser.equalsIgnoreCase("IE")) {
			
			driver = new InternetExplorerDriver();
			
			Reporter.log("The following script is running on >>>" + browser, true);
			
		}

		driver.get(url);
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		return driver;
	}

}
