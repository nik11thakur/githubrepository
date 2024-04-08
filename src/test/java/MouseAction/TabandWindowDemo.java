package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabandWindowDemo {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//		       //to open new tab
//		driver.switchTo().newWindow(WindowType.TAB);
		       //open in window 
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/login/");
		//driver.findElement(By.xpath("//*[@id=\"target\"]"));
		
}
}