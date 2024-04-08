package EXCELutileFILE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	int row=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table//tbody//tr")).size();
	System.out.println("No. of rows: "+row);
	int col=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table//tbody//tr[2]//td")).size();
	System.out.println("No. of column: "+col);
	         //printing single element
	String s=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table//tr[7]//td[1]")).getText();
	System.out.println(s); 
	
	//to print all element of a single row
	List<WebElement> row2=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table//tr[2]//td"));
	for(int r=0;r<row2.size();r++) {
	String el=row2.get(r).getText();
	System.out.println("No. of element by text in row 2: "+el);//to print the element of row 2
	}
	
	           // getting data of table
	for(int i=2;i<=row;i++) {
		for(int j=1;j<=col;j++) {
			String data=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table//tr["+i+"]//td["+j+"]")).getText();
			System.out.print("  "+data+"  ");
		}System.out.println();
	}
	        //adding the prices of 
	int sum=0;
	for(int i=2;i<=row;i++) {
		String price=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table//tr["+i+"]//td[4]")).getText();
		sum=sum+Integer.parseInt(price);
		System.out.println("Sum of all prices are: "+sum);
	if(sum==7100) {
		System.out.println("Test Passed");
	}else {
		System.out.println("Test Failed");
	}
	}
	
	
	
	
}
}
