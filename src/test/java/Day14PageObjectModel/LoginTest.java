package Day14PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
WebDriver driver;
LoginPage lp;
	@BeforeClass
	void setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	
	@Test
void TestLogin() {
		lp=new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
			lp.	setclick();
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
@Test
void LogoCheck() {
	lp=new LoginPage(driver);
	Assert.assertEquals(lp.checklogo(),true);
}

@AfterClass
void tearDown() {
	driver.close();
}


	
}
