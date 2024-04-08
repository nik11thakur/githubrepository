package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class RelativeLocators {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	WebElement username=driver.findElement(By.xpath("//input[@placeholder='Password']"));
//	driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("Hello");
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
    Thread.sleep(3000);
	WebElement s1=driver.findElement(RelativeLocator.with(By.tagName("input")).below(username));
	System.out.println(s1.getText());
	//.sendKeys("Hello");
	
//	driver.get("https://automationbookstore.dev/");
//	Thread.sleep(3000);
//	WebElement username=driver.findElement(By.xpath("//p[@id='pid6_author']"));
//    Thread.sleep(3000);
//	driver.findElement(RelativeLocator.with( By.id("pid6_title")).toLeftOf(username));
//	
}
}
