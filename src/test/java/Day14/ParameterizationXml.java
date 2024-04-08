package Day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterizationXml {
WebDriver driver;
	@BeforeClass
	@Parameters("browser")
void steup(String br) {
		if(br.equals("chrome")){
		driver=new ChromeDriver();
	}
	else if(br.equals("edge")) {
		driver=new EdgeDriver();
	}
	else{
		driver=new FirefoxDriver();
	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	
	}
@Test(priority=2)
	void testLogo() {
		try {
	boolean status=	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status,true);
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
@Test(priority=1)
void testLoginPageTitle() {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
@Test(priority=3)
void testLogin() {
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
}
@Test(priority=4)
	void tearUp() {
	driver.close();	
	}
	
}
