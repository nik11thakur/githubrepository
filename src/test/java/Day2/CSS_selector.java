package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.findElement(By.cssSelector("input#search")).sendKeys("mobile");
	
	
}
	
}
