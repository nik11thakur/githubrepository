package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Frames");
	
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Jackson");
	
}
}