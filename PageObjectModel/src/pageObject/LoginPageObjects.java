package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	@FindBy(name="email")
	public static WebElement UserName;
	@FindBy(name="password")
	public static WebElement Password;
	@FindBy(xpath="//span[normalize-space()='Login']")
	public static WebElement SButton;
	
	 /*public static WebElement UserName(WebDriver driver) {
		return driver.findElement(By.className("form-control"));	
	}
	
	 public static WebElement Password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Password']"));
	}
	
	public static WebElement SButton(WebDriver driver) {
		return driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		
	}*/
//how=How.CLASS_NAME,using
}
