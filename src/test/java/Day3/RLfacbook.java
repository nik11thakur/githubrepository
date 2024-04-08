package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to count the following elements available in facebook login page.
public class RLfacbook {
public static void main(String[] args) throws InterruptedException {
//	ChromeDriver driver=new ChromeDriver();
//	Thread.sleep(3000);
//	driver.get("https://www.facebook.com/");
//	Thread.sleep(3000);
////	List<WebElement> element=driver.findElements(By.xpath("//*[@type=\"text\"]/following::*"));
////	System.out.println(element.size()); 
//	List<WebElement> In=(List<WebElement>) driver.findElement(By.tagName("input"));
//	System.out.println(In.size());

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"email\"]/following::*"));
	System.out.println("No. of elements :"+element.size());
	List<WebElement> nt=driver.findElements(By.tagName("input"));
	System.out.println("No. of input boxes :"+nt.size());
	
}
}
