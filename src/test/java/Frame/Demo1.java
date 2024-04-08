package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Frames");
	//driver.switchTo().frame("frm1");
	
	//WebElement frame1=driver.findElement(By.xpath("//div[@class='top-bar-wrapper body-row']"));
	//driver.switchTo().frame(frame1);
	WebElement drp=driver.findElement(By.xpath("//*[@id=\"course\"]"));
	Select dropdown=new Select(drp);
	dropdown.selectByVisibleText("Java");
	
	//driver.switchTo().defaultContent();
	//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Byee Frames");
	
}
}
