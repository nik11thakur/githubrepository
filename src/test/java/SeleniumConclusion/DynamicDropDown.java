package SeleniumConclusion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DynamicDropDown {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	Thread.sleep(5000);
	List<WebElement> drp=driver.findElements(By.xpath("//*[@class=\"wM6W7d\"]/span"));
	Thread.sleep(5000);
	System.out.println("No. of element in dropdown are: "+drp.size());
	Thread.sleep(5000);
//	for(WebElement all:drp) {
//		System.out.println(all.getText());
//		Thread.sleep(5000);
//	}
	for(int i=0;i<drp.size();i++) {
		if(drp.get(i).getText().equals("selenium tutorial")) {
		 drp.get(i).click();
			break;
		}
	}
	
	
	
	
	
	
}
}
