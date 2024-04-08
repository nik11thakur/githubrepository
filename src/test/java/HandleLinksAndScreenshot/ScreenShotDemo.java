package HandleLinksAndScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotDemo {
public static void main(String[] args) throws IOException {
	//ChromeDriver driver=new ChromeDriver();
	       //for headless testing
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--headless=new");
	WebDriver driver =new ChromeDriver(option); //open the browser
	
	//WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://demo.nopcommerce.com/");
	//driver.manage().window().maximize();
	//TakesScreenshot ts=driver;
	TakesScreenshot ts=(TakesScreenshot) driver;
	
//	File scr=ts.getScreenshotAs(OutputType.FILE);
//	File trg=new File("C:\\Users\\user\\eclipse-workspace\\Selenium_maven\\Screenshot\\fullscreen.png");
//	FileUtils.copyFile(scr, trg);
	
	WebElement wb=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
	File scr=wb.getScreenshotAs(OutputType.FILE);
	File trg=new File("C:\\Users\\user\\eclipse-workspace\\Selenium_maven\\Screenshot\\specificarea.png");
	FileUtils.copyFile(scr, trg);
	
	
}
}
