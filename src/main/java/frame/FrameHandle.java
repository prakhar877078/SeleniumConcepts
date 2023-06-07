package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		WebElement frameelement = driver.findElement(By.name("main"));
		driver.switchTo().frame(frameelement);
		
		//driver.switchTo().frame("main");
		
		//driver.switchTo().frame(2);
		
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();

		
	}

}
