package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDownWithoutSelectTag {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
    driver.findElement(By.xpath("//button[@title='HTML, CSS']"));
    List<WebElement> all=driver.findElements(By.xpath("//*[@class=\"multiselect-container dropdown-menu\"]/child::*"));
   // System.out.println("Total elements are: "+all.size());
   
    for(WebElement list:all) {
    System.out.println(list.getText());
    }
    for(int i=0;i<all.size();i++) {
    	if(all.get(i).getText().equals("Python"))
    	{
    		all.get(i).click();
    	break;
    		
    	}
    }
//    for(int i=0;i<all.size();i++) {
//    	String OptionName= all.get(i).getText();
//    	if(OptionName.equals("Java")||OptionName.equals("Python"))
//    	{
//    		all.click();
//  
//    		
//    	}
//    }
     
}
}
