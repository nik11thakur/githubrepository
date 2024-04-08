package Day14PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;
	//constructor
	LoginPage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="img[alt='company-branding']")
	WebElement logo;
	@FindBy(name="username")
	WebElement usern;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickbutton;
//	//locate Element
//	By logo=By.cssSelector("img[alt='company-branding']");
//	By usern=By.name("username");
//	By password=By.name("password");
//	By clickbutton=By.xpath("//button[@type='submit']");
	//actions
	public void setUserName(String username) {
	usern.sendKeys(username);
	}
	public void setPassword(String paswd) {
		password.sendKeys(paswd);
		}
	public void setclick() {
		clickbutton.click();
		}
	public boolean checklogo() {
		boolean status=logo.isDisplayed();
		return status;
	}	
}

