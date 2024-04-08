 package Day6;
//ok
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	
	Alert alert=driver.switchTo().alert();
	alert.accept();
	String singleok =driver.findElement(By.id("result")).getText();
	if(singleok.equals("You successfully clicked an alert")){
		System.out.println("Result Passed");}
	else {
		System.out.println("Result Failed");
	}
	
	
	
}
}
