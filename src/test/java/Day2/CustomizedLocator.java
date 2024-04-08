package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedLocator {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php");
	
	driver.findElement(By.cssSelector("input#search_query_top"));
		
		
		
}
}
