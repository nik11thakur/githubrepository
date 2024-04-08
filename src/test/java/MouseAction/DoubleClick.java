package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3
public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
//		Thread.sleep(3000);
		
		driver.switchTo().frame("iframecontainer");
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
		
		
		
	}		
}
