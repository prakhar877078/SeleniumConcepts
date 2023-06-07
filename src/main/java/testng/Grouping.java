package testng;

import org.testng.annotations.Test;

/*loginbyemail - Sanity&Regression
loginbyfacebook - Sanity
loginbytwitter - Sanity

signupbyemail - Sanity&Regression
signupbyfacebook - Regression
signupbytwitter - Regression

paymentinrupees - Sanity&Regression
paymentindollar - Sanity
paymentreturnbybank - Regression
*/

public class Grouping {
	
	@Test(priority=1, groups= {"sanity","regression"})
	void loginbyemai(){
	  System.out.println("login by email...");	
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginbyfacebook() {
		System.out.println("login by facebook...");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginbytwitter() {
		System.out.println("login by twitter...");
	}
	
	@Test(priority=4, groups= {"sanity","regression"})
	void signupbyemail() {
		System.out.println("signup by email...");
	}
	
	@Test(priority=5, groups= {"regression"})
	void signupbyfacebook() {
		System.out.println("signup by facebook...");
	}
	
	@Test(priority=6, groups= {"regression"})
	void signupbytwitter() {
		System.out.println("signup by twitter...");
	}
	
	@Test(priority=7, groups= {"sanity","regression"})
	void paymentinrupees() {
		System.out.println("payment in rupees...");
	}
	
	@Test(priority=8, groups= {"sanity"})
	void paymentindollar() {
		System.out.println("payment in dollar...");
	}
	
	@Test(priority=9, groups= {"regression"})
	void paymentreturnbybank() {
		System.out.println("payment return by bank...");
	}

}
