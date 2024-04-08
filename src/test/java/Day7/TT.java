package Day7;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TT {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.id("name")).sendKeys("Jackson");
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("1234567890");
	driver.findElement(By.id("textarea")).sendKeys("Mandi<H.P>");
	driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
	
	Thread.sleep(3000);
	List<WebElement> days= driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type=\"checkbox\"]"));

	for(int i=0;i<days.size();i++) {
		days.get(i).click();
		days.get(0).click();
		days.get(6).click();
	}

	WebElement cntry=driver.findElement(By.xpath("//*[@class=\"form-control\"][@id=\"country\"]"));
	Select cn=new Select(cntry);
	cn.selectByValue("india");
	
	List<WebElement>clr=driver.findElements(By.xpath("//*[@id=\"colors\"]/child::*"));
	for(int i=0;i<clr.size();i++) {
		String c=clr.get(i).getText();
		if(c.equals("Black")||c.equals("Yellow")) {
		clr.get(i).click();
		break;
	}
	}
	driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

	//driver.navigate().back();
	driver.switchTo().defaultContent();
//	driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
//	driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
//	List <WebElement> search = driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/child::*"));
//	for(int i=0;i<search.size();i++)
//	{
//	if(search.get(i).getText().equals("Selenium"))
//	{
//	search.get(i).click();
//	break;
//	}
	
//	driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
//	Alert alert=driver.switchTo().alert();
//	alert.accept();
//	driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/script")).click();
//	Alert al=driver.switchTo().alert();
//	al.dismiss();
	//}
}
}