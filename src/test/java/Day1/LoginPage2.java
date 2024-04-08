package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage2 {
public static void main(String[] args) {
	//System.setProperty(null, null)
	
	//WebDriverManager.chromedriver().setup();//used before 4.6
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/index.php");

driver.findElement(By.name("userName")).sendKeys("mercury");
driver.findElement(By.name("password")).sendKeys("mercury");
driver.findElement(By.name("submit")).click();
String act_value=driver.getTitle();
String exp_value="Login: Mercury Tours";
if(act_value.equals(exp_value)) {
	System.out.println("Test is passed");
}else {
	System.out.println("Test is not passed");
}

driver.close();
}
}
