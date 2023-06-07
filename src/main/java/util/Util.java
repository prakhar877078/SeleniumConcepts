package util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;
	
	// constructor is created so that i can use the driver from the 
	//page maintaining same session id.
	public Util(WebDriver driver) {
		this.driver = driver;
	}
	
	
	/**
	 * This method is used to create WebElement on the basis of By locator.
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		}catch(Exception e) {
			System.out.println("some exceptions occured while creating the web element");
			System.out.println(e.getMessage());
		}
		
		return element;
	}
	
	/**
	 * This method is used to click on element
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
		getElement(locator).click();
		}catch(Exception e) {
			System.out.println("some exceptions occured while clicking on the web element");
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * This method is used to pass the values in a WebElement
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		try {
		getElement(locator).sendKeys(value);
		}catch(Exception e) {
			System.out.println("some exceptions occured while passing values to the web element");
			System.out.println(e.getMessage());
		}
	}
	
	//custom method for wait

	public void waitForElementPresent(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	//custom method for wait title

	public void waitForTitltPresent(String title, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	//custom method for wait

	public WebElement waitForElement(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return getElement(locator);
	}
	
	//custom method for title
	public String waitForElementTitle(String title, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	//Custom method for wait
	public WebElement waitForElementToBeVisible(By locator, int time) {
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	//Custom method for wait
	public WebElement waitForElementVisibilityLocated(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return getElement(locator);
	}
	
	//Custom method for wait
	public WebElement waitForElementToBeClickable(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return getElement(locator);
	}

	
}
