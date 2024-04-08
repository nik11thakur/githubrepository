package Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {
	public static void main(String[] args) {
    ChromeDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    FluentWait mywait =new FluentWait(driver);
    
    mywait.withTimeout(Duration.ofSeconds(30L));
    mywait.pollingEvery(Duration.ofSeconds(5L));
    mywait.ignoring(NoSuchElementEception.class);
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
 






	}
}
