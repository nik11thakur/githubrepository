package MouseAction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActionsClass {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act=new Actions(driver);
		Action steps=act.contextClick(button).build();
		steps.perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
		//Alert al=new Alert(driver);
		//al.accept();
}
}