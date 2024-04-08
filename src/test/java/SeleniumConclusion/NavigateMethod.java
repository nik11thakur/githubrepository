package SeleniumConclusion;

import java.net.MalformedURLException;
import java.net.URL;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws MalformedURLException {
     ChromeDriver driver=new ChromeDriver();
     //Approach 1
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     System.out.println(driver.getCurrentUrl());
     //Approach 2
     driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
     System.out.println(driver.getCurrentUrl());
     driver.navigate().back();
     System.out.println(driver.getCurrentUrl());
     //Approach 3
     URL url=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.navigate().to(url);
     System.out.println(driver.getCurrentUrl());
     driver.navigate().forward();
     driver.navigate().back();
     System.out.println(driver.getCurrentUrl());
     driver.navigate().forward();
     System.out.println(driver.getCurrentUrl());
     
	
	
	
	
	
	
	
}	
}
