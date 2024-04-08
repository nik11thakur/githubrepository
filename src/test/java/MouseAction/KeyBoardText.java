package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardText {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://text-compare.com/");
	driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("yooo");
	
	Actions act=new Actions(driver);
	//cntrol+a
	act.keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).perform();
	
	//control+c
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	
	//tab
	act.sendKeys(Keys.TAB);
	//control+v
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	
	
	
	
	
}
}
