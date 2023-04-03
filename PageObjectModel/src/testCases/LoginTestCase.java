package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginPageObjects;

public class LoginTestCase {
	
	@Test
	public void login() {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://phptravels.net/login");
	
	PageFactory.initElements(driver, LoginPageObjects.class);
	
	LoginPageObjects.UserName.sendKeys("user@phptravels.com");
	LoginPageObjects.Password.sendKeys("demouser");
	LoginPageObjects.SButton.click();
	
	/*LoginPageObjects.UserName(driver).sendKeys("user@phptravels.com");
	LoginPageObjects.Password(driver).sendKeys("demouser");
	LoginPageObjects.SButton(driver).click();*/
}
}