package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*If a dropdown is having select tag then only we can use Select Class else we can't use it.
*/
public class DropDown {

	public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/signup");
		 WebElement day = driver.findElement(By.id("day"));
		 WebElement month = driver.findElement(By.id("month"));
		 WebElement year = driver.findElement(By.id("year"));
		 
		 String date = "20-Dec-1996";
		 String dateval[] = date.split("-");
		 
		 DropDownUtil.selectValueFromDropDown(day, dateval[0]);
		 DropDownUtil.selectValueFromDropDown(month, dateval[1]);
		 DropDownUtil.selectValueFromDropDown(year, dateval[2]);

	}

}
