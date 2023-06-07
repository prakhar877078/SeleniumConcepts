package testng;

import org.testng.annotations.Test;

/**
 * Priority is used to decide the order of execution
 * @author Admin
 *
 */
public class SecondTest {

	@Test(priority = 1)
	void test1() {
		System.out.println("this is testing1");
	}
	
	@Test(priority = 3)
	void test2() {
		System.out.println("this is testing2");
	}
	
	@Test(priority = 4)
	void test3() {
		System.out.println("this is testing3");
	}
	
	@Test(priority = 2)
	void test4() {
		System.out.println("this is testing4");
	}


	
}
