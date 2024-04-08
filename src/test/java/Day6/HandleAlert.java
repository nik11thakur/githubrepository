package Day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Alert alert=driver.switchTo().alert();
	
	alert.accept();
	String text=driver.findElement(By.id("result")).getText();
//	if(text.equals("You clicked: Ok"))
	if(text.equals("You successfully clicked an alert"))
		System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		alert.dismiss();
	
	
}
}
