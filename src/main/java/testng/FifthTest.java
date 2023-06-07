package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * @AfterTest method will execute every time after completion of every Tests.
 * @author Admin
 *
 */
public class FifthTest {
	
	
	@Test
	public void test2() {
		System.out.println("this is test2 method from FifthTest");
	}
	
	@AfterTest
	public void nnn() {
		System.out.println("this is method nnn from FifthTest");
	}

}
