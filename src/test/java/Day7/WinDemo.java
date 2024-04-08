package Day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinDemo {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	
	
	Set<String>windowids=driver.getWindowHandles();
	List<String>a1=new ArrayList(windowids);
	String parentwindowid=a1.get(0);
	String childwindowid=a1.get(1);
	driver.switchTo().window(parentwindowid);
	System.out.println("Parent Window");
	
	driver.switchTo().window(childwindowid);
	System.out.println("Child Window");
	
	
}
}
