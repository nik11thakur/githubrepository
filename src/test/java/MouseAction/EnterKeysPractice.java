package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EnterKeysPractice {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/key_presses?");
	driver.findElement(By.xpath("//*[@id=\"target\"]"));
	
	Actions act=new Actions(driver);
	Action a1=act.sendKeys(Keys.TAB).build();
	a1.perform();
	String web=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	
	if(web.equals("You entered: TAB")) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	
	
	
}
}
