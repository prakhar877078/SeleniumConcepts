package syncandwait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.get("https://app.hubspot.com/login");
      
      //Applied for all the elements on the Web Page.(only for webelements)
     //Global Wait
      //Dynamic Wait
		/*
		 * It wait is provied for 20 sec then driver will wait for the element to
		 * interactable within 20 sec, if element is not found after 20 sec then it will
		 * throw no such element exception.
		 */
      
      //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      WebElement emailId = driver.findElement(By.id("username"));
      WebElement password = driver.findElement(By.id("password"));
      WebElement loginBtn = driver.findElement(By.id("loginBtn"));
      
      emailId.sendKeys("test@gmail.com");
      
      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		/* After line number 34, Implicitly Wait of 10 Sec is applied. */
	}

}
