package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	
	WebElement country=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
	WebElement state=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
			 Actions act=new Actions(driver);
			 act.dragAndDrop(state, country).build().perform();
	
	
	
	
	
	
}
}
