package xpath;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_xpath_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Creating xpath using single property
		//htmltag[@prop1='value']
		
		//input[@id='username']
		
		//Creating xpath using two property
		//htmltag[@prop1='value' and @prop2='value']
		
		//input[@id='username' and @type='email']
		
		//input[@class='form-control private-form__control login-email']
		
		//contains() in xpath
		//with contains() we can use single class
		//htmltag[contains(@prop,'value')]
		
		//input[contains(@class,'login-email')]	
		//input[contains(@id,'username')]
		//input[@id='username' and contains(@class,'login-email')]
		//input[@id='username' and contains(@class,'')]
		
	//contains used for dynamic ids:
	<input id='test_123'>
	<input id='test_121'>
	<input id='test_111'>
	<input id='test_120'>
	//input[contains(@id,'test_')]
	//   (//input[contains(@class,'form-control')])[1]
	//   (//input[contains(@class,'form-control')])[2]
	
	//In a collection of element if i want to jump to the last element then i will use
    //  (//input[contains(@class,'form-control')])[last()]
	
	//text() in xpath
	//htmltag[text()='value']
	//i18n-string[text()='Forgot my password']
	
	//text() with contain()
	//span[contains(text(),'Show Password')]
	//span[contains(text(),'Show')]
	//i18n-string[contains(text(),'Forgot my password')]
	
	//starts-with()
	//input[starts-with(@id,'username')]
	//*[@id='username'] --- finding a element where id = 'username'
	
	//immediate parent or parent - child
	//div//input --- in-direct child
	//div/input --- direct child
	
			
	}

}
