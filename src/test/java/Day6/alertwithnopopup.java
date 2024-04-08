package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertwithnopopup {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	String message=driver.findElement(By.cssSelector("div[class='example'] p")).getText();
	if(message.contains("Congratulations!")) {
		System.out.println("Test Passed");
	}else {
		System.out.println("Test Failed");
	}
	
	
	
}
}
