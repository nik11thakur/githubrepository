package SeleniumConclusion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
	List<WebElement> el=driver.findElements(By.xpath("//*[@class=\"multiselect-container dropdown-menu\"]/child::*"));
	
//	        //find no. of elements
//	System.out.println("Total elements are:- "+el.size());
//	        //print no. of elements by gettext()
//	for(int i=0;i<el.size();i++) {
//	System.out.println(i+ "Elements are:-" +el.get(i).getText());
//	}
	        //foreach loop to print elements by text
//	for(WebElement all:el) {
//		System.out.println("All Element are:- "+all.getText());
//	}
	
//	        //select an element
//	for(int i=0;i<el.size();i++) {
//		if(el.get(i).getText().equals("Python")) {
//		el.get(i).click();
//		break;
//		}
//		}
	        //Select multiple options
//	for(int i=0;i<el.size();i++) {
//		String multiselect=el.get(i).getText();
//		if(multiselect.equals("Angular")||multiselect.equals("C#")) {
//		el.get(i).click();
//		}
//		}
	        for(WebElement all:el) {
	        	String multiselect=all.getText();
	        	if(multiselect.equals("Angular")||multiselect.equals("C#")) {
	        	all.click();	
	        	}
	        }
	
	
	
}
}
