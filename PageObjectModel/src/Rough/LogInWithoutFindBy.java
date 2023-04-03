package Rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogInWithoutFindBy {
	
	public static WebElement username;
	public static WebElement password;
	public static WebElement btnlogin;
	
	@Test
	public void Login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PageFactory.initElements(driver, LogInWithoutFindBy.class);
		
	username.sendKeys("Admin");
	password.sendKeys("admin123");
    btnlogin.click();
		
	}

}
