/**
 * 
 */
package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Lenovo
 *
 */
public class Pages {

	WebDriver driver;

	@FindBy(how = How.ID, using = "txtUsername")
	WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@value='LOGIN']")
	WebElement loginButton;

	public Pages(WebDriver driver) {

		this.driver = driver;
	}

	public void loginPage(String uname, String pass) {

		username.sendKeys(uname);
		
		password.sendKeys(pass);
		
		loginButton.click();
		
	}

}
