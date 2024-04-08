package Day14PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//global variable
	WebDriver driver;
	//constructor
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	//locate Element
	By logo=By.cssSelector("img[alt='company-branding']");
	By usern=By.name("username");
	By password=By.name("password");
	By clickbutton=By.xpath("//button[@type='submit']");
	//actions
	public void setUserName(String username) {
	driver.findElement(usern).sendKeys(username);
	}
	public void setPassword(String paswd) {
		driver.findElement(password).sendKeys(paswd);
		}
	public void setclick() {
		driver.findElement(clickbutton).click();
		}
	public boolean checklogo() {
		boolean status=driver.findElement(logo).isDisplayed();
		return status;
	}
	
	
	
	
	
}
