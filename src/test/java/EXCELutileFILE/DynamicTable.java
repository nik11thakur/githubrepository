 package EXCELutileFILE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
	driver.findElement(By.name("username")).sendKeys("demo");
	driver.findElement(By.name("password")).sendKeys("demo");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();
	driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[3]//a[1]")).click();
	//driver.findElement(By.xpath("//*[@id=\"button-menu\"]/i")).click();
	//int menu=driver.findElements(By.xpath("//a[@class='parent collapsed']")).size();
	List <WebElement> menu=driver.findElements(By.xpath("//a[@class='parent collapsed']"));
	for(int i=0;i<menu.size();i++) {
		String list=menu.get(i).getText();
		if(list.equals("Customers")) {
			menu.get(i).click();
			break;
		}
	}
	List <WebElement> customer=driver.findElements(By.xpath("//*[@id=\"collapse-5\"]//li"));
	for(int j=0;j<customer.size();j++) {
		String list1=customer.get(j).getText();
		if(list1.equals("Customers")) {
			customer.get(j).click();
			break;
		}
	}
	int row=driver.findElements(By.xpath("//*[@id=\\\"form-order\\\"]//tbody//tr")).size();
	System.out.println(row);
	
	int col=driver.findElements(By.xpath("//[@id=\\\"form-order\\\"]//tbo*dy//tr[2]//td")).size();
	System.out.println(col);
	for(int r=2;r<=row;r++) {
		for(int c=0;c<=col;c++) {
			String el=driver.findElement(By.xpath("//*[@id=\"form-order\"]//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(el);
		}
		System.out.println();
	}
	
	
	
}
}
