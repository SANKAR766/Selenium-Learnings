package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANKAR\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		
		WebElement fullname=driver.findElement(By.id("fullname"));
		fullname.sendKeys("SANKAR");
		WebElement email=driver.findElement(By.id("email"));
		boolean enabled=email.isEnabled();
		System.out.println(enabled);
	}

}
