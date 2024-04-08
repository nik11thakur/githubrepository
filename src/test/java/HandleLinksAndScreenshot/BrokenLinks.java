package HandleLinksAndScreenshot;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//http://www.deadlinkcity.com/
public class BrokenLinks {
public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("http://www.deadlinkcity.com/");
	List<WebElement> l=driver.findElements(By.tagName("a"));
	System.out.println(l.size());
	
	int brokenlink=0;
	for(WebElement linkElement:l) {
		String hrefvalue=linkElement.getAttribute("href");
		if((hrefvalue==null)||hrefvalue.isEmpty()){
			System.out.println("href value is empty");
		    continue;
		}
		
		//connection
		URL linkurl=new URL(hrefvalue);
		HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();
		conn.connect();
		if(conn.getResponseCode()>400) {
			System.out.println(hrefvalue+"  "+"Broken link");
			brokenlink++;
		}
		else {
			System.out.println(hrefvalue + " "+" NOT Broken Link");
		}
		System.out.println("Total No of Broekn links are :" +brokenlink);
		
		
		
	}
	
	
}
}
/*or(WebElement linkElement:links)
{
String hrefValue=linkElement.getAttribute("href"); //value for href attribute

if(hrefValue==null || hrefValue.isEmpty() )
{
System.out.println("href value is empty");
continue;
}

//connection---open ,send
URL linkurl =new URL(hrefValue); //convert string to URL
HttpURLConnection conn =(HttpURLConnection) linkurl.openConnection(); //sending request to server
conn.connect();

if(conn.getResponseCode()>400) //getResponseCode()--status code
{
System.out.println(hrefValue + " "+"Broken Link");
brokenlinks++;
}
else
{
System.out.println(hrefValue + " "+" NOT Broken Link");
}
}

System.out.println("Total No of Broekn links are :" +brokenlinks);*/