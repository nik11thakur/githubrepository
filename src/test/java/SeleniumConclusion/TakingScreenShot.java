package SeleniumConclusion;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.facebook.com/login/");
	
	TakesScreenshot ts=(TakesScreenshot) driver; 
//	File src=ts.getScreenshotAs(OutputType.FILE);
//	File trg=new File("C:\\Users\\user\\eclipse-workspace\\Selenium_maven\\Screenshot\\tscr.png");
//	
//	FileUtils.copyFile(src, trg);
//	System.out.println("ScreenShot Taken");
	
	WebElement ss=driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
	File src=ss.getScreenshotAs(OutputType.FILE);
	File tsc=new File("C:\\Users\\user\\eclipse-workspace\\Selenium_maven\\Screenshot\\fblogin.png");
	FileUtils.copyFile(src, tsc);
	System.out.println("Successfull");
	
	
}
}
