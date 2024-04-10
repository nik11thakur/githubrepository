package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH_demo {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	//creating own Xpath
	WebElement text=driver.findElement(By.xpath("//*[@href=\"/apple-macbook-pro-13-inch\"]"));
	System.out.println(text);
	
	//absolute
	//driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]"));
	
	//relative
	//driver.findElement(By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']"));
	
  }
}
