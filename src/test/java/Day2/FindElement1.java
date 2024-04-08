package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	Thread.sleep(3000);
	List<WebElement> link=driver.findElements(By.tagName("a"));
	System.out.println(link.size());
	
}
}
