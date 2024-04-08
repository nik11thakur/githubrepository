package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
	System.out.println("value of element befor maxi"+ logo.getLocation());
	
	//open webpage to limited size
	Point p=new Point(85,35);
	driver.manage().window().setPosition(p);
	System.out.println("value of element "+logo.getLocation());
	
	p=new Point(100,200);
	driver.manage().window().setPosition(p);
	System.out.println("value of element "+logo.getLocation());
	
	
	
}
}
