package popuphandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// type = file should be there to use this approach using selenium.

public class FileUpload {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Admin\\Desktop\\others.txt");
		driver.findElement(By.id("submitbutton")).click();
		
		driver.quit();
		
	}

}
