package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	void beforeSuite(){
		System.out.println("this is before suite method...");
	}
	
	@AfterSuite
	void afterSuite(){
		System.out.println("this is after suite method...");
	}
	
	@BeforeClass
	void beforeClass(){
		System.out.println("this is before class method...");
	}
	
	@AfterClass
	void afterClass(){
		System.out.println("this is after class method...");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("this is before test method...");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("this is after test method...");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("this is before method...");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("this is after method...");
	}
	
	@Test
	void test1() {
		System.out.println("this is test1 method...");
	}
	
	@Test
	void test2() {
		System.out.println("this is test2 method...");
	}

}
