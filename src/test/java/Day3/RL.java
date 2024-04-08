package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RL {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationbookstore.dev/");
	Thread.sleep(5000);
	WebElement book=driver.findElement(By.xpath("//img[@id='pid6_thumb']"));
	Thread.sleep(5000);
	WebElement leftbook= driver.findElement(RelativeLocator.with(By.id("pid6_thumb")).toLeftOf(book)); 
	System.out.println(leftbook.getText() );
	//driver.findElement(By.xpath("//img[@id='pid1_thumb']"));
	
	
}
}
