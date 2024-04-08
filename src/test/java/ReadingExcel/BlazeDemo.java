package ReadingExcel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://blazedemo.com/");
	List<WebElement> list=driver.findElements(By.xpath("/html/body/div[3]/form/select[1]/option"));
	for(int i=0;i<list.size();i++){
		if(list.get(i).getText().equals("Boston")) {
			list.get(i).click();
			break;
		}
		}
	List<WebElement> list1=driver.findElements(By.xpath("/html/body/div[3]/form/select[2]/option"));
	for(int j=0;j<list1.size();j++) {
		if(list1.get(j).getText().equals("Rome")) {
			list1.get(j).click();
			break;
		}
	    }
	driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
	
	int row = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr")).size();
	System.out.println("Number of rows:" + row);
	int col = driver.findElements(By.xpath("/html/body/div[2]/table/thead/tr/th")).size();
	System.out.println("Number of columns:" + col);
	
	String 
	for(int a=1;a<row;a++) {
		String price=driver.findElement(By.xpath("/html/body/div[2]/table//tr["+a+"]//td[6]")).getText();
	    System.out.println(price);
	}
//	List<WebElement>tables=driver.findElement(By.xpath(""));
//	ArrayList<Double>price=new ArrayList<>();
	
	
	
}
}
