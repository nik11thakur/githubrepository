package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://ui.vision/demo/webtest/frames/");
	WebElement a=driver.findElement(By.xpath("/html/frameset/frame[1]"));
	driver.switchTo().frame(a);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1");
	driver.switchTo().defaultContent();
	WebElement c=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
	driver.switchTo().frame(c);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame3");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
	
	
	
	
	
	driver.switchTo().defaultContent();
	WebElement d=driver.findElement(By.xpath("/html/frameset/frame[2]"));
	driver.switchTo().frame(d);
	driver.findElement(By.xpath("//*[@id=\"id5\"]/div/input")).sendKeys("frame 5");
}
}
