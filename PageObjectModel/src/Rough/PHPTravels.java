package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTravels {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://phptravels.net/login");
		
		WebElement UserName=driver.findElement(By.className("form-control"));
		UserName.sendKeys("user@phptravels.com");
		
		WebElement Password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("demouser");
		
		WebElement SButton=driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		SButton.click();
	}
}