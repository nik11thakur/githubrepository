package SeleniumConclusion;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
public static void main(String[] args) throws IOException {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.get("http://www.deadlinkcity.com/");
	  List <WebElement> links=driver.findElements(By.tagName("a"));
	  System.out.println("Total links are:- "+links.size());
	  
	  int brokenlinks=0;
	  for(WebElement element:links) {
		  String hrefvalue=element.getAttribute("href");
		  if(hrefvalue==null||hrefvalue.isEmpty()) {
			  System.out.println("Value is Empty");
			  continue;
		  }
		  URL linkurl=new URL(hrefvalue);
		  HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();
		  conn.connect();
		  
		   if(conn.getResponseCode()>400) {
			   System.out.println(hrefvalue+"  Broken Link");
		       brokenlinks++;
		   }
		   else {
			   System.out.println(hrefvalue+"  Not broken");
		   }
	  }System.out.println("No. of broken link="+brokenlinks);
	  
	   
	  
	  
	  
}
}
