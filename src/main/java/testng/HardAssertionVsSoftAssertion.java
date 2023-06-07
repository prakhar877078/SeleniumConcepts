package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * In HardAssertion if assertion fails then next line of code will not be executed
 * @author Admin
 *
 */
public class HardAssertionVsSoftAssertion {
	
	@Test
	public void hardAssertions() {
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("this is hard assertion...");
	}
	
	/**
	 * In SoftAssertion if assertion fails then also next line of code will be executed.
	 * this can be accessed through SoftAssert class object
	 */
	@Test
	public void softAssertions() {
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1,2);

		System.out.println("this is soft assertion...");
		
		sa.assertAll();
	}

}
