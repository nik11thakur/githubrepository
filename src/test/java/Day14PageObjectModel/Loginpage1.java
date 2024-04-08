package Day14PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage1 {

		WebDriver driver;
		
		Loginpage1(WebDriver driver){
			this.driver=driver;
		
	}
	//locating element
		By logo= By.xpath("//img[@alt='nopCommerce demo store']");
		By email=By.xpath("//*[@id=\"Email\"]");
		By password=By.xpath("//*[@id=\"Password\"]");
		By Log_in=By.xpath("//button[normalize-space()='Log in']");
		
		
		
	
}
