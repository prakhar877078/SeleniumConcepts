package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		
		Actions action = new Actions(driver);
		
		WebElement sourceelement = driver.findElement(By.id("column-a"));
		WebElement targetelement = driver.findElement(By.id("column-b"));
		
		action.clickAndHold(targetelement).moveToElement(sourceelement).release();
		
		action.dragAndDrop(sourceelement, targetelement).build().perform();
		
	}

}
