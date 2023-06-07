package syncandwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {

		//Explicitly Wait is available as WebDriverWait
		/*
		 * If element is not found it will give timeout exception then it will give a
		 * message that expected condition failed waiting for presence of element
		 * located by By.id : username, tried for 3 seconds with 500 millisecond
		 * interval
		 */
		//Dynamic Wait
		//Element Specific Wait
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://app.hubspot.com/login");
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.titleContains("HubSpot"));
	    
	    System.out.println(driver.getTitle());
	     
	    By emailId = By.id("username");
	    
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait1.until(ExpectedConditions.presenceOfElementLocated(emailId));
	      
	    WebElement email = driver.findElement(emailId);
	    email.sendKeys("test@gmail.com");
	      
		/*
		 * WebElement emailId = driver.findElement(By.id("username")); 
		 * WebElement password = driver.findElement(By.id("password")); 
		 * WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		 */	      
	      //emailId.sendKeys("test@gmail.com");
	      
		
	}

}
