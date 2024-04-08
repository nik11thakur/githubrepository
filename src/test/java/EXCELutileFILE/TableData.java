package EXCELutileFILE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://testautomationpractice.blogspot.com/");
	//no. of rows
	int rows=driver.findElements(By.tagName("tr")).size();
	System.out.println("The total no. of row: "+rows);
	String row=driver.findElement(By.xpath("//*[@name=\"BookTable\"]//tr")).getText();
	System.out.println("The total no. of row: "+row);
	String col=driver.findElement(By.xpath("//*[@name=\"BookTable\"]//th")).getText();
	System.out.println("The total no. of column: "+col);
	String text=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
	System.out.println(text);
	/*for(int r=2;r<=rows;r++) {
		for(int c=1;c<=col;c++) {
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value);
		}  
		System.out.println();
	}
	for(int r=2;r<=rows;r++) {
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+2+"]//td["+2+"]")).getText();
		if(value.equals("Amit")) {
			String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+1+"]")).getText();
		}
	}
	//add all the price
	int sum=0;
	for(int r=2;r<=row;r++) {
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+1+"]")).getText();
	}
	*/
	
	
}
}
//https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html