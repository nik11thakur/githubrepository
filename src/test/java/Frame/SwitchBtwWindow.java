package Frame;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBtwWindow {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	
	Set<String> windowids=driver.getWindowHandles();
	
	//converting list into (set)arraylist
	/*List<String> a1=new ArrayList(windowids);
	String parentwindowid=a1.get(0);
	String childwindowid=a1.get(1);
	driver.switchTo().window(childwindowid);
	driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));
	System.out.println(driver.getTitle());
	driver.switchTo().window(parentwindowid);
	driver.findElement(By.name("username")).sendKeys("admin");
	*/
	for(String winid:windowids) {
	String text=driver.switchTo().window(winid).getTitle();
	if(text.equals("Human Resources Management Software | OrangeHRM")) {
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}else if(text.equals("OrangeHRM")){
		driver.findElement(By.name("username")).sendKeys("admin");
	}
	
	
	
}
}}
