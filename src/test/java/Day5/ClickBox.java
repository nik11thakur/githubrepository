package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickBox {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("Total number of links :- "+links.size());
	
	for(int i=0;i<links.size();i++) {
		System.out.println("Total number of links by text are : "+links.get(i).getText());
	}
	
	
//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user123");
//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password456");
	
	
	
	
	
}
}
