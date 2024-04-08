package Day12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class Annotation {

	@BeforeMethod
	public void Login() {
		System.out.println("Login");
	}
	@Test(priority=1)
	public void Search() {
		System.out.println("Functionality Search");
	}
	
	@Test(priority=2)
	public void Adv() {
		System.out.println("Advanced Search");
	}
	@AfterMethod
	public void Logout() {
		System.out.println("Logout");
	}
	@AfterClass
	public void AC_Logout() {
		System.out.println("After Class Logout");
	}
	@BeforeClass
	public void BC_Logout() {
		System.out.println("Before Class Login");
	}
	@BeforeSuite
	public void BS_Login() {
		System.out.println("Before Suite Login");
	}@AfterSuite
	public void AS_Logout() {
		System.out.println("After Suite Logout");
	}
	
	
}
