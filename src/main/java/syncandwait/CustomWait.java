package syncandwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		By emailId = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		//driver.findElement(emailId).sendKeys("abc@gmail.com");
		getElementWithWait(driver,emailId,6).sendKeys("abc@gmail.com");
		driver.findElement(password).sendKeys("Test@123");
		driver.findElement(loginBtn).click();
	}
	
	//Custom Wait
	public static WebElement getElementWithWait(WebDriver driver,By locator,int timeout) {
		WebElement element = null;
		
		for(int i=0; i<timeout; i++) {
			try {
				element = driver.findElement(locator);
				break;
			} catch(Exception e) {
				System.out.println("Waiting for element to be present on the page-->" +i +"secs");
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e1) {
					
				}
			}
		}
		return element;
	}

}
