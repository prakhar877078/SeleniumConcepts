package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImageCount {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		List <WebElement> imagelist = driver.findElements(By.tagName("img"));
		System.out.println("Total number of links :"+imagelist.size());
		
		for(int i=0; i<imagelist.size(); i++) {
			String imgURL = imagelist.get(i).getAttribute("src");
			System.out.println(imgURL);
		}
		
		driver.quit();
		
	}

}

