package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * here, @BeforeMethod and @AfterMethod will be executed before every method.
 * @author Admin
 *
 */
public class ThirdTest {

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("this is test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("this is test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("this is test 4");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	
}
