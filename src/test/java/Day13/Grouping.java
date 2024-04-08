package Day13;

import org.testng.annotations.Test;

//loginByEmail - sanity & regression
//loginByfacebook - sanity
//loginBytwitter - sanity
//
//signupbyemail - sanity & regression
//signupbyfacebook - regression
//signupbytwitter - regression
//
//paymentinrupees - sanity & regression
//paymentindollar - sanity
//paymentReturnbyBank - regression

public class Grouping {

	@Test(priority=1,groups= {"sanity","regression"})
	public void loginByEmail() {
		System.out.println("loginByEmail");
	}
	@Test(priority=2,groups= {"sanity"})
	public void loginByfacebook() {
		System.out.println("loginByfacebook");
	}
	@Test(priority=3,groups= {"sanity"})
	public void loginBytwitter() {
		System.out.println("loginBytwitter");
	}
	@Test(priority=4,groups= {"sanity","regression"})
	public void signupbyemail() {
		System.out.println(" signupbyemail");
	}
	@Test(priority=5,groups= {"regression"})
	public void signupbyfacebook() {
		System.out.println("signupbyfacebook");
	}
	@Test(priority=6,groups= {"regression"})
	public void signupbytwitter() {
		System.out.println("signupbytwitter");
	}
	@Test(priority=7,groups= {"sanity","regression"})
	public void paymentinrupees() {
		System.out.println("paymentinrupees");
	}
	@Test(priority=8,groups= {"sanity"})
	public void paymentindollar() {
		System.out.println("paymentindollar");
	}
	@Test(priority=9,groups= {"regression"})
	public void paymentReturnbyBank() {
		System.out.println("paymentReturnbyBank");
	}
	
}
