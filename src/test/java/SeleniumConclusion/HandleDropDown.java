package SeleniumConclusion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	
	//Select dropdown
	WebElement dd=driver.findElement(By.xpath("//select[@id='country-list']"));
	//Select class is used for elements of dropdown 
	Select drp=new Select(dd);
	//select by visible text
	drp.selectByVisibleText("India");
	// select by index
//	drp.selectByIndex(4);
//	//select by value
	drp.selectByValue("4");
	Thread.sleep(5000);
	WebElement st=driver.findElement(By.xpath("//select[@id='state-list']"));
	Select sd=new Select(st);
	Thread.sleep(5000);
	sd.selectByIndex(3);
	
	Thread.sleep(5000);
	//sd.selectByVisibleText("Delhi");
	         
              //to print all element
	List<WebElement> a=sd.getOptions();
	          //to print no. of element
		System.out.println(a.size());
		      //to print elements by name
	for(int i=0;i<a.size();i++) {

	System.out.println(a.get(i).getText());
	}
	
	
	
}
}
