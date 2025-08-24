package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageofdragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		
		
		WebElement draggable=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement droppable=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions action=new Actions(driver);
	
		action.clickAndHold(draggable).moveToElement(droppable).release(droppable).build().perform();
	
	}

}
