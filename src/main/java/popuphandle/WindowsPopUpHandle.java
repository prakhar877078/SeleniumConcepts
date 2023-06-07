package popuphandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUpHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> handles = driver.getWindowHandles();
		
		/*
		 * this will create one set object inside the memory, but it will not follow any
		 * order also it doesn't store any duplicate values.
		 */		
		
		Iterator<String> it = handles.iterator();
		String parentwindowid = it.next();
		
		System.out.println("Parent Window Id is :"+parentwindowid);
		
		String childwindowid = it.next();
		System.out.println("Child Window Id is :"+childwindowid);
		
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getTitle());
		
		/*
		 * How to handle multiple window popup
		 * https://www.hyrtutorials.com/p/window-handles-practice.html
		 */
		
		/*
		 * usecase 1: child 1, child 2 back to parent. usecase 2: child 1 back to parent
		 * then child 2 and back to parent. 
		 */
		
	}

}
