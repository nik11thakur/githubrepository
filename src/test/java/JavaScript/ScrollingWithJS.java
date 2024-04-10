package JavaScript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWithJS {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.countries-ofthe-world.com/");
	
	JavascriptExecutor js=driver;
	//Scroll page by pixil
	js.executeScript("window.scrollBy(0,3000)", " ");
	System.out.println(js.executeScript("retur window.page.YOffset)", " "));
	
//	js.executeScript(", args)
	
	
	
	
}
}
