package Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest1 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.get("https://testautomationpractice.blogspot.com/");

	driver.findElement(By.id("name")).sendKeys("Nikhil Thakur");
	driver.findElement(By.id("email")).sendKeys("nikhilthakur@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("1234567890");
	driver.findElement(By.id("textarea")).sendKeys("Mandi");
	driver.findElement(By.id("male")).click();
    
	List <WebElement> days=driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type=\"checkbox\"]"));
	for(int i=0;i<2;i++)
	{
	days.get(i).click();
	}
	WebElement country = driver.findElement( By.xpath("//*[@id=\"country\"]"));
	Select one = new Select(country);

	one.selectByVisibleText("India");
	
	driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/a[1]")).click();
	driver.navigate().back();

	driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
	driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();

	
}
}
