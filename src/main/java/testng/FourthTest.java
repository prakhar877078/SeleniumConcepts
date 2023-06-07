package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @BeforeTest method will execute multiple times before starting every tests
 * @author Admin
 *
 */
public class FourthTest {
	
	@Test
	public void test1() {
		System.out.println("this is test1 method from FourthTest");
	}
	
	@BeforeTest
	public void mmm() {
		System.out.println("this is method mmm from FourthTest");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite..");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite..");
	}

}
