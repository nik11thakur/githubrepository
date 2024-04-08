package Day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo {
 public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().to("https://testautomationpractice.blogspot.com/");
	
	//driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	
}
}
