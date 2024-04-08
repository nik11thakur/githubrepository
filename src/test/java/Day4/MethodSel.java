package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodSel {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	//WebElement check=driver.findElement(By.xpath("//input[@id='LastName']"));
	WebElement reg=driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
	System.out.println("Register is Displayed :"+reg.isDisplayed());
	WebElement TB=driver.findElement(By.cssSelector("#FirstName"));
	System.out.println("FirstName textbox is enabled: "+TB.isEnabled());
	WebElement DD=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
	DD.click();
	System.out.println(DD.isSelected());
	
	
	
	
}
}
