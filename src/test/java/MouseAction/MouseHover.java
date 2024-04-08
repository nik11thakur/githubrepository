package MouseAction;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
//	WebElement Desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
//	WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
//	
//	Actions act=new Actions(driver);
//	act.moveToElement(Desktop).moveToElement(Mac).click().build().perform();
	
	WebElement lp=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle show']"));
	WebElement wd=driver.findElement(By.xpath("//a[normalize-space()='Windows (0)']"));
	Actions act=new Actions(driver);
	act.moveToElement(lp).moveToElement(wd).click().build().perform();
	
	
	
	
}
}
