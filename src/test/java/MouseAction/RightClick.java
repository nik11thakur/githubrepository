package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClick {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act=new Actions(driver);
		act.contextClick(button).build().perform()
		
		
		
		
		
		
	}		
}
