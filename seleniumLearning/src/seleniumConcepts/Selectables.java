package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selectable.php");
		
		List<WebElement> selectables=driver.findElements(By.xpath("//*[@id=\"nav-home\"]/ul/li"));
		
	
		Actions action=new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(selectables.get(0)).click(selectables.get(1)).build().perform();
	
		

	}

}
