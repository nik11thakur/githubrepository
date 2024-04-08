package Day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getPageSource());
//	
	
	Thread.sleep(3000);
	//System.out.println(driver.getWindowHandle());
	
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Thread.sleep(4000);
	Set <String> win= driver .getWindowHandles();
	for(String Winid:win) {
	System.out.println(Winid);
	}
	
	driver.close();
	
}
}
