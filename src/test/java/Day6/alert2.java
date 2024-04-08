package Day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//ok and cancel
public class alert2 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Alert alert= driver.switchTo().alert();
	//alert.accept();
	alert.dismiss();
	String text1=driver.findElement(By.id("result")).getText();
	//if(text1.equals("You clicked: Ok")) {
	if(text1.equals("You clicked: Cancel")) {	
	System.out.println("Passed");
	}else {
		System.out.println("Failed");
	}
	
	
	
	
}
}
