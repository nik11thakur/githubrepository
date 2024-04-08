package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1. classname(single element)
//2. tags(multiple elements)
public class FindElement {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php");
	List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
	System.out.println("Total no of images in slider:" + sliders.size());
	// total images in page
	List<WebElement> images=driver.findElements(By.tagName("img"));
	System.out.println("Total images in a page:"+images.size());
	List<WebElement> link=driver.findElements(By.tagName    ("a"));
	System.out.println("Total no of links:"+link.size());
	
	
}
}
