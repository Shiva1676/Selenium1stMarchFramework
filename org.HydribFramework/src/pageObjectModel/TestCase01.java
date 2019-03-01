/**
 * 
 */
package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class TestCase01 {

	@Test
	public void testingApp(){
		
		WebDriver driver = BrowserFactory.getBrowsers("Chrome", "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		Pages page = PageFactory.initElements(driver, Pages.class);
		
		page.loginPage("Admin", "admin123");
		
	}

}
