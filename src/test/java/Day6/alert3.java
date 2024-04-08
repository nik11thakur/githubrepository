package Day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//ok with inbox
public class alert3 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.sendKeys("I am Popoy The Saler Man");
	alert.accept();
	String text=driver.findElement(By.id("result")).getText();
	if(text.equals("You entered: I am Popoy The Saler Man")) {
		System.out.println("Passed");
	}else {
		System.out.println("Failed");
	}
	}
	
	
	
	
}

