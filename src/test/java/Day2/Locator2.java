package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
        List <WebElement> sliders= driver.findElements("homeslider-description");
		
        List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of images available on the page :" +links.size());
}
}