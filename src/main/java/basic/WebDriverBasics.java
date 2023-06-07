package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*WebDriver is an Interface, for every browser there is a seperate class 
and these class implement WebDriver Interface

Interface has method in the form of prototype no method type and class will overwrite those methods.

WebDriver is an interface because there are certain method that are common to all 
i.e. we have to launch browser, get url, get title, navigate to elements, quit browser
then why to create unnecessary methods so any new bowser should follow the same set the rules.
*/

/*We can't create object for an interface in java, but we can do topcasting means 
 we know that ChromeDriver is a class which is implementing WebDriver Interface and 
 child class object can be 
 refered by parent interface reference variable.
*/


public class WebDriverBasics {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// topcasting this line will launch the browser
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
	}

}
