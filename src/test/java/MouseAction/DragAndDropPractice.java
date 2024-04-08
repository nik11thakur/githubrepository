package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(bank, account).build().perform();
		
		WebElement account1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		//act=new Actions(driver);
		act.dragAndDrop(amount, account1).build().perform();
		
		WebElement account2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		//act=new Actions(driver);
		act.dragAndDrop(sales, account2).build().perform();
		
		WebElement amount2=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		WebElement credit=driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
		//act=new Actions(driver);
		act.dragAndDrop(credit, amount2).perform();
		
}
}