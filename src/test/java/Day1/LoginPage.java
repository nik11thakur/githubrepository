package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
public static void main(String[] args) {
	//System.setProperty(null, null)
	
	//WebDriverManager.chromedriver().setup();//used before 4.6
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
}
}
