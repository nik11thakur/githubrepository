package SeleniumConclusion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://testautomationpractice.blogspot.com/
public class HandleCheckBox {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://testautomationpractice.blogspot.com/");
	
	//finding checkbox element and click it.
	//driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
	
	//finding the no. of check boxes
//	WebElement days=driver.findElement(By.xpath("//*[@class=\"form-check-input\"][@type=\"checkbox\"]"));
//	System.out.println(days.getSize());
//	
	List <WebElement> checkbox=driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type=\"checkbox\"]"));
	System.out.println("Number : "+checkbox.size());
	
	//Selecting all checkbox at ones
//	for(int i=0;i<checkbox.size();i++) {
//		checkbox.get(i).click();
//	}
//	
	//other way to check all boxes > by for each loop
//	for (WebElement chk:checkbox) {
//		chk.click();
//	}
//	// check first two
//	for(int i=0;i<2;i++) {
//		checkbox.get(i).click();
//	}
	//uncheck/deselect
	for(int i=0;i<checkbox.size();i++) {
		checkbox.get(i).click();
	}
    
	Thread.sleep(3000);
    
	for(int i=0;i<2;i++) {
		checkbox.get(i).click();
	}
	//uncheck the selected option
	for(int i=0;i<checkbox.size();i++) {
		if(checkbox.get(i).isSelected()) {
			checkbox.get(i).click();
		}
	}
	
	
}
}
